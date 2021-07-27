package fedcap;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Aprrovalprocess {
	// Create object login class of login class
	Login loginClass = new Login();
	Utilies1 utiliesClass = new Utilies1();

	@Test
	// Create Method change owner Opportunity
	public void sendAprrovalprocess() throws Exception {
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
		utiliesClass.clickEventxpath("//a[@name='Submit']");
		utiliesClass.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@role='textbox']")));

		// Click on button change owner
		utiliesClass.openchrome.findElement(By.xpath("//textarea[@role='textbox']")).sendKeys("Test");
		// textarea[@role='textbox']
		utiliesClass.clickEventxpath(
				"//button[@class='slds-button slds-button--neutral modal-button-left actionButton uiButton--default uiButton--brand uiButton']");
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
