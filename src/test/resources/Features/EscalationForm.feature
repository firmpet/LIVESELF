@reg
Feature: Escalations (Stage 1 to Stage 3 (Copy)

  Scenario: Escalation Logs successful submission
    Given I login with valid credentials
    When I click on Cta Escalation Test Process
    Then Escalation Form One is displayed
    When I entered Testing in the Text field
    And I click Cta Submit
    Then Submission successful page is displayed
    When I click on Cta MyRequests VThree
    Then My Request page is displayed with Data logs
    And I enter Case ID in the Search field
    Then The case log info is display with stages indicated
