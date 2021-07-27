package fedcap;



import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Contractcreatewizard {
	Login loginClass = new Login();
	Utilies1 utiliesClass = new Utilies1();

	@Test // Create Method Create New Employee
	public void addSectionandfield() throws Exception {
		loginClass.login();// input[@id='input-271'] // Create
		// explicit wait to halt until search box appear
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search apps or items...\"]"))); // Searching
		// Opportunities to search box
		utiliesClass.sendEventsxpath("//input[@placeholder=\"Search apps or items...\"]", ("Contract Wizard Setting")); // Click
																														// on
																														// Opportunities
		utiliesClass.clickEventxpath("//p[@class='slds-truncate']");
		Thread.sleep(20000);
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='Record Type']")));
		utiliesClass.staticDropdown("//select[@name='Record Type']", "012f4000000Oevx");
		Thread.sleep(7000);
		utiliesClass.jsEx("//button[@class='slds-button slds-button_neutral slds-button slds-button_brand']");
		utiliesClass.jsEx("(//button[@class='slds-button slds-button_brand'])[1]");
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='Section Name'])")));
		utiliesClass.sendEventsxpath("(//input[@name='Section Name'])", "Testing automation");

		utiliesClass.jsEx("(//button[@class='slds-button slds-button_brand'])[8]");

		utiliesClass.wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@value='Testing automation'])[1]")));
		utiliesClass.jsEx("(//button[@value='Testing automation'])[1]");
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='fieldLabel'])")));
		utiliesClass.sendEventsxpath("(//input[@name='fieldLabel'])", "contract");
		Thread.sleep(4000);
		utiliesClass.jsEx("(//*[text()='Contract Vehicle Name'])");
		utiliesClass.sendEventsxpath("(//input[@name='Opportunity Field Api'])", "Name");
		utiliesClass.jsEx("(//span[@class='slds-checkbox_faux'])");
		utiliesClass.jsEx("(//button[@class='slds-button slds-button_brand'])[10]");
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//button[@class='slds-button slds-button_brand'])[3]")));
		utiliesClass.jsEx("(//button[@class='slds-button slds-button_brand'])[3]");
		// Close the browser
		utiliesClass.openchrome.close();
	}

	@Test // Create Method Create New Employee
	public void editSectionandfield() throws Exception {
		String[] sectionnameNeeded = { "Testing automation", "information" };

		loginClass.login();// input[@id='input-271'] // Create
		// explicit wait to halt until search box appear
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search apps or items...\"]"))); // Searching
		// Opportunities to search box
		utiliesClass.sendEventsxpath("//input[@placeholder=\"Search apps or items...\"]", ("Contract Wizard Setting")); // Click
																														// on
																														// Opportunities
		utiliesClass.clickEventxpath("//p[@class='slds-truncate']");
		Thread.sleep(20000);
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='Record Type']")));
		utiliesClass.staticDropdown("//select[@name='Record Type']", "012f4000000Oevx");
		Thread.sleep(7000);
		utiliesClass.jsEx("//button[@class='slds-button slds-button_neutral slds-button slds-button_brand']");
		// jsEx("(//button[@class='slds-button slds-button_brand'])[1]");
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//button[@class='slds-button slds-button_brand'])[1]")));
		utiliesClass.openchrome.findElement(By.xpath("(//*[@data-key='custom_apps'])[1]")).click();
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='Section Name'])")));
		utiliesClass.openchrome.findElement(By.xpath("(//input[@name='Section Name'])")).clear();
		utiliesClass.sendEventsxpath("(//input[@name='Section Name'])", "Testing automation1");
		utiliesClass.jsEx("//*[text()='Update']");
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@data-key='custom_apps'])[2]")));
		utiliesClass.openchrome.findElement(By.xpath("(//*[@data-key='custom_apps'])[2]")).click();
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='fieldApiName'])[1]")));
		utiliesClass.openchrome.findElement(By.xpath("(//input[@name='fieldApiName'])[1]")).clear();
		Thread.sleep(4000);
		utiliesClass.sendEventsxpath("(//input[@name='fieldApiName'])[1]", "Contract");
		Thread.sleep(3000);
		utiliesClass.jsEx("(//*[text()='Contract Vehicle Name'])");
		utiliesClass.jsEx("(//button[@class='slds-button slds-button_brand'])[10]");
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//button[@class='slds-button slds-button_brand'])[3]")));
		utiliesClass.jsEx("(//button[@class='slds-button slds-button_brand'])[3]");
