Feature: feature to test login

  Scenario: check login with valid crednetials
    Given user is on login page
    When user enters username and Password
    And click on login button
    Then user navigated to home screen
