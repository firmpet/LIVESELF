package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.DatabaseFamPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DatabaseFam_step extends TestRunner {
    private DatabaseFamPO data = new DatabaseFamPO(driver);

    @When("^I click on Cta Database Integration Test$")
    public void iClickOnCtaDatabaseIntegrationTest() throws Throwable {
        data.databaseIntegrationBtn();
    }

    @And("^Database Integration Form One page is displayed$")
    public void databaseIntegrationFormOnePageIsDisplayed() {
        System.out.println(driver.getTitle());
    }

    @And("^I fill in the dropdown fields$")
    public void iFillInTheDropdownFields() throws Throwable {
        Thread.sleep(3000);
        data.enterText();
        data.testBtn();
        data.enterEmail();
    }

    @Then("^I click Next$")
    public void iClickCtaNext()  {
        data.nextBtn();
    }

    @And("^Read Only SubForm column is displayed$")
    public void readOnlySubFormColumnIsDisplayed()  {
        data.readOnlySubform();
    }

    @And("^I clicked Cta Next$")
    public void iClickedCtaNext() throws Throwable{
        Thread.sleep(2000);
        data.nextLink();
    }

    @Then("^Add a Entry column is displayed$")
    public void addAEntryColumnIsDisplayed() throws Throwable{
        Thread.sleep(2000);
        data.enterData();
    }

    @When("^I fill the text, FirstNameadd and emailadd fields$")
    public void iFillTheTextFirstNameaddAndEmailaddFields() throws Throwable{
        Thread.sleep(5000);
        data.textField();
        data.nameField();
        data.email();
    }

    @And("^I click Cta Submit button$")
    public void iClickCtaSubmitButton() throws Throwable{
             data.submitBtn();
    }

    @Then("^Successful submission page is displayed$")
    public void successfulSubmissionPageIsDisplayed() throws Throwable{
        data.successPage();
    }


}
