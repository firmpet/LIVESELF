package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.TokensPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tokens_step extends TestRunner {
    private TokensPO token = new TokensPO(driver);

    @When("^I click on Cta Tokens Process$")
    public void iClickOnCtaTokensProcess() throws Throwable {
        token.tokensBtn();
    }

    @Then("^All Tokens Form page is displayed$")
    public void allTokensFormPageIsDisplayed() throws Throwable{
        token.tokenLists();
    }

    @And("^Click Next btns$")
    public void clickNextBtn() {
        token.nextBtn();
    }

    @Then("^Assignment Tokens Column is displayed$")
    public void assignmentTokensColumnIsDisplayed()throws Throwable {
        token.assignmentColumn();
    }

    @When("^I click Next Btn$")
    public void iClickNextBtn() {
        token.nextbtn();
    }

    @Then("^Case Tokens Column is displayed$")
    public void caseTokensColumnIsDisplayed()throws Throwable {
        token.caseColumn();
    }

    @Then("^Citizen and CSA Tokens column is displayed$")
    public void citizenAndCSATokensColumnIsDisplayed()throws Throwable {
        token.citizenColumn();
    }

    @Then("^Date Time Token column is displayed$")
    public void dateTimeTokenColumnIsDisplayed()throws Throwable {
        token.dateTimeColumn();
    }

    @Then("^Escalation Tokens column is displayed$")
    public void escalationTokensColumnIsDisplayed()throws Throwable {
        token.escalationColumn();
    }

    @Then("^Form Tokens column is displayed$")
    public void formTokensColumnIsDisplayed()throws Throwable {
        token.formColumn();
    }

    @Then("^Process Tokens column is displayed$")
    public void processTokensColumnIsDisplayed()throws Throwable {
        token.processColumn();
    }

    @Then("^Subform Tokens column is displayed$")
    public void subformTokensColumnIsDisplayed() throws Throwable {
        token.subformColumn();
        Thread.sleep(2000);
    }

    @Then("^Task Tokens column is displayed$")
    public void taskTokensColumnIsDisplayed()throws Throwable {
        token.taskColumn();
    }

    @Then("^Map Field Tokens column is displayed$")
    public void mapFieldTokensColumnIsDisplayed() throws Throwable {
        token.mapColumn();
        Thread.sleep(3000);
    }

    @And("^Others column is displayed$")
    public void othersColumnIsDisplayed()throws Throwable {
        token.othersColumn();
    }

}
