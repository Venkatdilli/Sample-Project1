package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class A {
	@DataProvider
	public Object[][] getData(){
		return new Object[][]
		{
			{"Adactin1294","Dilli@1234"},
			{"Adactin1221","Dilli@123"}
		};
		
	}
	@Test(dataProvider="getData")
	public void Login(String username,String password) {
		ChromeDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		
	}

	
}