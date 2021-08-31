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

import com.firstproject.org.Maven_Project.Base_class;

public class ScreenShot {
	public static WebDriver driver;
	@Test
	private void same() throws IOException {
	//System.out.println(i/j);
		driver=Base_class.browser("chrome");
		Base_class.get_url("https://www.thebalancecareers.com/resume-profile-vs-resume-objective-2063185");
		
				  TakesScreenshot ts = (TakesScreenshot)driver;
				  File screenshotAs = ts.getScreenshotAs(OutputType.FILE); 
			  File dest = new File("C:\\Users\\Mani\\eclipse-workspace\\Maven_1\\screenshot\\.png");
			 FileUtils.copyFile(screenshotAs, dest);
		}
	}
