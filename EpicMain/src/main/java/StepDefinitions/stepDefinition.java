package StepDefinitions;

import BaseClass.PageBase;
import Pages.EpicPage;
import Pages.LandingPage;
import Pages.ProjectPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepDefinition extends PageBase {
	
	@Before
	public void openBrowser() throws Exception {
		Propertyfile();
		invokeBrowser(prop.getProperty("browserName"));
	}
	
	@Given("^user is on MainSpring$")
	public void user_is_on_MainSpring() {
		openWebsite("URL");
	}

	@Then("^user Navigate to Epics$")
	public void user_Navigate_to_Epics() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.clickProject("menu_xpath","project_xpath");
		
		ProjectPage projectPage = new ProjectPage(driver);
		projectPage.moveToExecute("execute_id","epics_id","addBtn_id");
	}
	
	@And("^user Add Epics with valid data$")
	public void user_Add_Epics() throws Exception {
	   EpicPage epicPage = new EpicPage(driver);
	   epicPage.EnterName("name_xpath");
	   epicPage.EnterDescription("description_xpath");
	   epicPage.SelectPriority("priority_xpath");
	   epicPage.EnterDueDate("Due_Date_id");
	   epicPage.SelectTheme("Theme_xpath");
	   epicPage.ClickSave("saveBtn_id");
	   screenshot();
	}
	
	@Then("^user fill Epics with invalid data$")
	public void user_fill_Epics_with_invalid_data() throws Exception {
		EpicPage epicPage = new EpicPage(driver);
		epicPage.EnterName("name_xpath");
		epicPage.EnterinvalidDueDate("Due_Date_id");
		epicPage.ClickSave("saveBtn_id"); 
	}

	@Then("^capture Error Message$")
	public void capture_Error_Message() {
	    EpicPage epicPage = new EpicPage(driver);
	    epicPage.getErrorMsg();
	}
	
	@Then("^user close the driver$")
	public void user_close_the_driver() {
		teardown();
	}

}
