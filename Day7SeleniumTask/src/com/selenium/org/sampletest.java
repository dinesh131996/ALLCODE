package com.selenium.org;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class sampletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Mani\\eclipse-workspace\\Day7SeleniumTask\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Dinesh");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("12345");
		
		WebElement login_btn = driver.findElement(By.xpath("login"));
		login_btn.click();
		
		//*[@id="loginForm"]/div/div[1]/div/label/input	
		TakesScreenshot ts =(TakesScreenshot)driver;
		
	File source = ts.getScreenshotAs(OutputType.FILE);
	File dest= new File("C:\\Users\\Mani\\eclipse-workspace\\Day7SeleniumTask\\screenshot\\king.png");
	Files.copy(source, dest);
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)");
	js.executeScript("window.scrollBy(0,-1000)");
		
	WebElement findElement = driver.findElement(By.id("location"));
	Select s = new Select(findElement);
	s.selectByVisibleText("Sydney");
	}

}
