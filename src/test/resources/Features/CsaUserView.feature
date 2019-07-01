@reg
Feature: Any CSA/User View And Continue Existing tasks test

  Scenario: Continue Existing Tasks Test
    Given I login with valid credentials
    When I navigate to task in Dash environment "CsaUserViewURL"
    And I login with valid WebLogin credentials
    Then I click on Cta Dashboard
    When I click Any CSA User
    And I click Continue
    Then I click on cancel
    And I select Yes
    When I clicks on Cta Dashboard
    And I click Any CSA User
    And I click on View
    When I click on Cta Dashboard
    Then I click Any CSA User

