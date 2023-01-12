
package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngDataprovider1 {
	@DataProvider
public Object[][]getdata()
{
		return new Object[][]
				{
			{"Adactin1292","Dilli@1234"},
			{"Adactin1294","dilli@1234"},
			{"Adactin1292","dilli@1234"},
			{"Adactin1294","Dilli@1234"}
				};
}
	@Test(dataProvider = "getdata")
	public void login(String user,String pass,String hotel)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\TestingSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login")).click();
		//driver.findElement(By.id("location")).sendKeys(hotel);
	}
}

