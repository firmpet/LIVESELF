@reg
Feature: My Requests

  Scenario: Stage Loopback
    Given I login with valid credentials
    When I navigate to Stage "LoopbackURL"
    Then SELF TEST - Loopback page is displayed
    When I click Cta Submit
    Then Displayed Reference Page
    When I click on Cta MyRequests VThree
    And I click current Stage two
    Then click on Cta Continue
    When I clicks No radio button
    And click Submit Cta
    Then Submit reference page is displayed