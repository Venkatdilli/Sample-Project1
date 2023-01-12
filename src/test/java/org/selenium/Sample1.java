package org.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1 {
	WebDriver driver;
	@BeforeClass
	private void Browserlaunch() {
WebDriverManager.chromedriver().setup();
 driver=new ChromeDriver();
driver.manage().window().maximize();
	}
	@BeforeMethod
	private void LaunchURL() {
		driver.get("https://adactinhotelapp.com/");
	}
	@Parameters("txtusername")
@Test
	private void login(String s) {
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys(s);
		
	
}
//@Test
//private void tc2() {
//System.out.println("method 2");
//}
//
//@Test
//
//private void tc3() {
//System.out.println("method 3");
//}

}
