@wip
Feature: Manage Marketing Campaigns page filters
  Agile story: As a user, I want to manage filters on the Marketing page


  Background: User already logged in
    Given the user is on the login page
    Given the user logged in as "store manager"
    #Given the user logged in with username as "storemanager85" and password as "UserUser123"

  Scenario: Verify managers see 5 default checked filter options on the Campaigns page
    When user clicks on Campaigns dropdown under Marketing module
    And user clicks on Manage filters button
    Then user should see five options checked by default

  Scenario: Verify managers can uncheck any filter options under Manage filters button
    When user clicks on Campaigns dropdown under Marketing module
    And user clicks on Manage filters button
    And user unchecks the second and third checkboxes
    Then user should see one or more options are unchecked