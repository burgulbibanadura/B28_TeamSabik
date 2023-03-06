@VehicleContractsPage
Feature: Vehicle contracts page
  Agile User Story 125 : As a user, I want to access to Vehicle contracts page

  Given : User on the login page

  @StoreManagers
  Scenario Outline: Store managers access the Vehicle contracts page
    When store managers enter valid "<username>" and "<password>"
    When store managers goes to the Fleet module
    And click Vehicle Contracts in the dropdown menu
    Then store managers should see the expected title and url
    #Expected Title : All - Vehicle Contract - Entities - System - Car - Entities - System
    #Expected URL : https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract

    Examples:

      | username       |  | password    |
      | storemanager51 |  | UserUser123 |
      | storemanager68 |  | UserUser123 |
      | storemanager99 |  | UserUser123 |

  @SalesManagers
  Scenario Outline: Sales managers access the Vehicle contracts page
    When sales managers enter valid "<username>" and "<password>"
    When sales managers goes to the Fleet module
    And click Vehicle Contracts in the dropdown menu
    Then sales managers should see the expected title and url
    #Expected Title : All - Vehicle Contract - Entities - System - Car - Entities - System
    #Expected URL : https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract

    Examples:

      | username        |  | password    |
      | salesmanager101 |  | UserUser123 |
      | salesmanager144 |  | UserUser123 |
      | salesmanager150 |  | UserUser123 |

  @Drivers
  Scenario Outline: Drivers should not able to access the Vehicle contracts page,
  the app should display "You do not have permission to perform this action."
    When drivers enter valid "<username>" and "<password>"
    When drivers goes to the Fleet module
    And click Vehicle Contracts in the dropdown menu
    Then drivers should see the expected message
    #"You do not have permission to perform this action."

    Examples:

      | username |  | password    |
      | user1    |  | UserUser123 |
      | user34   |  | UserUser123 |
      | user50   |  | UserUser123 |