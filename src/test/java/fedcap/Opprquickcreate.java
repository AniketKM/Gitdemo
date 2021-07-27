package fedcap;



import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Opprquickcreate {

	// Create object login class of login class
	Login loginClass = new Login();
	Utilies1 utiliesClass = new Utilies1();

	@Test
	// Create Method Create New Opportunity
	public void CreateNewOpportunity() throws Exception {
		// Call opprpage object
		loginClass.opprPage();
		// Create explicit wait to halt until New button appear
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Opp Quick Create']")));
		// Click on New button
		utiliesClass.clickEventxpath("//a[@title='Opp Quick Create']");

		// Click on New button
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='accessibility title']")));
		// switch to the iframe
		utiliesClass.openchrome.switchTo()
				.frame(utiliesClass.openchrome.findElement(By.xpath("//*[@title='accessibility title']")));
		System.out.println("********We are switch to the iframe*******");
		Thread.sleep(10000);
		utiliesClass.clickEventxpath("(//span[@class='slds-radio_faux'])[4]");
		utiliesClass.clickEventxpath("//button[@title='Next']");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='OppName']")));
		utiliesClass.sendEventsxpath("//input[@name='OppName']", "Automation test");
		utiliesClass.staticDropdown("//select[@name='OppStage']", "varOppStagesOptions.Qualification");
		utiliesClass.sendEventsxpath("//input[@name='OppAmount']", "4");
		utiliesClass.clickEventxpath("//input[@name='OppSolicitation_Date']");
		utiliesClass.clickEventxpath("//*[text()='18']");

		utiliesClass.clickEventxpath("//input[@name='OppProposal_Due_DateTime']");
		utiliesClass.clickEventxpath("//*[text()='18']");

		utiliesClass.clickEventxpath("//input[@name='OppCloseDate']");
		utiliesClass.clickEventxpath("//*[text()='18']");
		utiliesClass.clickEventxpath("//button[@title='Next']");
		Thread.sleep(7000);
		utiliesClass.clickEventxpath("//button[@title='Next']");
		utiliesClass.clickEventxpath("//input[@placeholder='Search Accounts...']");
		Thread.sleep(3000);
		utiliesClass.openchrome.findElement(By.xpath("//input[@placeholder='Search Accounts...']"))
				.sendKeys(Keys.ARROW_DOWN);
		utiliesClass.openchrome.findElement(By.xpath("//input[@placeholder='Search Accounts...']"))
				.sendKeys(Keys.ENTER);
		utiliesClass.clickEventxpath("//button[@title='Next']");
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
