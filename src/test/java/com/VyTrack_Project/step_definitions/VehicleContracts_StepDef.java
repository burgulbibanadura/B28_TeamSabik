package com.VyTrack_Project.step_definitions;

import com.VyTrack_Project.pages.LoginPage;
import com.VyTrack_Project.pages.VehicleContractsPage;
import com.VyTrack_Project.utilities.BrowserUtils;
import com.VyTrack_Project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VehicleContracts_StepDef {

    LoginPage login = new LoginPage();
    VehicleContractsPage vehicleContractsPage = new VehicleContractsPage();

    @Given("store managers on the login page")
    public void store_managers_on_the_login_page() {

    }
    @When("store managers enter valid username and password")
    public void store_managers_enter_valid_username_and_password() {
      login.userName.sendKeys("storemanager51");
      login.password.sendKeys("UserUser123" + Keys.ENTER);
    }

    @When("store managers goes to the Fleet module")
    public void storeManagersGoesToTheFleetModule() {
       BrowserUtils.sleep(3);
       BrowserUtils.hover(vehicleContractsPage.FleetModule);

    }

    @And("click Vehicle Contracts in the dropdown menu")
    public void clickVehicleContractsInTheDropdownMenu() {

        BrowserUtils.hover(vehicleContractsPage.VehicleContracts);
        vehicleContractsPage.VehicleContracts.click();
    }


    @Then("store managers should see the expected title")
    public void store_managers_should_see_the_expected_title() {
       String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        BrowserUtils.sleep(3);
        BrowserUtils.verifyTitle(expectedTitle);
    }


    @Given("sales managers on the login page")
    public void salesManagersOnTheLoginPage() {
    }

    @When("sales managers enter valid username and password")
    public void salesManagersEnterValidUsernameAndPassword() {
        login.userName.sendKeys("salesmanager101");
        login.password.sendKeys("UserUser123" + Keys.ENTER);
    }

    @When("sales managers goes to the Fleet module")
    public void salesManagersGoesToTheFleetModule() {
        BrowserUtils.sleep(3);
        BrowserUtils.hover(vehicleContractsPage.FleetModule);
    }

    @Then("sales managers should see the expected title")
    public void salesManagersShouldSeeTheExpectedTitle() {
        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        BrowserUtils.sleep(3);
        BrowserUtils.verifyTitle(expectedTitle);
    }

    @When("drivers enter valid username and password")
    public void driversEnterValidUsernameAndPassword() {
        login.userName.sendKeys("user1");
        login.password.sendKeys("UserUser123" + Keys.ENTER);
    }

    @When("drivers goes to the Fleet module")
    public void driversGoesToTheFleetModule() {
        BrowserUtils.sleep(3);
        BrowserUtils.hover(vehicleContractsPage.FleetModule);
    }

    @Then("drivers should see the expected message")
    public void driversShouldSeeTheExpectedMessage() {
      BrowserUtils.verifyElementDisplayed(vehicleContractsPage.ErrorMessage);
    }
}
