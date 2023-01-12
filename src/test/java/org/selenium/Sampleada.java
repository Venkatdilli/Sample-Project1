package org.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sampleada {
	static WebDriver driver;
	@BeforeClass
	public static void chromeLaunch(){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		}
	@Before
	public void openURL() {
		driver.get("https://adactinhotelapp.com/");
	}
@Test
public void Content()
{
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("Adactin1294");
	driver.findElement(By.id("password")).sendKeys("Dilli@1234");
	driver.findElement(By.id("login")).click();
	Select s = new Select(driver.findElement(By.id("location")));
	s.selectByValue("Sydney");
	Select s1 = new Select(driver.findElement(By.id("hotels")));
	s1.selectByIndex(1);
	Select s2 = new Select(driver.findElement(By.id("room_type")));
	s2.selectByVisibleText("Standard");
	Select s3 = new Select(driver.findElement(By.id("room_nos")));
	s3.selectByIndex(2);
	driver.findElement(By.id("datepick_in")).clear();
	driver.findElement(By.id("datepick_in")).sendKeys("22/04/2022");
	driver.findElement(By.id("datepick_out")).clear();
	driver.findElement(By.id("datepick_out")).sendKeys("27/04/2022");
	Select s4 = new Select(driver.findElement(By.id("adult_room")));
	s4.selectByVisibleText("2 - Two");
	Select s5 = new Select(driver.findElement(By.id("child_room")));
	s5.selectByValue("2");
	driver.findElement(By.id("Submit")).click();
	driver.findElement(By.id("radiobutton_0")).click();
	driver.findElement(By.id("continue")).click();

}

}
