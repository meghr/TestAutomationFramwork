package com.sharma.pages;

import com.sharma.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepOne extends CommonMethods{

	
	
	@FindBy(id = "first-name")
	public WebElement fname;
	
	@FindBy(id = "last-name")
	public WebElement lname;
	
	@FindBy(id = "postal-code")
	public WebElement zipCode;
	
	//@FindBy(xpath = "//input[@value='CONTINUE']")
	@FindBy(id="continue")
	public WebElement continueBtn;
	
	
	public CheckoutStepOne()
	{
		PageFactory.initElements(driver, this);
	}
}
