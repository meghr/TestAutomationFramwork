package com.sharma.steps;

import com.sharma.utils.CommonMethods;
import com.sharma.utils.ConfigsReader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class CheckoutSteps extends CommonMethods {

	@Given("user is actually successfully logged in")
	public void user_is_actually_successfully_logged_in() {
		sendText(loginPage.userName, ConfigsReader.getProperty("username"));
		sendText(loginPage.password, ConfigsReader.getProperty("password"));
		click(loginPage.loginBtn);
	}

	@When("I click on item with name {string}")
	public void i_click_on_item_with_name(String itemName) {
		for (WebElement item : mainPage.itemList) {
			if (item.getText().equals(itemName)) {
				click(item);
				break;
			}
		}

	}

	@When("I click on the ADD TO CART button")
	public void i_click_on_the_add_to_cart_button() {
		click(inventoryItemPage.addBtn);

	}

	@When("I click on the shopping cart button")
	public void i_click_on_the_shopping_cart_button() {
		click(inventoryItemPage.shoppingCard);
	}

	@When("I click on the checkout button")
	public void i_click_on_the_checkout_button() {
		click(cart.checkoutBtn);
	}

	@When("I enter the order information as {string}, {string}, and {string}")
	public void i_enter_the_order_information_as_and(String firstName, String lastName, String zipCode) {

		sendText(checkoutStepOne.fname, firstName);
		sendText(checkoutStepOne.lname, lastName);
		sendText(checkoutStepOne.zipCode, zipCode);
	}

	@When("I click on continue button")
	public void i_click_on_continue_button() {
		click(checkoutStepOne.continueBtn);
	}

	@Then("I verify the item name matches that of {string}")
	public void i_verify_the_item_name_matches_that_of(String itemName) {
		Assert.assertEquals(itemName, checkoutStepTwo.itemName.getText());
	}

	@When("I provide the dataTable info")
	public void i_provide_the_data_table_info(DataTable dataTable) {
	
		System.out.println("1. -------------   ");
		System.out.println(dataTable);

		System.out.println("2. -------------");
		List<Map<String, String>> mapList = dataTable.asMaps();
		System.out.println(mapList);
		
		for( Map<String, String> map : mapList)
		{
			System.out.println(map);
		}

		System.out.println("3. ----------");
		List<String> list = dataTable.asList();
		System.out.println(list);

		System.out.println("4. ---------");
		List<List<String>> lists = dataTable.asLists();
		System.out.println(lists);

		//here we implement the logic
		
	}

}
