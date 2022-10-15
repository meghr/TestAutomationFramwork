package com.sharma.steps;

import com.sharma.pages.InventoryItemPage;
import com.sharma.utils.CommonMethods;
import com.sharma.utils.ConfigsReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutSteps extends CommonMethods {

    @When("click on menu button")
    public void click_on_menu_button() {

        click(inventoryItemPage.menuButton);
        wait(2);

    }
    @When("click on logout option")
    public void click_on_logout_option() {
        click(inventoryItemPage.logoutOption);
        wait(2);
    }

    @Then("I validate that user logged out successfully")
    public void i_validate_that_user_logged_out_successfully() {
        Assert.assertTrue(loginPage.loginBtn.isDisplayed());
        wait(2);
    }


}
