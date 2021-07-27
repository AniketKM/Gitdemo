package fedcap;



	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeSuite;
	//import io.github.bonigarcia.wdm.WebDriverManager;
	public class Utilies1 {
		
		// Create openchrome public object
		public WebDriver openchrome;
		// Create wait public object
		public WebDriverWait wait;
		// Create chromeOptions public object
		public ChromeOptions chromeOptions;
		// Create js public object
		public JavascriptExecutor js;
		//Login loginClass = new Login();

		// Create a method of waits,chrome disable etc
		public void initObjects() throws Exception {
			// to disable chrome notifications

			chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--disable-notifications");
		//	WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			// created Object openchrome for chromedriver
			// Initiate Chrome browser
			openchrome = new ChromeDriver(chromeOptions);
			// Applied implicit wait to wait gloabally for 5secs
			openchrome.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			// Created object wait for explicit wait
			wait = new WebDriverWait(openchrome, 95);
			// Created object js of JavascriptExecutor
			js = (JavascriptExecutor) openchrome;
		}

		// Create a method of clickEvent by xpath
		public WebElement clickEventxpath(String clickElement) throws Exception {
			openchrome.findElement(By.xpath(clickElement)).click();
			return null;
		}

		// Create a method of clickEvent by className
		public void clickEventclassName(String clickElement2) throws Exception {
			openchrome.findElement(By.className(clickElement2)).click();
		}

		// Create a method of clickEvent by id
		public void clickEventid(String clickElement) throws Exception {
			openchrome.findElement(By.id(clickElement)).click();
		}

		// Create a method of clickEvent by name
		public void clickEventname(String clickElement) throws Exception {
			openchrome.findElement(By.name(clickElement)).click();
		}

		// Create a method of clickEvent by cssSelector
		public void clickEventcssSelector(String clickElement) throws Exception {
			openchrome.findElement(By.cssSelector(clickElement)).click();
		}

		// Create a method of clickEvent by tagName
		public void clickEventtagName(String clickElement) throws Exception {
			openchrome.findElement(By.tagName(clickElement)).click();
		}

		// Create a method of clickEvent by partialLinkText
		public void clickEventpartialLinkText(String clickElement) throws Exception {
			openchrome.findElement(By.partialLinkText(clickElement)).click();
		}

		// Create a method of clickEvent by linkText
		public void clickEventlinkText(String clickElement) throws Exception {
			openchrome.findElement(By.linkText(clickElement)).click();
		}

		// Create a method of sendEvents by xpath
		public void sendEventsxpath(String sendElement, String keyElement) throws Exception {
			openchrome.findElement(By.xpath(sendElement)).sendKeys(keyElement);
		}

		// Create a method of sendEvents by className
		public void sendEventsclassName(String sendElement2, String keyElement2) throws Exception {
			openchrome.findElement(By.className(sendElement2)).sendKeys(keyElement2);
		}

		// Create a method of sendEvents by name
		public void sendEventsname(String sendElement, String keyElement) throws Exception {
			openchrome.findElement(By.name(sendElement)).sendKeys(keyElement);
		}

		// Create a method of sendEvents by tagName
		public void sendEventstagName(String sendElement, String keyElement) throws Exception {
			openchrome.findElement(By.tagName(sendElement)).sendKeys(keyElement);
		}

		// Create a method of sendEvents by cssSelector
		public void sendEventscssSelector(String sendElement, String keyElement) throws Exception {
			openchrome.findElement(By.cssSelector(sendElement)).sendKeys(keyElement);
		}

		// Create a method of sendEvents by partialLinkText
		public void sendEventspartialLinkText(String sendElement, String keyElement) throws Exception {
			openchrome.findElement(By.partialLinkText(sendElement)).sendKeys(keyElement);
		}

		// Create a method of sendEvents by linkText
		public void sendEventslinkText(String sendElement, String keyElement) throws Exception {
			openchrome.findElement(By.linkText(sendElement)).sendKeys(keyElement);
		}

		// Create a method of static Drop down
		public void staticDropdown(String dropdownxpath, String Value) throws Exception {
			WebElement staticDropdown = openchrome.findElement(By.xpath(dropdownxpath));
			Select dropdown = new Select(staticDropdown);
			dropdown.selectByValue(Value);
			System.out.println(dropdown.getFirstSelectedOption().getText());
		}

		/*public void opprPage() throws Exception {
			// Call the login class to execute
			loginClass.login();// input[@id='input-271']
			// Create explicit wait to halt until search box appear
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search apps or items...\"]")));
			// Searching Opportunities to search box
			sendEventsxpath("//input[@placeholder=\"Search apps or items...\"]", ("Opportunities"));
			// Click on Opportunities
			clickEventxpath("//p[@class='slds-truncate']");

		}*/

		public void alert() throws Exception {

			openchrome.switchTo().alert().accept();
			Thread.sleep(9000);
			openchrome.switchTo().alert().accept();
		}

		public void mouseAction(String xpth) throws Exception {
			openchrome.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			WebElement element = openchrome.findElement(By.xpath(xpth));
			Actions Action = new Actions(openchrome);
			Action.doubleClick(element).perform();

		}

		public void jsEx(String xpath) throws Exception {
			WebElement element = openchrome.findElement(By.xpath((xpath)));
			JavascriptExecutor js = (JavascriptExecutor) openchrome;
			js.executeScript("arguments[0].click();", element);
		}

		public void clickingOk() throws Exception {
			Thread.sleep(2000);
			clickEventxpath("(//button[@class='confirm'])");
			Thread.sleep(2000);
			clickEventxpath("(//button[@class='confirm' and text()='OK'])");

		}

		// method to check add row is present or not
		public void formFilling() throws Exception {
			openchrome.findElement(By.xpath("(//input[@class='form-control tt-input'])[3]")).clear();
			sendEventsxpath("(//input[@class='form-control tt-input'])[3]", "Test Glance");
			// loginClass.sendEventsxpath("(//input[@class='form-control tt-input'])[4]",
			// "Test");
			clickEventxpath("(//button[@onclick='saveField();'])");

		}

		public void enterDataevent(String xpath) throws Exception {
			openchrome.findElement(By.xpath(xpath)).click();

			openchrome.findElement(By.xpath(xpath)).sendKeys(Keys.DOWN);

			openchrome.findElement(By.xpath(xpath)).sendKeys(Keys.ENTER);

		}

		// method to check add row is present or not
		public void saveCancelbutton() throws Exception {

			clickEventxpath("(//*[@class=' label bBody'])[7]");
			// Create explicit wait to halt until alert pop-up appear
			wait.until(ExpectedConditions.alertIsPresent());
			// Click Ok on alert
			openchrome.switchTo().alert().accept();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class=' label bBody'])[8]")));
			clickEventxpath("(//*[@class=' label bBody'])[8]");

		}

		// method to check add row is present or not
		public void addRowbutton() throws Exception {

			if (openchrome
					.findElement(By
							.xpath("(//button[@class='slds-button slds-button--neutral slds-not-selected slds-show'])[1]"))
					.isDisplayed()) {
				openchrome
						.findElement(By.xpath(
								"(//button[@class='slds-button slds-button--neutral slds-not-selected slds-show'])[1]"))
						.click();
			}

			else
				System.out.println("Add Row button is not there");

		}

		public void enterDataevent1(String xpath) throws Exception {
			openchrome.findElement(By.xpath(xpath)).click();
			for (int i = 1; i < 4; i++) {
				openchrome.findElement(By.xpath(xpath)).sendKeys(Keys.DOWN);
			}
			openchrome.findElement(By.xpath(xpath)).sendKeys(Keys.ENTER);
		}
	}

