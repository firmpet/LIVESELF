package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.ConditionsCheckPO;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConditionsCheck_step extends TestRunner {
    ConditionsCheckPO condition = new ConditionsCheckPO(driver);

    @Given("^I log into \"([^\"]*)\"$")
    public void iLogInto(String FormsURL) throws Throwable {
        condition.formsLogin(FormsURL);
    }

    @When("^I search for Run on Input Change Multiple Runs$")
    public void iSearchForRunOnInputChangeMultipleRuns() throws Throwable{
        condition.fieldSearch();
    }

    @And("^I click the result$")
    public void iClickTheResult() throws Throwable{
        condition.searchResult();
    }

    @Then("^I click on Fill cta$")
    public void iClickOnFillCta() throws Throwable{
        condition.fillBtn();
    }

    @When("^I select Yes cta$")
    public void iSelectYesCta() throws Throwable{
        condition.yesBtn();
    }

    @And("^I enter number in the first text field$")
    public void iEnterNumberInTheFirstTextField()throws Throwable {
        condition.inputField1();
    }

    @And("^I enter test in the text second field$")
    public void iEnterTestInTheTextSecondField()throws Throwable {
        condition.inputField2();
    }



}
