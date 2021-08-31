package com.hubnode.org;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Hub_Node {
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN8_1);
		
		String huburl="http://192.168.1.19:4444/wb/hub";
		WebDriver driver= new RemoteWebDriver(new URL(huburl),cap);
		
	driver.get("https://www.youtube.com/watch?v=P8yq37Qr4eo");	
	}

}
