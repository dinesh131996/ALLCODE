package com.hubnode.org;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Hub_Node {
	public static void main(String[] args) throws MalformedURLException {
		
		//WebDriver driver =  new ChromeDriver();
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("internet explorer");
		//cap.setVersion("89.0.4389.90");
		cap.setPlatform(Platform.WIN8_1);
		
		
		ChromeOptions chro = new ChromeOptions();
		chro.merge(cap);
		
		String huburl="http://192.168.1.15:4444/wd/hub";
		//WebDriver driver= new RemoteWebDriver((new URL(huburl)),chro);
		WebDriver driver= new RemoteWebDriver((new URL(huburl)),cap);
		driver.get("https://www.youtube.com/watch?v=P8yq37Qr4eo");	
	}

}
