package com.selenium.orgg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scrolll extends Base_class {
public static void main(String[] args) throws InterruptedException {
	driver=Base_class.browserss("chrome");
	get_url("https://www.amazon.in/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Thread.sleep(5000);
	js.executeScript("window.scrollBy(0,4974)");
	/*
	 * WebElement findElement =
	 * driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
	 * js.executeScript("arguments[0].scrollIntoView(true)",findElement);
	 * System.out.println(findElement.getLocation().getY());
	 */
	Thread.sleep(5000);
	
	
	WebElement findElement2 = driver.findElement(By.xpath("//a[@class='a-carousel-goto-prevpage']"));
	js.executeScript("arguments[0].scrollIntoView(true)",findElement2);
}
}
