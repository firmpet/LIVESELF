package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.DateFieldPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class DateField_step extends TestRunner {

    private DateFieldPO date = new DateFieldPO(driver);
    private TestAssert testAssert;

    @When("^I click on Cta Date Fields Manual Test$")
    public void iClickOnCtaDateFieldsManualTest() throws Throwable{
        date.dateFieldLink();
    }

    @Then("^Date Fields Manual Test Form page is displayed$")
    public void dateFieldsManualTestFormPageIsDisplayed()throws Throwable{
        date.dashboard();
        //Assert.assertFalse(testAssert.validateElementExistByXpath(driver, "//*[text()='Date Fields Manual Test Form']"));
    }

    @When("^I enter date From, date To and time in the fields$")
    public void iEnterDateFromDateToAndTimeInTheFields() throws Throwable {
        date.dateField();
        date.dateField1();
        date.timeField();

        Thread.sleep(4000);
    }

    @And("^I click Cta submit$")
    public void iClickCtaSubmit()  {
        date.submitBtn();
    }

    @Then("^Submission page should displayed with submitted data$")
    public void submissionPageShouldDisplayedWithSubmittedData()throws Throwable {
        date.submit();
        Assert.assertTrue(testAssert.validateElementExistByXpath(driver, "//*[@id='page']/section/section/div/div[1]/p[2]"));
    }
}
