package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.LoginFamPO;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginFam_step extends TestRunner {

    private LoginFamPO login = new LoginFamPO(driver);

    @When("^I click on Cta Home$")
    public void iClickOnCtaHome()  {
        login.homeBtn();
    }

    @Then("^Home page is displayed$")
    public void homePageIsDisplayed()  {
        login.dashboard();
    }

    @When("^I click Cta MyRequests V$")
    public void iClickCtaMyRequestsV()  {
        login.myRequestBtn();
    }

    @Then("^MyRequest V page is displayed$")
    public void myrequestVPageIsDisplayed()  {
        login.requestCaseTables();
    }
}
