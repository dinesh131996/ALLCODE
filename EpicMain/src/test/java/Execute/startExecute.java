package Execute;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import Engine.KeywordEngine;

public class startExecute {

public KeywordEngine keywordengine;
	
	@Test
	public void EpicTest() throws InvalidFormatException {
		keywordengine = new KeywordEngine();
		try {
			keywordengine.startExecution("Sheet");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
