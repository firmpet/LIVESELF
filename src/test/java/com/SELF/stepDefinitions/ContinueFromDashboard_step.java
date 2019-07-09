package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.ContinueFromDashboardPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContinueFromDashboard_step extends TestRunner {
    ContinueFromDashboardPO cfd = new ContinueFromDashboardPO(driver);

    @Given("^I launch \"([^\"]*)\"$")
    public void iLaunch(String DashPage) throws Throwable {
        cfd.dashPage(DashPage);
    }

    @When("^I navigate to dash \"([^\"]*)\"$")
    public void i_navigate_to_dash(String ContinueFromDashboard) throws Throwable {
        cfd.continueFromDashboard(ContinueFromDashboard);
    }

    @Then("^click Submit$")
    public void clickSubmit() throws Throwable{
        cfd.submit();
    }

    @When("^I click on Dashboard$")
    public void iClickOnDashboard()throws Throwable {
        cfd.dashboard();
    }

    @And("^I click on cta All Cases$")
    public void iClickOnCtaAllCases() throws Throwable{
        cfd.allCases();
    }

    @Then("^I select stage two$")
    public void iSelectStageTwo() throws Throwable{
        cfd.ctaStage2();
    }

    @When("^I click on Next$")
    public void iClickOnNext() throws Throwable{
        cfd.next();
    }

    @And("^I click on case reference$")
    public void iClickOnCaseReference() throws Throwable{
        cfd.caseRef();
    }

    @And("^I click on continue$")
    public void iClickOnContinue() throws Throwable{
        cfd.continueBtn();
    }

    @Then("^Submission message is displayed$")
    public void submissionMessageIsDisplayed() throws Throwable{
        cfd.submitBtn();
    }



}
