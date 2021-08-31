package com.first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Test {
	@Test
private void chroe() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Mani\\eclipse-workspace\\Maven_1\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
}
	@Test
	private void face() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mani\\eclipse-workspace\\Maven_1\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}
	@Test
	private void youtube() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mani\\eclipse-workspace\\Maven_1\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}
}
