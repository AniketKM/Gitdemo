package fedcap;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Customizeopplayout {

	// Create object login class of login class
	Login loginClass = new Login();
	Utilies1 utiliesClass = new Utilies1();

	@Test
	// Create Method Create New Employee
	public void addFields() throws Exception {

		loginClass.login();// input[@id='input-271']
		// Create explicit wait to halt until search box appear
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search apps or items...\"]")));
		// Searching Opportunities to search box
		utiliesClass.sendEventsxpath("//input[@placeholder=\"Search apps or items...\"]", ("Customize Opp Layout"));
		// Click on Opportunities
		utiliesClass.clickEventxpath("//p[@class='slds-truncate']");
		Thread.sleep(20000);
		// utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@title='accessibility
		// title']")));
		utiliesClass.openchrome.switchTo()
				.frame(utiliesClass.openchrome.findElement(By.xpath("//iframe[@title='accessibility title']")));
		utiliesClass.staticDropdown("//select[@class='form-control']", "0125G000000X9Un");
		utiliesClass.clickEventxpath("//input[@value='Go']");
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='editSec'])[1]")));
		utiliesClass.clickEventxpath("(//a[@class='editSec'])[1]");
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//input[@class='form-control tt-input'])[6]")));
		utiliesClass.sendEventsxpath("(//input[@class='form-control tt-input'])[6]", "Testing purpose");
		utiliesClass.sendEventsxpath("(//input[@class='form-control tt-input'])[7]", "Testing_purpose");
		utiliesClass.sendEventsxpath("(//input[@class='form-control'])[22]", "7");
		utiliesClass.clickEventxpath("(//div[@class='sp-dd'])");
		// utiliesClass.openchrome.findElement(By.xpath("(//input[@class='sp-input'])")).clear();
		Thread.sleep(7000);
		utiliesClass.clickEventxpath("(//div[@class='sp-dragger'])");
		// utiliesClass.sendEventsxpath("(//input[@class='sp-input'])", "#151111");
		utiliesClass.clickEventxpath("(//button[@class='sp-choose'])");
		// utiliesClass.openchrome.switchTo().alert().accept();
		utiliesClass.clickEventxpath("(//button[@onclick='saveGlance();'])");
		Thread.sleep(9000);
		utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='editSec'])[3]")));
		utiliesClass.clickEventxpath("(//a[@class='editSec'])[3]");
		utiliesClass.sendEventsxpath("(//input[@class='form-control'])[24]", "Test");
		utiliesClass.sendEventsxpath("(//input[@class='form-control'])[25]", "test");
		utiliesClass.sendEventsxpath("(//textarea[@class='form-control fixed-textarea'])[1]", "test");
		utiliesClass.clickEventxpath("(//button[@onclick='saveButton();'])");
		for (int i = 1; i <= 4; i++) {

			Thread.sleep(9000);
			utiliesClass.wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//input[@value='Add Field'])[" + i + "]")));
			utiliesClass.clickEventxpath("(//input[@value='Add Field'])[" + i + "]");
			utiliesClass.formFilling();

		}
		Thread.sleep(9000);
		utiliesClass.js.executeScript("window.scrollBy(0,-700)");
		utiliesClass.clickEventxpath("(//input[@value='Save'])");
		// Close the browser
		utiliesClass.openchrome.close();
	}

	@Test
	// Create Method Create New Employee
	public void editFields() throws Exception {

		loginClass.login();// input[@id='input-271']
		// Create explicit wait to halt until search box appear
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search apps or items...\"]")));
		// Searching Opportunities to search box
		utiliesClass.sendEventsxpath("//input[@placeholder=\"Search apps or items...\"]", ("Customize Opp Layout"));
		// Click on Opportunities
		utiliesClass.clickEventxpath("//p[@class='slds-truncate']");
		Thread.sleep(20000);
		// utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@title='accessibility
		// title']")));
		utiliesClass.openchrome.switchTo()
				.frame(utiliesClass.openchrome.findElement(By.xpath("//iframe[@title='accessibility title']")));
		utiliesClass.staticDropdown("//select[@class='form-control']", "0125G000000X9Un");
		utiliesClass.clickEventxpath("//input[@value='Go']");
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@alt='Update Field'])[7]")));
		utiliesClass.clickEventxpath("(//img[@alt='Update Field'])[7]");
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//input[@class='form-control tt-input'])[6]")));
		utiliesClass.openchrome.findElement(By.xpath("(//input[@class='form-control tt-input'])[6]")).clear();
		utiliesClass.sendEventsxpath("(//input[@class='form-control tt-input'])[6]", "Testing purpose1");
		utiliesClass.openchrome.findElement(By.xpath("(//input[@class='form-control tt-input'])[7]")).clear();
		utiliesClass.sendEventsxpath("(//input[@class='form-control tt-input'])[7]", "Testing_purpose1");
		utiliesClass.openchrome.findElement(By.xpath("(//input[@class='form-control'])[22]")).clear();
		utiliesClass.sendEventsxpath("(//input[@class='form-control'])[22]", "7");
		utiliesClass.clickEventxpath("(//div[@class='sp-dd'])");
		// utiliesClass.openchrome.findElement(By.xpath("(//input[@class='sp-input'])")).clear();
		Thread.sleep(7000);
		utiliesClass.clickEventxpath("(//div[@class='sp-dragger'])");
		// utiliesClass.sendEventsxpath("(//input[@class='sp-input'])", "#151111");
		utiliesClass.clickEventxpath("(//button[@class='sp-choose'])");
		// utiliesClass.openchrome.switchTo().alert().accept();
		utiliesClass.clickEventxpath("(//button[@onclick='saveGlance();'])");
		Thread.sleep(9000);
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//img[@onclick=\"isButtonUpdate('cust_button_1');\"])")));
		utiliesClass.clickEventxpath("(//img[@onclick=\"isButtonUpdate('cust_button_1');\"])");
		utiliesClass.openchrome.findElement(By.xpath("(//input[@class='form-control'])[24]")).clear();
		utiliesClass.sendEventsxpath("(//input[@class='form-control'])[24]", "Test1");
		utiliesClass.openchrome.findElement(By.xpath("(//input[@class='form-control'])[25]")).clear();
		utiliesClass.sendEventsxpath("(//input[@class='form-control'])[25]", "test1");
		utiliesClass.openchrome.findElement(By.xpath("(//textarea[@class='form-control fixed-textarea'])[1]")).clear();
		utiliesClass.sendEventsxpath("(//textarea[@class='form-control fixed-textarea'])[1]", "test1");
		utiliesClass.clickEventxpath("(//button[@onclick='saveButton();'])");

		Thread.sleep(9000);
		// utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-sectionname='Opportunity
		// Health']//child::div[@data-fieldlabel='Test
		// Glance']//child::div//child::a//child::img[@src='/resource/1619164997000/fedcapture__CustomLayout/EditLayout/img/edit.png']")));
		utiliesClass.clickEventxpath(
				"//div[@data-sectionname='Opportunity Health']//child::div[@data-fieldlabel='Test Glance']//child::div//child::a//child::img[@src='/resource/1619164997000/fedcapture__CustomLayout/EditLayout/img/edit.png']");
		utiliesClass.formFilling();
		Thread.sleep(9000);
		// utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-sectionname='Opportunity
		// Summary']//child::div[@data-fieldlabel='Test
		// Glance']//child::div//child::a//child::img[@src='/resource/1619164997000/fedcapture__CustomLayout/EditLayout/img/edit.png']")));
		utiliesClass.clickEventxpath(
				"//div[@data-sectionname='Opportunity Summary']//child::div[@data-fieldlabel='Test Glance']//child::div//child::a//child::img[@src='/resource/1619164997000/fedcapture__CustomLayout/EditLayout/img/edit.png']");
		utiliesClass.formFilling();
		Thread.sleep(9000);
		// utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-sectionname='Important
		// Dates']//child::div[@data-fieldlabel='Test
		// Glance']//child::div//child::a//child::img[@src='/resource/1619164997000/fedcapture__CustomLayout/EditLayout/img/edit.png']")));
		utiliesClass.clickEventxpath(
				"//div[@data-sectionname='Important Dates']//child::div[@data-fieldlabel='Test Glance']//child::div//child::a//child::img[@src='/resource/1619164997000/fedcapture__CustomLayout/EditLayout/img/edit.png']");
		utiliesClass.formFilling();
		Thread.sleep(9000);
		// utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-sectionname='Important
		// Dates']//child::div[@data-fieldlabel='Test
		// Glance']//child::div//child::a//child::img[@src='/resource/1619164997000/fedcapture__CustomLayout/EditLayout/img/edit.png']")));
		utiliesClass.clickEventxpath(
				"//div[@data-sectionname='Important Dates']//child::div[@data-fieldlabel='Test Glance']//child::div//child::a//child::img[@src='/resource/1619164997000/fedcapture__CustomLayout/EditLayout/img/edit.png']");
		utiliesClass.formFilling();
		Thread.sleep(9000);
		utiliesClass.js.executeScript("window.scrollBy(0,-700)");
		utiliesClass.clickEventxpath("(//input[@value='Save'])");
		// Close the browser
		utiliesClass.openchrome.close();

	}

	@Test
	// Create Method Create New Employee
	public void deleteFields() throws Exception {

		loginClass.login();// input[@id='input-271']
		// Create explicit wait to halt until search box appear
		utiliesClass.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search apps or items...\"]")));
		// Searching Opportunities to search box
		utiliesClass.sendEventsxpath("//input[@placeholder=\"Search apps or items...\"]", ("Customize Opp Layout"));
		// Click on Opportunities
		utiliesClass.clickEventxpath("//p[@class='slds-truncate']");
		Thread.sleep(20000);
		// utiliesClass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@title='accessibility
		// title']")));
		utiliesClass.openchrome.switchTo()
				.frame(utiliesClass.openchrome.findElement(By.xpath("//iframe[@title='accessibility title']")));
		utiliesClass.staticDropdown("//select[@class='form-control']", "0125G000000X9Un");
		utiliesClass.clickEventxpath("//input[@value='Go']");
		utiliesClass.wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@alt='Delete Field'])[7]")));
		utiliesClass.clickEventxpath("(//img[@alt='Delete Field'])[7]");
		utiliesClass.clickingOk();
		System.out.println("Custom field deleted successfully from 'At a Glance Section'");
		Thread.sleep(2000);
		utiliesClass.clickEventxpath("(//img[@onclick=\"isButtonDelete('1')\"])");
		utiliesClass.clickingOk();
		System.out.println("Custom field deleted successfully from 'At a button section");
		Thread.sleep(3000);
		utiliesClass.openchrome.findElement(By.xpath(
				"//div[@data-sectionname='Opportunity Health']//child::div[@data-fieldlabel='Test Glance']//child::div//child::a//child::img[@src='/resource/1619164997000/fedcapture__CustomLayout/EditLayout/img/close.png']"))
				.click();
		utiliesClass.clickingOk();
		System.out.println("Custom field deleted successfully from 'At Opportunity Health section");
		Thread.sleep(3000);
		utiliesClass.openchrome.findElement(By.xpath(
				"//div[@data-sectionname='Opportunity Summary']//child::div[@data-fieldlabel='Test Glance']//child::div//child::a//child::img[@src='/resource/1619164997000/fedcapture__CustomLayout/EditLayout/img/close.png']"))
				.click();
		utiliesClass.clickingOk();
		System.out.println("Custom field deleted successfully from 'Opportunity Summary'");
		Thread.sleep(3000);
		utiliesClass.openchrome.findElement(By.xpath(
				"//div[@data-sectionname='Important Dates']//child::div[@data-fieldlabel='Test Glance']//child::div//child::a//child::img[@src='/resource/1619164997000/fedcapture__CustomLayout/EditLayout/img/close.png']"))
				.click();
		utiliesClass.clickingOk();
		System.out.println("Custom field deleted successfully from 'Important Dates'");
		utiliesClass.openchrome.findElement(By.xpath(
				"//div[@data-sectionname='System Information']//child::div[@data-fieldlabel='Test Glance']//child::div//child::a//child::img[@src='/resource/1619164997000/fedcapture__CustomLayout/EditLayout/img/close.png']"))
				.click();
		utiliesClass.clickingOk();
		System.out.println("Custom field deleted successfully from 'System Information'");
		Thread.sleep(9000);
		utiliesClass.js.executeScript("window.scrollBy(0,-700)");
		utiliesClass.clickEventxpath("(//input[@value='Save'])");
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
