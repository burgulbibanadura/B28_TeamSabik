package com.VyTrack_Project.step_definitions;
import com.VyTrack_Project.pages.CalendarEventsPage;
import com.VyTrack_Project.pages.LoginPage;
import com.VyTrack_Project.utilities.BrowserUtils;
import com.VyTrack_Project.utilities.ConfigurationReader;
import com.VyTrack_Project.utilities.Driver;
import io.cucumber.java.en.*;
import io.cucumber.java.zh_tw.並且;
import net.bytebuddy.asm.Advice;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Map;

public class CalendarEvenStepDefinitions{

    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

    LoginPage loginPage = new LoginPage();
    @Given("the user logged in with blow correct credentials")
    public void the_user_logged_in_with_blow_correct_credentials(Map<String,String> credentials) {
        loginPage.userName.sendKeys(credentials.get("username") );
        loginPage.password.sendKeys(credentials.get("password"));
        loginPage.submit.click();
    }
    @When("the user navigate to {string} and {string}")
    public void the_user_navigate_to_and(String tab, String module) {
        calendarEventsPage.navigateToModule(tab,module);
    }
    @And("the user click on Create Calendar Event button")
    public void theUserClickOnCreateCalendarEventButton() {
        BrowserUtils.waitForClickablility(calendarEventsPage.createCalenderEventButton , 40).click();

    }

    @And("check the Repeat check box")
    public void checkTheRepeatCheckBox() {

        BrowserUtils.waitForClickablility(calendarEventsPage.repeatCheckBox,40).click();

    }
    @Then("verify the user should see the repeat number is 1")
    public void verify_the_user_should_see_the_repeat_number(){

      BrowserUtils.verifyElementDisplayed(calendarEventsPage.repeatEveryInputBox);

    }

    @Then("clear or delete the number")
    public void clearOrDeleteTheNumber() {

     calendarEventsPage.repeatEveryInputBox.sendKeys(Keys.CLEAR);
    }

    @Then("verify the user see {string}")
    public void verifyTheUserSee(String errorMessage) {

        String actualMessage = calendarEventsPage.errorMessage.getText();
        Assert.assertEquals(actualMessage,errorMessage);


    }

}

