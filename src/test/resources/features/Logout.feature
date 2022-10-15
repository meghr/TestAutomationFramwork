#Author: Neotech Academy
@logout
Feature: Sauce Demo logout

  Scenario: user logout
    When user enters valid username
    And user enters valid password
    And click on login button
    Then I validate that user is logged in
    When click on menu button
    And click on logout option
    Then I validate that user logged out successfully
