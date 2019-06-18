@reg
Feature: FAM SELF - Tricks Manual (Copy)

  Scenario: Useful Tricks Manual Test
    Given I login with valid credentials
    When I click on Cta Useful Tricks Manual Test
    Then Useful Tricks Forms page is displayed
    When I enter names in the fields
    And I select Yes from the dropdown field
    And I enter numbers in the fields
    And I select Date of birth in the field
    And I enter postcode in the field
    And I enter validate text in the field
    And I click Cta Submit
    Then Successful submission page displayed