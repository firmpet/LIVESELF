package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.EscalationFormPO;
import com.SELF.pageObject.LoginPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class EscalationForm_step extends TestRunner {
    private TestAssert testAssert;
    private EscalationFormPO esca = new EscalationFormPO(driver);
    private LoginPO hp = new LoginPO(driver);


    @Given("^I login with valid credentials$")
    public void iLoginWithValidCredentials() throws Throwable{
        hp.Login();
        Thread.sleep(2000);
    }

    @When("^I click on Cta Escalation Test Process$")
    public void iClickOnCtaEscalationTestProcess() throws Throwable{
        esca.escalations();
    }

    @Then("^Escalation Form One is displayed$")
    public void escalationFormOneIsDisplayed() throws Throwable {
        Assert.assertFalse(testAssert.validateElementExistByXpath(driver, "//*[text()='Escalation Form One']"));
    }

    @When("^I entered Testing in the Text field$")
    public void iEnteredReferenceNumberInTheTextField() throws Throwable {
        esca.enterTest();
    }

    @And("^I click Cta Submit$")
    public void iClickCtaSubmit() throws Throwable{
        esca.submitBtn();
    }

    @Then("^Submission successful page is displayed$")
    public void submissionSuccessfulPageIsDisplayed() throws Throwable{
        esca.submissionPage();
    }

    @When("^I click on Cta MyRequests VThree$")
    public void iClickOnCtaMyRequestsVThree() throws Throwable {
        esca.myRequestsV3Link();
    }

    @Then("^My Request page is displayed with Data logs$")
    public void myRequestPageIsDisplayedWithDataLogs() throws Throwable{
        Thread.sleep(1000);
        Assert.assertFalse(testAssert.validateElementExistById(driver, "My Requests"));
        //Thread.sleep(1000);
        Assert.assertFalse(testAssert.validateElementExistById(driver, "MyRequestTable"));
    }

    @And("^I enter Case ID in the Search field$")
    public void iEnterCaseIDInTheSearchField() throws Throwable {
        esca.searchField();
    }

    @Then("^The case log info is display with stages indicated$")
    public void theCaseLogInfoIsDisplayWithStagesIndicated() throws Throwable {
        esca.caseLogsPage();
    }


}
