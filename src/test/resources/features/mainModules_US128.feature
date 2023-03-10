@wip
Feature: Account Main Modules
  Agile story: As a user, I should be accessing all the main modules of the app.

  Background: User is already in the log in page
    Given the user is on the login page


#Driver
  Scenario: Verify Main Modules for driver
    Given the user logged in as "driver"
    Then the user should see the following options

      | Fleet      |
      | Customers  |
      | Activities |
      | System     |

    #SalesManager
  Scenario: Verify Main Modules for Sales Manager
    Given the user logged in as "Sales Manager"
    Then the user should see the following options

      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |


    #StoreManager
  Scenario: Verify Main Modules for Store Manager
    Given the user logged in as "Store Manager"
    Then the user should see the following options

      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |
