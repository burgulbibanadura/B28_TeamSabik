Feature: Accounts page filters
  Agile story: As a user, I want to filter customers’ info on the Account page.

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Store manager should see 8 filter options on Accounts page
    When store manager logs in with valid username "<username>" and password "<password>"
    And user clicks on Accounts dropdown under Customers module
    And user clicks on funnel button
    Then user should see the below expected options
      | Account Name  |
      | Contact Name  |
      | Contact Email |
      | Contact Phone |
      | Owner         |
      | Business Unit |
      | Created At    |
      | Updated At    |


    Examples:
      | username        | password    |
      | storemanager53  | UserUser123 |
      | storemanager90  | UserUser123 |
      | storemanager205 | UserUser123 |
      | storemanager235 | UserUser123 |


  Scenario Outline: Sales manager should see 8 filter options on Accounts page
    When sales manager logs in with valid username "<username>" and password "<password>"
    And user clicks on Accounts dropdown under Customers module
    And user clicks on funnel button
    Then user should see the below expected options
      | Account Name  |
      | Contact Name  |
      | Contact Email |
      | Contact Phone |
      | Owner         |
      | Business Unit |
      | Created At    |
      | Updated At    |


    Examples:
      | username        | password    |
      | salesmanager105 | UserUser123 |
      | salesmanager120 | UserUser123 |
      | salesmanager135 | UserUser123 |
      | salesmanager145 | UserUser123 |




