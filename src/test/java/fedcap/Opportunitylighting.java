package fedcap;



import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Opportunitylighting {
	// Create object login class of login class
	Login loginClass = new Login();
	Utilies1 utiliesClass = new Utilies1();

	@Test
	// Create Method Create New Opportunity
	public void CreateNewOpportunity() throws Exception {
		// Call opprpage object
		loginClass.opprPage();
		// Create explicit wait to halt until New button appear
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='New']")));
		// Click on New button
		utiliesClass.clickEventxpath("//a[@title='New']");
		// Create explicit wait to halt until RFP text appear
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='RFP']")));
		// Click on RFP text
		utiliesClass.clickEventxpath("//*[text()='RFP']");
		// Click on Next button
		utiliesClass.clickEventxpath("//*[text()='Next']");

		// filling data of Opportunity Health section

		// Create explicit wait to halt until Knowledge of Customer field appear
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@name='FedCapture__Knowledge_of_Customer__c']")));
		// Send 1 to Knowledge of Customer field
		utiliesClass.enterDataevent("//input[@name='FedCapture__Knowledge_of_Customer__c']");
		// Send 1 to Management Solution Match to Req.
		utiliesClass.enterDataevent("//input[@name='FedCapture__Management_Solution_Match_to_Req__c']");
		// Send 1 to Availability of Key Personnel
		utiliesClass.enterDataevent("//input[@name='FedCapture__Availability_of_Key_Personnel__c']");
		// Send 1 to Match to Strategic Focus
		utiliesClass.enterDataevent("//input[@name='FedCapture__Match_to_Strategic_Focus__c']");
		// Send 1 to Technical Solution Match to Req.
		utiliesClass.enterDataevent("//input[@name='FedCapture__Technical_Solution_Match_to_Req__c']");
		// Send 1 to Related Past Performance
		utiliesClass.enterDataevent("//input[@name='FedCapture__Related_Past_Performance__c']");
		// Send 1 to Teaming
		utiliesClass.enterDataevent("//input[@name='FedCapture__Teaming__c']");

