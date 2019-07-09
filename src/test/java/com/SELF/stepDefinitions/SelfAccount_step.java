package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.SelfAccountPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelfAccount_step extends TestRunner {
    SelfAccountPO welsh = new SelfAccountPO(driver);

    @When("^I navigate to Language Form \"([^\"]*)\" page$")
    public void i_navigate_to_Language_Form_page(String WelshURL) throws Throwable {
        welsh.languageFormPage(WelshURL);
    }

    @And("^I enter test in the field$")
    public void iEnterTestInTheField()throws Throwable {
        welsh.textField();
    }

    @And("^I select Open Welsh in the search field$")
    public void iSelectOpenWelshInTheSearchField() throws Throwable{
        welsh.filterField();
    }

    @Then("^I click Cta Continue-Welsh$")
    public void iClickCtaContinueWelsh() throws Throwable{
        welsh.verification();
    }

    @When("^I click Submit$")
    public void iClickSubmit()throws Throwable {
        welsh.submitText();
    }

    @Then("^I click Continue Cta$")
    public void iClickContinueCta() throws Throwable{
        welsh.ctaContinue();
    }
}
