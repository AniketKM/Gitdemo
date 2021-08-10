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
//tilies1 loginClass = new Utilies1();

@Test
	// Create Method Create New Opportunity
	public void CreateNewOpportunity() throws Exception {
		// Call opprpage object
		loginClass.opprPage();
		Thread.sleep(9000);
		// Create explicit wait to halt until New button appear
	//oginClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='New']")));
		// Click on New button
		loginClass.clickEventxpath("//a[@title='New']");
		// Create explicit wait to halt until RFP text appear
		loginClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='RFP']")));
		// Click on RFP text
		loginClass.clickEventxpath("//*[text()='RFP']");
		// Click on Next button
		loginClass.clickEventxpath("//*[text()='Next']");

		// filling data of Opportunity Health section

		// Create explicit wait to halt until Knowledge of Customer field appear
		loginClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@name='FedCapture__Knowledge_of_Customer__c']")));
		// Send 1 to Knowledge of Customer field
		loginClass.enterDataevent("//input[@name='FedCapture__Knowledge_of_Customer__c']");
		// Send 1 to Management Solution Match to Req.
		loginClass.enterDataevent("//input[@name='FedCapture__Management_Solution_Match_to_Req__c']");
		// Send 1 to Availability of Key Personnel
		loginClass.enterDataevent("//input[@name='FedCapture__Availability_of_Key_Personnel__c']");
		// Send 1 to Match to Strategic Focus
		loginClass.enterDataevent("//input[@name='FedCapture__Match_to_Strategic_Focus__c']");
		// Send 1 to Technical Solution Match to Req.
		loginClass.enterDataevent("//input[@name='FedCapture__Technical_Solution_Match_to_Req__c']");
		// Send 1 to Related Past Performance
		loginClass.enterDataevent("//input[@name='FedCapture__Related_Past_Performance__c']");
		// Send 1 to Teaming
		loginClass.enterDataevent("//input[@name='FedCapture__Teaming__c']");

//filling data of Opportunity Summary section  

		// Send Automation-Test to Opportunity Name
		loginClass.sendEventsxpath("//input[@name='Name']", " Automation-10");
		// Send Needs Analysis to Stage to Stage
		loginClass.enterDataevent("//input[@name='StageName']");
		// Send data Stage to Account
		loginClass.enterDataevent("//input[@placeholder='Search Accounts...']");
		// Wait
		Thread.sleep(2000);
		// Send data Stage to Stage
		loginClass.enterDataevent("//input[@placeholder='Search Accounts...']");
		Thread.sleep(2000);
		// Send 123456 to Total Contract Value
		loginClass.sendEventsxpath("//input[@name='Amount']", "123456");
		// Send data to Our Role
		loginClass.enterDataevent("//input[@name='FedCapture__Our_Role__c']");
		// Send data to Our Workshare %
		loginClass.enterDataevent("//input[@name='FedCapture__Workshare__c']");
		// Send data for testing purpose to Stage to RFP/Solicitation ID
		Thread.sleep(2000);
		loginClass.sendEventsxpath("//input[@name='FedCapture__RFP_Number__c']","5");
		// Send data to Contract Vehicle
		loginClass.enterDataevent("//input[@name='FedCapture__Contract_Vehicle__c']");
		// Selecting optionsto Contract_Type
		Actions actions = new Actions(loginClass.openchrome);
		loginClass.jsEx("//span[@title='Time & Materials']");
		actions.keyDown(Keys.CONTROL).build().perform();
		loginClass.clickEventxpath("//span[@title='Cost Plus']");
		loginClass.clickEventxpath("//span[@title='Firm Fixed Price']");
		actions.keyUp(Keys.CONTROL).build().perform();
		loginClass.clickEventxpath("//button[@title='Move selection to Chosen']");
		// Send data Competition Type
		loginClass.enterDataevent("//input[@name='FedCapture__Compition__c']");
		// Send datato Type
		loginClass.enterDataevent("//input[@name='Type']");
		// Selecting test1 to Original_Opportunity
		loginClass.enterDataevent("//input[@placeholder='Search Opportunities...']");
		// Send data for testing purpose to Next Step
		loginClass.sendEventsxpath("//input[@name='NextStep']", "Test Step");

		// filling data of Important Dates section

		// Send 13 to RFI Release Date
		loginClass.clickEventxpath("//input[@name='FedCapture__RFI_Release_Date__c']");
		loginClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='13']")));
		loginClass.clickEventxpath("//span[text()='13']");
		// Send 14 to Draft RFP Release Date
		loginClass.clickEventxpath("//input[@name='FedCapture__Draft_RFP_Release_Date__c']");
		loginClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='14']")));
		loginClass.clickEventxpath("//span[text()='14']");
		// Send 15 to RFP Release Date
		loginClass.clickEventxpath("//input[@name='FedCapture__Solicitation_Date__c']");
		loginClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='14']")));
		loginClass.clickEventxpath("//span[text()='15']");
		// Send 16 to RFP Release Date
		loginClass.clickEventxpath("//input[@name='FedCapture__Submission_Date__c']");
		loginClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='14']")));
		loginClass.clickEventxpath("//span[text()='16']");
		// Send 17 to Proposal Due Date
		Thread.sleep(4000);
		loginClass.jsEx("//input[@name='CloseDate']");
		loginClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='13']")));
		loginClass.clickEventxpath("//span[text()='17']");
		// Send 18 to Award Date
		loginClass.jsEx("//input[@name='FedCapture__Start_Date__c']");
		loginClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='13']")));
		loginClass.clickEventxpath("//span[text()='18']");
		// Send 24to Period of Performance (Months)
		loginClass.sendEventsxpath("//input[@name='FedCapture__Period_of_Performance_Months__c']", "24");
		// Click on save button
		Thread.sleep(4000);
		loginClass.jsEx("(//button[@class='slds-button slds-button_brand'])[2]");
		Thread.sleep(9000);
		loginClass.openchrome.close();

	}

