package com.selenium.orgg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Adactin_Task extends Base_class {
	//public static WebDriver driver;
	//public static WebElement element;
	public static void access_baseclass() throws InterruptedException {
	     driver= browserss("chrome");
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
     	
     	click("id", "check_all");
     	
     	click("name", "cancelall");
     	
     	alert("accept", "", "");
     	
     	click("id", "logout");
     	
     
     	waitt(30);
     	quit();

}
	public static void main(String[] args) throws InterruptedException {
		access_baseclass();
	}
}
