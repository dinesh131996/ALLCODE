package com.selenium.orgg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Windowss extends Base_class{
public static void main(String[] args) throws InterruptedException, AWTException {
	driver = browserss("chrome");
	get_url("https://www.google.com/");
	waitt(30);
	value=window_handle();
	/*
	 * element=webelements("xpath", "(//span[text()='Google'])[1]");
	 * actions_element("contextclick", element,""); */Robot r = new Robot();
	 /* r.keyPress(KeyEvent.VK_DOWN); r.keyPress(KeyEvent.VK_ENTER);
	 */
	
//	click("xpath", "(//a[@class='gb_g'])[1]");
	element=webelements("xpath", "//a[text()='हिन्दी']");
	actions_element("contextclick", element,"");
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	
	element=webelements("xpath", "//a[text()='বাংলা']");
	actions_element("contextclick", element,"");
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	
	Thread.sleep(4000);
	element=webelements("xpath", "//a[text()='বাংলা']");
	actions_element("contextclick", element,"");
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	
	Thread.sleep(4000);
	element=webelements("xpath", "//a[text()='বাংলা']");
	actions_element("contextclick", element,"");
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	
	Thread.sleep(4000);
	/*Set<String> windowHandles = driver.getWindowHandles();
	System.out.println(windowHandles.size());
	for (String string : windowHandles) {
		System.out.println(string);
		System.out.println(driver.switchTo().window(string).getTitle());
	if(!string.equals(windowHandle2)) {
		driver.close();
		System.out.println("dinesh");
	}*/
	window_handles();
	driver.switchTo().window(value);
	driver.findElement(By.name("q")).sendKeys("home");

	
}
}

class king extends Base_class
{
	public static WebDriver driver;
	public static void main(String[] args) {
	driver=Base_class.browserss("chrome");
	get_url("https://adactinhotelapp.com/");
	
 	send_keys("id", "username", "DineshDineshDineshDi");
 	
 	
	send_keys("id", "password", "123456");
	click("id", "login");
	
	element=webelements("id", "location");
 	selections(element, "value", "Sydney");
 	
 	element=webelements("id", "hotels");
 	selections(element, "value", "Hotel Hervey");
 	
 	
 	element=webelements("id", "room_type");
 	selections(element, "value", "Double");
 	element=webelements("id", "room_nos");
 	selections(element, "int", "2");
 
 	clearr("id", "datepick_in");
 	send_keys("xpath", "//input[@id='datepick_in']", "23/02/2021");

 	clearr("id", "datepick_out");		
 	send_keys("xpath", "//input[@id='datepick_out']", "27/02/2021");
 	
	element=webelements("id", "adult_room");
 	selections(element, "int", "2");
 	
 	element=webelements("id", "child_room");
 	selections(element, "int", "2");
 	
 	click("id", "Submit");
 	
 	click("id", "radiobutton_0");
 	click("id", "continue");
 	
 	send_keys("id", "first_name", "Dinesh");
 	
 	send_keys("id", "last_name", "subramanian");
 	
 	send_keys("id", "address", "Nallur, chennai kuruku sandhu");
 	
 	send_keys("id", "cc_num", "2017201520152015");
 	
 	element=webelements("id", "cc_type");
 	selections(element, "value", "MAST");
 	
 	element=webelements("id", "cc_exp_month");
 	selections(element, "visibletext", "May");
 	
 	element=webelements("id", "cc_exp_year");
 	selections(element, "visibletext", "2022");
 	
 	send_keys("id", "cc_cvv", "123");
 	
 	click("id", "book_now");
 	waitt(20);
 	click("id", "my_itinerary");

 	driver.findElement(By.xpath("//input[@id='room_type_399412']/parent::*/preceding-sibling::td[11]")).click();
 	driver.findElement(By.xpath("(//input[contains(@id,'room_type_')])[1]/parent::*/preceding-sibling::td[11]")).click();	
 	}
	}