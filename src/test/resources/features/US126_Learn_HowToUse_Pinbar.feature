@vadym
Feature: As a user I want to learn how to use the pinbar.


  Background:
    Given the user is on the login page
    Given the user logged in as "driver"

  Scenario:
    Given User click on Learn how to use this space link
    Then User should see how to use pinbar title
    #expected "How To Use Pinbar"

    Scenario:

      Given User click on Learn how to use this space link
    And user should see an image of pinbar on the page



