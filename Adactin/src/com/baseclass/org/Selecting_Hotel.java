package com.baseclass.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecting_Hotel {
	public static WebDriver driver;
	@FindBy(id="radiobutton_0")
	private WebElement checkbox_Btn;
	
	

	@FindBy(id="continue")
	private WebElement search_Btn;
	
	public Selecting_Hotel(WebDriver ldriver) {
    this.driver=ldriver;
    PageFactory.initElements(driver, this);

	}

	public WebElement getCheckbox_Btn() {
		return checkbox_Btn;
	}

	public WebElement getSearch_Btn() {
		return search_Btn;
	}

}
