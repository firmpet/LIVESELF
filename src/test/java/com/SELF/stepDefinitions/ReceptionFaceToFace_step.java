package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.ReceptionFaceToFacePO;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReceptionFaceToFace_step extends TestRunner {
    ReceptionFaceToFacePO f2f = new ReceptionFaceToFacePO(driver);

    @When("^I navigate to \"([^\"]*)\" CSA Select Workspace page$")
    public void iNavigateToCSASelectWorkspacePage(String ReceptionF2FURL) throws Throwable {
        f2f.csaSelectWorkspace(ReceptionF2FURL);
    }

    @And("^I select Reception modal$")
    public void iSelectReceptionModal() throws Throwable{
        f2f.receptionModal();
    }

    @Then("^the modal page is displayed$")
    public void theModalPageIsDisplayed() throws Throwable{
        f2f.displayPage();
    }

    @When("^I select Individual tab$")
    public void iSelectIndividualTab()throws Throwable {
        f2f.selectIndividual();
    }

    @And("^I select Mr$")
    public void iSelectMr()throws Throwable {
        f2f.titleOption();
    }

    @And("^I enter Firstname and Lastname$")
    public void iEnterFirstnameAndLastname() throws Throwable{
        f2f.name();
    }

    @Then("^I select Cta Issue Ticket$")
    public void iSelectCtaIssueTicket()throws Throwable {
        f2f.submit();
        f2f.secondName();
    }

    @And("^I select Service radio button$")
    public void iSelectServiceRadioButton() throws Throwable{
        f2f.releaseTesting();
    }
}
