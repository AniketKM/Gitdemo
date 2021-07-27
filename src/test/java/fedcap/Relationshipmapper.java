package fedcap;



import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Relationshipmapper {
	// Create object login class of login class
	Login loginClass = new Login();
	Utilies1 utiliesClass = new Utilies1();

	@Test
	// Create Method Create New Employee
	public void addContact() throws Exception {

		String[] options = { "Prospecting", "Prospecting", "Qualification", "Needs Analysis", "Value Proposition",
				"Prospecting" };
		loginClass.login();// input[@id='input-271']
		// Create explicit wait to halt until search box appear
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search apps or items...\"]")));
		// Searching Opportunities to search box
		utiliesClass.sendEventsxpath("//input[@placeholder=\"Search apps or items...\"]", ("Contacts"));
		// Click on Opportunities
		utiliesClass.clickEventxpath("//p[@class='slds-truncate']");
		Thread.sleep(20000);
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='New'])[1]")));
		utiliesClass.clickEventxpath("(//a[@title='New'])[1]");
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" (//input[@name='salutation'])")));
		utiliesClass.clickEventxpath("(//input[@name='salutation'])");
		utiliesClass.openchrome.findElement(By.xpath("(//input[@name='salutation'])"))
				.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER));
		utiliesClass.sendEventsxpath("(//input[@name='firstName'])", ("Automation1"));
		utiliesClass.sendEventsxpath("(//input[@name='lastName'])", ("test"));
		utiliesClass.openchrome.findElement(By.xpath("(//input[@class='slds-input slds-combobox__input'])[5]"))
				.sendKeys(Keys.ENTER);
		utiliesClass.clickEventxpath("(//button[@name='SaveEdit'])");
		// Close the browser
		utiliesClass.openchrome.close();
	}

	@Test
	public void addsubContact() throws Exception {

		loginClass.login();
		// Create explicit wait to halt until search box appear
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search apps or items...\"]")));
		// Searching Opportunities to search box
		utiliesClass.sendEventsxpath("//input[@placeholder=\"Search apps or items...\"]", ("Contacts"));
		// Click on OpportunitiesSearch Accounts...
		utiliesClass.clickEventxpath("//p[@class='slds-truncate']");
		Thread.sleep(20000);
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='New'])[1]")));
		utiliesClass.clickEventxpath("(//a[@title='New'])[1]");
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" (//input[@name='salutation'])")));
		utiliesClass.clickEventxpath("(//input[@name='salutation'])");
		utiliesClass.openchrome.findElement(By.xpath("(//input[@name='salutation'])"))
				.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER));
		utiliesClass.sendEventsxpath("(//input[@name='firstName'])", ("Automation3"));
		utiliesClass.sendEventsxpath("(//input[@name='lastName'])", ("test"));

		utiliesClass.sendEventsxpath("//input[@placeholder='Search Accounts...']", ("QA Account"));
		Thread.sleep(7000);
		utiliesClass.openchrome.findElement(By.xpath("//input[@placeholder='Search Accounts...']"))
				.sendKeys(Keys.ENTER);
		utiliesClass.clickEventxpath("(//a[@title='QA Account'])[3]");

		utiliesClass.sendEventsxpath("//input[@placeholder='Search Contacts...']", ("test test"));
		Thread.sleep(7000);
		utiliesClass.openchrome.findElement(By.xpath("//input[@placeholder='Search Contacts...']"))
				.sendKeys(Keys.ENTER);
		utiliesClass.openchrome.findElement(By.xpath("//input[@placeholder='Search Contacts...']"))
				.sendKeys(Keys.ENTER);
		utiliesClass.clickEventxpath("(//a[text()='test test'])[2]");
		Thread.sleep(4000);
		// utiliesClass.openchrome.findElement(By.xpath("(//input[@class='slds-input
		// slds-combobox__input'])[5]")).sendKeys(Keys.ENTER);
		utiliesClass.clickEventxpath("(//button[@name='SaveEdit'])");
		// Close the browser
		utiliesClass.openchrome.close();
	}

	@Test
	// Create Method Create New Employee
	public void addContanttooppr() throws Exception { // Call opprpage object
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
		utiliesClass.clickEventxpath("//a[@data-label='Related']");
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='view-all-label']")));
		utiliesClass.clickEventxpath("//*[@class='view-all-label']");
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Add Contact Roles'])")));
		utiliesClass.clickEventxpath("(//a[@title='Add Contact Roles'])");
		utiliesClass.sendEventsxpath("//input[@title='Search Contacts']", "test test");
		utiliesClass.openchrome.findElement(By.xpath("//input[@title='Search Contacts']")).sendKeys(Keys.ENTER);
		utiliesClass.clickEventxpath("(//*[@class='slds-checkbox--faux'])[23]");
		utiliesClass.clickEventxpath("(//button[@title='Next'])");
		Thread.sleep(7000);
		utiliesClass.mouseAction("(//button[@class='slds-button trigger slds-button_icon-border'])[2]");
		Thread.sleep(5000);
		utiliesClass.openchrome.findElement(By.xpath("(//a[@title='Business User'])")).sendKeys(Keys.ENTER);
		utiliesClass.clickEventxpath("//button[@title='Save']");
		// Close the browser
		utiliesClass.openchrome.close();

	}

	@Test
	// Create Method Create New Employee
	public void addTasktocontactcard() throws Exception { // Call opprpage object
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
		utiliesClass.clickEventxpath("//a[@data-label='Relationship Mapper']");
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='con_task'])[1]")));
		utiliesClass.jsEx("(//img[@class='con_task'])[1]");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='New Task']")));
		utiliesClass.jsEx("//button[@title='New Task']");
		utiliesClass.sendEventsxpath("//input[@name='subject']", "testing1");
		utiliesClass.staticDropdown(
				"(//select[@class='slds-select select uiInput uiInputSelect uiInput--default uiInput--select'])[1]",
				"In Progress");
		utiliesClass.clickEventxpath("//input[@name='ActivityDate']");
		utiliesClass.clickEventxpath("//*[text()='16']");
		utiliesClass.staticDropdown(
				"(//select[@class='slds-select select uiInput uiInputSelect uiInput--default uiInput--select'])[2]",
				"High");
		utiliesClass.sendEventsxpath("//textarea[@name='Description']", "testing1");
		Thread.sleep(7000);
		// utiliesClass.clickEventxpath("//button[@title='Save']");
		utiliesClass.jsEx("//button[@title='Save']");
		utiliesClass.jsEx("//button[@title='Back']");
		// Close the browser
		utiliesClass.openchrome.close();
	}

	@Test
	// Create Method Create New Employee
	public void sendMailfromcontactcard() throws Exception { // Call opprpage object
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
		utiliesClass.clickEventxpath("//a[@data-label='Relationship Mapper']");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='avatar'])[1]")));
		utiliesClass.jsEx("(//img[@class='avatar'])[1]");
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@inputmode='email'])")));
		utiliesClass.sendEventsxpath("(//input[@inputmode='email'])", "aniket.marjive@technomile.com");
		utiliesClass.sendEventsxpath("(//input[@placeholder='Subject'])", "testing purpose");
		utiliesClass.sendEventsxpath("(//div[@aria-label='Compose text'])", "testing purpose mail");
		Thread.sleep(7000);
		utiliesClass.jsEx("//button[@title='Send']");
		// Close the browser
		utiliesClass.openchrome.close();
	}

	@Test
	// Create Method Create New Employee
	public void addNotestocontactcard() throws Exception { // Call opprpage object
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
		utiliesClass.clickEventxpath("//a[@data-label='Relationship Mapper']");
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='con_CustomNotes'])[1]")));
		utiliesClass.jsEx("(//img[@class='con_CustomNotes'])[1]");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='New Note']")));
		utiliesClass.jsEx("//button[@title='New Note']");
		utiliesClass.sendEventsxpath("//input[@name='FedCapture__Title__c']", "testing1");
		utiliesClass.sendEventsxpath("//textarea[@name='FedCapture__Description__c']", "testing1 purpose");
		Thread.sleep(7000);
		utiliesClass.jsEx("//button[@title='Save']");
		utiliesClass.jsEx("//button[@title='Back']");
		// Close the browser
		utiliesClass.openchrome.close();
	}

	@Test
	// Create Method Create New Employee
	public void editcontactRoleofcontactcard() throws Exception { // Call opprpage object
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
		utiliesClass.clickEventxpath("//a[@data-label='Relationship Mapper']");
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='conrole_edit'])[1]")));
		utiliesClass.jsEx("(//img[@class='conrole_edit'])[1]");
		utiliesClass.staticDropdown(
				"(//select[@class='slds-select select uiInput uiInputSelect uiInput--default uiInput--select'])",
				"Economic Buyer");
		Thread.sleep(7000);
		utiliesClass.jsEx("//button[@class='slds-button slds-button_brand']");
		// Close the browser
		utiliesClass.openchrome.close();
	}

	@Test
	// Create Method Create New Employee
	public void editRelationshipinformationofcontactcard() throws Exception { // Call opprpage object
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
		utiliesClass.clickEventxpath("//a[@data-label='Relationship Mapper']");
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='con_edit'])[1]")));
		utiliesClass.jsEx("(//img[@class='con_edit'])[1]");
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='slds-page-header'])[3]")));
		utiliesClass.jsEx("(//*[@class='slds-page-header'])[3]");
		utiliesClass.jsEx("(//input[@name='FedCapture__Priority__c'])");
		utiliesClass.jsEx("(//*[@title='High'])");
		utiliesClass.jsEx("(//input[@name='FedCapture__Relationship_Strengths__c'])");
		utiliesClass.jsEx("(//*[@title='Strong'])");
		utiliesClass.jsEx("(//input[@name='FedCapture__Perception__c'])");
		utiliesClass.jsEx("(//*[@title='Weak'])[2]");
		utiliesClass.sendEventsxpath("(//input[@name='FedCapture__Justification__c'])", "testing1 purpose");
		// utiliesClass.staticDropdown("(//select[@class='slds-select select uiInput
		// uiInputSelect uiInput--default uiInput--select'])", "Economic Buyer");
		Thread.sleep(7000);
		utiliesClass.jsEx("//button[@class='slds-button slds-button_neutral slds-button slds-button_brand']");
		// Close the browser
		utiliesClass.openchrome.close();
	}

	@Test
	// Create Method Create New Employee
	public void zoominoutcollapseexpandrefreshprintofcontactcard() throws Exception { // Call opprpage object
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
		utiliesClass.clickEventxpath("//a[@data-label='Relationship Mapper']");
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@title='Zoom In'])")));
		utiliesClass.jsEx("(//button[@title='Zoom In'])");
		System.out.println("Zoom In");
		utiliesClass.jsEx("(//button[@title='Zoom Out'])");
		System.out.println("Zoom Out");
		Thread.sleep(7000);
		utiliesClass.jsEx("(//button[@class='btn zoom-init slds-button slds-button_neutral'])");
		System.out.println("Reset");
		Thread.sleep(9000);
		// jsEx("(//button[@class='btn zoom-init slds-button slds-button_neutral'])");

		utiliesClass.jsEx("(//button[@title='Expand All'])");
		System.out.println("Expand All");
		Thread.sleep(7000);
		utiliesClass.jsEx("(//button[@title='Collapse All'])");
		System.out.println("Collapse All");
		Thread.sleep(9000);
		utiliesClass.jsEx("(//button[@class='printRH slds-button slds-button_neutral'])");
		System.out.println("Print");
		Thread.sleep(7000);
		utiliesClass.jsEx("(//lightning-icon[@title='Refresh'])");
		System.out.println("Refresh");
		// Close the browser
		utiliesClass.openchrome.close();
	}

	@Test
	// Create Method Create New Employee
	public void fullViewofcontactcard() throws Exception { // Call opprpage object
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
		utiliesClass.clickEventxpath("//a[@data-label='Relationship Mapper']");
		// utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='slds-button
		// slds-button_neutral'])[4]")));
		Thread.sleep(7000);
		utiliesClass.jsEx("(//*[text()='Full View'])");
		System.out.println("Full view");
		// utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='slds-button
		// slds-button_neutral slds-show'])")));
		Thread.sleep(10000);
		utiliesClass.jsEx("(//button[@class='slds-button slds-button_neutral slds-show'])");
		System.out.println("Back");
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
