@reg
Feature: Myrequests - [Date Check] (Copy)

  Scenario: MyRequest Date Check
    Given I login with valid credentials
    And I navigate to request Date check "DateURL"
    When I enter text field
    And I clicked Cta Submit
    Then Reference and submission successful message is displayed
    When I click Cta Continue
    Then Survey page is displayed
    When I click top nav MyRequests VThree
    And Request data page is displayed
    And I clicked Case number column
    Then The result is displayed