//filling data of Opportunity Summary section  

		// Send Automation-Test to Opportunity Name
		utiliesClass.sendEventsxpath("//input[@name='Name']", " Automation-Test4");
		// Send Needs Analysis to Stage to Stage
		utiliesClass.enterDataevent("//input[@name='StageName']");
		// Send data Stage to Account
		utiliesClass.enterDataevent("//input[@placeholder='Search Accounts...']");
		// Wait
		Thread.sleep(2000);
		// Send data Stage to Stage
		utiliesClass.enterDataevent("//input[@placeholder='Search Accounts...']");
		Thread.sleep(2000);
		// Send 123456 to Total Contract Value
		utiliesClass.sendEventsxpath("//input[@name='Amount']", "123456");
		// Send data to Our Role
		utiliesClass.enterDataevent("//input[@name='FedCapture__Our_Role__c']");
		// Send data to Our Workshare %
		utiliesClass.enterDataevent("//input[@name='FedCapture__Workshare__c']");
		// Send data for testing purpose to Stage to RFP/Solicitation ID
		utiliesClass.enterDataevent("//input[@name='FedCapture__RFP_Number__c']");
		// Send data to Contract Vehicle
		utiliesClass.enterDataevent("//input[@name='FedCapture__Contract_Vehicle__c']");
		// Selecting optionsto Contract_Type
		Actions actions = new Actions(utiliesClass.openchrome);
		utiliesClass.clickEventxpath("//span[@title='Time & Materials']");
		actions.keyDown(Keys.CONTROL).build().perform();
		utiliesClass.clickEventxpath("//span[@title='Cost Plus']");
		utiliesClass.clickEventxpath("//span[@title='Firm Fixed Price']");
		actions.keyUp(Keys.CONTROL).build().perform();
		utiliesClass.clickEventxpath("//button[@title='Move selection to Chosen']");
		// Send data Competition Type
		utiliesClass.enterDataevent("//input[@name='FedCapture__Compition__c']");
		// Send datato Type
		utiliesClass.enterDataevent("//input[@name='Type']");
		// Selecting test1 to Original_Opportunity
		utiliesClass.enterDataevent("//input[@placeholder='Search Opportunities...']");
		// Send data for testing purpose to Next Step
		utiliesClass.sendEventsxpath("//input[@name='NextStep']", "Test Step");

		// filling data of Important Dates section

		// Send 13 to RFI Release Date
		utiliesClass.clickEventxpath("//input[@name='FedCapture__RFI_Release_Date__c']");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='13']")));
		utiliesClass.clickEventxpath("//span[text()='13']");
		// Send 14 to Draft RFP Release Date
		utiliesClass.clickEventxpath("//input[@name='FedCapture__Draft_RFP_Release_Date__c']");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='14']")));
		utiliesClass.clickEventxpath("//span[text()='14']");
		// Send 15 to RFP Release Date
		utiliesClass.clickEventxpath("//input[@name='FedCapture__Solicitation_Date__c']");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='14']")));
		utiliesClass.clickEventxpath("//span[text()='15']");
		// Send 16 to RFP Release Date
		utiliesClass.clickEventxpath("//input[@name='FedCapture__Submission_Date__c']");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='14']")));
		utiliesClass.clickEventxpath("//span[text()='16']");
		// Send 17 to Proposal Due Date
		utiliesClass.clickEventxpath("//input[@name='CloseDate']");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='13']")));
		utiliesClass.clickEventxpath("//span[text()='17']");
		// Send 18 to Award Date
		utiliesClass.clickEventxpath("//input[@name='FedCapture__Start_Date__c']");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='13']")));
		utiliesClass.clickEventxpath("//span[text()='18']");
		// Send 24to Period of Performance (Months)
		utiliesClass.sendEventsxpath("//input[@name='FedCapture__Period_of_Performance_Months__c']", "24");
		// Click on save button
		utiliesClass.clickEventxpath("(//button[@class='slds-button slds-button_brand'])[2]");

		// utiliesClass.openchrome.close();

	}

	@Test
	// Create Method edit Opportunity by edit button
	public void editOpportunitybyeditbutton() throws Exception

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
		utiliesClass.openchrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Edit Knowledge of Customer field
		utiliesClass.enterDataevent("//input[@name='FedCapture__Knowledge_of_Customer__c']");
		// Edit Management Solution Match to Req.
		utiliesClass.enterDataevent("//input[@name='FedCapture__Management_Solution_Match_to_Req__c']");
		// Edit StageName
		utiliesClass.enterDataevent("//input[@name='StageName']");
		// Edit Amount
		utiliesClass.openchrome.findElement(By.xpath("//input[@name='Amount']")).clear();
		utiliesClass.sendEventsxpath("//input[@name='Amount']", "654321");
		// Edit Solicitation_Date
		utiliesClass.clickEventxpath("//input[@name='FedCapture__Solicitation_Date__c']");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='20']")));
		utiliesClass.clickEventxpath("//span[text()='20']");
		// Edit Period_of_Performance_Months
		utiliesClass.openchrome.findElement(By.xpath("//input[@name='FedCapture__Period_of_Performance_Months__c']"))
				.clear();
		utiliesClass.sendEventsxpath("//input[@name='FedCapture__Period_of_Performance_Months__c']", "36");
		// Click on save button
		utiliesClass.clickEventxpath("(//button[@class='slds-button slds-button_brand '])[2]");
		// Print data
		System.out.println("Opportunity Edited Successfully");
		// utiliesClass.openchrome.close();
	}

	@Test
	// Create Method edit Opportunity by pencil icon
	public void editOpportunitybypencilicon() throws Exception

	{

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
		Thread.sleep(20000);
		// Click on Resource Budget section
		utiliesClass.mouseAction("(//*[@id='OpportunitySummary'] //*[@class='editicon'])[1]");
		// Wait
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Name']")));

		// filling data of Opportunity Summary section

		// Clear Opportunity Name
		utiliesClass.openchrome.findElement(By.xpath("//input[@name='Name']")).clear();
		// Enter Opportunity Name
		utiliesClass.sendEventsxpath("//input[@name='Name']", " Automation-Test5");
		// wait
		Thread.sleep(2000);
		// enter stage name
		utiliesClass.enterDataevent("(//input[@name='StageName'])[3]");
		// Edit data of account
		Thread.sleep(2000);
		utiliesClass.openchrome.findElement(By.xpath("(//button[@title='Clear Selection'])[1]")).click();
		utiliesClass.enterDataevent("//input[@placeholder='Search Accounts...']");
		// Wait
		Thread.sleep(2000);
		// Edit Total Contract Value
		utiliesClass.openchrome.findElement(By.xpath("//input[@name='Amount']")).clear();
		utiliesClass.sendEventsxpath("//input[@name='Amount']", "6");
		// Editing options to Contract_Type
		Actions actions = new Actions(utiliesClass.openchrome);
		utiliesClass.clickEventxpath("//span[@title='Time & Materials']");
		utiliesClass.clickEventxpath("//button[@title='Move selection to Available']");
		Thread.sleep(2000);
		utiliesClass.clickEventxpath("//span[@title='Cost Plus']");
		actions.keyDown(Keys.CONTROL).build().perform();
		utiliesClass.clickEventxpath("//span[@title='Firm Fixed Price']");
		actions.keyUp(Keys.CONTROL).build().perform();
		utiliesClass.clickEventxpath("//button[@title='Move selection to Chosen']");
		// Edit RFP Release Date
		utiliesClass.clickEventxpath("//input[@name='FedCapture__Solicitation_Date__c']");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='15']")));
		utiliesClass.clickEventxpath("//span[text()='15']");
		// edit Proposal Due Date
		utiliesClass.clickEventxpath("//input[@name='FedCapture__Submission_Date__c']");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='16']")));
		utiliesClass.clickEventxpath("//span[text()='18']");
		// edit award Date
		utiliesClass.clickEventxpath("//input[@name='CloseDate']");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='18']")));
		utiliesClass.clickEventxpath("//span[text()='19']");
		// Click on save button
		Thread.sleep(2000);
		utiliesClass.mouseAction("(//button[@class='slds-button slds-button_brand'])[2]");
		// Print data
		System.out.println("Opportunity Edited Successfully");
		// utiliesClass.openchrome.close();
	}

	@Test
	// Create Method clone Opportunity
	public void cloneOpportunity() throws Exception {
		// Call opprpage object
		loginClass.opprPage();

		// Create explicit wait to halt until Automation-Test1 appear
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-Test2'])[1]")));
		// Select opportunity with name Automation-Test1
		utiliesClass.clickEventxpath("(//a[@title='Automation-Test2'])[1]");
		// Create explicit wait to halt until change owner button appear
		utiliesClass.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@name='ChangeOwnerOne']")));
		// Click on button change owner
		utiliesClass.openchrome.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']"))
				.sendKeys(Keys.ENTER);
		// Create explicit wait to halt until clone option appear
		utiliesClass.wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@name='FedCapture__CloneButton_LDS']")));
		// Click on button clone
		utiliesClass.clickEventxpath("//a[@name='FedCapture__CloneButton_LDS']");
		// Create explicit wait to halt until Oppr name field appear
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='slds-input'])[1]")));
		// Clear data of Oppr name field
		utiliesClass.openchrome.findElement(By.xpath("(//input[@class='slds-input'])[1]")).clear();
		// Send data to Oppr name field
		utiliesClass.sendEventsxpath("(//input[@class='slds-input'])[1]", "Automation-cloneTest2");
		// Click on button Save
		utiliesClass.clickEventxpath("(//button[@class='slds-button slds-button_brand '])[2]");
		// Close the browser
		utiliesClass.openchrome.close();
	}

	@Test
	// Create Method change owner Opportunity
	public void changeownerOpportunity() throws Exception {
		// Call opprpage object
		loginClass.opprPage();

		// Create explicit wait to halt until Automation-Test1 appear
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-Test3'])[1]")));
		// Select opportunity with name Automation-Test1
		utiliesClass.clickEventxpath("(//a[@title='Automation-Test3'])[1]");
		// Create explicit wait to halt until Automation-Test1 appear
		utiliesClass.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@name='ChangeRecordType']")));
		// Click on button change owner
		utiliesClass.openchrome.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']"))
				.sendKeys(Keys.ENTER);
		utiliesClass.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@name='ChangeOwnerOne']")));
		// Click on button change owner
		utiliesClass.clickEventxpath("//a[@name='ChangeOwnerOne']");
		// search owner with name
		utiliesClass.sendEventsxpath("//input[@title='Search Users']", "rohan Deoskar");
		// Create explicit wait to halt until search result appear
		utiliesClass.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@name='ChangeOwnerOne']")));
		// Click on button change owner
		utiliesClass.clickEventxpath("//div[@class='modal-container slds-modal__container'] //div[@role='listbox']");
		// Create explicit wait to halt until search result name appear
		// utiliesClass.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='name']")));
		// Click on button of search result name
		Thread.sleep(9000);
		utiliesClass.clickEventxpath("//div[@class='name']");
		// Click on button submit
		Thread.sleep(7000);
		utiliesClass.clickEventxpath("//button[@title='Submit']");
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
