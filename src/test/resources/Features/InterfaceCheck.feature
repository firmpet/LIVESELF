@reg

Feature: Self - Interface Check (Copy)

  Scenario: Interface Check
    Given I login with valid credentials
    When I click Cta FAQs
    Then FAQs dashboard is displayed
    When I click on Cta Services
    Then Services dashboard is displayed
    When I click on Cta Dashboard
    Then The Dashboard page is displayed
    When I click on Cta MyRequests V
    Then MyRequests V page is displayed
    When I click on Cta Capita Connect V
    Then the Capita Connect V page is displayed