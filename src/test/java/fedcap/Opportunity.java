package fedcap;



//Import all classes and interface
import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

//Create CreateNewOpportunity class
public class Opportunity {
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
		// Create explicit wait to halt until Iframe appear
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='accessibility title']")));
		// switch to the iframe
		utiliesClass.openchrome.switchTo()
				.frame(utiliesClass.openchrome.findElement(By.xpath("//*[@title='accessibility title']")));
		System.out.println("********We are switch to the iframe*******");

		// filling data of Opportunity Health section

		// Create explicit wait to halt until Knowledge of Customer field appear
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//select[contains(@data-record,'Knowledge of Customer')]")));
		// Send 1 to Knowledge of Customer field
		utiliesClass.staticDropdown("//select[contains(@data-record,'Knowledge of Customer')]", "1");
		// Send 2 to Management Solution Match to Req.
		utiliesClass.staticDropdown("//select[contains(@data-record,'Management Solution Match to Req.')]", "2");
		// Send 3 to Availability of Key Personnel
		utiliesClass.staticDropdown("//select[contains(@data-record,'Availability of Key Personnel')]", "3");
		// Send 4 to Match to Strategic Focus
		utiliesClass.staticDropdown("//select[contains(@data-record,'Match to Strategic Focus')]", "4");
		// Send 5 to Technical Solution Match to Req.
		utiliesClass.staticDropdown("//select[contains(@data-record,'Technical Solution Match to Req.')]", "5");
		// Send 1 to Related Past Performance
		utiliesClass.staticDropdown("//select[contains(@data-record,'Related Past Performance')]", "1");
		// Send 2 to Teaming
		utiliesClass.staticDropdown("//select[contains(@data-record,'Teaming')]", "2");
		// Scrolling page
		utiliesClass.js.executeScript("window.scrollBy(0,500)");

		// filling data of Opportunity Summary section

		// Send Automation-Test1 to Opportunity Name
		utiliesClass.sendEventsxpath("//input[contains(@data-record,'Opportunity Name')]", "Automation-Test1");
		// Send Needs Analysis to Stage to Stage
		utiliesClass.staticDropdown("//select[contains(@data-record,'Stage')]", "Needs Analysis");
		// Send QA Account to Stage to Account
		utiliesClass.sendEventsxpath("//input[@id='AccountId']", "QA Account");
		utiliesClass.openchrome.findElement(By.xpath("//*[text()='QA Account']")).click();
		// Send 2 to Stage to Total Contract Value
		utiliesClass.sendEventsxpath("//input[contains(@data-record,'Total Contract Value')]", "2");
		// Send Prime to Stage to Our Role
		utiliesClass.staticDropdown("//select[contains(@data-record,'Our Role')]", "Prime");
		// Send 20 to Stage to Our Workshare %
		utiliesClass.sendEventsxpath("//input[contains(@data-record,'Our Workshare %')]", "20");
		// Send data for testing purpose to Stage to RFP/Solicitation ID
		utiliesClass.sendEventsxpath("//input[contains(@data-record,'RFP/Solicitation ID')]",
				"data for testing purpose");
		// Send space to Stage to Our Probability (%)
		utiliesClass.sendEventsxpath("//input[contains(@data-record,'Probability (%)')]", "");
		// Send C2AD - COMMAND AND CONTROL APPLICATIONS AND INFORMto Stage to Contract
		// Vehicle
		utiliesClass.staticDropdown("//select[contains(@data-record,'Contract Vehicle')]",
				"C2AD - COMMAND AND CONTROL APPLICATIONS AND INFORM");
		// Selecting 1st option to Contract_Type
		utiliesClass.clickEventxpath("//*[@id='FedCapture__Contract_Type_custom__c1']");
		utiliesClass.clickEventxpath("//*[@id='menu-FedCapture__Contract_Type_custom__c1-0']");
		// Send Full and Open to Competition Type
		utiliesClass.staticDropdown("//select[contains(@data-record,'Competition Type')]", "Full and Open");
		// Send Existing Customer - Replacement to Type
		utiliesClass.staticDropdown("//select[(@id='j_id0:j_id86:j_id97:0:j_id100:1:j_id103:6:j_id107:1:inputFields')]",
				"Existing Customer - Replacement");
		// Selecting 1st option to Type_of_Award
		utiliesClass.clickEventxpath("//*[@id='FedCapture__Type_of_Award__c2']");
		utiliesClass.clickEventxpath("//*[@id='menu-FedCapture__Type_of_Award__c2-1']");
		// Selecting test1 to Original_Opportunity
		utiliesClass.sendEventsxpath("//input[@id='FedCapture__Original_Opportunity__c']", "test1");
		utiliesClass.clickEventxpath("//*[text()='test1']");
		// Send data for testing purpose to Next Step
		utiliesClass.sendEventsxpath("//input[contains(@data-record,'Next Step')]", "data for testing purpose");
		// Scrolling page
		utiliesClass.js.executeScript("window.scrollBy(0,500)");

		// filling data of Important Dates section

		// Send 05/08/2021 to RFI Release Date
		utiliesClass.clickEventxpath("//input[contains(@data-record,'RFI Release Date')]");
		utiliesClass.sendEventsxpath("//input[contains(@data-record,'RFI Release Date')]", "05/08/2021");
		// Send 05/08/2021 to Draft RFP Release Date
		utiliesClass.clickEventxpath("//input[contains(@data-record,'Draft RFP Release Date')]");
		utiliesClass.sendEventsxpath("//input[contains(@data-record,'Draft RFP Release Date')]", "05/08/2021");
		// Send 05/08/2021 to RFP Release Date
		utiliesClass.clickEventxpath(
				"//input[(@id='j_id0:j_id86:j_id97:0:j_id100:2:j_id103:1:j_id107:0:inputDateFields')]");
		utiliesClass.sendEventsxpath(
				"//input[(@id='j_id0:j_id86:j_id97:0:j_id100:2:j_id103:1:j_id107:0:inputDateFields')]", "05/08/2021");
		// Send 05/08/2021 to Proposal Due Date
		utiliesClass.clickEventxpath("//input[contains(@data-record,'Proposal Due Date')]");
		utiliesClass.sendEventsxpath("//input[contains(@data-record,'Proposal Due Date')]", "05/08/2021");
		// Send 05/08/2021 to Award Date
		utiliesClass.clickEventxpath("//input[contains(@data-record,'Award Date')]");
		utiliesClass.sendEventsxpath("//input[contains(@data-record,'Award Date')]", "05/08/2021");
		// Send 05/08/2021 to Start Date
		utiliesClass.clickEventxpath("//input[contains(@data-record,'Start Date')]");
		utiliesClass.sendEventsxpath("//input[contains(@data-record,'Start Date')]", "05/08/2021");
		// Send 6 to Period of Performance (Months)
		utiliesClass.sendEventsxpath("//input[contains(@data-record,'Period of Performance (Months)')]", "6");

		// filling data of System Information section

		// Send 04/01/2021 to CreatedDate
		utiliesClass.clickEventxpath("//input[(@id='CreatedDate1_date')]");
		utiliesClass.sendEventsxpath("//input[(@id='CreatedDate1_date')]", "04/01/2021");
		// Send 12:30 AM to CreatedDate1_time
		utiliesClass.clickEventxpath("//input[(@id='CreatedDate1_time_hr')]");
		utiliesClass.clickEventxpath("//*[(text()='12:30 AM')]");
		// Send 04/01/2021 to LastModifiedDate
		utiliesClass.clickEventxpath("//input[(@id='LastModifiedDate2_date')]");
		utiliesClass.sendEventsxpath("//input[(@id='LastModifiedDate2_date')]", "04/01/2021");
		// Send 1:00 AM to LastModifiedDate2_time
		utiliesClass.clickEventxpath("//input[(@id='LastModifiedDate2_time_hr')]");
		utiliesClass.clickEventxpath("/html/body/div[5]/ul/li[3]");
		// (//li[(text()='12:30 AM')])[2]
		// Click on save button
		utiliesClass.clickEventxpath("//input[@id='j_id0:j_id86:savebtn']");
		utiliesClass.openchrome.close();
	}

	@Test
	// Create Method Create New Opportunity
	public void editOpportunitybypencilicon() throws Exception {
		// Call opprpage object
		loginClass.opprPage();
		// Select opportunity with name Automation-Test1
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-Test1'])[1]")));
		utiliesClass.clickEventxpath("(//a[@title='Automation-Test1'])[1]");
		// Scrolling page
		// utiliesClass.js.executeScript("window.scrollBy(0,700)");
		// Thread.sleep(10000);
		utiliesClass.wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//*[@id='OpportunitySummary'] //*[@class='editicon'])[1]")));
		utiliesClass.sendEventsxpath("(//*[@id='OpportunitySummary'] //*[@class='editicon'])[1]", "Keys.ENTER");
		// Create explicit wait to halt until Iframe appear
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='accessibility title']")));
		utiliesClass.openchrome.switchTo()
				.frame(utiliesClass.openchrome.findElement(By.xpath("//*[@title='accessibility title']")));
		System.out.println("********We are switch to the iframe*******");

		// Editing data of Opportunity Summary section required fields

		// Send Automation-Test2 to Opportunity Name
		utiliesClass.openchrome.findElement(By.xpath("//input[contains(@data-record,'Opportunity Name')]")).clear();
		utiliesClass.sendEventsxpath("//input[contains(@data-record,'Opportunity Name')]", "Automation-Test2");
		// Send Value Proposition to Stage to Stage
		// utiliesClass.openchrome.findElement(By.xpath("//select[contains(@data-record,'Stage')]")).clear();
		utiliesClass.staticDropdown("//select[contains(@data-record,'Stage')]", "Value Proposition");
		// Send 4 to Stage to Total Contract Value
		utiliesClass.openchrome.findElement(By.xpath("//input[contains(@data-record,'Total Contract Value')]")).clear();
		utiliesClass.sendEventsxpath("//input[contains(@data-record,'Total Contract Value')]", "4");
		// Send space to Stage to Our Probability (%)
		utiliesClass.openchrome.findElement(By.xpath("//input[contains(@data-record,'Probability (%)')]")).clear();
		utiliesClass.sendEventsxpath("//input[contains(@data-record,'Probability (%)')]", "20");
		// utiliesClass.sendEventsxpath("//*[@id='input-2474']",
		// "Keys.chord(Keys.CONTROL,\"1\",Keys.DELETE");

		// Editing data of Important Dates section required fields

		// Send 05/18/2021 to RFP Release Date
		utiliesClass.openchrome
				.findElement(By
						.xpath("//input[(@id='j_id0:j_id86:j_id97:0:j_id100:2:j_id103:1:j_id107:0:inputDateFields')]"))
				.clear();
		utiliesClass.clickEventxpath(
				"//input[(@id='j_id0:j_id86:j_id97:0:j_id100:2:j_id103:1:j_id107:0:inputDateFields')]");
		utiliesClass.sendEventsxpath(
				"//input[(@id='j_id0:j_id86:j_id97:0:j_id100:2:j_id103:1:j_id107:0:inputDateFields')]", "05/18/2021");
		// Send 05/18/2021 to Proposal Due Date
		utiliesClass.openchrome.findElement(By.xpath("//input[contains(@data-record,'Proposal Due Date')]")).clear();
		utiliesClass.clickEventxpath("//input[contains(@data-record,'Proposal Due Date')]");
		utiliesClass.sendEventsxpath("//input[contains(@data-record,'Proposal Due Date')]", "05/18/2021");
		// Send 05/18/2021 to Award Date
		utiliesClass.openchrome.findElement(By.xpath("//input[contains(@data-record,'Award Date')]")).clear();
		utiliesClass.clickEventxpath("//input[contains(@data-record,'Award Date')]");
		utiliesClass.sendEventsxpath("//input[contains(@data-record,'Award Date')]", "05/18/2021");
		// Click on save button
		utiliesClass.clickEventxpath("//input[@id='j_id0:j_id86:savebtn']");
		utiliesClass.openchrome.close();

	}

	@Test
	// Create Method Create New Opportunity
	public void editOpportunitybyeditbutton() throws Exception {
		// Call opprpage object
		loginClass.opprPage();
		// Select opportunity with name Automation-Test1
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-Test1'])[1]")));
		utiliesClass.clickEventxpath("(//a[@title='Automation-Test1'])[1]");
		// Scrolling page
		Thread.sleep(20000);
		utiliesClass.clickEventxpath("(//button[@class='slds-button slds-button_neutral'])[1]");
		// Create explicit wait to halt until Iframe appear
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='accessibility title']")));
		utiliesClass.openchrome.switchTo()
				.frame(utiliesClass.openchrome.findElement(By.xpath("//*[@title='accessibility title']")));
		System.out.println("********We are switch to the iframe*******");

		// Editing data of Opportunity Summary section required fields

		// Send Automation-Test2 to Opportunity Name
		utiliesClass.openchrome.findElement(By.xpath("//input[contains(@data-record,'Opportunity Name')]")).clear();
		utiliesClass.sendEventsxpath("//input[contains(@data-record,'Opportunity Name')]", "Automation-Test3");
		// Send Value Proposition to Stage to Stage
		// utiliesClass.openchrome.findElement(By.xpath("//select[contains(@data-record,'Stage')]")).clear();
		utiliesClass.staticDropdown("//select[contains(@data-record,'Stage')]", "Value Proposition");
		// Send 4 to Stage to Total Contract Value
		utiliesClass.openchrome.findElement(By.xpath("//input[contains(@data-record,'Total Contract Value')]")).clear();
		utiliesClass.sendEventsxpath("//input[contains(@data-record,'Total Contract Value')]", "4");
		// Send space to Stage to Our Probability (%)
		utiliesClass.openchrome.findElement(By.xpath("//input[contains(@data-record,'Probability (%)')]")).clear();
		utiliesClass.sendEventsxpath("//input[contains(@data-record,'Probability (%)')]", "20");
		// utiliesClass.sendEventsxpath("//*[@id='input-2474']",
		// "Keys.chord(Keys.CONTROL,\"1\",Keys.DELETE");

		// Editing data of Important Dates section required fields

		// Send 05/18/2021 to RFP Release Date
		utiliesClass.openchrome
				.findElement(By
						.xpath("//input[(@id='j_id0:j_id86:j_id97:0:j_id100:2:j_id103:1:j_id107:0:inputDateFields')]"))
				.clear();
		utiliesClass.clickEventxpath(
				"//input[(@id='j_id0:j_id86:j_id97:0:j_id100:2:j_id103:1:j_id107:0:inputDateFields')]");
		utiliesClass.sendEventsxpath(
				"//input[(@id='j_id0:j_id86:j_id97:0:j_id100:2:j_id103:1:j_id107:0:inputDateFields')]", "05/18/2021");
		// Send 05/18/2021 to Proposal Due Date
		utiliesClass.openchrome.findElement(By.xpath("//input[contains(@data-record,'Proposal Due Date')]")).clear();
		utiliesClass.clickEventxpath("//input[contains(@data-record,'Proposal Due Date')]");
		utiliesClass.sendEventsxpath("//input[contains(@data-record,'Proposal Due Date')]", "05/18/2021");
		// Send 05/18/2021 to Award Date
		utiliesClass.openchrome.findElement(By.xpath("//input[contains(@data-record,'Award Date')]")).clear();
		utiliesClass.clickEventxpath("//input[contains(@data-record,'Award Date')]");
		utiliesClass.sendEventsxpath("//input[contains(@data-record,'Award Date')]", "05/18/2021");
		// Click on save button
		utiliesClass.clickEventxpath("//input[@id='j_id0:j_id86:savebtn']");
		utiliesClass.openchrome.close();
	}

	@Test
	// Create Method Create New Opportunity
	public void cloneOpportunity() throws Exception {
		// Call opprpage object
		loginClass.opprPage();

		// Create explicit wait to halt until Automation-Test1 appear
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-Test1'])[1]")));
		// Select opportunity with name Automation-Test1
		utiliesClass.clickEventxpath("(//a[@title='Automation-Test1'])[1]");
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
		utiliesClass.sendEventsxpath("(//input[@class='slds-input'])[1]", "Automation-cloneTest1");
		// Click on button Save
		utiliesClass.clickEventxpath("(//button[@class='slds-button slds-button_brand '])[2]");
		// Close the browser
		utiliesClass.openchrome.close();

	}

	@Test
	// Create Method Create New Opportunity
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
		utiliesClass.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='name']")));
		// Click on button of search result name
		utiliesClass.clickEventxpath("//div[@class='name']");
		// Click on button submit
		utiliesClass.clickEventxpath("//button[@title='Submit']");
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