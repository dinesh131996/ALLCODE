package com.runner.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Final_Page {
public static WebDriver driver;
	@FindBy(id="my_itinerary")
	private WebElement myLiteracy;
	@FindBy(id="check_all")
	private WebElement selectAll;
	@FindBy(id="logout")
	private WebElement logout;
	public WebElement getMyLiteracy() {
		return myLiteracy;
	}
	public WebElement getSelectAll() {
		return selectAll;
	}
	public WebElement getLogout() {
		return logout;
	}
	

	
	public Final_Page(WebDriver ldriver) {
		// TODO Auto-generated constructor stub
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
}
