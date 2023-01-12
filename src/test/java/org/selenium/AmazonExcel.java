package org.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonExcel {

	public static void main(String[] args) throws IOException {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
WebElement src = driver.findElement(By.id("twotabsearchtextbox"));
src.sendKeys("furniture",Keys.ENTER);
 WebElement findElements = driver.findElement(By.tagName("a"));
 List<WebElement> findElements2 = findElements.findElements(By.tagName("span"));
System.out.println(findElements2);
File file =new File("C:\\Users\\Admin\\eclipse-workspace\\TestMavenBuild\\Excel\\Data 2.xlsx");
FileInputStream stream = new FileInputStream(file);
Workbook book =new XSSFWorkbook(stream);
Sheet createSheet = book.createSheet("venkat");
for (int i = 0; i <findElements2.size(); i++) {
WebElement ele = findElements2.get(i);	
String text = ele.getText();
Row row = createSheet.createRow(i);
Cell createCell = row.createCell(0);
createCell.setCellValue(text);
}
FileOutputStream out =new FileOutputStream(file);
book.write(out);

//for (WebElement webElement : findElements) {
//	String text = webElement.getText();
//	System.out.println(text+" ");
//}
//	
//	File file =new File("C:\\Users\\Admin\\eclipse-workspace\\TestMavenBuild\\Excel\\Data 1.xlsx");
//	FileUtils.writ n
//	
//	
//	FileInputStream stream =new FileInputStream(file);
//	Workbook workbook =new XSSFWorkbook();
//	
//	Sheet sheet = workbook.getSheet("Sheet1");
//	
//	Row createRow1 = sheet.createRow(0);
//	Cell createCell = createRow1.createCell(6);
//	createCell.
//	
	}

}
