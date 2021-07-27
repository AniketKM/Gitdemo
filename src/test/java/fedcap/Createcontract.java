package fedcap;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Createcontract {

	// Create object login class of login class
	Login loginClass = new Login();
	Utilies1 utiliesClass = new Utilies1();

	@Test
	public void creatingContract() throws Exception {

		// Call opprpage object
		loginClass.opprPage();

		// Create explicit wait to halt until Automation-Test1 appear
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-Test3'])[1]")));
		// Select opportunity with name Automation-Test1
		utiliesClass.clickEventxpath("(//a[@title='Automation-Test3'])[1]");

		// driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

		Thread.sleep(30000);

		JavascriptExecutor js = (JavascriptExecutor) utiliesClass.openchrome;

		js.executeScript("window.scrollBy(0,800)");

		WebElement currentStage = utiliesClass.openchrome.findElement(By.xpath(
				"//label[@for='StageName']/following-sibling::lightning-output-field/div/lightning-formatted-text"));

		System.out.println(currentStage);

		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//label[@for='StageName']/following-sibling::lightning-output-field/div/lightning-formatted-text")));

		String expectedStage = "Closed Won";

		String actualStage = currentStage.getText();

		System.out.println(actualStage);

		if (expectedStage.equals(actualStage)) {
			System.out.println("Pass");
		} else {
			WebElement element = utiliesClass.openchrome
					.findElement(By.xpath("//label[text()='Stage']/following-sibling::a"));

			((JavascriptExecutor) utiliesClass.openchrome).executeScript("arguments[0].click();", element);
			Thread.sleep(9000);

			utiliesClass.clickEventxpath(" (//input[@name='StageName'])[3]");
			Thread.sleep(7000);
			utiliesClass.openchrome.findElement(By.xpath(" (//input[@name='StageName'])[3]")).sendKeys("c");
			Thread.sleep(4000);

			utiliesClass.openchrome.findElement(By.xpath("(//input[@name='StageName'])[3]")).sendKeys(Keys.ENTER);

			js.executeScript("window.scrollBy(0,-500)");

			WebElement saveButton = utiliesClass.openchrome
					.findElement(By.xpath("//button[@class='slds-button slds-button_brand']"));

			utiliesClass.wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//button[@class='slds-button slds-button_brand']")));
			Thread.sleep(7000);
			((JavascriptExecutor) utiliesClass.openchrome).executeScript("arguments[0].click();", saveButton);

		}

		/* Creating Contract Wizard */
		utiliesClass.wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']")))
				.click();

		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Create Contract']")))
				.click();

		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Next']")))
				.click();

		utiliesClass.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name = 'CreatedDate']")))
				.sendKeys("Jul 8, 2021");

		utiliesClass.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@name = 'CreatedDate'])[2]")))
				.click();

		utiliesClass.openchrome.findElement(By.xpath("(//input[@name = 'CreatedDate'])[2]")).sendKeys(Keys.ENTER);

		utiliesClass.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/span/span[text()='BPA']")))
				.click();

		utiliesClass.clickEventxpath("//button[@title='Move selection to Chosen']");

		utiliesClass.clickEventxpath("//button[text()='Save Draft']");
		// Close the browser
		utiliesClass.openchrome.close();
	}

	@AfterMethod
	public void tearDown(ITestResult result) {

		// Here will compare if test is failing then only it will enter into if
		// condition
		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				// Create refernce of TakesScreenshot and Call method to capture screenshot
				File src = ((TakesScreenshot) utiliesClass.openchrome).getScreenshotAs(OutputType.FILE);
				// Copy method specific location here it will save all screenshot in our project
				// home directory and
				// result.getName() will return name of test case so that screenshot name will
				// be same
				FileUtils.copyFile(src, new File("E:\\ss./Screenshots/" + result.getName() + ".png"));
				System.out.println("Screenshot taken");
			}

			catch (Exception e) {
				System.out.println("Exception while taking screenshot " + e.getMessage());
			}
		}
	}
}
