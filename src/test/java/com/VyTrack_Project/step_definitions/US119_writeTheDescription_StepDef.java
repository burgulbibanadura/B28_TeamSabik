package com.VyTrack_Project.step_definitions;

import com.VyTrack_Project.pages.US119_writeTheDescription;
import com.VyTrack_Project.pages.LoginPage;
import com.VyTrack_Project.utilities.BrowserUtils;
import com.VyTrack_Project.utilities.ConfigurationReader;
import com.VyTrack_Project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.openqa.selenium.Keys.ENTER;

public class US119_writeTheDescription_StepDef {


    LoginPage login = new LoginPage();
    US119_writeTheDescription b28G46_119 = new US119_writeTheDescription();

    @Given("the user is on the main page")
    public void the_user_is_on_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("Driver enter valid {string} and {string}")
    public void driver_enter_valid_and(String username, String password) {

        login.userName.sendKeys(username);
        login.password.sendKeys(password + ENTER);

    }

    @When("Driver goes to Activities module by using hover and click on Calendar Events in the dropdown menu")
    public void driverGoesToActivitiesModuleByUsingHoverAndClickOnCalendarEventsInTheDropdownMenu() {

        BrowserUtils.waitForTitleContains("Dashboard");
        BrowserUtils.hover(b28G46_119.activitiesModule);

        BrowserUtils.waitFor(3);
        b28G46_119.calendarDropDown.click();

    }

    @When("Driver should navigate and click on Create Calendar Event button")
    public void driver_should_navigate_and_click_on_create_calendar_event_button() {

        BrowserUtils.hover(b28G46_119.createCalendarEventButton);
        BrowserUtils.waitFor(2);
        b28G46_119.createCalendarEventButton.click();

    }

    @When("Driver types {string} in the Title box")
    public void driver_types_in_the_title_box(String title) {

        BrowserUtils.waitFor(2);
        b28G46_119.inputTitleBox.sendKeys(title);


    }

    @When("Driver types {string} in the Description box")
    public void driver_types_in_the_description_box(String message) {

        Driver.getDriver().switchTo().frame(b28G46_119.iframe);
        BrowserUtils.waitFor(2);
        b28G46_119.textBox.sendKeys(message);

        Driver.getDriver().switchTo().parentFrame();

    }

    @And("Driver navigate and click on Repeat radiobutton")
    public void driverNavigateAndClickOnRepeatRadiobutton() {

        BrowserUtils.waitFor(2);

        b28G46_119.radioButton.click();

    }

    @When("Driver clicks to Save and Close button")
    public void driver_clicks_to_save_and_close_button() {

        BrowserUtils.waitFor(2);

        b28G46_119.saveAndCloseButton.click();

    }

    @Then("Driver should see message {string} is displayed")
    public void driver_should_see_message_is_displayed(String message) {

        BrowserUtils.verifyElementDisplayed(b28G46_119.messageText);

    }


    @When("StoreManager enter valid {string} and {string}")
    public void storemanagerEnterValidAnd(String username, String password) {

        login.userName.sendKeys(username);
        login.password.sendKeys(password + ENTER);
    }

    @When("StoreManager goes to Activities module by using hover and click on Calendar Events in the dropdown menu")
    public void storemanagerGoesToActivitiesModuleByUsingHoverAndClickOnCalendarEventsInTheDropdownMenu() {
        BrowserUtils.waitForTitleContains("Dashboard");
        BrowserUtils.hover(b28G46_119.activitiesModule);
        BrowserUtils.waitFor(3);
        b28G46_119.calendarDropDown.click();

    }

    @And("StoreManager should navigate and click on Create Calendar Event button")
    public void storemanagerShouldNavigateAndClickOnCreateCalendarEventButton() {

        BrowserUtils.hover(b28G46_119.createCalendarEventButton);
        BrowserUtils.waitFor(2);
        b28G46_119.createCalendarEventButton.click();
    }

    @And("StoreManager types {string} in the Title box")
    public void storemanagerTypesInTheTitleBox(String title) {

        BrowserUtils.waitFor(2);
        b28G46_119.inputTitleBox.sendKeys(title);
    }

    @And("StoreManager types {string} in the Description box")
    public void storemanagerTypesInTheDescriptionBox(String message) {

        Driver.getDriver().switchTo().frame(b28G46_119.iframe);
        BrowserUtils.waitFor(2);
        b28G46_119.textBox.sendKeys(message);

        Driver.getDriver().switchTo().parentFrame();

    }

    @And("StoreManager navigate and click on Repeat radiobutton")
    public void storemanagerNavigateAndClickOnRepeatRadiobutton() {

        BrowserUtils.waitFor(2);
        b28G46_119.radioButton.click();
    }

    @And("StoreManager clicks to Save and Close button")
    public void storemanagerClicksToSaveAndCloseButton() {

        BrowserUtils.waitFor(2);

        b28G46_119.saveAndCloseButton.click();
    }

    @Then("StoreManager should see message {string} is displayed")
    public void storemanagerShouldSeeMessageIsDisplayed(String message) {

        BrowserUtils.verifyElementDisplayed(b28G46_119.messageText);
    }

    @When("SalesManager enter valid {string} and {string}")
    public void salesmanagerEnterValidAnd(String username, String password) {

        login.userName.sendKeys(username);
        login.password.sendKeys(password + ENTER);
    }

    @When("SalesManager goes to Activities module by using hover and click on Calendar Events in the dropdown menu")
    public void salesmanagerGoesToActivitiesModuleByUsingHoverAndClickOnCalendarEventsInTheDropdownMenu() {
        BrowserUtils.waitForTitleContains("Dashboard");
        BrowserUtils.hover(b28G46_119.activitiesModule);
        BrowserUtils.waitFor(2);
        b28G46_119.calendarDropDown.click();

    }

    @And("SalesManager should navigate and click on Create Calendar Event button")
    public void salesmanagerShouldNavigateAndClickOnCreateCalendarEventButton() {

        BrowserUtils.hover(b28G46_119.createCalendarEventButton);
        BrowserUtils.waitFor(2);
        b28G46_119.createCalendarEventButton.click();
    }

    @And("SalesManager types {string} in the Title box")
    public void salesmanagerTypesInTheTitleBox(String title) {

        BrowserUtils.waitFor(2);
        b28G46_119.inputTitleBox.sendKeys(title);
    }

    @And("SalesManager types {string} in the Description box")
    public void salesmanagerTypesInTheDescriptionBox(String message) {

        Driver.getDriver().switchTo().frame(b28G46_119.iframe);
        BrowserUtils.waitFor(2);
        b28G46_119.textBox.sendKeys(message);
        Driver.getDriver().switchTo().parentFrame();
    }

    @And("SalesManager navigate and click on Repeat radiobutton")
    public void salesmanagerNavigateAndClickOnRepeatRadiobutton() {

        BrowserUtils.waitFor(2);
        b28G46_119.radioButton.click();
    }

    @And("SalesManager clicks to Save and Close button")
    public void salesmanagerClicksToSaveAndCloseButton() {

        BrowserUtils.waitFor(2);
        b28G46_119.saveAndCloseButton.click();

    }

    @Then("SalesManager should see message {string} is displayed")
    public void salesmanagerShouldSeeMessageIsDisplayed(String message) {
        BrowserUtils.verifyElementDisplayed(b28G46_119.messageText);

    }
}



