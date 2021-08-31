package com.sele.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling {
	public void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Mani\\eclipse-workspace\\Karthi\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("");
	}
}
