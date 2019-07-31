@reg
Feature: Read Only Checker

  Scenario: Checker
    Given I login with valid credentials
    When I navigate to "ReadOnlyCheckerURL"
    Then Click Next
    When I enter test
    Then I click Next
    When I enter testing in fieldone
    And I enter testing in fieldtwo
    And I enter pin number in fieldthree
    And I enter Yes in fieldfour
    And I select yes in fieldfive
    And I select Yes radio button in fieldsix
    And I enter figure in fieldseven
    And I select date
    And I select time
    And I enter dateTime
    Then I click Next
    When I enter Footpath, Park, Road and Cycle Track in the field
    And I select Yes from all the three dropdown fields
    And I click Cta Add Record
    Then I entered value in the field
