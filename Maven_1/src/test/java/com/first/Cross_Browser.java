package com.first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Browser {

	@Test
	@Parameters({"username","password"})
	private void chroem() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mani\\eclipse-workspace\\Maven_1\\driver\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.youtube.com/");
	
	}
	@Test
	private void chroe() {
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mani\\eclipse-workspace\\Maven_1\\driver\\geckodriver.exe");
WebDriver driver= new FirefoxDriver();
driver.get("https://www.youtube.com/");
	
	}
	
	@Test
	private void chrom() {
System.setProperty("webdriver.ie.driver", "C:\\Users\\Mani\\eclipse-workspace\\Maven_1\\driver\\IEDriverServer.exe");
WebDriver driver= new InternetExplorerDriver();
driver.get("https://www.youtube.com/");
	
	}
	
	
	
}
