package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTestNG {
	
	WebDriver driver;
	

	@BeforeClass
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@BeforeMethod
	public void launchURL() {
		driver.get("https://www.amazon.in/");
	}

	@Test
	public void productprice() {

		WebElement src = driver.findElement(By.id("twotabsearchtextbox"));
		src.sendKeys("furniture", Keys.ENTER);
		WebElement findElement = driver.findElement(By.xpath("//span[text()='9,499'][1]"));
		String text = findElement.getText();
		System.out.println(text);
	}
	

}
