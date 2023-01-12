package org.selenium;
import java.awt.Desktop.Action;
import java.awt.Desktop.Action;
import java.io.File;
import java.io.File;
import java.io.IOException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Set;
import java.util.Set;


import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClassMethods {
	WebDriver driver;
	public void getDriver() {
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	}
	
	public void enterUrl(String url) {
		driver.get(url);
	
	}
	public void maximizedwindow(){

		driver.manage().window().maximize();
	}
	
	public void textBox(WebElement element,String data) {
		element.sendKeys(data);
		element.sendKeys(data);
	}
	
	public void clickButton(WebElement element) {
		element.click();
	}
	
	
	public void clickOnAlert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	
	
	
	public String getTextFromWebPage(WebElement element,String data) {
		String text = element.getText();
		return text;
	}
	
	public String insertValueinTextbox(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
		
	}
	
	public void closeallwindow() {
		driver.quit();
	
	}
	public void closeCurrentWindow() {
		driver.close();	
		
	}
	public String getTitle() {
		String title = driver.getTitle();
		
		return title;
	
	}
	public String getCurrenturl() {
	
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}
	public void sendkeysJs(WebElement element,String data) {
	
		JavascriptExecutor script = (JavascriptExecutor) driver;
		script.executeScript("argument[0].setAttribute('value'," +data+ "')", element);
	
	}
	public WebElement getLocatorById(WebElement element,String data) {
	
		 driver.findElement(By.id(data));
		 return element;
		
	}
	public WebElement getLocatorByName(WebElement element,String data) {

		driver.findElement(By.name(data));
		return element;
	
	}
	
	public void click(WebElement element) {
	
		element.click();
	}
	
	public WebElement getLocatorByClassName(WebElement element,String data) {
	
		WebElement WebElement = driver.findElement(By.xpath(data));
		return WebElement;
			}
	
	
	public void alertAcceptance() {
		Alert alert = driver.switchTo().alert();
	
		alert.accept();
	}
	
	
	public void getOptions(WebElement element) {
		Select select = new Select(element);
		
		select.getOptions();
	
	}
	public String scanner() {
	
		Scanner scanner = new Scanner(System.in);
		
		String nextLine = scanner.nextLine();
		return nextLine;
	}
	
	public int Scanner() {
	
		 Scanner scanner = new Scanner(System.in);
		 int int1 =scanner.nextInt();
		
		 return int1;
	}
	
   public void selectByText(WebElement element,String data) {
 
		Select select = new Select(element);
		select.selectByVisibleText(data);
		
	
	}
	public boolean Scanner1() {
	
		Scanner scanner = new Scanner(System.in);
		
		boolean nextBoolean = scanner.nextBoolean();
		
		return nextBoolean;
	}
	
	
	public Set<String> windowHandles(){
		   Set<String>windowHandles = driver.getWindowHandles();
		
		   return windowHandles;
	}
	
	public String windowHandle() {
	
		   String windowHandle = driver.getWindowHandle();
		
		   return windowHandle;
    
    }
	public void keyDown(CharSequence d) {
		Actions action = new Actions(driver);
		
		action.keyDown(d).perform();
	}
	
	
	public void doubleClick(WebElement element) {
		Actions action = new Actions(driver);
	
		action.doubleClick(element).perform();
	
	}
	public void keyUp(CharSequence d) {
	
		Actions action = new Actions(driver);
		action.keyUp(d).perform();
		
	
	}
	
	public void contextClick(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	
	}
	
	public void dropDown(WebElement element) {
		Actions action =new Actions(driver);
		
		action.dragAndDrop(element, element).perform();
	}
	
	public void moveToElement(WebElement element,String data) {
	
		Actions action = new Actions(driver);
		
		action.moveToElement(element).perform();
	}
	
	public void screenShot(String data)throws IOException {
	
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File screenshootAs = screenshot.getScreenshotAs(null);
		
		
		
		File file = new File(data);
		
		FileUtils.copyFile(screenshootAs, file);
		
		
	}
	
	
	public void print (String data) {
		System.out.println(data);
	}
	
}
	
	
	
	
	
	
	
	 
	 
	
	
	
	
	 
	 
	
	
	
	
	
	
	
	
		
		
		
		
	
	












	