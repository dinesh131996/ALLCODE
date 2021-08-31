package com.selenium.orgg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ToKnowTheLink extends Base_class {
public static void main(String[] args) {
	driver=browserss("chrome");
	get_url("https://www.google.com/search?q=selenium+download&rlz=1C1CHBD_enIN939IN939&oq=selenium+download&aqs=chrome.0.69i59j0l6j69i60.5736j0j4&sourceid=chrome&ie=UTF-8");
	List<WebElement> findElements = driver.findElements(By.tagName("a"));
	for (WebElement webElement : findElements) {
		System.out.println(webElement.getText());
	}
	
}
	
	
}
