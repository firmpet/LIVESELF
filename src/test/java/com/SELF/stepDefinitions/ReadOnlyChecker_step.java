package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.ReadOnlyCheckerPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReadOnlyChecker_step extends TestRunner {
    private ReadOnlyCheckerPO read = new ReadOnlyCheckerPO(driver);


    @When("^I navigate to \"([^\"]*)\"$")
    public void i_navigate_to(String ReadOnlyCheckerURL) throws Throwable {
        read.checkerPage(ReadOnlyCheckerURL);
    }

    @Then("^Click Next$")
    public void clickNext() throws Throwable{
        read.ctaNext();
    }

    @When("^I enter test$")
    public void iEnterTest() throws Throwable{
        read.linputField();
    }

    @When("^I enter testing in fieldone$")
    public void iEnterTestingInFieldone() throws Throwable{
        read.field1();
    }

    @And("^I enter testing in fieldtwo$")
    public void iEnterTestingInFieldtwo() throws Throwable{
        read.field2();
    }

    @And("^I enter pin number in fieldthree$")
    public void iEnterPinNumberInFieldthree()throws Throwable {
        read.pin();
    }

    @And("^I enter Yes in fieldfour$")
    public void iEnterYesInFieldfour() throws Throwable{
        read.fieldSelection();
    }

    @And("^I select yes in fieldfive$")
    public void iSelectYesInFieldfive() throws Throwable{
        read.checkbox();
    }

    @And("^I select Yes radio button in fieldsix$")
    public void iSelectYesRadioButtonInFieldsix() throws Throwable{
        read.radioButton();
    }

    @And("^I enter figure in fieldseven$")
    public void iEnterFigureInFieldseven() throws Throwable{
        read.enterNumber();
    }

    @And("^I select date$")
    public void iSelectDate()throws Throwable {
        read.enterDate();
    }

    @And("^I select time$")
    public void iSelectTime()throws Throwable {
        read.enterTime();
    }

    @And("^I enter dateTime$")
    public void iEnterDateTime() throws Throwable{
        read.dateAndTime();
    }



}
