package com.selenium.orgg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handle1 {
	public static String value;
	
	public static WebDriver  driver;
	
	public static void main(String[] args) throws AWTException, InterruptedException {

		// first we want to set the driver
	

		// WebDriver is an interface
		// ChromeDriver is a class
		driver=Base_class.browserss("chrome");

		// Using get we give the URL to the driver
		driver.get("https://www.redbus.in/bus-tickets");

		// It is implicitWait
		// Instead of using Thread
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("txtSource")).sendKeys("chennai");

		// parent window
		value=driver.getWindowHandle();
System.out.println(value);
		// For Mouse hover we want to import the Actions
		// Actions is a class
		Actions as = new Actions(driver);

		// child window 1
		WebElement rpool_button = driver.findElement(By.xpath("//a[text()='rPool']"));
		as.contextClick(rpool_button).build().perform();

		// For Keyboard hover we want to import the Actions
		// Robot is a class
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		// child window 2
		WebElement rpool_button1 = driver.findElement(By.xpath("//a[text()='BUS HIRE']"));
		as.contextClick(rpool_button1).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);

		// Access all the parent and child windows
	value=Base_class.window_handles();
	System.out.println(value);
		
		}
		
		
	
	}

