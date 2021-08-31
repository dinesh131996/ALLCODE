package Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import BaseClass.PageBase;
import Utils.CustomReports;

public class EpicPage extends PageBase {
	CustomReports report = new CustomReports();

	public EpicPage(WebDriver driver) {
		this.driver=driver;
	}
		
	public void EnterName(String nameKey) throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Propertyfile();
	getExcelData();
	String Name=sheet.getRow(1).getCell(0).getStringCellValue();
			   driver.switchTo().frame("content");
			   WebElement  name = getElement(nameKey);
			   name.click();
			   name.sendKeys(Name);
	}
	
	public void EnterDescription(String descriptionKey) {

		String Description=sheet.getRow(1).getCell(1).getStringCellValue();
			   WebElement  description = getElement(descriptionKey);
			   description.sendKeys(Description);
	}
	
	public void SelectPriority(String priorityKey) {
		String Priority=sheet.getRow(1).getCell(2).getStringCellValue();
			   Select select= new Select(getElement(priorityKey));
				select.selectByValue(Priority);
	}
	
	public void EnterDueDate(String due_dateKey) {
		String Due_Date=sheet.getRow(1).getCell(3).toString();
		WebElement due_date=getElement(due_dateKey);
		due_date.sendKeys(Due_Date);
	}
	
	public void SelectTheme(String themeKey) {
		String Theme=sheet.getRow(1).getCell(4).toString();
		Select priority = new Select(getElement(themeKey));
		priority.selectByVisibleText(Theme);
		try {
			custom("Pass","ValidTestCase");
		} catch (IOException e) {
			try {
				custom("Fail","InValidTestCase: Theme");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	public void ClickSave(String saveKey) {
		WebElement save=getElement(saveKey);
		save.click();
	}
	
	public void newEpic(String newEpicKey) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\'KEY_BUTTON_Add\']")).click();
	}
	
	public void EnterinvalidName(String nameKey) throws Exception {
		Propertyfile();
		getExcelData();
		String Name=sheet.getRow(1).getCell(0).getStringCellValue();	
		   WebElement  name = getElement(nameKey);
		   name.sendKeys(Name);
	}
	
	public void EnterinvalidDueDate(String due_dateKey) {
		String Due_Date=sheet.getRow(2).getCell(3).toString();
		WebElement due_date=getElement(due_dateKey);
		due_date.sendKeys(Due_Date);
	}
	
	public void getErrorMsg() {
		Alert alert=driver.switchTo().alert();
		String a=alert.getText();
		alert.accept();
		String a2=a.substring(0, 39);
		String a1="Please enter date in the correct format";		
		Assert.assertEquals(a1, a2);
		System.out.println("Error Message:\n");
		System.out.println(a);	
	}
	public void custom(String result, String test) throws IOException {
		int index = 1;
		report.updateReport(index,"EpicModuleTest",test,result);
		
	}
}
