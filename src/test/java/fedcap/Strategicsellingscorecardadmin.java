package fedcap;



import java.io.File;
import java.util.List;
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
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Strategicsellingscorecardadmin {
	// Create object login class of login class
	Login loginClass = new Login();
	Utilies1 utiliesClass = new Utilies1();

	@Test
	// Create Method Create New Employee
	public void addQuestions() throws Exception {

		String[] options = { "Prospecting", "Prospecting", "Qualification", "Needs Analysis", "Value Proposition",
				"Prospecting" };
		loginClass.login();// input[@id='input-271']
		// Create explicit wait to halt until search box appear
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search apps or items...\"]")));
		// Searching Opportunities to search box
		utiliesClass.sendEventsxpath("//input[@placeholder=\"Search apps or items...\"]",
				("Strategic Selling Scorecard Admin"));
		// Click on Opportunities
		utiliesClass.clickEventxpath("//p[@class='slds-truncate']");
		// Thread.sleep(20000);
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@title='Add Row'])[1]")));

		for (int i = 1; i <= 5; i++) {
			utiliesClass.clickEventxpath("(//button[@title='Add Row'])[1]");
			Thread.sleep(7000);
			utiliesClass.openchrome.findElement(By.xpath("(//select[@class='slds-select'])[" + i + "]"))
					.sendKeys(options[i]);
			Thread.sleep(7000);
			utiliesClass.sendEventsxpath("(//textarea[@class='slds-textarea'])[" + i + "]", "testing purpose");

		}
		System.out.println("5 Questions added succesfully");
		utiliesClass.clickEventxpath("(//*[@class='slds-checkbox_faux'])[5]");
		System.out.println("Uncheck active button of 5th Question");
		utiliesClass.clickEventxpath("(//*[@data-key='delete'])[4]");
		System.out.println("4 no. Question Deleted succesfully");
		Thread.sleep(9000);
		utiliesClass.clickEventxpath("(//*[@data-key='add'])[2]");
		utiliesClass.sendEventsxpath("(//select[@class='slds-select'])[5]", "Prospecting");
		utiliesClass.sendEventsxpath("(//textarea[@class='slds-textarea'])[5]", "testing purpose");
		System.out.println("Add 5th Question succesfully by click on + icon");
		utiliesClass.clickEventxpath("(//button[@title='Success'])");
		// Close the browser
		utiliesClass.openchrome.close();

	}

	@Test
	// Create Method Create New Employee
	public void getCurrentstatus() throws Exception { // Call opprpage object
		loginClass.opprPage();
		utiliesClass.openchrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Select opportunity with name Automation-Test1
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-Test2'])[1]")));
		utiliesClass.clickEventxpath("(//a[@title='Automation-Test2'])[1]");
		// Wait
		Thread.sleep(10000);
		// Window scrolling
		utiliesClass.js.executeScript("window.scrollBy(0,700)");
		// Wait
		Thread.sleep(40000);
		// Click on Resource Budget section
		utiliesClass.clickEventxpath("//a[@data-label='Scorecard']");
		Thread.sleep(10000);
		utiliesClass.clickEventxpath("(//*[@class='slds-radio_faux'])[3]");
		utiliesClass.clickEventxpath("(//*[@class='slds-radio_faux'])[5]");
		utiliesClass.clickEventxpath("(//*[@class='slds-radio_faux'])[12]");
		Thread.sleep(10000);
		// utiliesClass.openchrome.findElement(By.xpath("(//*[@class='slds-radio_faux'])[12]")).sendKeys(Keys.chord(Keys.TAB,Keys.ENTER));
		// utiliesClass.openchrome.findElement(By.xpath("")).sendKeys(Keys.ENTER);
		Actions actions = new Actions(utiliesClass.openchrome);
		for (int i = 1; i <= 6; i++)

		{
			actions.sendKeys(Keys.TAB).build().perform();

		}
		actions.sendKeys(Keys.ENTER).build().perform();
		String message = utiliesClass.openchrome.findElement(By.xpath("(//*[@data-key='success'])[1]")).getText();
		System.out.println("The Success message --- " + message);
		// Close the browser
		utiliesClass.openchrome.close();

	}

	@Test
	// Create Method Create New Employee
	public void getPrintpreview() throws Exception { // Call opprpage object
		loginClass.opprPage();
		utiliesClass.openchrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Select opportunity with name Automation-Test1
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-Test2'])[1]")));
		utiliesClass.clickEventxpath("(//a[@title='Automation-Test2'])[1]");
		// Wait
		Thread.sleep(10000);
		// Window scrolling
		utiliesClass.js.executeScript("window.scrollBy(0,700)");
		// Wait
		Thread.sleep(40000);
		// Click on Resource Budget section
		utiliesClass.clickEventxpath("//a[@data-label='Scorecard']");
		Thread.sleep(10000);
		Actions actions = new Actions(utiliesClass.openchrome);
		for (int i = 1; i <= 4; i++)

		{
			actions.sendKeys(Keys.TAB).build().perform();

		}
		actions.sendKeys(Keys.ENTER).build().perform();
		System.out.println("Print successfully");
		// Close the browser
		utiliesClass.openchrome.close();
	}

	@Test
	// Create Method Create New Employee
	public void getStagenameanswer() throws Exception { // Call opprpage object
		loginClass.opprPage();
		utiliesClass.openchrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Select opportunity with name Automation-Test1
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-Test2'])[1]")));
		utiliesClass.clickEventxpath("(//a[@title='Automation-Test2'])[1]");
		// Wait
		Thread.sleep(10000);
		// Window scrolling
		utiliesClass.js.executeScript("window.scrollBy(0,700)");
		// Wait
		Thread.sleep(40000);
		// Click on Resource Budget section
		utiliesClass.clickEventxpath("//a[@data-label='Scorecard']");
		Thread.sleep(20000);
		utiliesClass.openchrome.findElement(By.xpath("(//a[@class='slds-tabs--default__link'])[2]"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(9000);
		String message = utiliesClass.openchrome.findElement(By.xpath("(//div[@class='stageBtn'])[1]")).getText();
		System.out.println("Stage name --- " + message);
		utiliesClass.clickEventxpath("(//*[@class='slds-radio_faux'])[20]");
		String message1 = utiliesClass.openchrome.findElement(By.xpath("(//div[@class='stageBtn'])[2]")).getText();
		System.out.println("Stage name --- " + message1);
		utiliesClass.clickEventxpath("(//*[@class='slds-radio_faux'])[21]");
		Actions actions = new Actions(utiliesClass.openchrome);
		for (int i = 1; i <= 13; i++)

		{
			actions.sendKeys(Keys.TAB).build().perform();

		}
		actions.sendKeys(Keys.ENTER).build().perform();

		if (utiliesClass.openchrome.findElement(By.xpath("(//*[@data-key='success'])[1]")).isDisplayed()) {
			String message2 = utiliesClass.openchrome.findElement(By.xpath("(//*[@data-key='success'])[1]")).getText();

			System.out.println("The Success message --- " + message2);
		} else {
			System.out.println("The Success message");
		}
		// Close the browser
		utiliesClass.openchrome.close();
	}

	@Test
	// Create Method Create New Employee
	public void getStagprint() throws Exception {
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
		utiliesClass.js.executeScript("window.scrollBy(0,700)");
		// Wait
		Thread.sleep(40000);
		// Click on Resource Budget section
		utiliesClass.clickEventxpath("//a[@data-label='Scorecard']");
		Thread.sleep(20000);
		utiliesClass.openchrome.findElement(By.xpath("(//a[@class='slds-tabs--default__link'])[2]"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(10000);
		Actions actions = new Actions(utiliesClass.openchrome);
		for (int i = 1; i <= 3; i++)

		{
			actions.sendKeys(Keys.TAB).build().perform();

		}
		Thread.sleep(9000);
		actions.sendKeys(Keys.ENTER).build().perform();
		System.out.println("Print successfully");
		// Close the browser
		utiliesClass.openchrome.close();
	}

	@Test
	// Create Method Create New Employee
	public void selectStagestandardlevel() throws Exception {
		// Call opprpage object
		loginClass.opprPage();
		utiliesClass.openchrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Select opportunity with name Automation-Test1
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-Test2'])[1]")));
		utiliesClass.clickEventxpath("(//a[@title='Automation-Test2'])[1]");
		// Wait
		Thread.sleep(40000);
		Actions actions = new Actions(utiliesClass.openchrome);
		for (int i = 1; i <= 12; i++) {
			actions.sendKeys(Keys.TAB).build().perform();

		}
		Thread.sleep(5000);
		actions.sendKeys(Keys.ENTER).build().perform();
		System.out.println("Successfully");
		Thread.sleep(9000);
		if (utiliesClass.openchrome.findElement(By.xpath("//div[@class='slds-modal__container']")).isDisplayed()) {
			Thread.sleep(7000);
			utiliesClass.openchrome.findElement(By.xpath("(//div[@class='slds-radio_button-group'])[3]")).click();
			Thread.sleep(7000);
			utiliesClass.openchrome.findElement(By.xpath("//button[@title='Save']")).sendKeys(Keys.ENTER);
		}

		else {
			System.out.println("Successfully");

		}

		// Close the browser
		utiliesClass.openchrome.close();
	}

	@Test
	// Create Method Create New Employee
	public void editStagesdetailpage() throws Exception {
		// Call opprpage object
		loginClass.opprPage();
		// Implicit wait
		utiliesClass.openchrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Select opportunity with name Automation-Test2
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-Test2'])[1]")));
		utiliesClass.clickEventxpath("(//a[@title='Automation-Test2'])[1]");
		// Wait
		Thread.sleep(10000);
		// Window scrolling
		utiliesClass.js.executeScript("window.scrollBy(0,700)");
		// Wait
		Thread.sleep(30000);
		// Click on Resource Budget section
		utiliesClass.mouseAction("(//*[@id='OpportunitySummary'] //*[@class='editicon'])[1]");
		// Wait
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Name']")));
		// wait
		Thread.sleep(2000);
		// enter stage name
		utiliesClass.enterDataevent1("(//input[@name='StageName'])[3]");
		// Click on save button
		Thread.sleep(9000);
		utiliesClass.mouseAction("(//button[@class='slds-button slds-button_brand'])[2]");
		// Print data
		System.out.println("Stage Name Edited Successfully");
		// Close the browser
		utiliesClass.openchrome.close();
	}

	@Test
	// Create Method edit Opportunity by edit button
	public void editStageseditpage() throws Exception

	{

		// Call opprpage object
		loginClass.opprPage();
		// Select opportunity with name Automation-Test4
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Automation-Test4']")));
		utiliesClass.clickEventxpath("//a[@title='Automation-Test4']");
		// Click on edit button
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Edit']")));
		utiliesClass.clickEventxpath("//button[text()='Edit']");
		// Implicit wait
		Thread.sleep(10000);
		// Edit StageName
		utiliesClass.enterDataevent1("//input[@name='StageName']");
		// Click on save button
		utiliesClass.clickEventxpath("(//button[@class='slds-button slds-button_brand '])[2]");
		Thread.sleep(9000);
		utiliesClass.clickEventxpath("(//*[@class='slds-button slds-radio_button'])[3]");
		Thread.sleep(7000);
		utiliesClass.openchrome.findElement(By.xpath("//button[@title='Save']")).sendKeys(Keys.ENTER);
		// Print data
		System.out.println("Stage Name Edited Successfully");
		// Close the browser
		utiliesClass.openchrome.close();
	}

	@Test
	// Create Method Create New Employee
	public void OverdueWinnabilityItems() throws Exception { // Call opprpage object
		loginClass.opprPage();
		utiliesClass.openchrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Select opportunity with name Automation-Test1
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-Test2'])[1]")));
		utiliesClass.clickEventxpath("(//a[@title='Automation-Test2'])[1]");
		// Wait
		Thread.sleep(10000);
		// Window scrolling
		utiliesClass.js.executeScript("window.scrollBy(0,700)");
		// Wait
		Thread.sleep(40000);
		// Click on Resource Budget section
		utiliesClass.clickEventxpath("//a[@data-label='Scorecard']");
		Thread.sleep(20000);
		utiliesClass.openchrome.findElement(By.xpath("(//a[@class='slds-tabs--default__link'])[3]"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(9000);
		// Thread.sleep(9000);
		String message = utiliesClass.openchrome.findElement(By.xpath("(//div[@class='main-class'])")).getText();
		System.out.println(message);
		// Close the browser
		utiliesClass.openchrome.close();

	}

	@Test
	// Create Method Create New Employee
	public void RecentStagequestionselect() throws Exception { // Call opprpage object
		loginClass.opprPage();
		utiliesClass.openchrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Select opportunity with name Automation-Test1
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-Test2'])[1]")));
		utiliesClass.clickEventxpath("(//a[@title='Automation-Test2'])[1]");
		// Wait
		Thread.sleep(10000);
		// Window scrolling
		utiliesClass.js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(30000);
		// Click on Resource Budget section
		// utiliesClass.clickEventxpath("//a[@data-label='Scorecard']");
		// Thread.sleep(20000);
		String message = utiliesClass.openchrome
				.findElement(By.xpath("(//div[@class='tableHeader FedCaptureOppStageRecentActivity'])")).getText();
		System.out.println(message);
		utiliesClass.clickEventxpath("(//div[@class='slds-radio_button-group'])[3]");
		System.out.println("Recent stage question present");
		utiliesClass.openchrome.findElement(By.xpath("//button[@title='Save']")).sendKeys(Keys.ENTER);
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
