package com.sharma.pages;

import com.sharma.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepTwo extends CommonMethods{

	
	@FindBy(xpath="//div[@class = 'inventory_item_name']")
	public WebElement itemName;
	
	
	public CheckoutStepTwo()
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
