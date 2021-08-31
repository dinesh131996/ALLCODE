package com.stepdef.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_Class.Base_class;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import gherkin.formatter.model.Scenario;

public class For_Register extends Base_class{
	
	
	
	//public static WebDriver driver;
	@Given("^set up the browser$")
	public void set_up_the_browser() throws Throwable {
	   
	  //  driver= new ChromeDriver();
		browserss("chrome");
	}

	@Then("^Give the url$")
	public void give_the_url() throws Throwable {
	   
	 get_url("https://www.flipkart.com/"); 
	 click("xpath", "//button[@class='_2KpZ6l _2doB4z']");
	}

	@Then("^search the product$")
	public void search_the_product() throws Throwable {
		//////div[text()='Electronics']
		//a[text()='Login']
		
		Thread.sleep(10000);
		WebElement findElement = driver.findElement(By.xpath("//div[text()='Electronics']"));
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 10);
		 * wait.until(ExpectedConditions.visibilityOf(findElement));
		 * Thread.sleep(10000);
		 */
		Actions a = new Actions(driver);
		a.moveToElement(findElement).build().perform();
		  driver.findElement(By.xpath("//a[text()='Computer Peripherals']")).click();
		  
		 
		
	}

	@Then("^add to cart$")
	public void add_to_cart() throws Throwable {
	   
	    
	}

}
