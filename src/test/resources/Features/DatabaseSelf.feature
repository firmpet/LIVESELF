@reg
Feature: FAM SELF - Database (Copy)

  Scenario: Database Copy
    Given I login with valid credentials
    When I click on Cta Database Integration Test
    And Database Integration Form One page is displayed
    And I select test from dropdown field and I enter email address in text field in Select List Check column
    Then I click Next
    And Read Only SubForm column is displayed
    And I clicked Cta Next
    Then Add a Entry column is displayed
    When I fill in firstaname, lastname and email in the fields
    And I click Cta Submit
    Then Successful submission page is displayed