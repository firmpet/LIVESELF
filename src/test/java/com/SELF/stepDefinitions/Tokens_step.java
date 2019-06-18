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
    public void assignmentTokensColumnIsDisplayed() {
        token.assignmentColumn();
    }

    @When("^I click Next Btn$")
    public void iClickNextBtn() {
        token.nextbtn();
    }

    @Then("^Case Tokens Column is displayed$")
    public void caseTokensColumnIsDisplayed() {
        token.caseColumn();
    }

//    @When("^I click Next Cta$")
//    public void iClickNextCta() {
//        token.btnNext();
//    }

    @Then("^Citizen and CSA Tokens column is displayed$")
    public void citizenAndCSATokensColumnIsDisplayed() {
        token.citizenColumn();
    }

//    @When("^Clicks Next$")
//    public void ClicksNext() {
//        token.nextLink();
//    }

    @Then("^Date Time Token column is displayed$")
    public void dateTimeTokenColumnIsDisplayed() {
        token.dateTimeColumn();
    }

    @Then("^Escalation Tokens column is displayed$")
    public void escalationTokensColumnIsDisplayed() {
        token.escalationColumn();
    }

    @Then("^Form Tokens column is displayed$")
    public void formTokensColumnIsDisplayed() {
        token.formColumn();
    }

    @Then("^Process Tokens column is displayed$")
    public void processTokensColumnIsDisplayed() {
        token.processColumn();
    }

    @Then("^Subform Tokens column is displayed$")
    public void subformTokensColumnIsDisplayed() throws Throwable {
        token.subformColumn();
        Thread.sleep(2000);
    }

    @Then("^Task Tokens column is displayed$")
    public void taskTokensColumnIsDisplayed() {
        token.taskColumn();
    }

    @Then("^Map Field Tokens column is displayed$")
    public void mapFieldTokensColumnIsDisplayed() throws Throwable {
        token.mapColumn();
        Thread.sleep(3000);
    }

    @And("^Others column is displayed$")
    public void othersColumnIsDisplayed() {
        token.othersColumn();
    }

}
