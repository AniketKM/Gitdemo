package fedcap;



import java.io.File;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Resourcebudget {

	// Create object login class of login class
	Login loginClass = new Login();
	//Utilies1 loginClass = new Utilies1();
/*	@Test
	// Create Method Create New labor category
	public void CreateNewlaborcategory() throws Exception {

		// Call the login class to execute
		loginClass.login();// input[@id='input-271']
		// Create explicit wait to halt until search box appear
		loginClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search apps or items...\"]")));
		// Searching Opportunities to search box
		Thread.sleep(9000);
		loginClass.sendEventsxpath("//input[@placeholder=\"Search apps or items...\"]", ("labor categories"));
		// Click on Opportunities
		loginClass.clickEventxpath("(//p[@class='slds-truncate'])[2]");
		// Create explicit wait to halt until New button appear
		loginClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='New']")));
		// Click on New Button
		loginClass.clickEventxpath("//a[@title='New']");
		// Create explicit wait to halt until Name button appear
		loginClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Name']")));
		// Sending on Data to Name field
		loginClass.sendEventsxpath("//input[@name='Name']", "Automation");
		// Sending on Data to Description field
		loginClass.sendEventsxpath("//textarea[@class='slds-textarea']", "Automation");
		// Sending on Data to Cost_Per_Hour field
		loginClass.sendEventsxpath("//input[@name='FedCapture__Cost_Per_Hour__c']", "500");
		// Click on Save Button
		loginClass.clickEventxpath("//button[@name='SaveEdit']");
		// Close the browser
		loginClass.openchrome.close();

	}*/

/*	@Test
	// Create Method Create New Employee
	public void CreateNewEmployee() throws Exception {

		// Call the login class to execute
		loginClass.login();// input[@id='input-271']
		// Create explicit wait to halt until search box appear
		loginClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search apps or items...\"]")));
		// Searching Opportunities to search box
		loginClass.sendEventsxpath("//input[@placeholder=\"Search apps or items...\"]", ("Employees"));
		// Click on Opportunities
		loginClass.clickEventxpath("//p[@class='slds-truncate']");
		// Create explicit wait to halt until New button appear
		loginClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='New']")));
		// Click on New Button
		loginClass.clickEventxpath("//a[@title='New']");
		// Create explicit wait to halt until Name button appear
		loginClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Name']")));
		// Sending on Data to Name field
		loginClass.sendEventsxpath("//input[@name='Name']", "QA-Automation");
		// Clear data of Working_Hour field
		loginClass.openchrome.findElement(By.xpath("//input[@name='FedCapture__Working_Hour__c']")).clear();
		// Sending on Data to Working_Hour field
		loginClass.sendEventsxpath("//input[@name='FedCapture__Working_Hour__c']", "80");
		// loginClass.sendEventsxpath("//input[@placeholder='Search Labor
		// Categories...']","Automation");
		loginClass.clickEventxpath("//button[@name='SaveEdit']");
		// Close the browser
		loginClass.openchrome.close();

	}*/

	/*@Test
	// Create Method in resource budget Adding lab emp
	public void rsAdddeletelabemp() throws Exception {

		// Call opprpage object
		loginClass.opprPage();
		loginClass.openchrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Select opportunity with name Automation-Test1
		loginClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-7'])")));
		loginClass.clickEventxpath("(//a[@title='Automation-7'])");
		Thread.sleep(10000);
		// Scrolling page
		loginClass.js.executeScript("window.scrollBy(0,450)");
		// Create explicit wait to halt until Resource Budget section appear
		Thread.sleep(20000);
		loginClass.clickEventxpath("//a[@data-label='Related']");
		Thread.sleep(7000);
		// Click on Resource Budget Section
		loginClass.clickEventxpath("//a[@data-label='Details']");
		Thread.sleep(20000);
		Actions actions = new Actions(loginClass.openchrome);
		for (int i = 1; i <= 6; i++) {
			actions.sendKeys(Keys.TAB).build().perform();

		}
		Thread.sleep(5000);
		actions.sendKeys(Keys.ENTER).build().perform();
		//loginClass.mouseAction("//div[@class='slds-tabs_card'] //li[@title='Resource Budget']");
		// Click on Add row button
		Thread.sleep(12000);
		loginClass
				.jsEx("(//button[@class='slds-button slds-button--neutral slds-not-selected slds-show'])[1]");
		// Create explicit wait to halt until pop-up appear
		Thread.sleep(12000);
		// Sending on Data to labor field
		loginClass.sendEventsxpath(
				"(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])[1]", "QA");
		// Select data from drop-down
		Thread.sleep(8000);
		loginClass.jsEx("//a[text()='QA']");
		// Sending on Data to employee field
		loginClass.sendEventsxpath(
				"(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])[1]",
				"QA-Automation");
		// Select data from drop-down
		Thread.sleep(8000);
		loginClass.jsEx("//a[text()='QA-Automation']");
		// Click on Add button
		loginClass.jsEx("//button[text()='Add']");
		// Sending on Data to time field
		Thread.sleep(8000);
		loginClass.sendEventsxpath(
				"//input[@class='slds-input 1 0 input uiInputSmartNumber uiInput uiInputNumber uiInput--default uiInput--input']",
				"5");
		// Click on Save button
		Thread.sleep(8000);
		loginClass.jsEx("//button[@class='slds-button slds-button--neutral slds-show']");
		// Create explicit wait to halt until alert pop-up appear
		loginClass.wait.until(ExpectedConditions.alertIsPresent());
		// Call alert method
		loginClass.alert();
		// Click on Delete text
		Thread.sleep(8000);
		loginClass.jsEx("(//a[@class='slds-show'])[1]");
		// Create explicit wait to halt until alert pop-up appear
		loginClass.wait.until(ExpectedConditions.alertIsPresent());
		// Call alert method
		loginClass.alert();
		// Close the browser
		loginClass.openchrome.close();

	}*/

	
	/* * @Test //Create Method in resource budget Delete lab emp public void
	 * rsDeletelabemp() throws Exception { //Click on Delete text
	 * loginClass.mouseAction("(//a[@class='slds-show'])[1]"); //Create explicit
	 * wait to halt until alert pop-up appear
	 * loginClass.wait.until(ExpectedConditions.alertIsPresent()); //Call alert
	 * method loginClass.alert(); //Close the browser
	 * loginClass.openchrome.close(); }*/
	 

/*	@Test
	// Create Method in resource budget add lab
	public void rsAddlab() throws Exception {

		// Call opprpage object
		loginClass.opprPage();
		// Create implicit wait for each line
		loginClass.openchrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Select opportunity with name Automation-Test1
		loginClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-5'])")));
		loginClass.clickEventxpath("(//a[@title='Automation-5'])");
		// Wait
		Thread.sleep(10000);
		// Window scrolling
		loginClass.js.executeScript("window.scrollBy(0,700)");
		// Wait
		//Thread.sleep(30000);
		Thread.sleep(20000);
		loginClass.clickEventxpath("//a[@data-label='Related']");
		Thread.sleep(7000);
		// Click on Resource Budget Section
		loginClass.clickEventxpath("//a[@data-label='Details']");
		Thread.sleep(20000);
		Actions actions = new Actions(loginClass.openchrome);
		for (int i = 1; i <= 6; i++) {
			actions.sendKeys(Keys.TAB).build().perform();

		}
		Thread.sleep(5000);
		actions.sendKeys(Keys.ENTER).build().perform();
		// Click on Resource Budget Section
		//loginClass.mouseAction("//div[@class='slds-tabs_card'] //li[@title='Resource Budget']");
		// Click on Add row button
		Thread.sleep(10000);
		loginClass
				.jsEx("(//button[@class='slds-button slds-button--neutral slds-not-selected slds-show'])[1]");
		// Create explicit wait to halt until pop-up appear
		Thread.sleep(10000);
		// Sending on Data to labor field
		loginClass.sendEventsxpath(
				"(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])[1]", "QA");
		// Select data from drop-down
		Thread.sleep(5000);
		loginClass.jsEx("//a[text()='QA']");
		// Click on Add button
		Thread.sleep(8000);
		loginClass.jsEx("//button[text()='Add']");
		// Sending Data to time field
		Thread.sleep(8000);
		loginClass.sendEventsxpath(
				"(//input[@data-aura-class='uiInputSmartNumber uiInput uiInputNumber uiInput--default uiInput--input'])[1]",
				"5");
		// Click on Save button
		Thread.sleep(8000);
		loginClass.jsEx("//button[@class='slds-button slds-button--neutral slds-show']");
		// Create explicit wait to halt until alert pop-up appear
		loginClass.wait.until(ExpectedConditions.alertIsPresent());
		// Call alert method
		loginClass.alert();
		// Close the browser
		loginClass.openchrome.close();
	}
*/
	/*@Test
	// Create Method in resource budget add lab emp with no time
	public void rsAddlabempnotime() throws Exception {

		// Call opprpage object
		loginClass.opprPage();
		loginClass.openchrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Select opportunity with name Automation-Test1
		loginClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-5'])")));
		loginClass.clickEventxpath("(//a[@title='Automation-5'])");
		// Wait
		Thread.sleep(10000);
		// Create explicit wait to halt until banner section appear
		loginClass.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@role='banner']")));
		// Window scrolling
		loginClass.js.executeScript("window.scrollBy(0,500)");
		// Wait
		//Thread.sleep(10000);
		// Click on Resource Budget section
		Thread.sleep(20000);
		loginClass.clickEventxpath("//a[@data-label='Related']");
		Thread.sleep(7000);
		// Click on Resource Budget Section
		loginClass.clickEventxpath("//a[@data-label='Details']");
		Thread.sleep(20000);
		Actions actions = new Actions(loginClass.openchrome);
		for (int i = 1; i <= 6; i++) {
			actions.sendKeys(Keys.TAB).build().perform();

		}
		Thread.sleep(5000);
		actions.sendKeys(Keys.ENTER).build().perform();
		//loginClass.mouseAction("//div[@class='slds-tabs_card'] //li[@title='Resource Budget']");
		// Wait
		Thread.sleep(10000);
		// Click on Add Row button
		loginClass.jsEx("(//button[text()='Add Row'])[1]");
		// Create explicit wait to halt until pop-up appear
		Thread.sleep(10000); // Sending on Data to labor field
		loginClass.sendEventsxpath(
				"(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])[1]", "QA");
		// Select data from drop-down
		Thread.sleep(10000);
		loginClass.jsEx("//a[text()='QA']");
		// Sending on Data to employee field
		loginClass.sendEventsxpath(
				"(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])[1]",
				"QA-Automation");
		// Wait
		Thread.sleep(10000);
		// Select data from drop-down
		loginClass.jsEx("//a[text()='QA-Automation']");
		// Click on Save button
		loginClass.jsEx("//button[text()='Add']");
		// Wait
		Thread.sleep(10000);
		// Click on Save button
		loginClass.jsEx("//button[@class='slds-button slds-button--neutral slds-show']");
		// Create explicit wait to halt until alert pop-up appear
		loginClass.wait.until(ExpectedConditions.alertIsPresent());
		// Call alert method
		loginClass.alert();
		// Close the browser
		loginClass.openchrome.close();

	}*/

/*	@Test
	// Create Method in resource budget add lab emp with more time
	public void rsAddlabempwithmoretime() throws Exception {

		// Call opprpage object
		loginClass.opprPage();
		loginClass.openchrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Select opportunity with name Automation-Test1
		loginClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-Test3'])[1]")));
		loginClass.clickEventxpath("(//a[@title='Automation-Test3'])[1]");
		// Wait
		Thread.sleep(10000);
		// Window scrolling
		loginClass.js.executeScript("window.scrollBy(0,700)");
		// loginClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='slds-tabs_card']
		// //li[@title='Resource Budget']")));
		// Wait
		Thread.sleep(20000);
		loginClass.clickEventxpath("//a[@data-label='Related']");
		Thread.sleep(7000);
		// Click on Resource Budget Section
		loginClass.clickEventxpath("//a[@data-label='Details']");
		Thread.sleep(20000);
		Actions actions = new Actions(loginClass.openchrome);
		for (int i = 1; i <= 6; i++) {
			actions.sendKeys(Keys.TAB).build().perform();

		}
		Thread.sleep(5000);
		actions.sendKeys(Keys.ENTER).build().perform();
		//Thread.sleep(20000);
		// Click on Resource Budget section
		//loginClass.mouseAction("//div[@class='slds-tabs_card'] //li[@title='Resource Budget']");
		// Wait
		Thread.sleep(9000);
		// Click on Add Row button
		loginClass
				.jsEx("(//button[@class='slds-button slds-button--neutral slds-not-selected slds-show'])[1]");
		// Create explicit wait to halt until pop-up appear
		Thread.sleep(10000);
		// Sending on Data to labor field
		loginClass.sendEventsxpath(
				"(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])[1]", "QA");
		// Select data from drop-down
		loginClass.jsEx("//a[text()='QA']");
		// Sending on Data to employee field
		loginClass.sendEventsxpath(
				"(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])[1]",
				"QA-Automation");
		// Wait
		Thread.sleep(9000);
		// Select data from drop-down
		loginClass.jsEx("//a[text()='QA-Automation']");
		// Click on Save button
		loginClass.jsEx("//button[text()='Add']");
		// Wait
		Thread.sleep(9000);
		// Sending on Data to time field
		loginClass.sendEventsxpath(
				"//input[@class='slds-input 1 1 input uiInputSmartNumber uiInput uiInputNumber uiInput--default uiInput--input']",
				"90");
		// Click on Save button
		loginClass.jsEx("//button[@class='slds-button slds-button--neutral slds-show']");
		// Create explicit wait to halt until alert pop-up appear
		loginClass.wait.until(ExpectedConditions.alertIsPresent());
		// Call alert method
		loginClass.alert();
		// Close the browser
		loginClass.openchrome.close();
	}*/

	/*@Test
	// Create Method in resource budget add Cost Hour Scheduled Hours
	public void rsCostHourScheduledHours() throws Exception {

		// Call opprpage object
		loginClass.opprPage();
		loginClass.openchrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Select opportunity with name Automation-Test1
		loginClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-5'])")));
		loginClass.clickEventxpath("(//a[@title='Automation-5'])");
		// Wait
		Thread.sleep(10000);
		// Window scrolling
		loginClass.js.executeScript("window.scrollBy(0,600)");
		// Wait
		Thread.sleep(20000);
		loginClass.clickEventxpath("//a[@data-label='Related']");
		Thread.sleep(7000);
		// Click on Resource Budget Section
		loginClass.clickEventxpath("//a[@data-label='Details']");
		Thread.sleep(20000);
		Actions actions = new Actions(loginClass.openchrome);
		for (int i = 1; i <= 6; i++) {
			actions.sendKeys(Keys.TAB).build().perform();

		}
		Thread.sleep(5000);
		actions.sendKeys(Keys.ENTER).build().perform();
		//Thread.sleep(25000);
		// Click on Resource Budget section
		//loginClass.mouseAction("//div[@class='slds-tabs_card'] //li[@title='Resource Budget']");
		// Wait
		Thread.sleep(9000);
		// Click on Add Row button
		loginClass
				.jsEx("(//button[@class='slds-button slds-button--neutral slds-not-selected slds-show'])[1]");
		// Create explicit wait to halt until pop-up appear
		Thread.sleep(9000);
		// Sending on Data to labor field
		loginClass.sendEventsxpath(
				"(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])[1]", "QA");
		// Select data from drop-down
		Thread.sleep(9000);
		loginClass.jsEx("//a[text()='QA']");
		// Sending on Data to employee field
		Thread.sleep(9000);
		loginClass.sendEventsxpath(
				"(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])[1]",
				"Salesfoce developer");
		// Wait
		Thread.sleep(9000);
		// Select data from drop-down
		loginClass.jsEx("//a[text()='Salesfoce developer']");
		// Click on Save button
		loginClass.jsEx("//button[text()='Add']");
		// Wait
		Thread.sleep(9000);
		// Sending on Data to time field
		loginClass.openchrome.findElement(By.xpath(
			"//input[@class='slds-input 1 1 input uiInputSmartNumber uiInput uiInputNumber uiInput--default uiInput--input']")).sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ENTER));
		// Wait
		Thread.sleep(9000);
		// Create explicit wait to halt until pop-up appear
		loginClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@class='slds-input input  uiInputSmartNumber']")));
		// Wait
		Thread.sleep(12000);
		// Sending on Data to Cost Hour field
		loginClass.sendEventsxpath("//input[@class='slds-input input  uiInputSmartNumber']", "100");
		// Wait
		Thread.sleep(9000);
		// Sending on Data to Scheduled Hours field
		loginClass.sendEventsxpath("//input[@class='slds-input input uiInputSmartNumber']", "10");
		// Wait
		Thread.sleep(9000);
		// Click on Save button
		loginClass.jsEx("(//button[@class='slds-button slds-button--neutral slds-button--brand'])[3]");
		// Wait
		Thread.sleep(10000);
		// Click on Save button
		loginClass.jsEx("//button[@class='slds-button slds-button--neutral slds-show']");
		// Create explicit wait to halt until alert pop-up appear
		loginClass.wait.until(ExpectedConditions.alertIsPresent());
		// Call alert method
		loginClass.alert();
		// Close the browser
		loginClass.openchrome.close();

	}*/

	@Test
	// Create Method in resource budget add emp
	public void rsAddemp() throws Exception {

		// Call opprpage object
		loginClass.opprPage();
		loginClass.openchrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Select opportunity with name Automation-Test1
		loginClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-5'])")));
		loginClass.clickEventxpath("(//a[@title='Automation-5'])");
		// Wait
		Thread.sleep(10000);
		// Window scrolling
		loginClass.js.executeScript("window.scrollBy(0,700)");
		// Wait
		Thread.sleep(20000);
		loginClass.clickEventxpath("//a[@data-label='Related']");
		Thread.sleep(7000);
		// Click on Resource Budget Section
		loginClass.clickEventxpath("//a[@data-label='Details']");
		Thread.sleep(20000);
		Actions actions = new Actions(loginClass.openchrome);
		for (int i = 1; i <= 6; i++) {
			actions.sendKeys(Keys.TAB).build().perform();

		}
		Thread.sleep(5000);
		actions.sendKeys(Keys.ENTER).build().perform();
		//Thread.sleep(20000);
		// Click on Resource Budget section
		//loginClass.mouseAction("//div[@class='slds-tabs_card'] //li[@title='Resource Budget']");
		// Wait
		Thread.sleep(10000);
		// Click on Add Row button
		loginClass.jsEx
			("(//button[@class='slds-button slds-button--neutral slds-not-selected slds-show'])[1]");
		// Create explicit wait to halt until pop-up appear
		loginClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])[1]")));
		// Sending on Data to labor field
		loginClass.sendEventsxpath(
				"(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])[1]",
				"Automation");
		// Wait
		Thread.sleep(9000);
		// Select data from drop-down
		loginClass.mouseAction("//a[text()='Automation']");
		// Click on Save button
		loginClass.mouseAction("//button[text()='Add']");
		// Wait
		Thread.sleep(10000);
		// Click on employee field
		loginClass.mouseAction("(//a[text()='Add Employee'])[2]");
		// Wait
		Thread.sleep(9000);
		// Sending on Data to employee field
		loginClass.sendEventsxpath(
				"(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])[2]",
				"Android developer");
		// Wait
		Thread.sleep(9000);
		// Select data from drop-down
		loginClass.mouseAction("//a[text()='Android developer']");
		// Click on Ok button
		loginClass.mouseAction("//button[text()='Ok']");
		// Wait
		Thread.sleep(10000);
		// Sending on Data to time field
		loginClass.sendEventsxpath(
				"//input[@class='slds-input 4 0 input uiInputSmartNumber uiInput uiInputNumber uiInput--default uiInput--input']",
				"5");
		// Click on Save button
		loginClass.mouseAction("//button[@class='slds-button slds-button--neutral slds-show']");
		// Create explicit wait to halt until alert pop-up appear
		loginClass.wait.until(ExpectedConditions.alertIsPresent());
		// Call alert method
		loginClass.alert();
		// Close the browser
		loginClass.openchrome.close();
	}

	/*@Test
	// Create Method in resource budget add expense
	public void rsAddexpense() throws Exception {

		// Call opprpage object
		loginClass.opprPage();
		loginClass.openchrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Select opportunity with name Automation-Test1
		loginClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-Test2'])[1]")));
		loginClass.clickEventxpath("(//a[@title='Automation-Test2'])[1]");
		// Wait
		Thread.sleep(10000);
		// Window scrolling
		loginClass.js.executeScript("window.scrollBy(0,700)");
		// Wait
		Thread.sleep(25000);
		// Click on Resource Budget section
		loginClass.mouseAction("//div[@class='slds-tabs_card'] //li[@title='Resource Budget']");
		// Wait
		Thread.sleep(10000);
		// Click on Add Row button
		loginClass
				.mouseAction("(//button[@class='slds-button slds-button--neutral slds-not-selected slds-show'])[2]");
		// Wait
		Thread.sleep(10000);
		// Calling Select class
		Select expense = new Select(loginClass.openchrome.findElement(By.xpath(
				"//select[@class='slds-input half-width select uiInput uiInputSelect uiInput--default uiInput--select']")));
		// Select data from drop-down
		expense.selectByValue("Facilities");
		// Wait
		// Thread.sleep(9000);

		// loginClass.mouseAction("//option[@value='Facilities']");
		// Wait
		Thread.sleep(12000);
		// Click on Add Expense
		loginClass.mouseAction("//button[text()='Add Expense']");
		// Wait
		Thread.sleep(12000);
		// clear all data of expense field
		loginClass.openchrome
				.findElement(By.xpath(
						"(//input[@data-aura-class='uiInputSmartNumber uiInput uiInput--default uiInput--input'])[2]"))
				.sendKeys(Keys.chord(Keys.CONTROL, Keys.BACK_SPACE));
		// Wait
		Thread.sleep(12000);
		// send data to expense field
		loginClass.openchrome
				.findElement(By.xpath(
						"(//input[@data-aura-class='uiInputSmartNumber uiInput uiInput--default uiInput--input'])[2]"))
				.sendKeys("150");
		// Wait
		Thread.sleep(9000);
		// Click on save button
		loginClass.mouseAction("//button[text()='Save Expense']");
		// Close the browser
		loginClass.openchrome.close();

	}

	@Test
	// Create Method in resource budget add Start end date more than 60days
	public void rsStartenddatemorethan60days() throws Exception {

		// Call opprpage object
		loginClass.opprPage();
		loginClass.openchrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Select opportunity with name Automation-Test1
		loginClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-Test2'])[1]")));
		loginClass.clickEventxpath("(//a[@title='Automation-Test2'])[1]");
		// Wait
		Thread.sleep(10000);
		// Window scrolling
		loginClass.js.executeScript("window.scrollBy(0,700)");
		// Wait
		Thread.sleep(20000);
		// Click on Resource Budget section
		loginClass.mouseAction("//div[@class='slds-tabs_card'] //li[@title='Resource Budget']");
		// Wait
		Thread.sleep(10000);
		// Click on Start date field
		loginClass.mouseAction("(//input[@class='slds-input dateVF_BP input'])[1]");
		// Wait
		Thread.sleep(9000);
		// Select current DATE
		loginClass.mouseAction(
				"//span[@class='slds-day weekday todayDate selectedDate DESKTOP uiDayInMonthCell--default']");
		// Wait
		Thread.sleep(10000);
		// Click on end date field
		loginClass.mouseAction("(//input[@class='slds-input dateVF_BP input'])[2]");
		// Wait
		Thread.sleep(9000);
		// Click on next month arrow
		loginClass.mouseAction("//a[@title='Go to next month']");
		// Wait
		Thread.sleep(9000);
		// Click on next month arrow
		loginClass.mouseAction("//a[@title='Go to next month']");
		// Wait
		Thread.sleep(7000);
		// Select date 25
		loginClass.mouseAction("//span[text()='25']");
		// Wait
		Thread.sleep(7000);
		// Click on Go button
		loginClass.mouseAction("(//button[@class='slds-button slds-button--neutral slds-not-selected'])[2]");
		// Wait
		Thread.sleep(7000);
		// Capture error text
		String Text = loginClass.openchrome.findElement(By.xpath("//div[@class='slds-notify__content slds-grid']"))
				.getText();
		// Print error text
		System.out.println("Error message :  " + Text);
		// Wait
		Thread.sleep(7000);
		// Call add row button method
		loginClass.addRowbutton();
		// Close the browser
		loginClass.openchrome.close();

	}

	@Test
	// Create Method in resource budget Display unit select month and year
	public void rsDisplayunit() throws Exception {

		// Call opprpage object
		loginClass.opprPage();
		loginClass.openchrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Select opportunity with name Automation-Test1
		loginClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-Test2'])[1]")));
		loginClass.clickEventxpath("(//a[@title='Automation-Test2'])[1]");
		// Wait
		Thread.sleep(10000);
		// Window scrolling
		loginClass.js.executeScript("window.scrollBy(0,700)");
		// Wait
		Thread.sleep(20000);
		// Click on Resource Budget section
		loginClass.mouseAction("//div[@class='slds-tabs_card'] //li[@title='Resource Budget']");
		// Wait
		Thread.sleep(10000);
		// Click on display unit
		loginClass.mouseAction("(//input[@class='slds-input dateVF_BP input'])[1]");
		// Wait
		Thread.sleep(10000);
		// calling select class
		Select DisplayUnit = new Select(loginClass.openchrome.findElement(By
				.xpath("//select[@class='slds-input select uiInput uiInputSelect uiInput--default uiInput--select']")));
		// select month
		DisplayUnit.selectByValue("Month");
		// Print select value
		System.out.println("Month is selected");
		// Wait
		Thread.sleep(7000);
		// call add row button method
		loginClass.addRowbutton();
		// Wait
		Thread.sleep(12000);
		// Select year
		DisplayUnit.selectByValue("Year");
		// Print select value
		System.out.println("Year is selected");
		// Wait
		Thread.sleep(7000);
		// call add row button method
		loginClass.addRowbutton();
		// Close the browser
		loginClass.openchrome.close();

	}*/

	@AfterMethod
	public void tearDown(ITestResult result) {

		// Here will compare if test is failing then only it will enter into if
		// condition
		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				// Create refernce of TakesScreenshot and Call method to capture screenshot
				File src = ((TakesScreenshot) loginClass.openchrome).getScreenshotAs(OutputType.FILE);
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
