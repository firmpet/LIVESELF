@rege
Feature: Inbox - Email - Content and Open

  Scenario: Content and Open
    Given I login with valid credentials
    When I navigate to "InboxEmailURL" inbox
    And I click Inbox modal
    And I click on email
    Then I click Raise Case button
    When I select Service Release Testing
    And I select Reason Release Testing
    And I select Type Calculations
    Then I select Cta Select
