package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\TestingSelenium\\\\driver\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://adactinhotelapp.com/");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("Adactin1294");
driver.findElement(By.id("password")).sendKeys("Dilli@1234");
driver.findElement(By.id("login")).click();
Select s=new Select(driver.findElement(By.id("location")));
s.selectByValue("Melbourne");
Select s1=new Select(driver.findElement(By.id("hotels")));
s1.selectByIndex(1);
Select s2=new Select(driver.findElement(By.id("room_type")));
s2.selectByVisibleText("Deluxe");
Select s3=new Select(driver.findElement(By.id("room_nos")));
s3.selectByIndex(2);
driver.findElement(By.id("datepick_in")).clear();
driver.findElement(By.id("datepick_in")).sendKeys("22/04/2022");
driver.findElement(By.id("datepick_out")).clear();
driver.findElement(By.id("datepick_out")).sendKeys("27/04/2022");
Select s4=new Select(driver.findElement(By.id("adult_room")));
s4.selectByVisibleText("2 - Two");
Select s5=new Select(driver.findElement(By.id("child_room")));
s5.selectByValue("2");
driver.findElement(By.id("Submit")).click();
driver.findElement(By.id("radiobutton_0")).click();
driver.findElement(By.id("continue")).click();
WebElement firstname = driver.findElement(By.id("first_name"));
firstname.sendKeys("venkat");
WebElement lastname = driver.findElement(By.id("last_name"));
lastname.sendKeys("dilli");
WebElement  BillingAdders = driver.findElement(By.id("address"));
BillingAdders.sendKeys("no:50,OMR,chennia");
WebElement cno = driver.findElement(By.id("cc_num"));
cno.sendKeys("12345678901234");
Select s6=new Select (driver.findElement(By.id("cc_type")));
s6.selectByValue("VISA");
Select s7=new Select(driver.findElement(By.id("cc_exp_month")));
s7.selectByVisibleText("April");
Select s8=new Select(driver.findElement(By.id("cc_exp_year")));
s8.selectByIndex(3);
WebElement cvv = driver.findElement(By.id("cc_cvv"));
cvv.sendKeys("1234");
driver.findElement(By.id("book_now")).click();
Thread.sleep(5000);
WebElement findElement2 = driver.findElement(By.id("order_no"));
String attribute = findElement2.getAttribute("value");
System.out.println(attribute);

	}

}
