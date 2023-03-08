package com.VyTrack_Project.step_definitions;

import com.VyTrack_Project.pages.LoginPage;
import com.VyTrack_Project.pages.US117_AccountsPage;
import com.VyTrack_Project.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


import java.util.ArrayList;
import java.util.List;

public class US117_AccountsFilters_StepDefs {

    LoginPage loginPage = new LoginPage();
    US117_AccountsPage us117AccountsPage = new US117_AccountsPage();


    @When("store manager logs in with valid username {string} and password {string}")
    public void store_manager_logs_in_with_valid_username_and_password(String username, String password) {

        loginPage.login(username,password);

    }

    @When("user clicks on Accounts dropdown under Customers module")
    public void user_clicks_on_accounts_dropdown_under_customers_module() {
        BrowserUtils.waitForTitleContains("Dashboard");
        BrowserUtils.hover(us117AccountsPage.customersModule);
        us117AccountsPage.accountsOption.click();
    }

    @When("user clicks on funnel button")
    public void user_clicks_on_funnel_button() {
        BrowserUtils.waitFor(3);
        us117AccountsPage.funnelButton.click();
    }


    @Then("user should see the below expected options")
    public void user_should_see_the_below_expected_options(List<String> expectedOptions) {
        BrowserUtils.waitFor(3);
        us117AccountsPage.manageFiltersDropdown.click();
        List<String> actualOptions = new ArrayList<>();

        for (WebElement each : us117AccountsPage.manageFiltersOptions) {

            actualOptions.add(each.getText());
        }

        Assert.assertEquals(actualOptions, expectedOptions);
    }

    @When("sales manager logs in with valid username {string} and password {string}")
    public void sales_manager_logs_in_with_valid_username_and_password(String username, String password) {
        loginPage.login(username,password);
    }

}
