@reg
Feature: MyGovScot Test

  Scenario: Perth and Kinross
    Given I login with valid credentials
    When I navigate to Perth and Kinross Council page "PerthKinrossCouncil"
    And I sign in to the account
    Then the account is displayed