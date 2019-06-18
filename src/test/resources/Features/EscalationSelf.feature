@reg
Feature: FAM SELF - Escalation Stage 1 15mins till Stage 3 (Copy)

  Scenario: Escalation Test Process Stage One
    Given I login with valid credentials
    When I click on Cta Escalation Test Process
    Then Escalation Form One is displayed
    When I entered Testing in the Text field
    And click Cta Submit
    Then Submission successful page is displayed