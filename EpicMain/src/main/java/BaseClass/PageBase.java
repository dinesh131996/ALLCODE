package BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.Constants;

public class PageBase {

	public WebDriver driver;
	public Properties prop;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;

	//Property file
	public void Propertyfile() {
		try {
			if (prop == null) {
				prop = new Properties();

				try {
					FileInputStream file = new FileInputStream(
							System.getProperty("user.dir")
									+ "//src//test//resources//ObjectRepository//projectConfig.properties");
					prop.load(file);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {

		}
	}

	//Invoking browsers
	public void invokeBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {

			//Setting property of chrome driver
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")
							+ "/src/test/resources/drivers/chromedriver.exe");

			driver = new ChromeDriver();
		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			
			//Setting property of firefox driver
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")
							+ "/src/test/resources/drivers/geckodriver.exe");
			
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICITLY_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIMEOUTS, TimeUnit.SECONDS);
	}
	
	//Opening website
	public void openWebsite(String websiteURLKey) {
		driver.get(prop.getProperty(websiteURLKey));
		
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Getting excel values
	public void getExcelData() throws Exception{
	
		File file = new File(System.getProperty("user.dir")+"//src//test//resources//ExcelData//FormDetails.xlsx");
		FileInputStream readfile = new FileInputStream(file);
	
		workbook = new XSSFWorkbook(readfile);
		sheet = workbook.getSheet("Sheet");
	}
	
	//Locators
	public WebElement getElement(String locatorKey) {
		WebElement element = null;

		if (locatorKey.endsWith("_xpath")) {
			element = driver.findElement(By.xpath(prop.getProperty(locatorKey)));
		} else if (locatorKey.endsWith("_partialLinkText")) {
			element = driver.findElement(By.partialLinkText(prop.getProperty(locatorKey)));
		} else if (locatorKey.endsWith("_name")) {
			element = driver.findElement(By.name(prop.getProperty(locatorKey)));
		} else if (locatorKey.endsWith("_id")) {
			element = driver.findElement(By.id(prop.getProperty(locatorKey)));
		} else if (locatorKey.endsWith("_CssSelector")) {
			element = driver.findElement(By.cssSelector(prop.getProperty(locatorKey)));
		}
		return element;
	}
	
	//closing browser
	public void teardown() {
		driver.close();
	}
	
	public void screenshot() throws IOException {
		
		WebDriverWait wait = new WebDriverWait(driver,1000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\'KEY_BUTTON_Add\']"))));
		   //ScreenShot:
		   TakesScreenshot capture = (TakesScreenshot) driver;
		   File srcFile = capture.getScreenshotAs(OutputType.FILE);
		   File destFile = new File(System.getProperty("user.dir")+"\\Screenshot\\screenshot.png");
		   FileUtils.copyFile(srcFile, destFile);
	}

}
