package com.first;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	public static WebDriver driver;
	int count = 0;
	int limit = 4;

	public boolean retry(ITestResult result) {
		
		  if (!result.isSuccess()) { 
			  TakesScreenshot ts = (TakesScreenshot)driver;
			  File screenshotAs = ts.getScreenshotAs(OutputType.FILE); 
		  File dest = new File("C:\\Users\\Mani\\eclipse-workspace\\Maven_1\\screenshot\\.png");
		   try {
			FileUtils.copyFile(screenshotAs, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		  }
if (count<limit) {
	count++;
	return true;
}
		return false;
	}

}
