@reg
  Feature: Phone Team Raise Case
    Scenario: Phone Team Raise
      Given I login with valid credentials
      When I navigate to "CSASelectWorkspace" to access CSA Select Workspace
      Then I select Phone Team modal
      When I enter test in search field
      And I click Search button
      Then I click Raise Case button
      When I select Service Release Testing
      And I select Reason Release Testing
      And I select Type Calculations
      Then I select Cta Select
      When I enter texts in the field
      And I select Next
      And I select Yes in the three dropdown fields
      Then I select Next
      When I select Next
      And I click Add Record
      Then I select Submit








