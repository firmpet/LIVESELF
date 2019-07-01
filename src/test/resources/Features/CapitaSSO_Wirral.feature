@reg
Feature: Self - Capita SSO (Wirral)

  Scenario: Capita SSO
    Given I login with valid credentials
    When I click on Capita Connect V
    Then I click on MyServices Dashboard
    When I click on Cta Add Service
    And I click Add on Council Tax tab
    And I click Add on Business Rate tab
    Then I click Confirm button
    And I click remove Council Tax
    And I click remove Business Rate





