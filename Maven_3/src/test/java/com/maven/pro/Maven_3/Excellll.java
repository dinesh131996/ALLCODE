package com.maven.pro.Maven_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excellll {
public static void main(String[] args) throws IOException {

	//give correct path
	// file only stored in the c:user  only
	//other than user the file is not detectable
	
	
File f = new File("C:\\Users\\Mani\\New Microsoft Office Excel Worksheet.xlsx");
FileInputStream fis= new FileInputStream(f);
Workbook work = new XSSFWorkbook(fis);
Sheet sheetAt = work.getSheetAt(0);
for (int row = 0; row < sheetAt.getPhysicalNumberOfRows(); row++) {
	Row rowz = sheetAt.getRow(row);
//	Cell cell = rowz.getCell(row);
	for (int col = 0; col < rowz.getPhysicalNumberOfCells(); col++) {
		Cell cell = rowz.getCell(col);
		CellType cellType = cell.getCellType();
		if (cellType.equals(cellType.STRING)) {
			
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}else if (cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			String valueOf = String.valueOf(numericCellValue);
			System.out.println(valueOf);

}
}
}
}
}