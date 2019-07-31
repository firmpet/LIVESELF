@reg
Feature: Run Check

  Scenario: Checks
    Given I go to "RunCheckURL"
    Then I look for Integration run check
    When I click on Cta Filll
    Then I click on Submitt
