package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.CsaUserViewPO;
import com.SELF.pageObject.WebLoginPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class CsaUserView_step extends TestRunner {
    CsaUserViewPO csa = new CsaUserViewPO(driver);
    WebLoginPO dash = new WebLoginPO(driver);


    @When("^I navigate to task in Dash environment \"([^\"]*)\"$")
    public void i_navigate_to_task_in_Dash_environment(String CsaUserViewURL) throws Throwable {
        csa.csaPage(CsaUserViewURL);
    }

    @And("^I login with valid WebLogin credentials$")
    public void iClickLogin() throws Throwable{
        Thread.sleep(2000);
        dash.DashLogin();
        Thread.sleep(2000);
    }

    @When("^I click Any CSA User$")
    public void iClickAnyCSAUser() throws Throwable{
        csa.anyCsaUser();
    }

    @And("^I click Continue$")
    public void iClickContinue()throws Throwable {
        csa.continueBtn();
    }

    @Then("^I click on cancel$")
    public void iClickOnCancel() throws Throwable{
        csa.cancelBtn();
    }

    @And("^I select Yes$")
    public void iSelectYes() throws Throwable{
        csa.abbort();
        driver.switchTo().alert().accept();
    }

    @When("^I clicks on Cta Dashboard$")
    public void iClicksOnCtaDashboard() throws Throwable{
        csa.dashboard();
    }

    @And("^I click on View$")
    public void iClickOnView() throws Throwable{
        csa.viewBtn();
    }



}
