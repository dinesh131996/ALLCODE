package com.pomclass.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public static WebDriver driver;

	private String username;
	//@FindBy(id = "username")
	//private WebElement username;

	public void setUsername(String username) {
		this.username = username;
	}

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login")
	private WebElement login_btn;

	public Login_Page(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public String getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}

}
