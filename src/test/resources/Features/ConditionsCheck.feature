@reg
Feature: Look Up

  Scenario: Conditions Check
    Given I log into "FormsURL"
    When I search for Run on Input Change Multiple Runs
    And I click the result
    Then I click on Fill cta
    When I select Yes cta
    And I enter number in the first text field
    And I enter test in the text second field
    Then I click Submits
