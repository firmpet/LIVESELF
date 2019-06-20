package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.TricksManualPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TricksManual_step extends TestRunner {

    private TricksManualPO tricks = new TricksManualPO(driver);

    @When("^I click on Cta Useful Tricks Manual Test$")
    public void iClickOnCtaUsefulTricksManualTest() throws Throwable{
        tricks.tricksManual();
    }

    @Then("^Useful Tricks Forms page is displayed$")
    public void usefulTricksFormsPageIsDisplayed()throws Throwable {
        tricks.formPage();
    }

    @When("^I enter names in the fields$")
    public void iEnterNamesInTheFields() {
        tricks.fName();
        tricks.lName();
    }

    @And("^I select Yes from the dropdown field$")
    public void iSelectYesFromTheDropdownField() {
        tricks.dropdownField();
        tricks.texts();
    }

    @And("^I enter numbers in the fields$")
    public void iEnterNumbersInTheFields() {
        tricks.digit();
        tricks.digits();
    }

    @And("^I select Date of birth in the field$")
    public void iSelectDateOfBirthInTheField() throws Throwable{
        tricks.dob();
    }

    @And("^I enter postcode in the field$")
    public void iEnterPostcodeInTheField() throws Throwable  {
        tricks.postal();
        Thread.sleep(3000);
    }

    @And("^I enter validate text in the field$")
    public void iEnterInTheField()  {
        tricks.verifier();
    }

    @Then("^Successful submission page displayed$")
    public void successful_submission_page_displayed() throws Throwable {
        tricks.submitPage();
    }


}
