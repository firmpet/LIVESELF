@reg
Feature: FAM Database Test (Copy)

  Scenario: Database
    Given I login with valid credentials
    When I click on Cta Database Integration Test
    And Database Integration Form One page is displayed
    And I fill in the dropdown fields
    Then I click Next
    And Read Only SubForm column is displayed
    And I clicked Cta Next
    Then Add a Entry column is displayed
    When I fill the text, FirstNameadd and emailadd fields
    And I click Cta Submit button
    Then Successful submission page is displayed