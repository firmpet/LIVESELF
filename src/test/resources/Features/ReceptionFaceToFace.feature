@reg
  Feature: Service - Reception
    Scenario: Reception Face to Face
      Given I login with valid credentials
      When I navigate to "ReceptionF2FURL" CSA Select Workspace page
      And I select Reception modal
      Then the modal page is displayed
      When I select Individual tab
      And I select Mr
      And I enter Firstname and Lastname
      Then I select Cta Issue Ticket
      And I select Service radio button
      Then I select Cta Issue Ticket


