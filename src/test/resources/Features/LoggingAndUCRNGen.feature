@reg
Feature: Auto Test
    Scenario: Logging And UCRN Generation
      Given I launch "LogOut" page
      When I launch "AutoTestURL" page on Inttest
      When I enter Username
      And I enter Password
      Then I click Log in button
      When I navigate to "AdminPeople" URL
      Then I click on Add User toggle
      And I enter new User email





