@reg
Feature: FAM SELF - Tokens (Copy)

  Scenario: Tokens
    Given I login with valid credentials
    When I click on Cta Tokens Process
    Then All Tokens Form page is displayed
    And Click Next btns
    Then Assignment Tokens Column is displayed
    When I click Next Btn
    Then Case Tokens Column is displayed
    When I click Next Btn
    Then Citizen and CSA Tokens column is displayed
    When I click Next Btn
    Then Date Time Token column is displayed
    When I click Next Btn
    Then Escalation Tokens column is displayed
    When I click Next Btn
    Then Form Tokens column is displayed
    When I click Next Btn
    Then Process Tokens column is displayed
    When I click Next Btn
    Then Subform Tokens column is displayed
    When I click Next Btn
    Then Task Tokens column is displayed
    When I click Next Btn
    Then Map Field Tokens column is displayed
    When I click Next Btn
    And Others column is displayed
    Then I click Cta Submit