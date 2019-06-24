package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.CalculationFamPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculationFam_step extends TestRunner {
    private CalculationFamPO calcu = new CalculationFamPO(driver);

    @When("^I click on Cta Calculations Process$")
    public void iClickOnCtaCalculationsProcess() throws Throwable {
        calcu.calculationsProcessLink();
    }

    @Then("^Calculations Form page is displayed with Contains column$")
    public void calculationsFormPageIsDisplayedWithContainsColumn()throws Throwable {
        calcu.calculationsColumn();
    }

    @When("^I enter Footpath, Park, Road and Cycle Track in the field$")
    public void iEnterFootpathParkRoadAndCycleTrackInTheField()throws Throwable{
        calcu.insertText();
    }

    @Then("^IF statement column is displayed with Extended IF statement as title$")
    public void ifStatementColumnIsDisplayedWithExtendedIFStatementAsTitle()throws Throwable{
        calcu.pageTitle();
    }

    @And("^I select Yes from all the three dropdown fields$")
    public void iSelectYesFromAllTheThreeDropdownFields() throws Throwable {
        //calcu.inputField();
        calcu.insertText1();
        //calcu.inputField1();
        calcu.insertText2();
        //calcu.inputField2();
        calcu.insertText3();
    }

    @And("^I click Nextlink$")
    public void iClickNextlink()throws Throwable{
        calcu.nextbtn();
    }

    @Then("^String Manipulation column page is displayed$")
    public void stringManipulationColumnPageIsDisplayed()throws Throwable{
        calcu.stringManSection();
    }

    @And("^Select Nextlink$")
    public void selectNextlink()throws Throwable{
        calcu.nextBtn();
    }

    @Then("^Subforms column page is displayed$")
    public void subformsColumnPageIsDisplayed()throws Throwable{
        calcu.subforms();
    }

    @And("^I click Cta Add Record$")
    public void iClickCtaAddRecord() throws Throwable {
        calcu.recordBtn();
    }

    @And("^I entered value in the field$")
    public void iEnteredValueInTheField() throws Throwable {
        calcu.textField();
        calcu.addRecordBtn();
    }

    @And("^Total sum of the record is displayed$")
    public void totalSumOfTheRecordIsDisplayed()throws Throwable{
        calcu.sum();
    }

    @And("^Click Cta Submit$")
    public void iClickCtaSubmit() throws Throwable {
        calcu.submitBtn();
    }

    @Then("^Submission page is displayed$")
    public void submissionPageIsDisplayed()throws Throwable{
        calcu.submitPage();
    }

}
