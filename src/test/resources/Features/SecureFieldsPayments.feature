@reg
Feature: Secure Fields Payment

  Scenario: Fields Payment
    Given I login with valid credentials
    When I navigate to "FieldPayment" page
    Then I enter text in the field
    And I enter payment amount in the second field
    Then I click Submits
    When I enter full name in the field
    And I enter full card number in the field
    And I enter expiry date
    And I enter card security date
    Then I clicks Submit
