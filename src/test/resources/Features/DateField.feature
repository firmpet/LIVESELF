@reg
Feature: FAM SELF - Date Test (Copy)

  Scenario: Date Test Copy
    Given I login with valid credentials
    When I click on Cta Date Fields Manual Test
    Then Date Fields Manual Test Form page is displayed
    When I enter date From, date To and time in the fields
    And I click Cta submit
    Then Submission page should displayed with submitted data