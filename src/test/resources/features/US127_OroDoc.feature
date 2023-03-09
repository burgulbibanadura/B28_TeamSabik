@wip
Feature: As a user, I should be access to the Oroinc Documentation page.

  Background: User on the login page
    Given the user is on the login page

  Scenario Outline:
    Given the user logged in with username as "<username>" and password as "<password>"
    Then user click the question icon on the right top of the homepage
    And User access to the Oro Documentation page

    Examples:
      | username        | password    |
      | user7           | UserUser123 |
      | user195         | UserUser123 |
      | storemanager63  | UserUser123 |
      | storemanager244 | UserUser123 |
      | salesmanager109 | UserUser123 |
      | salesmanager255 | UserUser123 |