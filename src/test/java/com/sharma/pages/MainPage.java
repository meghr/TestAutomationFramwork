package com.sharma.pages;

import com.sharma.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {

	@FindBy(xpath = "//div[@class='app_logo']")
	public WebElement appLogo;
	
	@FindBy(xpath = "//div[@class = 'inventory_item_name']")
	public List<WebElement> itemList;
	

	public MainPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