@Test
	// Create Method edit Opportunity by edit button
	public void editOpportunitybyeditbutton() throws Exception

	{

		// Call opprpage object
		loginClass.opprPage();
		// Select opportunity with name Automation-Test4
		loginClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Automation-9']")));
		loginClass.clickEventxpath("//a[@title='Automation-9']");
		// Click on edit button
		loginClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Edit']")));
		loginClass.clickEventxpath("//button[text()='Edit']");
		// Implicit wait
		loginClass.openchrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Edit Knowledge of Customer field
		loginClass.enterDataevent("//input[@name='FedCapture__Knowledge_of_Customer__c']");
		// Edit Management Solution Match to Req.
		loginClass.enterDataevent("//input[@name='FedCapture__Management_Solution_Match_to_Req__c']");
		// Edit StageName
		loginClass.enterDataevent("//input[@name='StageName']");
		// Edit Amount
		loginClass.openchrome.findElement(By.xpath("//input[@name='Amount']")).clear();
		loginClass.sendEventsxpath("//input[@name='Amount']", "654321");
		// Edit Solicitation_Date
		loginClass.jsEx("//input[@name='FedCapture__Solicitation_Date__c']");
		loginClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='20']")));
		loginClass.clickEventxpath("//span[text()='20']");
		// Edit Period_of_Performance_Months
		loginClass.openchrome.findElement(By.xpath("//input[@name='FedCapture__Period_of_Performance_Months__c']"))
				.clear();
		loginClass.sendEventsxpath("//input[@name='FedCapture__Period_of_Performance_Months__c']", "36");
		// Click on save button
		loginClass.clickEventxpath("(//button[@class='slds-button slds-button_brand '])[2]");
		// Print data
		System.out.println("Opportunity Edited Successfully");
		Thread.sleep(9000);
		 loginClass.openchrome.close();
	}

