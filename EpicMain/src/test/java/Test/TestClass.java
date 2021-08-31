package Test;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import BaseClass.PageBase;
import Pages.EpicPage;
import Pages.LandingPage;
import Pages.ProjectPage;
import Utils.ExtentReportManager;

public class TestClass extends PageBase{
	
	ExtentReports report = ExtentReportManager.getReportInstance();

	public void invokeBrowser() {
		Propertyfile();
		invokeBrowser(prop.getProperty("browserName"));
		ExtentTest logger = report.createTest("Test One");
		logger.log(Status.INFO,"Initializing browser");
		
	}
	
	public void openWebsite() {
		openWebsite("URL");
		ExtentTest logger = report.createTest("Test Two");
		logger.log(Status.INFO,"Navigate to website");
	}
	
	public void navigateToEpics() {
		ExtentTest logger = report.createTest("Test Three");
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.clickProject("menu_xpath","project_xpath");
		logger.log(Status.INFO,"Clicking on Project");
		
		ProjectPage projectPage = new ProjectPage(driver);
		projectPage.moveToExecute("execute_id","epics_id","addBtn_id");
		logger.log(Status.INFO,"Go to Epics and Add");
	}
	
	public void EpicsValidData() throws Exception {
		EpicPage epicPage = new EpicPage(driver);
		epicPage.EnterName("name_xpath");
		epicPage.EnterDescription("description_xpath");
		epicPage.SelectPriority("priority_xpath");
		epicPage.EnterDueDate("Due_Date_id");
		epicPage.SelectTheme("Theme_xpath");
		epicPage.ClickSave("saveBtn_id");
		screenshot();
		ExtentTest logger = report.createTest("Test Four");
		logger.log(Status.PASS,"Saving Epics with valid data");
	}
	
	public void EpicsInvalidData() throws Exception {
		EpicPage epicPage = new EpicPage(driver);
		epicPage.newEpic("newEpic_xpath");
		epicPage.EnterinvalidName("name_xpath");
		epicPage.EnterinvalidDueDate("Due_Date_id");
		epicPage.ClickSave("saveBtn_id");
		ExtentTest logger = report.createTest("Test Five");
		logger.log(Status.INFO,"Filling Invalid details");
	}
	
	public void captureErrorMsg() {
		 EpicPage epicPage = new EpicPage(driver);
		 epicPage.getErrorMsg();
			ExtentTest logger = report.createTest("Test Six");
			logger.log(Status.INFO,"Getting Error Message");
	}
	
	public void Closebrowser() {
		teardown();
		ExtentTest logger = report.createTest("Test Seven");
		logger.log(Status.PASS,"Closing the browser");
		report.flush();
	}
}
