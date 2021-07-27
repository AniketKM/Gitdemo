package fedcap;



import java.awt.List;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Adminrelatedlistlayout {

	Login loginClass = new Login();
	Utilies1 utiliesClass = new Utilies1();

	@Test // Create Method Create New Employee public void addCasetoaccount()
	public void addcaseComponent() throws Exception {
		loginClass.login();// input[@id='input-271'] // Create
		// explicit wait to halt until search box appear
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search apps or items...\"]"))); // Searching
		// Opportunities to search box
		utiliesClass.sendEventsxpath("//input[@placeholder=\"Search apps or items...\"]",
				("Admin Related List Layout")); // Click on Opportunities
		utiliesClass.clickEventxpath("//p[@class='slds-truncate']");
		Thread.sleep(20000);
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@title='Go'])")));
		utiliesClass.clickEventxpath("(//button[@title='Go'])");
		utiliesClass.clickEventxpath("(//button[@title='Add Related List'])");
		Thread.sleep(7000);
		utiliesClass.staticDropdown(" (//select[@class='slds-select'])[2]", "Case");
		Actions actions = new Actions(utiliesClass.openchrome);
		utiliesClass.clickEventxpath("(//div[@data-value='AccountId'])");
		actions.keyDown(Keys.CONTROL).build().perform();
		utiliesClass.clickEventxpath("(//div[@data-value='AssetId'])");
		utiliesClass.clickEventxpath("(//div[@data-value='BusinessHoursId'])");
		actions.keyUp(Keys.CONTROL).build().perform();
		utiliesClass.clickEventxpath("(//button[@title='Move selection to Selected'])[1]");
		utiliesClass.clickEventxpath("(//button[@title='Add Related List'])[2]");
	}

	@Test // Create Method Create New Employee public void editCasetoaccount()
	public void editcaseComponent() throws Exception {
		loginClass.login();// input[@id='input-271'] // Create
		// explicit wait to halt until search box appear
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search apps or items...\"]"))); // Searching
		// Opportunities to search box
		utiliesClass.sendEventsxpath("//input[@placeholder=\"Search apps or items...\"]",
				("Admin Related List Layout")); // Click on Opportunities
		utiliesClass.clickEventxpath("//p[@class='slds-truncate']");
		Thread.sleep(20000);
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@title='Go'])")));
		utiliesClass.clickEventxpath("(//button[@title='Go'])");
		Thread.sleep(9000);
		utiliesClass.js.executeScript("window.scrollBy(0,700)");
		utiliesClass.clickEventxpath("(//button[@title='Update Settings'])[6]");
		Thread.sleep(7000);
		// utiliesClass.staticDropdown(" (//select[@class='slds-select'])[2]", "Case");
		Actions actions = new Actions(utiliesClass.openchrome);
		utiliesClass.clickEventxpath("(//div[@data-value='AccountId'])");
		actions.keyDown(Keys.CONTROL).build().perform();
		utiliesClass.clickEventxpath("(//div[@data-value='AssetId'])");
		actions.keyUp(Keys.CONTROL).build().perform();
		utiliesClass.clickEventxpath("(//button[@title='Move selection to Available'])[1]");
		utiliesClass.clickEventxpath("(//button[@title='Add Related List'])[2]");
	}

	@Test // Create Method Create New Employee public void editCasetoaccount()
	public void deletecaseComponent() throws Exception {
		loginClass.login();// input[@id='input-271'] // Create
		// explicit wait to halt until search box appear
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search apps or items...\"]"))); // Searching
		// Opportunities to search box
		utiliesClass.sendEventsxpath("//input[@placeholder=\"Search apps or items...\"]",
				("Admin Related List Layout")); // Click on Opportunities
		utiliesClass.clickEventxpath("//p[@class='slds-truncate']");
		Thread.sleep(20000);
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@title='Go'])")));
		utiliesClass.clickEventxpath("(//button[@title='Go'])");
		Thread.sleep(10000);
		utiliesClass.js.executeScript("window.scrollBy(0,700)");
		utiliesClass.clickEventxpath("(//button[@title='Delete'])[6]");
		utiliesClass.openchrome.switchTo().alert().accept();
	}

	@Test // Create Method Create New Employee public void
	public void adddeleterecordtoCasecomponent() throws Exception {
		loginClass.login();//

		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search apps or items...\"]"))); // Searching
		// Opportunities to search box
		utiliesClass.sendEventsxpath("//input[@placeholder=\"Search apps or items...\"]", ("FedCapture")); // Click on
																											// Opportunities
		utiliesClass.clickEventxpath("//p[@class='slds-truncate']");
		Thread.sleep(10000);
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("// [text()='Accounts']")));
		utiliesClass.jsEx("// [text()='Accounts']");
		Thread.sleep(20000);
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Automation1']")));
		utiliesClass.clickEventxpath("//a[@title='Automation1']");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-label='Related']")));
		utiliesClass.clickEventxpath("//a[@data-label='Related']");
		Thread.sleep(10000);
		utiliesClass.js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(7000);
		utiliesClass.jsEx("(//button[@class='slds-button slds-button_neutral slds-button slds-button_brand'])[17]");
		Thread.sleep(4000);
		utiliesClass.jsEx("(//button[@class='slds-button slds-button_neutral slds-button slds-button_brand'])[16]");
		System.out.println("Cases component present");
		Thread.sleep(12000);
		utiliesClass.openchrome.findElement(By.xpath("(// [@data-key='edit'])[4]")).sendKeys(Keys.ENTER);
		System.out.println("edit record of cases component");
		Thread.sleep(4000);
		utiliesClass.openchrome.findElement(By.xpath("(// [@data-key='undo'])")).sendKeys(Keys.ENTER); // jsEx("(//
																										// [@data-key='undo'])");
																										// Thread.sleep(4000);
		utiliesClass.clickEventxpath("(// [@data-key='delete'])[3]");
		Thread.sleep(4000);
		utiliesClass.openchrome.switchTo().alert().accept();
		System.out.println("Delete record of cases component");

	}

	@Test
