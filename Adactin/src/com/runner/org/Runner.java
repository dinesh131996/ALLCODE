package com.runner.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;

import com.baseclass.org.Base_class;
import com.baseclass.org.Personal_Details;
import com.baseclass.org.Selecting_Hotel;
import com.pomclass.org.Booking_Details;
import com.pomclass.org.Login_Page;

public class Runner {
	public static WebDriver driver;
public static void main(String[] args) {
	
	
	

 driver=Base_class.browser("chrome");
 Base_class.get_url("https://adactinhotelapp.com/");
	Login_Page l= new Login_Page(driver);
	l.setUsername("username");
	Base_class.send_keys("id",l.getUsername(), "DineshDineshDineshDi");
	
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','123456')", l.getPassword());
	
//	Base_class.send(l.getPassword(), "123456");
	Base_class.clic(l.getLogin_btn());
	
	Booking_Details b = new Booking_Details(driver);
	Base_class.selections(b.getLocation(), "value", "Sydney");
	Base_class.selections(b.getHostel(), "value", "Hotel Hervey");
	Base_class.selections(b.getRoom(), "value", "Double");
	Base_class.selections(b.getNoOfRoom(), "value", "2");
	Base_class.clea(b.getCheckIn());
	Base_class.send(b.getCheckIn(), "25/02/2021");
	Base_class.clea(b.getCheckOut());
	Base_class.send(b.getCheckOut(), "28/02/2021");
	Base_class.selections(b.getAdult(), "int", "2");
	Base_class.selections(b.getChildren(), "int", "2");
	Base_class.clic(b.getSubmit_Btn());
	
	Selecting_Hotel s = new Selecting_Hotel(driver);
	Base_class.clic(s.getCheckbox_Btn());
	Base_class.clic(s.getSearch_Btn());
	
	Personal_Details p = new Personal_Details(driver);
	Base_class.send(p.getFirstname(), "Dinesh");
	Base_class.send(p.getLastname(), "subramanian");
	Base_class.send(p.getAddress(), "nallur, chennai kuruku santhu");
	Base_class.send(p.getCardNo(), "2017201520152015");
	Base_class.selections(p.getCcType(), "value", "MAST");
	Base_class.selections(p.getExpiryMonth(), "visibletext", "May");
	Base_class.selections(p.getExpiryYear(), "visibletext", "2022");
	Base_class.send(p.getCcv(), "123");
	Base_class.clic(p.getBookNow());
	Base_class.waitt(10);
	
	Final_Page f = new Final_Page(driver);
	Base_class.clic(f.getMyLiteracy());
	Base_class.clic(f.getSelectAll());
	Base_class.clic(f.getLogout());
	Base_class.quit();
	
	
}
}