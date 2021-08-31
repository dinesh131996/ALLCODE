package com.hubnode.org;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Hub_Node {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		//DesiredCapabilities cappp= new DesiredCapabilities()
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);

	//	ChromeOptions chroo = new ChromeOptions();
		
		ChromeOptions chro = new ChromeOptions();
		chro.merge(cap);

		//String huburl = "http://192.168.1.19:4444/wd/hub";
		URL url = new URL("http://192.168.1.19:4444/wd/hub");
		// http://192.168.1.19:4444/grid/console
Thread.sleep(10000);

		//WebDriver driver = new RemoteWebDriver(new URL(huburl), chro);
WebDriver driver=new RemoteWebDriver(url,chro);
//new URL(huburl), chro
		driver.get("https://www.youtube.com/watch?v=P8yq37Qr4eo");
	}

}
