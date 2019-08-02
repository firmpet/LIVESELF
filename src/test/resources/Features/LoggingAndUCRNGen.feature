@rege
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
      And I confirm the ConfirmEmail
      And I enter new User passwoRd
      And I confirm new User ConfirmPasswoRd
      Then I click Create new account link
      When I navigate to "SupportURL" in Dash link
      And I click Web Login portal
      And I enter new User email
      And I enter new User password
      Then I click sign in btn
      When I navigate to "FormsURL" page
      Then I click Permission Manager
      When I search for email
      Then I click Edit link
      When I select user email radio button
      Then I select Web Login radio button
      When I enter email in Name field
      And I enter email in email field
      And I enter UCRN in the field
      Then I click Add New User ID





