package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.PhoneTeamRaisePO;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class PhoneTeamRaise_step extends TestRunner {
    TestAssert testAssert;
    private PhoneTeamRaisePO phone = new PhoneTeamRaisePO(driver);


    @When("^I navigate to \"([^\"]*)\" to access CSA Select Workspace$")
    public void iNavigateToToAccessCSASelectWorkspace(String PhoneURL) throws Throwable {
        phone.csaSelectWorkspace(PhoneURL);
    }

    @Then("^I select Phone Team modal$")
    public void iSelectPhoneTeamModal() throws Throwable{
        phone.phoneCase();
    }


    @When("^I enter test in search field$")
    public void iEnterTestInSearchField() throws Throwable{
        phone.textField();
    }

    @And("^I click Search button$")
    public void iClickSearchButton() throws Throwable{
        phone.searchBtn();
    }

    @Then("^I click Raise Case button$")
    public void iClickRaiseCaseButton() throws Throwable{
        phone.addRaiseCase();
    }

    @When("^I select Service Release Testing$")
    public void iSelectServiceReleaseTesting() throws Throwable{
        phone.releaseTesting();
    }

    @And("^I select Reason Release Testing$")
    public void iSelectReasonReleaseTesting()throws Throwable {
        phone.reasonField();
    }

    @And("^I select Type Calculations$")
    public void iSelectTypeCalculations() throws Throwable{
        phone.calculation();
    }

    @Then("^I select Cta Select$")
    public void iSelectCtaSelect()throws Throwable {
        phone.select();
    }

    @When("^I enter texts in the field$")
    public void iEnterInTheField() throws Throwable {
        phone.texts();
    }

    @And("^I select Next$")
    public void iSelectNext() throws Throwable{
        phone.next();
    }

    @And("^I select Yes in the three dropdown fields$")
    public void iSelectYesInTheThreeDropdownFields() throws Throwable{
        phone.treeOption();
        phone.benchOption();
        phone.lampOption();
    }

    @And("^I click Add Record$")
    public void iClickAddRecord()throws Throwable {
        phone.amount();
    }

    @And("^I select Submit$")
    public void iSelectSubmit() throws Throwable{
        phone.submit();
    }

}
