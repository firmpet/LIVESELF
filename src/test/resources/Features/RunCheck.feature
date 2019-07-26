#@reg
Feature: RUN CHECK

  Scenario: Run Check Exploratory
    Given I navigate to "RunCheckURL"
    Then I search for Integration run check with conditions
    When I click on Cta Fill
    Then I click on Submit
    When I click Cta View Data
    And I click on the case reference
    And I click Cta Next Task stage three
    Then I click on Submit
    When I enter full name in the field
    And I enter full card number in the field
    And I enter expiry date
    And I enter card security date
    Then Click Submits
    When I click Cta View Data
    And I click on the case reference
    Then I click Cta Next Task stage two
    When I enter yes in text one
    And I enter yes in text three
    And I enter yes in text four
    And I enter yes in text five
    Then I click on Submit
    When I click Cta View Data
    And I click on the case reference
    And I click Cta Next Task stage one
    Then I click on Submit
    When I enter full name in the field
    And I enter full card number in the field
    And I enter expiry date
    And I enter card security date
    Then I click Submits
    When I click on Cta Test User
    And I select Integration Manager
    Then I search for the case id
    When I confirm creation Third stage
    And I confirm Escalation Third stage
    And I confirm Creation Second stage
    And I confirm Escalation second stage
    And I confirm Submission first stage
    And I confirm Pre Submission






