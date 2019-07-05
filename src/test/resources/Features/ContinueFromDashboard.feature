@reg
Feature: Continue From Dashboard

  Scenario: Dashboard
    Given I launch "DashPage"
    When I navigate to dash "ContinueFromDashboard"
    Then click Submit
    When I click on Dashboard
    And I click on cta All Cases
    Then I select stage two
    When I click on Next
    And I click on case reference
    And I click on continue
    And click Submit
    Then Submission message is displayed


