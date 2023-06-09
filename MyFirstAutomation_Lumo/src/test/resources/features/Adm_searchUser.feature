Feature: Admin User

    Background:
        #steps from the commonstep1
        Given I am on the application home page
        Then I login

  Scenario: Verify that admin users search panel filters users correctly

#Given I am logged in
    When I click the admin menu
    Then I should see the users page
    When I enter user data
    And I click on the search button
    Then Search result should return the correct user