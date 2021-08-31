package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.PageBase;
import Utils.Constants;

public class LandingPage extends PageBase{
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public ProjectPage clickProject(String menuKey, String projectKey) {
		
		Propertyfile();
	
		WebElement menu=getElement(menuKey);
		
		Actions action= new Actions(driver);
		action.moveToElement(menu).build().perform();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,1000);
		wait.until(ExpectedConditions.visibilityOf(getElement(projectKey)));
		WebElement proj=getElement(projectKey);
		proj.click();
		
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICITLY_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIMEOUTS, TimeUnit.SECONDS);
		
		return PageFactory.initElements(driver, ProjectPage.class);
	}
}
