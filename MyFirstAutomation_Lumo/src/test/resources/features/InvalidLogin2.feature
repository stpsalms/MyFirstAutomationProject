@ignore
Feature: Login

  Scenario: User with wrong password should not able to login

    Given I get to the login
    When I type in correct username
    And I type in incorrect password
    When I click the login
    Then My loggin attempt should fail
