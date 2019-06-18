@reg
Feature: FAM SELF - HTTP Look Up’s (Copy)

  Scenario: HTTP Exmaples and Testing
    Given I login with valid credentials
    When I click on Cta HTTP Examples and Testing
    Then HTTP Testing and Example page is displayed
    When I click Cta LookUp in HTTP Get No Token column
    And  click Next btn
    Then I enter Breedname in the field
    And I click Cta LookUp
    And  click Next
    Then I click Cta LookUp to fill up the fields
    And I click on Cta Submit
    Then Successful submission page is displayed with reference