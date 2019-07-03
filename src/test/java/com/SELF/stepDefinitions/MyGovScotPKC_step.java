package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.MyGovScotPKCPO;
import com.SELF.pageObject.PKC_LoginPO;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyGovScotPKC_step extends TestRunner {
    MyGovScotPKCPO pkc = new MyGovScotPKCPO(driver);
    PKC_LoginPO log = new PKC_LoginPO(driver);


    @When("^I navigate to Perth and Kinross Council page \"([^\"]*)\"$")
    public void iNavigateToPerthAndKinrossCouncilPage(String PerthKinrossCouncil) throws Throwable {
        pkc.perth_Kinross(PerthKinrossCouncil);
    }

    @And("^I sign in to the account$")
    public void iSignInToTheAccount() {
        log.SignIn();
    }

    @Then("^the account is displayed$")
    public void theAccountIsDisplayed()throws Throwable {
        pkc.lightingPost();
    }


}
