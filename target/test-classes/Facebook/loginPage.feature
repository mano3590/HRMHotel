
@Regression
Feature: Facebook End to End funtionality

  Scenario Outline: Login funtionality
    Given Navigate to login Page
    When Enter the UserName "<userName>" and  Password "<Password>"
    And Click on the login button
    Then Verify home page of Facebook

    Examples: 
      | userName             | Password  |
      | jjmano2008@gmail.com | 12345jhgf |
      | Ram                  | sdfgh3456 |
