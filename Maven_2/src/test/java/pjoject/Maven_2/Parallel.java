package pjoject.Maven_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {
	@Test
	private void boy() {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mani\\eclipse-workspace\\Maven_2\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.toolsqa.com/selenium-webdriver/run-selenium-tests-on-chrome/");
	}
	@Test
	private void boys() {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mani\\eclipse-workspace\\Maven_2\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.toolsqa.com/selenium-webdriver/run-selenium-tests-on-chrome/");
	}
	@Test
	private void boyz() {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mani\\eclipse-workspace\\Maven_2\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.toolsqa.com/selenium-webdriver/run-selenium-tests-on-chrome/");
	}
}