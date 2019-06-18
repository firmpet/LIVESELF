@reg
Feature: FAM SELF - Calculations (Copy)

  Scenario: Calculation of multiple sums
    Given I login with valid credentials
    When I click on Cta Calculations Process
    Then Calculations Form page is displayed with Contains column
    When I enter Footpath, Park, Road and Cycle Track in the field
    And I click Next
    Then IF statement column is displayed with Extended IF statement as title
    And I select Yes from all the three dropdown fields
    And I click Nextlink
    Then String Manipulation column page is displayed
    And Select Nextlink
    Then Subforms column page is displayed
    And I click Cta Add Record
    And I entered value in the field
    And Total sum of the record is displayed
    And click Cta Submit
    Then Submission page is displayed