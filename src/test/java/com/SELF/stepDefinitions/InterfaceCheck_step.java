package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.InterfaceCheckPO;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InterfaceCheck_step extends TestRunner {
    private InterfaceCheckPO inter = new InterfaceCheckPO(driver);
    private TestAssert testAssert;

    @When("^I click Cta FAQs$")
    public void iClickCtaFAQs() throws Throwable{
        inter.faqsBtn();
    }

    @Then("^FAQs dashboard is displayed$")
    public void faqsDashboardIsDisplayed() throws Throwable {
        inter.contentPage();
    }

    @When("^I click on Cta Services$")
    public void iClickOnCtaServices() throws Throwable{
        inter.serviceBtn();
    }

    @Then("^Services dashboard is displayed$")
    public void servicesDashboardIsDisplayed() throws Throwable{
        inter.pagecontents();
    }

    @When("^I click on Cta Dashboard$")
    public void iClickOnCtaDashboard() {
        inter.dashbtn();
    }

    @Then("^The Dashboard page is displayed$")
    public void theDashboardPageIsDisplayed() throws Throwable{
        inter.casesTable();
    }

    @When("^I click on Cta MyRequests V$")
    public void iClickOnCtaMyRequestsV() {
        inter.requestLink();
    }

    @Then("^MyRequests V page is displayed$")
    public void myrequestsVPageIsDisplayed() throws Throwable{
        inter.casesLog();
    }

    @When("^I click on Cta Capita Connect V$")
    public void iClickOnCtaCapitaConnectV()throws Throwable {
        inter.connectNav();
    }

    @Then("^the Capita Connect V page is displayed$")
    public void theCapitaConnectVPageIsDisplayed()throws Throwable {
        inter.serviceLists();
    }

}
