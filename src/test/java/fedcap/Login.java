// Create a package in eclipse
package fedcap;


//Import all classes and interface
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

//Create login class
public class Login {
	Utilies1 utiliesClass = new Utilies1();
/*// Create openchrome public object
	public WebDriver openchrome;
//Create wait public object
	public WebDriverWait wait;
//Create chromeOptions public object
	public ChromeOptions chromeOptions;
//Create js public object
	public JavascriptExecutor js;*/

	@Test
	public void login() throws Exception {
// Calling initObjects method
		utiliesClass.initObjects();
// Maximize the browser
		utiliesClass.openchrome.manage().window().maximize();
// Pass application url
		utiliesClass.openchrome.get("https://login.salesforce.com/");
//Passing Username
		utiliesClass.sendEventsxpath("//*[@id=\"username\"]", "fedcapentbetatest@technomile.com");
//Passing Password
		utiliesClass.sendEventsxpath("//*[@id=\"password\"]", "Dev@2022");
// Clicking on login button
		utiliesClass.clickEventxpath("//*[@id=\"Login\"]");
//printing page title
		System.out.println("Page title is : " + utiliesClass.openchrome.getTitle());
//if verification code page is present
		if (utiliesClass.openchrome.getTitle().contains("Verify Your Identity | Salesforce")) {
			// Clicking on VC input field
			utiliesClass.clickEventxpath("//*[@id=\"emc\"]");
			// halt for 2mins 90secs to enter VC manually
			Thread.sleep(29000);
			// Clicking on verify button
			utiliesClass.clickEventxpath("//*[@id=\"save\"]");
			// halting until application launcher appear
			// wait.until(ExpectedConditions.elementToBeClickable(By.className("slds-icon-waffle")));
			// Click on application launcher appear
			// clickEventclassName("slds-icon-waffle");
			utiliesClass.wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//div[@class='appLauncher slds-context-bar__icon-action']")));
			utiliesClass.clickEventxpath("//div[@class='appLauncher slds-context-bar__icon-action']");
			Thread.sleep(7000);
			utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='slds-button']")));
			// Click on view all text
			utiliesClass.clickEventxpath("//button[@class='slds-button']");
		} else {
			// halting until application launcher appear
			// wait.until(ExpectedConditions.elementToBeClickable(By.className("slds-icon-waffle")));
			// Click on application launcher appear
			// clickEventclassName("slds-icon-waffle");

			utiliesClass.wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//div[@class='appLauncher slds-context-bar__icon-action']")));
			utiliesClass.mouseAction("//div[@class='appLauncher slds-context-bar__icon-action']");
			// Thread.sleep(7000);
			utiliesClass.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='slds-button']")));
			// Click on view all text
			utiliesClass.clickEventxpath("//button[@class='slds-button']");
		}

	}

	public void opprPage() throws Exception {
		// Call the login class to execute
		login();// input[@id='input-271']
		// Create explicit wait to halt until search box appear
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search apps or items...\"]")));
		// Searching Opportunities to search box
		utiliesClass.sendEventsxpath("//input[@placeholder=\"Search apps or items...\"]", ("Opportunities"));
		// Click on Opportunities
		utiliesClass.clickEventxpath("//p[@class='slds-truncate']");

	}

	// It will execute after every test execution
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

/*
 * @AfterClass() public void Close_Browser() throws Exception {
 * //openchrome.quit(); // closing current window //openchrome.close(); //
 * closing All window
 */
