package com.VyTrack_Project.step_definitions;

import com.VyTrack_Project.pages.LoginPage;
import com.VyTrack_Project.pages.US120_CalendarRepeatDayPage;
import com.VyTrack_Project.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US120_CalendarRepeatDay_StepDefs {

  LoginPage loginPage = new LoginPage();

  US120_CalendarRepeatDayPage us09_elements = new US120_CalendarRepeatDayPage();


  @When("Manager log in with {string} and {string}")
  public void managerLogInWithAnd(String username, String password) {
    loginPage.login(username, password);
  }


  @And("Manager hover on the Activities button")
  public void managerHoverOnTheActivitiesButton() {

    BrowserUtils.waitForClickablility(us09_elements.activitiesButtonManager, 5);
    BrowserUtils.hover(us09_elements.activitiesButtonManager);
  }

  @And("Manager click on the Calendar Events button")
  public void managerClickOnTheCalendarEventsButton() {
    BrowserUtils.waitForClickablility(us09_elements.calendarEventButton, 5);
    us09_elements.calendarEventButton.click();
  }

  @And("Manager click on the Create Calendar Event button")
  public void managerClickOnTheCreateCalendarEventButton() {
    BrowserUtils.waitForClickablility(us09_elements.CreateCalendarEventButton, 5);
    us09_elements.CreateCalendarEventButton.click();
  }

  @And("Manager type their job title")
  public void managerTypeTheirJobTitle() {
    BrowserUtils.waitForClickablility(us09_elements.title, 5);
    us09_elements.title.sendKeys("Manager");
  }

  @And("Manager click on the repeat checkbox")
  public void managerClickOnTheRepeatCheckbox() {

    BrowserUtils.waitForClickablility(us09_elements.repeatCheckbox, 5);
    us09_elements.repeatCheckbox.click();
  }

  @And("Manager type the number for how many days their would like to repeat event")
  public void managerTypeTheNumberForHowManyDaysTheirWouldLikeToRepeatEvent() {
    BrowserUtils.waitForClickablility(us09_elements.repeatEveryButton, 5);

    us09_elements.repeatEveryButton.clear();
    us09_elements.repeatEveryButton.sendKeys("140" + Keys.ENTER);
  }


  @Then("user is able to see error message if enter number witch is not allowed")
  public void userIsAbleToSeeErrorMessageIfEnterNumberWitchIsNotAllowed() {
    Assert.assertTrue(us09_elements.warningMessageBoth.isDisplayed());
    System.out.println(us09_elements.warningMessageBoth.getText());
  }


  @When("Driver log in with {string} and {string}")
  public void driverLogInWithAnd(String username, String password) {
    loginPage.login(username, password);
  }

  @And("Driver hover on the Activities button")
  public void driverHoverOnTheActivitiesButton() {
    BrowserUtils.waitForClickablility(us09_elements.activitiesButtonDriver, 5);
    BrowserUtils.hover(us09_elements.activitiesButtonDriver);

  }

  @And("Driver click on the Calendar Events button")
  public void driverClickOnTheCalendarEventsButton() {
    BrowserUtils.waitForClickablility(us09_elements.calendarEventButton, 5);
    us09_elements.calendarEventButton.click();
  }

  @And("Driver click on the Create Calendar Event button")
  public void driverClickOnTheCreateCalendarEventButton() {
    BrowserUtils.waitForClickablility(us09_elements.CreateCalendarEventButton,3);
    //BrowserUtils.waitForClickablility(us09_elements.calendarEventButton, 5);
    us09_elements.CreateCalendarEventButton.click();
  }

  @And("Driver type their job title")
  public void driverTypeTheirJobTitle() {
    BrowserUtils.waitForClickablility(us09_elements.title, 5);
    us09_elements.title.sendKeys("Driver");
  }

  @And("Driver click on the repeat checkbox")
  public void driverClickOnTheRepeatCheckbox() {

    BrowserUtils.waitForClickablility(us09_elements.repeatCheckbox, 5);
    us09_elements.repeatCheckbox.click();
  }

  @And("Driver type the number for how many days their would like to repeat event")
  public void driverTypeTheNumberForHowManyDaysTheirWouldLikeToRepeatEvent() {
    BrowserUtils.waitForClickablility(us09_elements.repeatEveryButton, 5);

    us09_elements.repeatEveryButton.clear();
    us09_elements.repeatEveryButton.sendKeys("140" + Keys.ENTER);
  }
}