// Close the browser
		utiliesClass.openchrome.close();
	}

	@Test // Create Method Create New Employee
	public void rearrageneFields() throws Exception {
		String[] sectionnameNeeded = { "Testing automation", "information" };

		loginClass.login();// input[@id='input-271'] // Create
		// explicit wait to halt until search box appear
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search apps or items...\"]"))); // Searching
		// Opportunities to search box
		utiliesClass.sendEventsxpath("//input[@placeholder=\"Search apps or items...\"]", ("Contract Wizard Setting")); // Click
																														// on
																														// Opportunities
		utiliesClass.clickEventxpath("//p[@class='slds-truncate']");
		Thread.sleep(20000);
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='Record Type']")));
		utiliesClass.staticDropdown("//select[@name='Record Type']", "012f4000000Oevx");
		Thread.sleep(7000);
		utiliesClass.jsEx("//button[@class='slds-button slds-button_neutral slds-button slds-button_brand']");
		// jsEx("(//button[@class='slds-button slds-button_brand'])[1]");
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//button[@class='slds-button slds-button_brand'])[1]")));
		utiliesClass.jsEx("(//button[@class='slds-button slds-button_brand'])[5]");
		// oginClass.openchrome.findElement(By.xpath("(//button[@class='slds-button
		// slds-button_brand'])[5]")).click();
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//button[@class='slds-button slds-button_brand'])[10]")));

		// Element which needs to drag.
		WebElement From = utiliesClass.openchrome
				.findElement(By.xpath("(//div[@class='slds-truncate slds-p-horizontal_small'])[2]"));

		// Element on which need to drop.
		WebElement To = utiliesClass.openchrome
				.findElement(By.xpath("(//div[@class='slds-truncate slds-p-horizontal_small'])[1]"));

		JavascriptExecutor js = (JavascriptExecutor) utiliesClass.openchrome;
		js.executeScript("function createEvent(typeOfEvent) {\n" + "var event =document.createEvent(\"CustomEvent\");\n"
				+ "event.initCustomEvent(typeOfEvent,true, true, null);\n" + "event.dataTransfer = {\n" + "data: {},\n"
				+ "setData: function (key, value) {\n" + "this.data[key] = value;\n" + "},\n"
				+ "getData: function (key) {\n" + "return this.data[key];\n" + "}\n" + "};\n" + "return event;\n"
				+ "}\n" + "\n" + "function dispatchEvent(element, event,transferData) {\n"
				+ "if (transferData !== undefined) {\n" + "event.dataTransfer = transferData;\n" + "}\n"
				+ "if (element.dispatchEvent) {\n" + "element.dispatchEvent(event);\n"
				+ "} else if (element.fireEvent) {\n" + "element.fireEvent(\"on\" + event.type, event);\n" + "}\n"
				+ "}\n" + "\n" + "function simulateHTML5DragAndDrop(element, destination) {\n"
				+ "var dragStartEvent =createEvent('dragstart');\n" + "dispatchEvent(element, dragStartEvent);\n"
				+ "var dropEvent = createEvent('drop');\n"
				+ "dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n"
				+ "var dragEndEvent = createEvent('dragend');\n"
				+ "dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" + "}\n" + "\n"
				+ "var source = arguments[0];\n" + "var destination = arguments[1];\n"
				+ "simulateHTML5DragAndDrop(source,destination);", From, To);

		utiliesClass.jsEx("(//button[@class='slds-button slds-button_brand'])[10]");
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//button[@class='slds-button slds-button_brand'])[3]")));
		utiliesClass.jsEx("(//button[@class='slds-button slds-button_brand'])[3]");
		// Close the browser
		utiliesClass.openchrome.close();
	}

	@Test // Create Method Create New Employee
	public void rearrageneSections() throws Exception {
		String[] sectionnameNeeded = { "Testing automation", "information" };

		loginClass.login();// input[@id='input-271'] // Create
		// explicit wait to halt until search box appear
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search apps or items...\"]"))); // Searching
		// Opportunities to search box
		utiliesClass.sendEventsxpath("//input[@placeholder=\"Search apps or items...\"]", ("Contract Wizard Setting")); // Click
																														// on
																														// Opportunities
		utiliesClass.clickEventxpath("//p[@class='slds-truncate']");
		Thread.sleep(20000);
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='Record Type']")));
		utiliesClass.staticDropdown("//select[@name='Record Type']", "012f4000000Oevx");
		Thread.sleep(7000);
		utiliesClass.jsEx("//button[@class='slds-button slds-button_neutral slds-button slds-button_brand']");
		// jsEx("(//button[@class='slds-button slds-button_brand'])[1]");
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//button[@class='slds-button slds-button_brand'])[1]")));
		utiliesClass.jsEx("(//button[@class='slds-button slds-button_brand'])[2]");
		// oginClass.openchrome.findElement(By.xpath("(//button[@class='slds-button
		// slds-button_brand'])[5]")).click();
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//button[@class='slds-button slds-button_brand'])[10]")));

//Element which needs to drag.    		
		WebElement From = utiliesClass.openchrome
				.findElement(By.xpath("(//div[@class='slds-section__title slds-theme_shade'])[2]"));

