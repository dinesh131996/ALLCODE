package com.tutorial.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tutorial {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mani\\eclipse-workspace\\Tutorial\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=selenium+download&rlz=1C1CHBD_enIN939IN939&oq=selenium+download&aqs=chrome.0.69i59j0l6j69i60.5736j0j4&sourceid=chrome&ie=UTF-8");
		/*
		 * driver.navigate().to("https://www.youtube.com/"); driver.navigate().back();
		 * driver.navigate().forward(); driver.navigate().refresh();
		 * driver.navigate().to("https://sites.google.com/a/chromium.org/chromedriver/")
		 * ;
		 */
		/*
		 * WebElement emailAddress = driver.findElement(By.xpath("//input[@type='text']"));
		 * emailAddress.sendKeys("dinesh");
		 * 
		 * WebElement passs = driver.findElement(By.id("pass"));
		 * passs.sendKeys("12345");
		 * 
		 * WebElement Loginbtn = driver.findElement(By.name("login")); Loginbtn.click();
		 */
		
		
		WebElement emaill = driver.findElement(By.xpath("//input[@type='text']"));
		emaill.sendKeys("dinesh");
		
		WebElement loginbtn = driver.findElement(By.xpath("//button[@value='1']"));
		loginbtn.click();
		driver.navigate().back();
		
		List<WebElement> linkonthispage = driver.findElements(By.tagName("a"));
		for (WebElement webElement : linkonthispage) {
			System.out.println(webElement.getText());
		}

		//Thread.sleep(30000);
		//driver.quit();

	}
}
