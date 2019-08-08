package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.MyGovScotHighlandPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyGovScotHighland_step extends TestRunner {
    MyGovScotHighlandPO highland = new MyGovScotHighlandPO(driver);



    @When("^I navigate to Highland Council page \"([^\"]*)\"$")
    public void i_navigate_to_Highland_Council_page(String HighlandCouncil) throws Throwable {
        highland.highlandCouncil(HighlandCouncil);
    }

    @Then("^I click cta Sign in with mygovscot$")
    public void iClickCtaSignInWithMygovscot() throws Throwable{
        highland.ctaSign();
    }

    @When("^I enter username$")
    public void iEnterUsername()throws Throwable {
        highland.ctaUsername();
    }

    @And("^I enter password$")
    public void iEnterPassword() throws Throwable{
        highland.ctaPassword();
    }

    @Then("^click log in button$")
    public void clickLogInButton() throws Throwable{
        highland.ctaLogin();
    }
}
