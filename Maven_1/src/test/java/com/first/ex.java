package com.first;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ex {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\Mani\\eclipse-workspace\\Maven_1\\excel\\New Microsoft Office Excel Worksheet.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook work = new  XSSFWorkbook(fis);
	Sheet sheetAt = work.getSheetAt(0);
	for (int i = 0; i < sheetAt.getPhysicalNumberOfRows(); i++) {
	Row Row = sheetAt.getRow(i);
	for (int j = 0; j < Row.getPhysicalNumberOfCells(); j++) {
		Cell cell = Row.getCell(j);
		CellType cellType = cell.getCellType();
		if (cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}else {
			double numericCellValue = cell.getNumericCellValue();
			System.out.println(numericCellValue);
		}
	}
	}
	Sheet createSheet = work.createSheet();
	Row createRow = createSheet.createRow(0);
	Cell createCell = createRow.createCell(0);
	createCell.setCellValue("dinehsl");
	
	
	
	
}
}
