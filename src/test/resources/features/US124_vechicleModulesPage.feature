@wipAliya
Feature: Vehicle Models Access Control


  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline: Verify managers have access to Vehicle Models page

    Given user as a store manager log in with "<username>" and password "<password>"
    When I click on the Fleet dropdown in the main menu
    And I click on the Vehicle Models option
    Then I should see the following options in the columns in the web-table
      | MODEL NAME               |
      | MAKE                     |
      | CAN BE REQUESTED         |
      | CVVI                     |
      | CO2 FEE (/MONTH)         |
      | COST (DEPRECIATED)       |
      | TOTAL COST (DEPRECIATED) |
      | CO2 EMISSIONS            |
      |FUEL TYPE                 |
      | VENDORS                  |


    Examples:
      | username       | password    |
      | storemanager51 | UserUser123 |




  Scenario: Verify drivers do not have access to Vehicle Models page
    Given I am logged in as a driver
    When I click on the Fleet dropdown in the main menu
    And I click on the Vehicle Models option
    Then I should see an error message stating "You do not have permission to perform this action."