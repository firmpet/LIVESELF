package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.CapitaSSO_WirralPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CapitaSSO_Wirral_step extends TestRunner {
    CapitaSSO_WirralPO sso = new CapitaSSO_WirralPO(driver);


    @When("^I click on Capita Connect V")
    public void iClickOnCapitaConnectV() throws Throwable{
        sso.capitaConnectBtn();
    }  
    
    @And("^I click on MyServices Dashboard$")
    public void iClickOnMyServicesDashboard()throws Throwable {
        sso.ctaMyServices();
    }

    @When("^I click on Cta Add Service$")
    public void iClickOnCtaAddService() throws Throwable{
        sso.ctaAddServices();
    }

    @And("^I click Add on Council Tax tab$")
    public void iClickAddOnCouncilTaxTab() throws Throwable{
        sso.ctaAddCouncilTax();
    }

    @And("^I click Add on Business Rate tab$")
    public void iClickAddOnBusinessRateTab()throws Throwable {
        sso.ctaAddBusinessRates();
    }

    @Then("^I click Confirm button$")
    public void iClickConfirmButton() throws Throwable{
        sso.confirm();
    }

    @And("^I click remove Council Tax$")
    public void iClickRemoveCouncilTax()throws Throwable {
        sso.councilTaxAccount();
    }

    @And("^I click remove Business Rate$")
    public void iClickRemoveBusinessRate() throws Throwable{
        sso.businessRatesAccount();
    }
}
