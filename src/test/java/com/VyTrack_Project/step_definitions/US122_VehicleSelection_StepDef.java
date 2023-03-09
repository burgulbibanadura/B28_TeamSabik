package com.VyTrack_Project.step_definitions;

import com.VyTrack_Project.pages.LoginPage;
import com.VyTrack_Project.pages.US122_VehicleSelection_Page;
import com.VyTrack_Project.utilities.BrowserUtils;
import com.VyTrack_Project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US122_VehicleSelection_StepDef {


    LoginPage loginPage = new LoginPage();
    LoginStepDefs loginStepDefs = new LoginStepDefs();
    US122_VehicleSelection_Page vehicleSelectionPage = new US122_VehicleSelection_Page();

    @Given("user as a store manager log in with {string} and password {string}")
    public void userAsAStoreManagerLogInWithAndPassword(String userName, String password) {
        loginPage.login(userName, password);
    }
    @When("the user clicks the Fleet menu and selects Vehicle")
    public void the_user_clicks_the_fleet_menu_and_selects_vehicle() {
        vehicleSelectionPage.fleetDropDown.click();
        vehicleSelectionPage.vehicleOption.click();

    }
    @Then("all checkboxes on the page should be unchecked")
    public void all_checkboxes_on_the_page_should_be_unchecked() {
        WebElement checkBox = vehicleSelectionPage.mainCheckBox;
        Assert.assertFalse(checkBox.isSelected());

    }
    @When("the user checks the first checkbox in the web-table")
    public void the_user_checks_the_first_checkbox_in_the_web_table() {
        BrowserUtils.waitFor(3);
        vehicleSelectionPage.mainCheckBox.click();
        BrowserUtils.waitFor(2);
        vehicleSelectionPage.mainCheckBox.click();

    }
    @When("the user checks any car's checkbox")
    public void the_user_checks_any_car_s_checkbox() {
        BrowserUtils.waitFor(2);
        vehicleSelectionPage.checkBox1.click();
        BrowserUtils.waitFor(2);
        vehicleSelectionPage.checkBox2.click();

        WebElement checkBox = vehicleSelectionPage.checkBox1;
        Assert.assertTrue(checkBox.isSelected());

    }
    @Given("user as a sales manager log in with {string} and password {string}")
    public void userAsASalesManagerLogInWithAndPassword(String userName, String password) {
        loginPage.login(userName, password);
    }

}
