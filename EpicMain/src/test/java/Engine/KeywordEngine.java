package Engine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import Test.TestClass;


public class KeywordEngine {

	public static Workbook book;
	public Sheet sheet;
	
	public TestClass test;
	
	public final String SCENARIO_SHEET_PATH=System.getProperty("user.dir")+"\\src\\test\\java\\Keyword\\scenario\\ExcelTest.xlsx";
	
	public void startExecution(String sheetname) {
		
		FileInputStream file = null;
		
		try {
			file = new FileInputStream(SCENARIO_SHEET_PATH);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
		book = WorkbookFactory.create(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetname);
		
		int k=0;
		for(int i=0;i<sheet.getLastRowNum();i++) {
			String action = sheet.getRow(i+1).getCell(k+2).toString().trim();
			
			switch (action) {
			case "invokeBrowser":
				test=new TestClass();
				test.invokeBrowser();
				break;
			case "openWebsite":
				test.openWebsite();
				break;
			case "navigateToEpics":
				test.navigateToEpics();
				break;
			case "EpicsValidData":
				try {
					test.EpicsValidData();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case "EpicsInvalidData":
				try {
					test.EpicsInvalidData();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case "captureErrorMsg":
				test.captureErrorMsg();
				break;
			case "Closebrowser":
				test.Closebrowser();
				break;
			default:
				break;
			}
		}
		
	}

}
