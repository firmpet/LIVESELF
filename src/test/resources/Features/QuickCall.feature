@reg
Feature: Quick Call

  Scenario: Services
    Given I login with valid credentials
    When I navigate to "CSASelectWorkspace" to access CSA Select Workspace
    Then I select Phone Team modal
    When I select Release Testing radio button
    And I select Calculation radio button
    And I select Concat radio button
    And I select String radio button
    And I select No radio button
    Then I select Submit button
    When I select Release Testing radio button
    And I select Calculation radio button
    And I select Concat radio button
    And I select Numbers radio button
    And I select Yes radio button
    And I enter character in the text field
    Then I select Submit button