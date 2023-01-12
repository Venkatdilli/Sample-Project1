package org.pom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.selenium.BaseClass1;

public class runnerClass extends BaseClass1 {
	public static void main(String[] args) throws IOException {
		runnerClass rn = new runnerClass();
		rn.getdriver("chrome");
		rn.launchUrl("https://adactinhotelapp.com/index.php");
		
		LoginClass lg = new LoginClass();
		WebElement userName = lg.getUserName();
		String getDataFromExcel = lg.GetDataFromExcel("Sheet4", 3, 0);
        lg.Sendkeys(userName, getDataFromExcel);
        WebElement passWord = lg.getPassWord();
        String getDataFromExcel2 = lg.GetDataFromExcel("Sheet4", 3, 1);
        lg.Sendkeys(passWord, getDataFromExcel2);
		 
		lg.clickLogin();
		
		SearchHotel sh=new  SearchHotel();
		
	}

}