// Create Method Create New Employee
	public void newrecordandexporttoCasecomponent() throws Exception {
		loginClass.login();// input[@id='input-271']
		// Create explicit wait to halt until search box appear
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search apps or items...\"]")));
		// Searching Opportunities to search box
		utiliesClass.sendEventsxpath("//input[@placeholder=\"Search apps or items...\"]", ("FedCapture"));
		// Click on Opportunities
		utiliesClass.clickEventxpath("//p[@class='slds-truncate']");
		Thread.sleep(10000);
		// utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//
		// [text()='Accounts']")));
		utiliesClass.jsEx("// [text()='Accounts']");
		Thread.sleep(20000);
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Automation1']")));
		utiliesClass.clickEventxpath("//a[@title='Automation1']");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-label='Related']")));
		utiliesClass.clickEventxpath("//a[@data-label='Related']");
		Thread.sleep(10000);
		utiliesClass.js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(7000);
		utiliesClass.jsEx("(//button[@class='slds-button slds-button_neutral slds-button slds-button_brand'])[18]");
		// Thread.sleep(4000);
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='select'])[2]")));
		utiliesClass.jsEx("(//a[@class='select'])[2]");
		Thread.sleep(4000);
		/*
		 * / utiliesClass.openchrome.findElement(By.xpath("(//a[@class='select'])[2]")).
		 * sendKeys(Keys.ARROW_DOWN);
		 * utiliesClass.openchrome.findElement(By.xpath("(//a[@class='select'])[2]")).
		 * sendKeys(Keys.ARROW_DOWN);
		 */
		utiliesClass.jsEx("(//a[@title='Phone'])");
		Thread.sleep(4000);
		String accountname = utiliesClass.openchrome
				.findElement(By.xpath("//a[@class='pill focused uiPill--default uiPill']")).getText();
		System.out.println(accountname);
		Thread.sleep(4000);
		utiliesClass.clickEventxpath("//button[@title='Save']");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//button[@class='slds-button slds-button--brand Button1'])[6]")));
		utiliesClass.jsEx("(//button[@class='slds-button slds-button--brand Button1'])[6]");
		Thread.sleep(4000);
		utiliesClass.openchrome.switchTo().alert().accept();
		// System.out.println("Delete record of cases component");
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
