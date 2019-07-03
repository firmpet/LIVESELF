package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.QuickCallPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class QuickCall_step extends TestRunner {
    QuickCallPO call = new QuickCallPO(driver);


    @When("^I select Release Testing radio button$")
    public void iSelectReleaseTestingRadioButton() throws Throwable{
        call.releaseBtn();
    }

    @And("^I select Calculation radio button$")
    public void iSelectCalculationRadioButton() throws Throwable{
        call.calculationBtn();
    }

    @And("^I select Concat radio button$")
    public void iSelectConcatRadioButton() throws Throwable{
        call.concatBtn();
    }

    @And("^I select String radio button$")
    public void iSelectStringRadioButton()throws Throwable {
        call.stringBtn();
    }

    @And("^I select No radio button$")
    public void iSelectNoRadioButton() throws Throwable{
        call.noRadioBtn();
    }

    @Then("^I select Submit button$")
    public void iSelectSubmitButton() throws Throwable{
        call.submitBtn();
    }

    @And("^I select Numbers radio button$")
    public void iSelectNumbersRadioButton() throws Throwable{
        call.numberField();
    }

    @And("^I select Yes radio button$")
    public void iSelectYesRadioButton()throws Throwable {
        call.yesRadioBtn();
    }

    @And("^I enter character in the text field$")
    public void iEnterCharacterInTheTextField() throws Throwable{
        call.enterText();
    }


}
