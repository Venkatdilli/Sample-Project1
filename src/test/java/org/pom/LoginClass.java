package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.selenium.BaseClass1;

public class LoginClass extends BaseClass1 {
	public LoginClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement userName;
	@FindBy(id = "password")
	private WebElement passWord;
	@FindBy(id = "login")
	private WebElement loginAdactin;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLoginAdactin() {
		return loginAdactin;
	}

	public void userDetails(String username, String password) {
		WebElement userName2 = getUserName();
		Sendkeys(userName2, username);
		WebElement passWord2 = getPassWord();
		Sendkeys(passWord2, password);
		WebElement loginAdactin2 = getLoginAdactin();
		
		
	}

	public void clickLogin() {
		WebElement element = getLoginAdactin();
		click(element);
	}
}
