@rege
Feature: Self - Case View

  Scenario: TESTS-52 (Copy) (Copy) (Copy)
    Given I login with valid credentials
    When I navigate to Case View "URLpage"
    Then Case View should displayed
    When I enter credentials in the fields
    And I click Cta Submit
    When I click Cta MyRequests VThree
    And Searched for reference
    And click Cta Continue
    Then Case view page is displayed
    When I enter new credentials in the fields
    And I click Cta Submit
    Then Submission reference page is displayed
    When I click Cta Dashboard
    And Searched for case reference
    Then I clicks Cta Continue
    When I entered credentials in the fields
    And click Cta Submit
    Then results page is displayed with stages number