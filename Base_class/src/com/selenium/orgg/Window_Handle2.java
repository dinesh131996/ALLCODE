package com.selenium.orgg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handle2 {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mani\\eclipse-workspace\\Window_handing\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/bus-tickets");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	/*
	 * String first = driver.getWindowHandle(); System.out.println(first);
	 */
	driver.findElement(By.id("txtSource")).sendKeys("chennai");
	System.out.println(driver.getTitle());
	Actions  as = new Actions(driver);
	WebElement rpool_button = driver.findElement(By.xpath("//a[text()='rPool']"));
	as.contextClick(rpool_button).build().perform();
	
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	// to get the axis of the particular window
	System.out.println(driver.manage().window().getSize());
	
}
}