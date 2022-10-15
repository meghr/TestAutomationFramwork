package com.sharma.pages;

import com.sharma.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{

	@FindBy(id = "user-name")
	public WebElement userName;

	@FindBy(id = "password")
	public WebElement password;

	//@FindBy(xpath = "//input [@value='LOGIN']")
	@FindBy(id = "login-button")
	public WebElement loginBtn;

	@FindBy(xpath = "//h3 [@data-test='error']")
	public WebElement errorMsg;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

}
