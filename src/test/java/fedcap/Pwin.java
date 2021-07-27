package fedcap;



import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Pwin {

	// Create object login class of login class
	Login loginClass = new Login();
	Utilies1 utiliesClass = new Utilies1();

	@Test
	// Create Method in resource budget add emp
	public void Pwinquestion() throws Exception {

		// Call opprpage object
		loginClass.opprPage();
		utiliesClass.openchrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Select opportunity with name Automation-Test1
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Automation-Test3'])[1]")));
		utiliesClass.clickEventxpath("(//a[@title='Automation-Test3'])[1]");
		// Wait
		Thread.sleep(10000);
		// Window scrolling
		utiliesClass.js.executeScript("window.scrollBy(0,700)");
		// Wait
		Thread.sleep(20000);
		// Click on Resource Budget section
		utiliesClass.mouseAction("//div[@class='slds-tabs_card'] //li[@title='PWin']");
		// utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@type='radio'])[2]")));
		Thread.sleep(7000);
		utiliesClass.mouseAction("(//*[@type='radio'])[2]");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='A'])[1]")));
		utiliesClass.mouseAction("(//*[text()='A'])[1]");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Yes'])[1]")));
		utiliesClass.mouseAction("(//*[text()='Yes'])[1]");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Yes'])[2]")));
		utiliesClass.mouseAction("(//*[text()='Yes'])[2]");
		utiliesClass.mouseAction("(//*[text()='Save'])[2]");
		// Create explicit wait to halt until alert pop-up appear
		utiliesClass.wait.until(ExpectedConditions.alertIsPresent());
		// Call alert method
		utiliesClass.openchrome.switchTo().alert().accept();
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@data-tab='ssstab2'])")));
		utiliesClass.mouseAction("(//a[@data-tab='ssstab2'])");
		utiliesClass.mouseAction("(//*[text()='Yes'])[3]");
		utiliesClass.mouseAction("(//*[text()='Yes'])[4]");
		utiliesClass.mouseAction("(//*[text()='Yes'])[5]");
		utiliesClass.mouseAction("(//*[text()='Yes'])[6]");
		utiliesClass.mouseAction("(//*[text()='Yes'])[7]");
		utiliesClass.mouseAction("(//*[text()='Save'])[3]");
		utiliesClass.wait.until(ExpectedConditions.alertIsPresent());
		// Call alert method
		utiliesClass.openchrome.switchTo().alert().accept();
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@data-tab='ssstab3'])")));
		utiliesClass.mouseAction("(//a[@data-tab='ssstab3'])");
		utiliesClass.mouseAction("(//*[text()='Yes'])[8]");
		utiliesClass.mouseAction("(//*[text()='Yes'])[9]");
		utiliesClass.mouseAction("(//*[text()='Yes'])[10]");
		utiliesClass.mouseAction("(//*[text()='Save'])[4]");
		utiliesClass.wait.until(ExpectedConditions.alertIsPresent());
		// Call alert method
		utiliesClass.openchrome.switchTo().alert().accept();
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@data-tab='ssstab4'])")));
		utiliesClass.mouseAction("(//a[@data-tab='ssstab4'])");
		Thread.sleep(7000);
		utiliesClass.mouseAction("(//*[text()='A'])[2]");
		utiliesClass.mouseAction("(//*[text()='Save'])[5]");
		utiliesClass.wait.until(ExpectedConditions.alertIsPresent());
		// Call alert method
		utiliesClass.openchrome.switchTo().alert().accept();
		// Close the browser
		utiliesClass.openchrome.close();

	}

	@Test
	// Create Method Create New Employee
	public void AddiingQuestions() throws Exception {

		String[] value = { "Question", "Question", "helptext", "A", "B", "C", "D", "Question for tesing purpose",
				"Helptext", "Question", "helptext", "A", "B", "C", "D", "E", "Question", "Question", "helptext", "A",
				"B", "C", "D", "E", "Question", "Question", "helptext", "A", "B", "Question for testing purpose",
				"helptext", "A", "B", "C", "D", "E" };
		loginClass.login();// input[@id='input-271']
		// Create explicit wait to halt until search box appear
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search apps or items...\"]")));
		// Searching Opportunities to search box
		utiliesClass.sendEventsxpath("//input[@placeholder=\"Search apps or items...\"]", ("Questions"));
		// Click on Opportunities
		utiliesClass.clickEventxpath("//p[@class='slds-truncate']");
		Thread.sleep(15000);
		utiliesClass.openchrome.switchTo()
				.frame(utiliesClass.openchrome.findElement(By.xpath("//iframe[@title='accessibility title']")));

		// Gate1

		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//select[@class='slds-input select uiInput uiInputSelect uiInput--default uiInput--select']")));
		utiliesClass.staticDropdown(
				"//select[@class='slds-input select uiInput uiInputSelect uiInput--default uiInput--select']",
				"Gate 1 - Interest");
		utiliesClass.clickEventxpath("(//*[@class=' label bBody'])[1]");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])[1]")));
		utiliesClass.clickEventxpath("(//*[@class=' label bBody'])[2]");
		for (int j = 0; j <= 3; j++) {

			utiliesClass.clickEventxpath("(//button[@class='slds-button slds-button--brand'])[6]");

		}
		Thread.sleep(7000);
		utiliesClass.js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(7000);
		for (int i = 29; i <= 34; i++) {

			System.out.println("temp1-" + i);
			utiliesClass.openchrome.findElement(
					By.xpath("(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])["
							+ i + "]"))
					.clear();
			utiliesClass.openchrome.findElement(
					By.xpath("(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])["
							+ i + "]"))
					.sendKeys(value[i]);

		}
		utiliesClass.openchrome.findElement(By.xpath(
				"(//input[@data-aura-class='uiInputSmartNumber uiInput uiInputNumber uiInput--default uiInput--input'])[11]"))
				.clear();
		utiliesClass.openchrome.findElement(By.xpath(
				"(//input[@data-aura-class='uiInputSmartNumber uiInput uiInputNumber uiInput--default uiInput--input'])[11]"))
				.sendKeys("00");
		utiliesClass.clickEventxpath("(//label[@class='slds-checkbox custom_checkbox'])[6]");
		utiliesClass.openchrome.findElement(By.xpath(
				"(//input[@class='slds-input input uiInputSmartNumber uiInput uiInputNumber uiInput--default uiInput--input'])[6]"))
				.clear();
		utiliesClass.sendEventsxpath(
				"(//input[@class='slds-input input uiInputSmartNumber uiInput uiInputNumber uiInput--default uiInput--input'])[6]",
				"6");
		for (int j = 26; j <= 29; j++) {

			utiliesClass.staticDropdown(
					"(//select[@class='slds-input select uiInput uiInputSelect uiInput--default uiInput--select'])[" + j
							+ "]",
					"Excellent");

		}
		utiliesClass.saveCancelbutton();
		System.out.println("Question added succesfully to Gate-1");

		// Gate2

		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//select[@class='slds-input select uiInput uiInputSelect uiInput--default uiInput--select']")));
		utiliesClass.staticDropdown(
				"//select[@class='slds-input select uiInput uiInputSelect uiInput--default uiInput--select']",
				"Gate 2 - Pursuit");
		utiliesClass.clickEventxpath("(//*[@class=' label bBody'])[1]");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])[1]")));
		Thread.sleep(9000);

		utiliesClass.clickEventxpath("(//*[@class=' label bBody'])[2]");
		for (int j = 0; j <= 3; j++) {

			utiliesClass.clickEventxpath("(//button[@class='slds-button slds-button--brand'])[7]");

		}
		for (int i = 27; i <= 32; i++) {

			System.out.println("temp1-" + i);
			utiliesClass.openchrome.findElement(
					By.xpath("(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])["
							+ i + "]"))
					.clear();
			utiliesClass.openchrome.findElement(
					By.xpath("(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])["
							+ i + "]"))
					.sendKeys(value[i]);
		}

		utiliesClass.openchrome.findElement(By.xpath(
				"(//input[@data-aura-class='uiInputSmartNumber uiInput uiInputNumber uiInput--default uiInput--input'])[13]"))
				.clear();
		utiliesClass.openchrome.findElement(By.xpath(
				"(//input[@data-aura-class='uiInputSmartNumber uiInput uiInputNumber uiInput--default uiInput--input'])[13]"))
				.sendKeys("00");
		utiliesClass.clickEventxpath("(//label[@class='slds-checkbox custom_checkbox'])[7]");
		utiliesClass.openchrome.findElement(By.xpath(
				"(//input[@class='slds-input input uiInputSmartNumber uiInput uiInputNumber uiInput--default uiInput--input'])[7]"))
				.clear();
		utiliesClass.sendEventsxpath(
				"(//input[@class='slds-input input uiInputSmartNumber uiInput uiInputNumber uiInput--default uiInput--input'])[7]",
				"7");
		for (int j = 23; j <= 26; j++) {

			utiliesClass.staticDropdown(
					"(//select[@class='slds-input select uiInput uiInputSelect uiInput--default uiInput--select'])[" + j
							+ "]",
					"Excellent");

		}

		utiliesClass.saveCancelbutton();
		System.out.println("Question added succesfully to Gate-2");

		// Gate 3

		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//select[@class='slds-input select uiInput uiInputSelect uiInput--default uiInput--select']")));
		utiliesClass.staticDropdown(
				"//select[@class='slds-input select uiInput uiInputSelect uiInput--default uiInput--select']",
				"Gate 3 - Preliminary Bid");
		utiliesClass.clickEventxpath("(//*[@class=' label bBody'])[1]");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])[1]")));
		Thread.sleep(9000);
		utiliesClass.clickEventxpath("(//*[@class=' label bBody'])[2]");
		for (int j = 0; j <= 3; j++) {

			utiliesClass.clickEventxpath("(//button[@class='slds-button slds-button--brand'])[5]");

		}
		for (int i = 19; i <= 24; i++) {

			System.out.println("temp1-" + i);
			utiliesClass.openchrome.findElement(
					By.xpath("(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])["
							+ i + "]"))
					.clear();
			utiliesClass.openchrome.findElement(
					By.xpath("(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])["
							+ i + "]"))
					.sendKeys(value[i]);
		}
		utiliesClass.openchrome.findElement(By.xpath(
				"(//input[@data-aura-class='uiInputSmartNumber uiInput uiInputNumber uiInput--default uiInput--input'])[9]"))
				.clear();
		utiliesClass.openchrome.findElement(By.xpath(
				"(//input[@data-aura-class='uiInputSmartNumber uiInput uiInputNumber uiInput--default uiInput--input'])[9]"))
				.sendKeys("00");
		utiliesClass.clickEventxpath("(//label[@class='slds-checkbox custom_checkbox'])[5]");
		utiliesClass.openchrome.findElement(By.xpath(
				"(//input[@class='slds-input input uiInputSmartNumber uiInput uiInputNumber uiInput--default uiInput--input'])[5]"))
				.clear();
		utiliesClass.sendEventsxpath(
				"(//input[@class='slds-input input uiInputSmartNumber uiInput uiInputNumber uiInput--default uiInput--input'])[5]",
				"5");
		for (int j = 17; j <= 20; j++) {

			utiliesClass.staticDropdown(
					"(//select[@class='slds-input select uiInput uiInputSelect uiInput--default uiInput--select'])[" + j
							+ "]",
					"Excellent");

		}

		utiliesClass.saveCancelbutton();
		System.out.println("Question added succesfully to Gate-3");

		// Gate 4

		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//select[@class='slds-input select uiInput uiInputSelect uiInput--default uiInput--select']")));
		utiliesClass.staticDropdown(
				"//select[@class='slds-input select uiInput uiInputSelect uiInput--default uiInput--select']",
				"Gate 4 - Bid Validation");
		utiliesClass.clickEventxpath("(//*[@class=' label bBody'])[1]");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])[1]")));
		Thread.sleep(9000);
		utiliesClass.clickEventxpath("(//*[@class=' label bBody'])[2]");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"(//select[@class='slds-input select uiInput uiInputSelect uiInput--default uiInput--select'])[7]")));
		utiliesClass.staticDropdown(
				"(//select[@class='slds-input select uiInput uiInputSelect uiInput--default uiInput--select'])[7]",
				"Yes/No");
		for (int i = 7; i <= 8; i++) {

			System.out.println("temp1-" + i);
			utiliesClass.openchrome.findElement(
					By.xpath("(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])["
							+ i + "]"))
					.clear();
			utiliesClass.openchrome.findElement(
					By.xpath("(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])["
							+ i + "]"))
					.sendKeys(value[i]);
		}

		utiliesClass.openchrome.findElement(By.xpath(
				"(//input[@data-aura-class='uiInputSmartNumber uiInput uiInputNumber uiInput--default uiInput--input'])[3]"))
				.clear();
		utiliesClass.openchrome.findElement(By.xpath(
				"(//input[@data-aura-class='uiInputSmartNumber uiInput uiInputNumber uiInput--default uiInput--input'])[3]"))
				.sendKeys("00");
		utiliesClass.clickEventxpath("(//label[@class='slds-checkbox custom_checkbox'])[2]");
		utiliesClass.openchrome.findElement(By.xpath(
				"(//input[@class='slds-input input uiInputSmartNumber uiInput uiInputNumber uiInput--default uiInput--input'])[2]"))
				.clear();
		utiliesClass.sendEventsxpath(
				"(//input[@class='slds-input input uiInputSmartNumber uiInput uiInputNumber uiInput--default uiInput--input'])[2]",
				"2");
		utiliesClass.saveCancelbutton();
		System.out.println("Question added succesfully to Gate-4");
		// Close the browser
		utiliesClass.openchrome.close();

	}

	@Test
	// Create Method Create New Employee
	public void deleteQuestionsandtheiroptions() throws Exception {

		loginClass.login();// input[@id='input-271']
		// Create explicit wait to halt until search box appear
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search apps or items...\"]")));
		// Searching Opportunities to search box
		utiliesClass.sendEventsxpath("//input[@placeholder=\"Search apps or items...\"]", ("Questions"));
		// Click on Opportunities
		utiliesClass.clickEventxpath("//p[@class='slds-truncate']");
		Thread.sleep(15000);
		utiliesClass.openchrome.switchTo()
				.frame(utiliesClass.openchrome.findElement(By.xpath("//iframe[@title='accessibility title']")));

		// Gate1

		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//select[@class='slds-input select uiInput uiInputSelect uiInput--default uiInput--select']")));
		utiliesClass.staticDropdown(
				"//select[@class='slds-input select uiInput uiInputSelect uiInput--default uiInput--select']",
				"Gate 1 - Interest");
		utiliesClass.clickEventxpath("(//*[@class=' label bBody'])[1]");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])[1]")));
		for (int i = 19; i <= 22; i++) {
			utiliesClass.clickEventxpath("(//a[@class='remove_icon'])[19]");
			// Click Ok on alert
			utiliesClass.wait.until(ExpectedConditions.alertIsPresent());
			// Click Ok on alert
			utiliesClass.openchrome.switchTo().alert().accept();
		}

		utiliesClass.clickEventxpath("(//*[@class='slds-show close'])[2]");
		utiliesClass.wait.until(ExpectedConditions.alertIsPresent());
		// Click Ok on alert
		utiliesClass.openchrome.switchTo().alert().accept();
		utiliesClass.saveCancelbutton();

		// Gate2

		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//select[@class='slds-input select uiInput uiInputSelect uiInput--default uiInput--select']")));
		utiliesClass.staticDropdown(
				"//select[@class='slds-input select uiInput uiInputSelect uiInput--default uiInput--select']",
				"Gate 2 - Pursuit");
		utiliesClass.clickEventxpath("(//*[@class=' label bBody'])[1]");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])[1]")));
		Thread.sleep(9000);
		for (int i = 15; i <= 18; i++) {
			utiliesClass.clickEventxpath("(//a[@class='remove_icon'])[15]");
			// Click Ok on alert
			utiliesClass.wait.until(ExpectedConditions.alertIsPresent());
			// Click Ok on alert
			utiliesClass.openchrome.switchTo().alert().accept();
		}

		utiliesClass.clickEventxpath("(//*[@class='slds-show close'])[3]");
		utiliesClass.wait.until(ExpectedConditions.alertIsPresent());
		// Click Ok on alert
		utiliesClass.openchrome.switchTo().alert().accept();
		utiliesClass.saveCancelbutton();

		// Gate3

		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//select[@class='slds-input select uiInput uiInputSelect uiInput--default uiInput--select']")));
		utiliesClass.staticDropdown(
				"//select[@class='slds-input select uiInput uiInputSelect uiInput--default uiInput--select']",
				"Gate 3 - Preliminary Bid");
		utiliesClass.clickEventxpath("(//*[@class=' label bBody'])[1]");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])[1]")));
		Thread.sleep(9000);
		for (int i = 11; i <= 14; i++) {
			utiliesClass.clickEventxpath("(//a[@class='remove_icon'])[11]");
			// Click Ok on alert
			utiliesClass.wait.until(ExpectedConditions.alertIsPresent());
			// Click Ok on alert
			utiliesClass.openchrome.switchTo().alert().accept();
		}

		utiliesClass.clickEventxpath("(//*[@class='slds-show close'])[3]");
		utiliesClass.wait.until(ExpectedConditions.alertIsPresent());
		// Click Ok on alert
		utiliesClass.openchrome.switchTo().alert().accept();
		utiliesClass.saveCancelbutton();

		// Gate4

		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//select[@class='slds-input select uiInput uiInputSelect uiInput--default uiInput--select']")));
		utiliesClass.staticDropdown(
				"//select[@class='slds-input select uiInput uiInputSelect uiInput--default uiInput--select']",
				"Gate 4 - Bid Validation");
		utiliesClass.clickEventxpath("(//*[@class=' label bBody'])[1]");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])[1]")));
		Thread.sleep(9000);
		utiliesClass.clickEventxpath("(//*[@class='slds-show close'])");
		utiliesClass.wait.until(ExpectedConditions.alertIsPresent());
		// Click Ok on alert
		utiliesClass.openchrome.switchTo().alert().accept();
		utiliesClass.saveCancelbutton();
		// Close the browser
		utiliesClass.openchrome.close();
	}

	@Test
	// Create Method Create New Employee
	public void cloneQuestion() throws Exception {
		loginClass.login();// input[@id='input-271']
		// Create explicit wait to halt until search box appear
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search apps or items...\"]")));
		// Searching Opportunities to search box
		utiliesClass.sendEventsxpath("//input[@placeholder=\"Search apps or items...\"]", ("Questions"));
		// Click on Opportunities
		utiliesClass.clickEventxpath("//p[@class='slds-truncate']");
		Thread.sleep(15000);
		utiliesClass.openchrome.switchTo()
				.frame(utiliesClass.openchrome.findElement(By.xpath("//iframe[@title='accessibility title']")));

		// Gate1

		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//select[@class='slds-input select uiInput uiInputSelect uiInput--default uiInput--select']")));
		utiliesClass.staticDropdown(
				"//select[@class='slds-input select uiInput uiInputSelect uiInput--default uiInput--select']",
				"Gate 1 - Interest");
		utiliesClass.clickEventxpath("(//*[@class=' label bBody'])[1]");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("(//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input'])[1]")));
		utiliesClass.clickEventxpath("(//*[@class=' label bBody'])[5]");
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='slds-input select']")));
		utiliesClass.staticDropdown("//select[@class='slds-input select']", "Gate 2 - Pursuit");
		utiliesClass.clickEventxpath("//button[@class='slds-button slds-button--neutral slds-button--brand']");
		utiliesClass.wait.until(ExpectedConditions.alertIsPresent());
		// Click Ok on alert
		utiliesClass.openchrome.switchTo().alert().accept();
		utiliesClass.clickEventxpath("(//*[@class=' label bBody'])[4]");
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
