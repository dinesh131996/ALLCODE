package com.selenium.org;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Task1 {

	public static void main(String[] args) throws IOException {
		
		List<String> list = new LinkedList<String>();
		list.add("on the table");
		list.add("on for table");
		list.add("on in table");
		list.add("on the floor");
		list.add("on the mark");
		list.add("take for me");
		
		for (String string : list) {
			String[] split = string.split(" ");
			if (split[1].equals("the")) {
				System.out.println(string);
			}
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Mani\\eclipse-workspace\\Day7SeleniumTask\\driver\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://chercher.tech/webdriverio/dynamic-webtable");
		 * 
		 * 
		 * 
		 * 
		 * 
		 * List<WebElement> findElements =
		 * driver.findElements(By.xpath("//td[contains(text(),'Chercher.tech')]"));
		 */
		
		
		
		/*
		 * for (WebElement webElement : findElements) {
		 * 
		 * String s =webElement.getText();
		 * 
		 * String[] split = s.split(" "); if (split[2]=="john") { System.out.println(s);
		 * }
		 */

		/*
		 * TakesScreenshot ts = (TakesScreenshot)driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File frame = new File(
		 * "C:\\Users\\Mani\\eclipse-workspace\\Day7SeleniumTask\\screenshot\\greens.png"
		 * ); Files.copy(source, frame); //Files.copy(source, frame);
		 */

	}

}
