@ignore
Feature: Login

  Scenario Outline: Login with invalid credentials should return error message

    When I get to the home page
    Then I enter "<Username>" in the username field
    And I enter "<Password>" in the password field
    When I click on the login
    Then I should get the correct "<errorMessage>"

    Examples:
      | Username     | Password      | errorMessage         |
      | Maggie       | admin123      | Invalid credentials  |
      | Admin        | admintesting  | Invalid credentials  |
      | Maggie       | admintesting  | Invalid credentials  |
