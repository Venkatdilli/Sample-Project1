package org.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FunctionClass extends BaseClass1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseClass1 b=new BaseClass1();
b.getdriver("chrome");
b.implicitwait(30);
b.launchUrl("https://adactinhotelapp.com/");


//b.entertextbyjs("Adactin1294", findByLocator);
//WebElement findByLocator2 = b.findByLocator("id","password");
//b.entertextbyjs("Dilli@1234", findByLocator2);
//WebElement findByLocator3 = b.findByLocator("id", "login");
//b.entertextbyjs(null, findByLocator3);
//WebElement findByLocator4 = b.findByLocator("id", "location");
//b.entertextbyjs(null, findByLocator4);

WebElement findElement = b.driver.findElement(By.id("username"));
b.entertextbyjs("Adactin1294", findElement);
String attributeByJs2 = b.getAttributeByJs(findElement);
System.out.println(attributeByJs2);
WebElement findElement2 = b.driver.findElement(By.id("password"));
b.entertextbyjs("Dilli@1234", findElement2);
//String attributeByJs = b.getAttributeByJs(findElement2);
//System.out.println(attributeByJs);
//
 WebElement findElement3 = b.driver.findElement(By.id("login"));	
b.btnclick(findElement3);
// WebElement findElement4 = b.driver.findElement(By.id("location"));
//b.selectbyvalue(findElement4, "Sydney");
//System.out.println();
//WebElement findElement5 = b.driver.findElement(By.id("hotels"));
//b.selectbyvalue(findElement5, "Hotel Sunshine");
//WebElement findElement6 = b.driver.findElement(By.id("room_type"));
//b.selectbyvalue(findElement6, "Deluxe");
//WebElement findElement7 = b.driver.findElement(By.id("room_nos"));
//b.selectbyvalue(findElement7, "3");
//WebElement findElement8 = b.driver.findElement(By.id("datepick_in"));
//b.clear(findElement8);
//WebElement findElement9 = b.driver.findElement(By.id("datepick_in"));
//b.Sendkeys(findElement9, "22/08/2007");
//WebElement findElement10 = b.driver.findElement(By.id("datepick_out"));
//b.clear(findElement10);
//WebElement findElement11 = b.driver.findElement(By.id("datepick_out"));
//b.Sendkeys(findElement11, "24/09/2007");
//WebElement findElement12 = b.driver.findElement(By.id("adult_room"));
//b.selectbyindex(findElement12, 2);
//WebElement findElement13 = b.driver.findElement(By.id("child_room"));
//b.selectbyindex(findElement13, 2);
//WebElement findElement14 = b.driver.findElement(By.id("Submit"));
//b.btnclick(findElement14);
b.selectDropDown(By.id("location"), "value", "Sydney");
b.selectDropDown(By.id("room_type"), "value", "Deluxe");
b.selectDropDown(By.id("room_nos"), "value", "3");
WebElement findElement8 = b.driver.findElement(By.id("datepick_in"));
b.clear(findElement8);
WebElement findElement9 = b.driver.findElement(By.id("datepick_in"));
b.Sendkeys(findElement9, "22/08/2007");
WebElement findElement10 = b.driver.findElement(By.id("datepick_out"));
b.clear(findElement10);
WebElement findElement11 = b.driver.findElement(By.id("datepick_out"));
b.Sendkeys(findElement11, "24/09/2007");


b.selectDropDown(By.id("adult_room"), "index", "2");
b.selectDropDown(By.id("child_room"), "index", "2");
WebElement findByLocator2 = b.findByLocator("id", "Submit");
b.btnclick(findByLocator2);
	WebElement findByLocator6 = b.findByLocator("id", "first_name");
	b.Sendkeys(findElement3, "venkat");
	WebElement findByLocator7 = b.findByLocator("id", "last_name");
	b.Sendkeys(findElement3, "dilli");
	WebElement findByLocator8 = b.findByLocator("id", "address");
	b.Sendkeys(findElement3, "no:50,OMR,chennai");
	WebElement findByLocator9 = b.findByLocator("id", "cc_num");
	b.Sendkeys(findElement3, "12345678901324");
	b.selectDropDown(By.id("cc_type"), "value", "VISA");
	b.selectDropDown(By.id("cc_exp_month"), "visibletext", "April");
	b.selectDropDown(By.id("cc_exp_year"), "index", "3");
	WebElement findByLocator10 = b.findByLocator("id", "cc_cvv");
	b.Sendkeys(findElement3, "1323");
	WebElement findByLocator11 = b.findByLocator("id", "book_now");
	b.btnclick(findByLocator11);
	
	}
}
