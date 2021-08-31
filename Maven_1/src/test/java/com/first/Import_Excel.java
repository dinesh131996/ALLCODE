package com.first;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Import_Excel {
	public static void main(String[] args) throws IOException, FileNotFoundException {

		File f = new File(
				"C:\\Users\\Mani\\eclipse-workspace\\Maven_1\\excel\\New Microsoft Office Excel Worksheet.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook work = new XSSFWorkbook(fis);
		Sheet sheetAt = work.getSheetAt(0);
		for (int row = 0; row < sheetAt.getPhysicalNumberOfRows(); row++) {
			Row rowz = sheetAt.getRow(row);
//Cell cell = rowz.getCell(row);
			// for (int col = 0; col < rowz.getPhysicalNumberOfCells(); col++) {

			for (int col = 1; col <= 2; col++) {

				Cell cell = rowz.getCell(col);
				CellType cellType = cell.getCellType();
				if (cellType.equals(cellType.STRING)) {

					String stringCellValue = cell.getStringCellValue();
					System.out.print(stringCellValue);
				} else if (cellType.equals(cellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					String valueOf = String.valueOf(numericCellValue);
					System.out.print(valueOf);

				}
				System.out.print(" | ");
			}
			System.out.println();
		}

		Sheet createSheet = work.createSheet("3");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("dinesh");

		// Row row1 = createSheet.createRow(0); 
		Cell col1 = createRow.createCell(1);
		col1.setCellValue("dinesh");

		// Row row2 = createSheet.createRow(0);
		Cell cell2 = createRow.createCell(2);
		cell2.setCellValue("dinesh");

		// Row row3 = createSheet.createRow(0); 
		Cell col3 = createRow.createCell(3);
		col3.setCellValue("dinesh");

		Row row4 = createSheet.createRow(1);
		Cell col4 = row4.createCell(0);
		col4.setCellValue("dinesh");

		// Row row5 = createSheet.createRow(1); 
		Cell col5 = row4.createCell(1);
		col5.setCellValue("dinesh");

		// Row row6 = createSheet.createRow(1); 
		Cell col6 = row4.createCell(2);
		col6.setCellValue("dinesh");

		// Row row7 = createSheet.createRow(1); 
		Cell col7 = row4.createCell(3);
		col7.setCellValue("dinesh");

		Row row8 = createSheet.createRow(2);
		Cell col8 = row8.createCell(0);
		col8.setCellValue("dinesh");

		// Row row9 = createSheet.createRow(2);
		Cell col9 = row8.createCell(1);
		col9.setCellValue("dinesh");

		FileOutputStream i = new FileOutputStream(f);
		work.write(i);
		work.close();

		System.out.println("printing completed");

	}
}