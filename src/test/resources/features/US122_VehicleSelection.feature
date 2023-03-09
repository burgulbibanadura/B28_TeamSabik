@wip
Feature: User should be able to select any Vehicle from Vehicle page

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Check Vehicle Checkboxes as a store manager
    Given user as a store manager log in with "<username>" and password "<password>"
    When the user clicks the Fleet menu and selects Vehicle
    Then all checkboxes on the page should be unchecked
    When the user checks the first checkbox in the web-table
    When the user checks any car's checkbox

    Examples:
      | username       | password    |
      | storemanager51 | UserUser123 |

  Scenario Outline: Check Vehicle Checkboxes as a sales manager
    Given user as a sales manager log in with "<username>" and password "<password>"
    When the user clicks the Fleet menu and selects Vehicle
    Then all checkboxes on the page should be unchecked
    When the user checks the first checkbox in the web-table
    When the user checks any car's checkbox

    Examples:
      | username        | password    |
      | salesmanager101 | UserUser123 |