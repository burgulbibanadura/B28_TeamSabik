@Erhad
Feature: As a user,I should see error messages when I enter an invalid integer into the calendar

  Scenario Outline: As a Manager,I should see error messages when I enter an invalid integer into the calendar
    Given the user is on the login page
    When Manager log in with "<username>" and "<password>"
    And Manager hover on the Activities button
    And Manager click on the Calendar Events button
    And Manager click on the Create Calendar Event button
    And Manager type their job title
    And Manager click on the repeat checkbox
    And Manager type the number for how many days their would like to repeat event
    Then user is able to see error message if enter number witch is not allowed


    Examples:
      | username        | password    |
      | storemanager51  | UserUser123 |
      | storemanager75  | UserUser123 |
      | storemanager85  | UserUser123 |
      | salesmanager103 | UserUser123 |
      | salesmanager127 | UserUser123 |

  @Driver
  Scenario Outline: As a Driver,I should see error messages when I enter an invalid integer into the calendar
    Given the user is on the login page
    When Driver log in with "<username>" and "<password>"
    And Driver hover on the Activities button
    And Driver click on the Calendar Events button
    And Driver click on the Create Calendar Event button
    And Driver type their job title
    And Driver click on the repeat checkbox
    And Driver type the number for how many days their would like to repeat event
    Then user is able to see error message if enter number witch is not allowed


    Examples:
      | username | password    |
      | user1    | UserUser123 |
      | user28   | UserUser123 |
      | user50   | UserUser123 |
      | user17   | UserUser123 |
      | user238  | UserUser123 |









