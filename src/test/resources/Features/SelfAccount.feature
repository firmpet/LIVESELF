@reg
Feature: Self Account
    Scenario: Login My Requests
    Given I login with valid credentials
      When I navigate to Language Form "WelshURL" page
      And I enter test in the field
      Then I click Cta Submit
      When I click Cta MyRequests VThree
      And I select Open Welsh in the search field
      Then I click Cta Continue-Welsh
      When I click Submit
      Then I click Continue Cta





