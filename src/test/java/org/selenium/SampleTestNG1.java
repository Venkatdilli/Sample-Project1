package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTestNG1 {
	WebDriver driver;

	@BeforeClass
	private void Browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@BeforeMethod
	private void LaunchURL() {
		driver.get("https://adactinhotelapp.com/");
	}

	@Parameters({ "txtusername", "txtpass", "date1", "date2", "firstname", "lastname", "BillingAdders", "cno", "ccv" })
	@Test
	private void login(@Optional("welcome") String name, String pass, String d1, String d2, String d3, String d4,
			String d5, String d6, String d7) throws InterruptedException {
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys(name);
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys(pass);
		WebElement findElement = driver.findElement(By.id("login"));
		findElement.click();
		Select s = new Select(driver.findElement(By.id("location")));
		s.selectByValue("Sydney");
		Select s1 = new Select(driver.findElement(By.id("hotels")));
		s1.selectByIndex(1);
		Select s2 = new Select(driver.findElement(By.id("room_type")));
		s2.selectByVisibleText("Standard");
		Select s3 = new Select(driver.findElement(By.id("room_nos")));
		s3.selectByIndex(2);
		driver.findElement(By.id("datepick_in")).clear();
		WebElement date1 = driver.findElement(By.id("datepick_in"));
		date1.sendKeys(d1);
		driver.findElement(By.id("datepick_out")).clear();
		WebElement date2 = driver.findElement(By.id("datepick_out"));
		date2.sendKeys(d2);
		Select s4 = new Select(driver.findElement(By.id("adult_room")));
		s4.selectByVisibleText("2 - Two");
		Select s5 = new Select(driver.findElement(By.id("child_room")));
		s5.selectByValue("2");
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys(d3);
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys(d4);
		WebElement BillingAdders = driver.findElement(By.id("address"));
		BillingAdders.sendKeys(d5);
		WebElement cno = driver.findElement(By.id("cc_num"));
		cno.sendKeys(d6);
		Select s6 = new Select(driver.findElement(By.id("cc_type")));
		s6.selectByValue("VISA");
		Select s7 = new Select(driver.findElement(By.id("cc_exp_month")));
		s7.selectByVisibleText("April");
		Select s8 = new Select(driver.findElement(By.id("cc_exp_year")));
		s8.selectByIndex(3);
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys(d7);
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(5000);
		WebElement findElement2 = driver.findElement(By.id("order_no"));
		String attribute = findElement2.getAttribute("value");
		System.out.println(attribute);

	}

}
