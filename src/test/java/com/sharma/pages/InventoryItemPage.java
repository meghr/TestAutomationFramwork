package com.sharma.pages;

import com.sharma.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryItemPage extends CommonMethods {

	
	
	@FindBy(xpath= "//button[text()='Add to cart']")
	public WebElement addBtn;
	
	@FindBy(xpath = "//div[@id='shopping_cart_container']/a")
	public WebElement shoppingCard;

	@FindBy(id="react-burger-menu-btn")
	public WebElement menuButton;

	@FindBy(id="logout_sidebar_link")
	public WebElement logoutOption;
	
	public InventoryItemPage() 
	{
		PageFactory.initElements(driver, this);
	}
	

}
