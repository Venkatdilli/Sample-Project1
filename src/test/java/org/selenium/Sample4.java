package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample4 {
@Test(dataProvider = "getdata",dataProviderClass = TestngDataprovider1.class)
public void login(String user,String pass)
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\TestingSelenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys(user);
	driver.findElement(By.id("password")).sendKeys(pass);
	driver.findElement(By.id("login")).click();
}
	//public static void main(String[] args) {
//
//		Result runClasses = JUnitCore.runClasses(Sample1.class, Sample2.class, Sample3.class);
//		// to get the runcount
//		int runCount = runClasses.getRunCount();
//		System.out.println("Total Number of method:" + runCount);
////To get the ignore count
//		int ignoreCount = runClasses.getIgnoreCount();
//		System.out.println("Total Number of Ignore:" + ignoreCount);
////To Get the Failure count
//		List<Failure> failures = runClasses.getFailures();
//		for (int i = 1; i < failures.size(); i++) {
//			Failure text = failures.get(i);
//			String string = text.toString();
//			System.out.println(string);

		
		}
	//}


