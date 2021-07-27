package fedcap;



import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Autopopulate {
	// Create object login class of login class
	Login loginClass = new Login();
	Utilies1 utiliesClass = new Utilies1();

	@Test
	// Create Method Create New Employee
	public void getAccountautopopulate() throws Exception {
		loginClass.login();// input[@id='input-271']
		// Create explicit wait to halt until search box appear
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search apps or items...\"]")));
		// Searching Opportunities to search box
		utiliesClass.sendEventsxpath("//input[@placeholder=\"Search apps or items...\"]", ("Accounts"));
		// Click on Opportunities
		utiliesClass.clickEventxpath("//p[@class='slds-truncate']");
		Thread.sleep(20000);
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Automation1']")));
		utiliesClass.clickEventxpath("//a[@title='Automation1']");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-label='Related']")));
		utiliesClass.clickEventxpath("//a[@data-label='Related']..");
		Thread.sleep(10000);
		utiliesClass.jsEx("(//a[@title='New'])[2]");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//input[@class='slds-input slds-combobox__input slds-combobox__input-value']")));
		Thread.sleep(9000);
		String autopopulateacoountname = utiliesClass.openchrome
				.findElement(By.xpath("//input[@class='slds-input slds-combobox__input slds-combobox__input-value']"))
				.getAttribute("placeholder");
		System.out.println("Autopopulate Account name - " + autopopulateacoountname);
		// System.out.println(autopopulateacoountname);
		// Close the browser
		utiliesClass.openchrome.close();

	}

	@Test
	// Create Method Create New Employee
	public void getOpprautopopulate() throws Exception {
		// Call opprpage object
		loginClass.opprPage();
		utiliesClass.openchrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Select opportunity with name Automation-Test1
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-Test2'])[1]")));
		utiliesClass.clickEventxpath("(//a[@title='Automation-Test2'])[1]");
		// Wait
		Thread.sleep(10000);
		// Window scrolling
		utiliesClass.js.executeScript("window.scrollBy(0,500)");
		// Wait
		Thread.sleep(40000);
		// Click on Resource Budget section
		utiliesClass.jsEx("//a[@data-label='Related']");
		utiliesClass.js.executeScript("window.scrollBy(0,300)");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@name='New'])[1]")));
		// utiliesClass.clickEventxpath("//*[@class='view-all-label']");
		utiliesClass.jsEx("(//button[@name='New'])[1]");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//input[@class='slds-input slds-combobox__input slds-combobox__input-value']")));
		Thread.sleep(9000);
		String autopopulateopprname = utiliesClass.openchrome
				.findElement(By.xpath("//input[@class='slds-input slds-combobox__input slds-combobox__input-value']"))
				.getAttribute("placeholder");
		System.out.println("Autopopulate oppor name - " + autopopulateopprname);
		// System.out.println(autopopulateacoountname);
		// Close the browser
		utiliesClass.openchrome.close();
	}

	@Test
	// Create Method Create New Employee
	public void getContactsautopopulate() throws Exception {

		
				
		loginClass.login();// input[@id='input-271']
		// Create explicit wait to halt until search box appear
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search apps or items...\"]")));
		// Searching Opportunities to search box
		utiliesClass.sendEventsxpath("//input[@placeholder=\"Search apps or items...\"]", ("Contacts"));
		// Click on Opportunities
		utiliesClass.clickEventxpath("//p[@class='slds-truncate']");
		Thread.sleep(20000);
		utiliesClass.wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation2 testing'])[1]")));
		utiliesClass.clickEventxpath("(//a[@title='Automation2 testing'])[1]");

		// Window scrolling
		utiliesClass.js.executeScript("window.scrollBy(0,100)");
		// Wait
		Thread.sleep(40000);
		// Click on Resource Budget section
		// jsEx("(//a[@data-label='Related'])[2]");
		// utiliesClass.js.executeScript("window.scrollBy(0,300)");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@title='New'])[3]")));
		// utiliesClass.clickEventxpath("//*[@class='view-all-label']");
		utiliesClass.jsEx("(//div[@title='New'])[3]");
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//a[@class='pill focused uiPill--default uiPill'])[1]")));
		Thread.sleep(9000);
		String autopopulateopprname = utiliesClass.openchrome
				.findElement(By.xpath("(//a[@class='pill focused uiPill--default uiPill'])[1]")).getAttribute("text");
		System.out.println("Autopopulate oppor name - " + autopopulateopprname);
		// Close the browser
		utiliesClass.openchrome.close();
	}

	@AfterMethod
	public void tearDown(ITestResult result) {

// Here will compare if test is failing then only it will enter into if condition
		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				// Create refernce of TakesScreenshot and Call method to capture screenshot
				File src = ((TakesScreenshot) utiliesClass.openchrome).getScreenshotAs(OutputType.FILE);
// Copy method  specific location here it will save all screenshot in our project home directory and
// result.getName() will return name of test case so that screenshot name will be same
				FileUtils.copyFile(src, new File("E:\\ss./Screenshots/" + result.getName() + ".png"));
				System.out.println("Screenshot taken");
			}

			catch (Exception e) {
				System.out.println("Exception while taking screenshot " + e.getMessage());
			}
		}
	}

}

