package org.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Demo {

	public static void main(String[] args) throws IOException {
//			File file = new File("C:\\Users\\Admin\\eclipse-workspace\\TestMavenBuild\\Excel");
//			FileInputStream stream = new FileInputStream(file);
//			Workbook workbook = new XSSFWorkbook(stream);
//			
//			Sheet sheet = workbook.getSheet("sheet1");		
//			Row row = sheet.getRow(1);
//			Cell cell = row.getCell(1);
//			System.out.println(cell);
//			
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\TestMavenBuild\\Excel\\Data 2.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);

		Sheet sheet = workbook.getSheet("Sheet1");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) // ctrl+space

		{
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {// ctrl+space
				Cell cell = row.getCell(j);
				// check celltype
				// cell contains number,date,string,boolean
				CellType cellType = cell.getCellType();// ctrl+space
				switch (cellType) { // ctrl+space
				case STRING:
					String s1 = cell.getStringCellValue();
					System.out.println(s1);

					break;
				case NUMERIC:
//					if(DateUtil.isCellDateFormatted(cell)) {
//						Date dateCellValue = cell.getDateCellValue();
//						 SimpleDateFormat name = new SimpleDateFormat("DD-MMM-YY");
//						 String format = name.format(dateCellValue);
//						 System.out.println(format);
//					}
					if (DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat simp = new SimpleDateFormat("DD-MMM-YY");// ctrl+space
						String format = simp.format(dateCellValue);
						System.out.println(format);
					} else {
						double numericCellValue = cell.getNumericCellValue();
						System.out.println(numericCellValue);
					}
					break;
				case BOOLEAN:
					boolean booleanCellValue = cell.getBooleanCellValue();
					System.out.println(booleanCellValue);
					break;

				}

			}
		}

	}

}
