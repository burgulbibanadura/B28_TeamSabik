package com.VyTrack_Project.step_definitions;

import com.VyTrack_Project.pages.LoginPage;
import com.VyTrack_Project.pages.MainPage;
import com.VyTrack_Project.pages.VehicleCostsPage;
import com.VyTrack_Project.utilities.BrowserUtils;
import com.VyTrack_Project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class VehicleCosts_StepDefs {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    Actions actions = new Actions(Driver.getDriver());
    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();

    @Given("user follow sign in")
    public void user_follow_sign_in() {

    }
    @When("user enters username {string}")
    public void user_enters_username(String username) {
        loginPage.userName.sendKeys(username);
    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
      loginPage.password.sendKeys(password+ Keys.ENTER);
    }
    @Then("user is on Dashboard")
    public void user_is_on_dashboard() {
        Assert.assertTrue(Driver.getDriver().getTitle().equals("Dashboard"));
        BrowserUtils.waitFor(5);
    }


    @Given("User hover mouse over the Fleet tab")
    public void user_hover_mouse_over_the_fleet_tab() {
        //mainPage.fleetDropdown.click();
       actions.moveToElement(mainPage.fleetDropdown).click().perform();
        BrowserUtils.waitFor(5);
    }
    @Then("User selects Vehicle Costs from dropdown")
    public void user_selects_vehicle_costs_from_dropdown() {
        //mainPage.vehicleCostsTabUnderFleet.click();
      actions.moveToElement(mainPage.vehicleCostsTabUnderFleet).click().perform();
        BrowserUtils.waitFor(5);
    }

    @Then("user should see three columns on the Vehicle Costs page")
    public void userShouldSeeThreeColumnsOnTheVehicleCostsPage() {
        Assert.assertTrue(vehicleCostsPage.tableColumnHeaders.size()==3);
    }

    @Then("user verifies column titles as expected")
    public void user_verifies_column_titles_as_expected() {
        Assert.assertTrue(vehicleCostsPage.typeColumnHeader.getText().equals("TYPE"));
        Assert.assertTrue(vehicleCostsPage.totalPriceColumnHeader.getText().equals("TOTAL PRICE"));
        Assert.assertTrue(vehicleCostsPage.dateColumnHeader.getText().equals("DATE"));
    }


    @Then("users check the first checkbox to check all the Vehicle Costs")
    public void users_check_the_first_checkbox_to_check_all_the_vehicle_costs() {
        vehicleCostsPage.firstCheckBoxButton.click();
    }



}
