
Feature: Manage filters on the Vehicle Costs page

  Background: User navigates to login page
    Given the user is on the login page
    Given the user logged in as "sales manager"
    #Given the user logged in with username as "User1" and password as "UserUser123"

  Scenario: Users see 3 columns on the Vehicle Model page
    Given User hover mouse over the Fleet tab
    Then User selects Vehicle Costs from dropdown
    Then user should see three columns on the Vehicle Costs page
    Then user verifies column titles as expected
    #Expected Column names: TYPE, TOTAL PRICE, DATE
  @wip
  Scenario: users check the first checkbox to check all the Vehicle Costs
    Given User hover mouse over the Fleet tab
    Then User selects Vehicle Costs from dropdown
    Then users check the first checkbox to check all the Vehicle Costs


    


