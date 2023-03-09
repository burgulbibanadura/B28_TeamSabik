@users
  Feature: Verify user should be able to write the “Description” when user create a calendar event.

    Background: User is already on the main page
      Given the user is on the main page


  #  @Driver
    Scenario Outline: Verify Drivers is able to write the "Description" field on the calendar event page.
     When Driver enter valid "<username>" and "<password>"
     When Driver goes to Activities module by using hover and click on Calendar Events in the dropdown menu
     And Driver should navigate and click on Create Calendar Event button
     And Driver types "Meeting with team" in the Title box
     And Driver types "Scrum daily meeting" in the Description box
     And Driver navigate and click on Repeat radiobutton
     And Driver clicks to Save and Close button
     Then Driver should see message "Scrum Daily meeting" is displayed

     Examples:
       | username | password    |
       | user1    | UserUser123 |
       | user5    | UserUser123 |
       | user10    | UserUser123 |


   # @StoreManager
    Scenario Outline: Verify StoreManager is able to write the "Description" field on the calendar event page.

      When StoreManager enter valid "<username>" and "<password>"
      When StoreManager goes to Activities module by using hover and click on Calendar Events in the dropdown menu
      And StoreManager should navigate and click on Create Calendar Event button
      And StoreManager types "Meeting with team" in the Title box
      And StoreManager types "Scrum daily meeting" in the Description box
      And StoreManager navigate and click on Repeat radiobutton
      And StoreManager clicks to Save and Close button
      Then StoreManager should see message "Scrum Daily meeting" is displayed

      Examples:
        | username       | password    |
        | storemanager51 | UserUser123 |
        | storemanager61 | UserUser123 |
        | storemanager71 | UserUser123 |


   # @SalesManager
    Scenario Outline: Verify SalesManager is able to write the "Description" field on the calendar event page.

      When SalesManager enter valid "<username>" and "<password>"
      When SalesManager goes to Activities module by using hover and click on Calendar Events in the dropdown menu
      And SalesManager should navigate and click on Create Calendar Event button
      And SalesManager types "Meeting with team" in the Title box
      And SalesManager types "Scrum daily meeting" in the Description box
      And SalesManager navigate and click on Repeat radiobutton
      And SalesManager clicks to Save and Close button
      Then SalesManager should see message "Scrum Daily meeting" is displayed

      Examples:
        | username        | password    |
        | salesmanager101 | UserUser123 |
        | salesmanager110 | UserUser123 |
        | salesmanager120 | UserUser123 |




















