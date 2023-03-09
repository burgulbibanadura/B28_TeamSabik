package com.VyTrack_Project.step_definitions;

import com.VyTrack_Project.pages.LoginPage;
import com.VyTrack_Project.pages.US125_VehicleContractsPage;
import com.VyTrack_Project.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class US125_VehicleContracts_StepDefs {

    LoginPage login = new LoginPage();
    US125_VehicleContractsPage US125VehicleContractsPage = new US125_VehicleContractsPage();

    @Given("store managers on the login page")
    public void store_managers_on_the_login_page() {

    }
    @When("store managers enter valid {string} and {string}")
    public void storeManagersEnterValidAnd(String username, String password) {
        login.userName.sendKeys(username);
        login.password.sendKeys(password + Keys.ENTER);
    }

    @When("store managers goes to the Fleet module")
    public void storeManagersGoesToTheFleetModule() {
        BrowserUtils.sleep(3);
        BrowserUtils.hover(US125VehicleContractsPage.FleetModule);

    }

    @And("click Vehicle Contracts in the dropdown menu")
    public void clickVehicleContractsInTheDropdownMenu() {
        BrowserUtils.hover(US125VehicleContractsPage.VehicleContracts);
        US125VehicleContractsPage.VehicleContracts.click();
    }


    @Then("store managers should see the expected title and url")
    public void storeManagersShouldSeeTheExpectedTitleAndUrl() {
        BrowserUtils.waitFor(3);
        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        String expectedUrl = "https://qa1.vytrack.com/entity/Extend_Entity_VehicleContract";


        BrowserUtils.verifyTitle(expectedTitle);
        BrowserUtils.verifyURLContains(expectedUrl);

    }


    @Given("sales managers on the login page")
    public void salesManagersOnTheLoginPage() {
    }

    @When("sales managers enter valid {string} and {string}")
    public void salesManagersEnterValidAnd(String username, String password) {
        login.userName.sendKeys(username);
        login.password.sendKeys(password + Keys.ENTER);
    }

    @When("sales managers goes to the Fleet module")
    public void salesManagersGoesToTheFleetModule() {
        BrowserUtils.waitFor(3);
        BrowserUtils.hover(US125VehicleContractsPage.FleetModule);
    }

    @Then("sales managers should see the expected title and url")
    public void salesManagersShouldSeeTheExpectedTitleAndUrl() {
        BrowserUtils.waitFor(3);
        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        String expectedUrl = "https://qa1.vytrack.com/entity/Extend_Entity_VehicleContract";


        BrowserUtils.verifyTitle(expectedTitle);
        BrowserUtils.verifyURLContains(expectedUrl);
    }

    @When("drivers enter valid {string} and {string}")
    public void driversEnterValidAnd(String username, String password) {
        login.userName.sendKeys(username);
        login.password.sendKeys(password + Keys.ENTER);
    }

    @When("drivers goes to the Fleet module")
    public void driversGoesToTheFleetModule() {
        BrowserUtils.waitFor(3);
        BrowserUtils.hover(US125VehicleContractsPage.FleetModule);
    }

    @Then("drivers should see the expected message")
    public void driversShouldSeeTheExpectedMessage() {
      BrowserUtils.verifyElementDisplayed(US125VehicleContractsPage.ErrorMessage);
    }
}
