@reg
Feature: MyGovScot Test

  Scenario: Highland Council
    Given I login with valid credentials
    When I navigate to Highland Council page "HighlandCouncil"
    Then I click cta Sign in with mygovscot
    When I enter username
    And I enter password
    Then click log in button