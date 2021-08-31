package com.first;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;



public class Simple {
	int i=10; int j=0;
	
	public static WebDriver driver;
	
@Test(retryAnalyzer = RetryAnalyzer.class)
private void same(ITestResult result) {
//System.out.println(i/j);
	assertEquals("dinu", "din");
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
}

@Test(retryAnalyzer = RetryAnalyzer.class)
private void same1() {
System.out.println(i/j);
}
@Test(retryAnalyzer = RetryAnalyzer.class)
private void same2() {
System.out.println(i+j);
}

@Test(enabled=false)
private void takeOver() {
	// TODO Auto-generated method stub
System.out.println(i/j);
}
@Test(invocationCount = 3)
private void clac() {
	// TODO Auto-generated method stub
System.out.println(i+j);
}
}