@Test
	// Create Method edit Opportunity by pencil icon
	public void editOpportunitybypencilicon() throws Exception

	{

		// Call opprpage object
		loginClass.opprPage();
		// Implicit wait
		loginClass.openchrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Select opportunity with name Automation-Test2
		loginClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-9'])")));
		loginClass.clickEventxpath("(//a[@title='Automation-9'])");
		// Wait
		Thread.sleep(10000);
		// Window scrolling
		loginClass.js.executeScript("window.scrollBy(0,700)");
		// Wait
		Thread.sleep(20000);
		// Click on Resource Budget section
		loginClass.jsEx("(//*[@id='OpportunitySummary'] //*[@class='editicon'])[1]");
		// Wait
		loginClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Name']")));

		// filling data of Opportunity Summary section

		// Clear Opportunity Name
		loginClass.openchrome.findElement(By.xpath("//input[@name='Name']")).clear();
		// Enter Opportunity Name
		loginClass.sendEventsxpath("//input[@name='Name']", " Automation-Test2");
		// wait
		Thread.sleep(2000);
		// enter stage name
		loginClass.enterDataevent("(//input[@name='StageName'])[3]");
		// Edit data of account
		Thread.sleep(2000);
		loginClass.openchrome.findElement(By.xpath("(//button[@title='Clear Selection'])[1]")).click();
		loginClass.enterDataevent("//input[@placeholder='Search Accounts...']");
		// Wait
		Thread.sleep(2000);
		// Edit Total Contract Value
		loginClass.openchrome.findElement(By.xpath("//input[@name='Amount']")).clear();
		loginClass.sendEventsxpath("//input[@name='Amount']", "6");
		// Editing options to Contract_Type
		Actions actions = new Actions(loginClass.openchrome);
		loginClass.jsEx("//span[@title='Time & Materials']");
		loginClass.jsEx("//button[@title='Move selection to Available']");
		Thread.sleep(2000);
		loginClass.jsEx("//span[@title='Cost Plus']");
		actions.keyDown(Keys.CONTROL).build().perform();
		loginClass.jsEx("//span[@title='Firm Fixed Price']");
		actions.keyUp(Keys.CONTROL).build().perform();
		loginClass.jsEx("//button[@title='Move selection to Chosen']");
		// Edit RFP Release Date
		loginClass.jsEx("//input[@name='FedCapture__Solicitation_Date__c']");
		loginClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='15']")));
		loginClass.clickEventxpath("//span[text()='15']");
		// edit Proposal Due Date
		loginClass.jsEx("//input[@name='FedCapture__Submission_Date__c']");
		loginClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='16']")));
		loginClass.clickEventxpath("//span[text()='18']");
		// edit award Date
		loginClass.jsEx("//input[@name='CloseDate']");
		loginClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='18']")));
		loginClass.clickEventxpath("//span[text()='19']");
		// Click on save button
		Thread.sleep(2000);
		loginClass.mouseAction("(//button[@class='slds-button slds-button_brand'])[2]");
		// Print data
		System.out.println("Opportunity Edited Successfully");
		Thread.sleep(9000);
		 loginClass.openchrome.close();
	}

	@Test
	// Create Method clone Opportunity
	public void cloneOpportunity() throws Exception {
		// Call opprpage object
		loginClass.opprPage();

		// Create explicit wait to halt until Automation-Test1 appear
		loginClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-9'])")));
		// Select opportunity with name Automation-Test1
		loginClass.clickEventxpath("(//a[@title='Automation-9'])");
		// Create explicit wait to halt until change owner button appear
		loginClass.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@name='ChangeRecordType']")));
		// Click on button change owner
		loginClass.openchrome.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']"))
				.sendKeys(Keys.ENTER);
		// Create explicit wait to halt until clone option appear
		loginClass.wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@name='FedCapture__CloneButton_LDS']")));
		// Click on button clone
		loginClass.clickEventxpath("//a[@name='FedCapture__CloneButton_LDS']");
		// Create explicit wait to halt until Oppr name field appear
		loginClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='slds-input'])[1]")));
		// Clear data of Oppr name field
		loginClass.openchrome.findElement(By.xpath("(//input[@class='slds-input'])[1]")).clear();
		// Send data to Oppr name field
		loginClass.sendEventsxpath("(//input[@class='slds-input'])[1]", "Automation-cloneTest2");
		// Click on button Save
		loginClass.jsEx("(//button[@class='slds-button slds-button_brand '])[2]");
		// Close the browser
		Thread.sleep(9000);
		loginClass.openchrome.close();
	}

		@Test
	// Create Method change owner Opportunity
	public void changeownerOpportunity() throws Exception {
		// Call opprpage object
		loginClass.opprPage();

		// Create explicit wait to halt until Automation-Test1 appear
		loginClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-9'])")));
		// Select opportunity with name Automation-Test1
		loginClass.clickEventxpath("(//a[@title='Automation-9'])");
		// Create explicit wait to halt until Automation-Test1 appear
		loginClass.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@name='ChangeRecordType']")));
		// Click on button change owner
		loginClass.openchrome.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']"))
				.sendKeys(Keys.ENTER);
		loginClass.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@name='ChangeOwnerOne']")));
		// Click on button change owner
		loginClass.clickEventxpath("//a[@name='ChangeOwnerOne']");
		// search owner with name
		loginClass.sendEventsxpath("//input[@title='Search Users']", "rohan Deoskar");
		// Create explicit wait to halt until search result appear
		Thread.sleep(9000);
		loginClass.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='modal-container slds-modal__container'] //div[@role='option']")));
		// Click on button change owner
		loginClass.clickEventxpath("//div[@class='modal-container slds-modal__container'] //div[@role='option']");
		// Create explicit wait to halt until search result name appear
		// loginClass.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='name']")));
		// Click on button of search result name
		Thread.sleep(9000);
		loginClass.clickEventxpath("//div[@class='name']");
		// Click on button submit
		Thread.sleep(7000);
		loginClass.clickEventxpath("//button[@title='Submit']");
		// Close the browser
		Thread.sleep(9000);
		loginClass.openchrome.close();
	}

	@AfterMethod
	public void tearDown(ITestResult result) {

// Here will compare if test is failing then only it will enter into if condition
		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				// Create refernce of TakesScreenshot and Call method to capture screenshot
				File src = ((TakesScreenshot) loginClass.openchrome).getScreenshotAs(OutputType.FILE);
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
