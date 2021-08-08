Feature: Login into Application

  Scenario Outline: Positive test validation testing
    Given intialize browser with chrome
    And Navigate to "http://www.qaclickacademy.com/" site
    And Click on Login link in home page to land on sign in screen
    When user enteres valid <username> and <password> and log in
    Then Verify that user lands on Home screen
    And Close Browsers

    Examples: 
    |username|password|
    |BBK1  |Pass123|
    |BBK2  |Pass234|