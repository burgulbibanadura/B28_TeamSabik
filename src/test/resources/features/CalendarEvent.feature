@activities
Feature: Create calendar events
  User story: As a user I should be able to create recurring calendar events

  Background: user is already on the login page
    Given  the user is on the login page


  Scenario: verify the default repeat day is 1
    Given the user logged in with blow correct credentials
      | username | salesmanager101 |
      | password | UserUser123     |

    When the user navigate to "Activities" and "Calendar Events"
    And the user click on Create Calendar Event button
    And check the Repeat check box
    Then verify the user should see the repeat number is 1

@wip
  Scenario: Verify user see the error message after clearing the repeat day
    Given the user logged in with blow correct credentials
      | username | storemanager85 |
      | password | UserUser123     |

    When the user navigate to "Activities" and "Calendar Events"
    And the user click on Create Calendar Event button
    And check the Repeat check box
    Then clear or delete the number
    Then verify the user see "This value should not be blank."