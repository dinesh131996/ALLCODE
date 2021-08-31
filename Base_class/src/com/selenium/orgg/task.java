package com.selenium.orgg;

import org.openqa.selenium.WebDriver;

public class task {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//Base_class.browser("firefox");

		//1  Base_class.click("xpath", "//a[text()='Alert with Textbox ']");
		//1  Base_class.click("xpath", "(//button[contains(text(),'click the button to')])[3]");
		// 1 Base_class.alert("sendkey", "Dinesh","accept");
		//2  Base_class.get("http://demo.automationtesting.in/Alerts.html");
		// 2 Base_class.click("xpath", "//button[@class='btn btn-danger']");
		// 2 Base_class.alert("accept", null, null);
		  

		Thread.sleep(4000);
		// Base_class.get("https://www.google.com/");
		// Base_class.frame(0);
		// Base_class.send_key("//input[@type='text']", "hello");

		// Base_class.send_keys("xpath", "//input[@type='text']", "hello");
		// Base_class.navigation("to",
		// "https://www.google.com/search?client=firefox-b-d&q=gobigo");
		// Base_class.click("xpath", "//a[text()='Gmail']");
		// Base_class.navigation("back", "");

		driver=Base_class.browserss("chrome");
		Base_class.get_url("http://demo.automationtesting.in/Frames.html");
		
		// Base_class.send_key("//input[@type='text']", "hello");
		Base_class.send_keys("xpath", "//input[@type='text']", "hello");

		Base_class.browserss("opera");

	}

}
