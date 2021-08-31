package Pages;


import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.PageBase;

public class ProjectPage extends PageBase{
	
	public ProjectPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Project page works
	public EpicPage moveToExecute(final String executeKey, String epicKey, String addKey) {
		
		Propertyfile();
		
		Wait<WebDriver> wait1= new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		WebElement p=wait1.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				return getElement(executeKey);
			}
			
		});
		Actions actions= new Actions(driver);
		actions.moveToElement(p).build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver,1000);
		wait.until(ExpectedConditions.visibilityOf(getElement(epicKey)));
		
		WebElement epic=getElement(epicKey);
		epic.click();
		
		WebElement add=getElement(addKey);
		add.click();
		
		return PageFactory.initElements(driver, EpicPage.class);
	}

}
