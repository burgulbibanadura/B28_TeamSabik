package com.VyTrack_Project.step_definitions;

import com.VyTrack_Project.pages.LoginPage;
import com.VyTrack_Project.pages.MainPage;
import com.VyTrack_Project.pages.US124_VehicleModulePage;
import com.VyTrack_Project.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US124_vechicleModulesStepDefs {

    LoginPage loginPage=new LoginPage();
    MainPage mainPage=new MainPage();
    LoginStepDefs loginStepDefs=new LoginStepDefs();
    US124_VehicleModulePage vehicleModulePage=new US124_VehicleModulePage();
    @Given("user as a store manager log in with {string} and password {string}")
    public void userAsAStoreManagerLogInWithAndPassword(String Username, String password) {
    loginPage.login(Username, password);
    }

    @When("I click on the Fleet dropdown in the main menu")
    public void i_click_on_the_fleet_dropdown_in_the_main_menu() {
        BrowserUtils.waitFor(3);
        vehicleModulePage.fleetDropDown.click();


    }

    @When("I click on the Vehicle Models option")
    public void i_click_on_the_vehicle_models_option() {
        BrowserUtils.waitFor(3);
        vehicleModulePage.vehicleModule.click();

    }


    @Then("I should see the following options in the columns in the web-table")
    public void iShouldSeeTheFollowingOptionsInTheColumnsInTheWebTable(List<String> expectedOptions) {

        BrowserUtils.waitFor(4);
        List<WebElement> actualOptionsAsWebElement = vehicleModulePage.tableColumnHeaders;
        List<String> actualOptions = new ArrayList<>();
        for (WebElement each : actualOptionsAsWebElement) {
            actualOptions.add(each.getText());
        }
        Assert.assertTrue(actualOptions.containsAll(expectedOptions));
    }


    @Given("I am logged in as a driver")
    public void i_am_logged_in_as_a_driver() {
    loginStepDefs.the_user_logged_in_as("driver");
    }

    @Then("I should see an error message stating {string}")
    public void i_should_see_an_error_message_stating(String string) {

    String expectedResult="You do not have permission to perform this action.";
    String actualResult=vehicleModulePage.errorMessageDisplayed.getText();
    Assert.assertEquals(expectedResult,actualResult);
    }



}