//Element on which need to drop.		
		WebElement To = utiliesClass.openchrome
				.findElement(By.xpath("(//div[@class='slds-section__title slds-theme_shade'])[1]"));

		JavascriptExecutor js = (JavascriptExecutor) utiliesClass.openchrome;
		js.executeScript("function createEvent(typeOfEvent) {\n" + "var event =document.createEvent(\"CustomEvent\");\n"
				+ "event.initCustomEvent(typeOfEvent,true, true, null);\n" + "event.dataTransfer = {\n" + "data: {},\n"
				+ "setData: function (key, value) {\n" + "this.data[key] = value;\n" + "},\n"
				+ "getData: function (key) {\n" + "return this.data[key];\n" + "}\n" + "};\n" + "return event;\n"
				+ "}\n" + "\n" + "function dispatchEvent(element, event,transferData) {\n"
				+ "if (transferData !== undefined) {\n" + "event.dataTransfer = transferData;\n" + "}\n"
				+ "if (element.dispatchEvent) {\n" + "element.dispatchEvent(event);\n"
				+ "} else if (element.fireEvent) {\n" + "element.fireEvent(\"on\" + event.type, event);\n" + "}\n"
				+ "}\n" + "\n" + "function simulateHTML5DragAndDrop(element, destination) {\n"
				+ "var dragStartEvent =createEvent('dragstart');\n" + "dispatchEvent(element, dragStartEvent);\n"
				+ "var dropEvent = createEvent('drop');\n"
				+ "dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n"
				+ "var dragEndEvent = createEvent('dragend');\n"
				+ "dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" + "}\n" + "\n"
				+ "var source = arguments[0];\n" + "var destination = arguments[1];\n"
				+ "simulateHTML5DragAndDrop(source,destination);", From, To);

		utiliesClass.jsEx("(//button[@class='slds-button slds-button_brand'])[10]");
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//button[@class='slds-button slds-button_brand'])[3]")));
		utiliesClass.jsEx("(//button[@class='slds-button slds-button_brand'])[3]");
// Close the browser
		utiliesClass.openchrome.close();
	}

	@Test // Create Method Create New Employee
	public void cloneSection() throws Exception {

		loginClass.login();// input[@id='input-271'] // Create
		// explicit wait to halt until search box appear
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search apps or items...\"]"))); // Searching
		// Opportunities to search box
		utiliesClass.sendEventsxpath("//input[@placeholder=\"Search apps or items...\"]", ("Contract Wizard Setting")); // Click
																														// on
																														// Opportunities
		utiliesClass.clickEventxpath("//p[@class='slds-truncate']");
		Thread.sleep(20000);
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='Record Type']")));
		utiliesClass.staticDropdown("//select[@name='Record Type']", "012f4000000Oevx");
		Thread.sleep(7000);
		utiliesClass.jsEx("//button[@class='slds-button slds-button_neutral slds-button slds-button_brand']");
		// jsEx("(//button[@class='slds-button slds-button_brand'])[1]");
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//button[@class='slds-button slds-button_brand'])[1]")));
		Thread.sleep(7000);
		utiliesClass
				.jsEx("(//button[@class='slds-button slds-button_neutral slds-button slds-button_brand slds-show'])");
//  utiliesClass.openchrome.findElement(By.xpath("(//div[@class='slds-col slds-size_1-of-12'])[2]")).click();
		utiliesClass.staticDropdown("(//select[@class='slds-select'])[2]", "012f4000000Oevw");
		utiliesClass.jsEx("(//button[@class='slds-button slds-button_brand'])[8]");

		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//button[@class='slds-button slds-button_brand'])[3]")));
		utiliesClass.jsEx("(//button[@class='slds-button slds-button_brand'])[3]");
		// Close the browser
		utiliesClass.openchrome.close();
	}

	@Test // Create Method Create New Employee
	public void deleteSectionandfield() throws Exception {

		loginClass.login();// input[@id='input-271'] // Create
		// explicit wait to halt until search box appear
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search apps or items...\"]"))); // Searching
		// Opportunities to search box
		utiliesClass.sendEventsxpath("//input[@placeholder=\"Search apps or items...\"]", ("Contract Wizard Setting")); // Click
																														// on
																														// Opportunities
		utiliesClass.clickEventxpath("//p[@class='slds-truncate']");
		Thread.sleep(20000);
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='Record Type']")));
		utiliesClass.staticDropdown("//select[@name='Record Type']", "012f4000000Oevx");
		Thread.sleep(7000);
		utiliesClass.jsEx("//button[@class='slds-button slds-button_neutral slds-button slds-button_brand']");
		// jsEx("(//button[@class='slds-button slds-button_brand'])[1]");
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//button[@class='slds-button slds-button_brand'])[1]")));
		utiliesClass.openchrome.findElement(By.xpath("(//*[@data-key='clear'])[2]")).click();
		utiliesClass.wait.until(ExpectedConditions.alertIsPresent());
		utiliesClass.openchrome.switchTo().alert().accept();
		utiliesClass.openchrome.findElement(By.xpath("(//*[@data-key='clear'])[1]")).click();
		utiliesClass.wait.until(ExpectedConditions.alertIsPresent());
		utiliesClass.openchrome.switchTo().alert().accept();
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//button[@class='slds-button slds-button_brand'])[3]")));
		utiliesClass.jsEx("(//button[@class='slds-button slds-button_brand'])[3]");
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
