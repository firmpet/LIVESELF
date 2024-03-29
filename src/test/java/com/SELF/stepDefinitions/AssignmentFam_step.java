package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.AssignmentFamPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AssignmentFam_step extends TestRunner {
    private AssignmentFamPO assign = new AssignmentFamPO(driver);

    @When("^I click on Cta Dashboard and Assignment Process$")
    public void iClickOnCtaDashboardAndAssignmentProcess() throws Throwable {
        assign.dashboardAndAssignmentProcessLink();
    }

    @And("^New Form page is displayed$")
    public void newFormPageIsDisplayed() throws Throwable{
        assign.formPage();
    }

    @And("^I enter test summary date$")
    public void iEnterTestSummaryDate() {
        assign.clearField();
        assign.enterText();
    }

    @And("^I select email and group from the dropdown fields$")
    public void iSelectEmailAndGroupFromTheDropdownFields() throws Throwable{

        //assign.userField();
        assign.enterEmail();
        //assign.groupField();
        assign.groupName();
    }

    @And("^click Cta Submit$")
    public void clickCtaSubmit() throws Throwable {
        assign.submitBtn();
    }

    @Then("^successful form submission page is displayed$")
    public void successfulFormSubmissionPageIsDisplayed() throws Throwable {
        assign.formSubmit();
    }
}
