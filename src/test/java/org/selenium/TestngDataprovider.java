package org.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngDataprovider {
	public  Object exceldata(int row,int cell) throws IOException
	{
		File file =new File("C:\\Users\\Admin\\eclipse-workspace\\TestMavenBuild\\Excel\\Data 2.xlsx");
	FileInputStream stream=new FileInputStream(file);
	Workbook book =new XSSFWorkbook(stream);
	Sheet sheet = book.getSheet("Sheet4");
	Row row2 = sheet.getRow(row);
	Cell cell2 = row2.getCell(cell);
	CellType cellType = cell2.getCellType();
	String value="";
	switch (cellType) {
	case STRING:
		value = cell2.getStringCellValue();
		
		break;
	case NUMERIC:
		if(DateUtil.isCellDateFormatted(cell2))
		{
			 Date dateCellValue = cell2.getDateCellValue();
			 SimpleDateFormat format =new SimpleDateFormat("DD-MM-YYYY");
			 value = format.format(dateCellValue);
		}else {
			double numericCellValue = cell2.getNumericCellValue();
			long round = Math.round(numericCellValue);
			if(round==numericCellValue)
			{
				value= String.valueOf(round);
			}else
			{
			     value=	String.valueOf(numericCellValue);
			}
		}
		break;
	default:
		break;
	}
	return value;
	
	
	
	
	}@DataProvider
public Object[][]Getdata() throws IOException
{
return new Object[][]
		{
	{exceldata(0, 0),exceldata(0, 1)},
	{exceldata(1, 0),exceldata(1, 1)},
//	{exceldata(2,0),exceldata(1, 1)},
//	{exceldata(3,0),exceldata(3,1)}
		};
	
		
}
	@DataProvider
	public  Object[][]Getsearch() throws IOException
	{
		return new Object[][]
				{
			{exceldata(2,0),exceldata(2,1),exceldata(2,2)},
			{exceldata(3,0),exceldata(3,1),exceldata(3,2)}
				};
		
	}
	@Test(dataProvider = "Getdata",priority=1)
	public void login(String user ,String pass )
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\TestingSelenium\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login")).click();
		//driver.findElement(By.id("location")).sendKeys(location);
	}
	@Test(dataProvider="Getsearch",priority=2)
	public void search(String user ,String pass ,String location)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\TestingSelenium\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("location")).sendKeys(location);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
