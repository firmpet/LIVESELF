package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.RunCheckPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RunCheck_step extends TestRunner {
    private RunCheckPO run = new RunCheckPO(driver);


    @Given("^I navigate to \"([^\"]*)\"$")
    public void iNavigateTo(String RunCheckURL) throws Throwable {
        run.CheckPages(RunCheckURL);
    }

    @Then("^I search for Integration run check with conditions$")
    public void iSearchForIntegrationRunCheckWithConditions() throws Throwable{
        run.inputField();
        run.ctaIntegration();
    }

    @When("^I click on Cta Fill$")
    public void iClickOnCtaFill() throws Throwable{
        run.ctaFill();
    }

    @Then("^I click on Submit$")
    public void iClickOnSubmit() throws Throwable{
        run.ctaSubmit();
    }

    @When("^I click Cta View Data$")
    public void iClickCtaViewData() throws Throwable{
        run.ctaViewData();
    }

    @And("^I click on the case reference$")
    public void iClickOnTheCaseReference() throws Throwable{
        run.caseID();
    }

    @And("^I click Cta Next Task stage three$")
    public void iClickCtaNextTaskStageThree() throws Throwable{
        run.ctaStage3();
    }

    @Then("^Click Submits$")
    public void clickSubmits() throws Throwable{
        run.payment();
    }

    @Then("^I click Cta Next Task stage two$")
    public void iClickCtaNextTaskStageTwo() throws Throwable{
        run.ctaStage2();
    }

    @When("^I enter yes in text one$")
    public void iEnterYesInTextOne()throws Throwable {
        run.test1Field();
    }

    @And("^I enter yes in text three$")
    public void iEnterYesInTextThree() throws Throwable{
        run.test3Field();
    }

    @And("^I enter yes in text four$")
    public void iEnterYesInTextFour() throws Throwable{
        run.test4Field();
    }

    @And("^I enter yes in text five$")
    public void iEnterYesInTextFive()throws Throwable {
        run.test5Field();
    }

    @And("^I click Cta Next Task stage one$")
    public void iClickCtaNextTaskStageOne() throws Throwable{
        run.ctaNextTask();
    }

    @When("^I click on Cta Test User$")
    public void iClickOnCtaTestUser() throws Throwable{
        run.ctaTestUser();
    }

    @And("^I select Integration Manager$")
    public void iSelectIntegrationManager()throws Throwable {
        run.integration();
    }

    @Then("^I search for the case id$")
    public void iSearchForTheCaseId() throws Throwable{
        run.logsLink();
        run.inputSearch();
    }

    @When("^I confirm creation Third stage$")
    public void iConfirmCreationThirdStage() throws Throwable{
        
    }

    @And("^I confirm Escalation Third stage$")
    public void iConfirmEscalationThirdStage() throws Throwable{
        
    }

    @And("^I confirm Creation Second stage$")
    public void iConfirmCreationSecondStage() throws Throwable{
        
    }

    @And("^I confirm Escalation second stage$")
    public void iConfirmEscalationNdStageSecond() throws Throwable{
        
    }

    @And("^I confirm Submission first stage$")
    public void iConfirmSubmissionStStageFirst()throws Throwable {
        
    }

    @And("^I confirm Pre Submission$")
    public void iConfirmPreSubmission()throws Throwable {
    }



}
