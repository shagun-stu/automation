Feature: Login functionality

  Scenario: Successful login with valid credentials
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the home page

  Scenario: Unsuccessful login with invalid credentials
    Given user is on login page
    When user enters invalid username and password
    Then error message is displayed - Invalid Credentials
