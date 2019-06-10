@reg
Feature: Login Test FAM (Copy)
  Scenario: Login
    Given user is on home page
    When I login with valid credentials
    And I click on Cta Home
    Then Home page is displayed
    When I click Cta FAQs
    Then FAQs dashboard is displayed
    When I click Cta MyRequests V
    Then MyRequest V page is displayed