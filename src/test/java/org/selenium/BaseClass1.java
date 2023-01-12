package org.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
	// private static final String = null;
	public static WebDriver driver;
	JavascriptExecutor js;
	FileInputStream stream;
	//WorkBook book = null;
	private int locator;
	private String file;

	public void getdriver(String name) {

		switch (name) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		default:
			System.out.println("Invalid BrowserName");
			break;
		}

		driver.manage().window().maximize();

	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public WebElement findByLocator(String name, String value) {

		WebElement ele = null;
		switch (name) {
		case "id":
			WebElement findElement = driver.findElement(By.id(value));

			break;
		case "name":
			WebElement findElement2 = driver.findElement(By.name(value));
			break;

		case "classname":
			WebElement findElement3 = driver.findElement(By.className(value));
		default:
			break;
		case "xpath":
			WebElement findElement4 = driver.findElement(By.xpath(value));
			break;
		}
		return ele;
	}

	public void Sendkeys(WebElement element, String data)

	{
		element.sendKeys(data);

	}

	public void btnclick(WebElement element) {
		element.click();
	}

	public void clear(WebElement element) {
		element.clear();
	}

	public void entertextbyjs(String data, WebElement element) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + data + "')", element);

	}

	public String getAttributeByJs(WebElement element) {
		String string = js.executeScript("return arguments[0].getAttribute('value')", element).toString();
		return string;

	}

	public void selectbyvalue(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByValue(data);
	}

	public void selectbyindex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);

	}

	public void seldctbyVisibletext(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByVisibleText(data);
	}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
		
	}
	public void selectDropDown( By locator,String type,String value)
	{
		Select select =new Select(getElement(locator));
		switch (type) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			
			break;
		case "value":
			select.selectByValue(value);
break;
		case "visibletext":
			select.selectByVisibleText(value);
			break;
		default:
			System.out.println("Invalid select class");
			break;
		}
	}

	public String GetAttri(WebElement element, String data) {
		return element.getAttribute(data);
	}

	public String GetDataFromExcel(String Sheetname, int rowno,int cellno) throws IOException {
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\TestMavenBuild\\Excel\\Data 2.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet(Sheetname);
		Row row = sheet.getRow(rowno);
Cell cell = row.getCell(cellno);
CellType cellType = cell.getCellType();
String data1="";
switch (cellType) {
case STRING:
	data1=cell.getStringCellValue();
	
	break;
case NUMERIC:
	if(DateUtil.isCellDateFormatted(cell))
	{
		Date dateCellValue = cell.getDateCellValue();
		SimpleDateFormat format=new SimpleDateFormat("DD-MM-YYYY");
		data1=format.format(dateCellValue);
	}else
	{
		double numericCellValue = cell.getNumericCellValue();
		long round = Math.round(numericCellValue);
		if(round==numericCellValue)
		{
			data1=String.valueOf(round);
		}else
		{
			data1=String.valueOf(numericCellValue);
		}
	}
	break;

default:
	System.out.println("Invalid Data From Excel");
	break;
}
return data1;




		

	}
	public void CreateSheetFromExcel(String data,int cellno,int rowno,String Sheetname) throws IOException
	{
		File file =new File("C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\TestMavenBuild\\\\Excel\\\\Data 2.xlsx");
		FileInputStream stream =new FileInputStream(file);
		Workbook book =new XSSFWorkbook(stream);
		Sheet createSheet = book.createSheet(Sheetname);
		Row createRow = createSheet.createRow(rowno);
		Cell createCell = createRow.createCell(cellno);
		createCell.setCellValue(data);
		FileOutputStream stream1=new FileOutputStream(file);
		book.write(stream1);

	}
public void textBoxClick(WebElement element)
{
	element.click();
}

public void implicitwait(int sec)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
}


public void click(WebElement element)
{
element.click();
}




}
