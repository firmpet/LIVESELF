package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.RequestDateCheckPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;

public class RequestDateCheck_step extends TestRunner {

    private RequestDateCheckPO dateCheck = new RequestDateCheckPO(driver);
    TestAssert testAssert;

    @And("^I navigate to request Date check \"([^\"]*)\"$")
    public void iNavigateToRequestDateCheck(String DateURL) throws Throwable {
        //Thread.sleep(3000);
        dateCheck.requestDateCheck(DateURL);
    }

    @When("^I enter text field$")
    public void iEnterTextField() throws Throwable{
        //Thread.sleep(2000);
        dateCheck.inputText();
    }

    @And("^I clicked Cta Submit$")
    public void iClickedCtaSubmit()throws Throwable   {
        dateCheck.submitBtnn();
    }

    @Then("^Reference and submission successful message is displayed$")
    public void referenceAndSubmissionSuccessfulMessageIsDisplayed() throws Throwable {
        Thread.sleep(2000);
        Assert.assertTrue(testAssert.validateElementExistByXpath(driver, "//p[text()='Thank you for submitting Myrequests date check']"));
//        String text = driver.findElement(By.xpath("//p[text()='Thank you for submitting Myrequests date check']")).getText();
//        assertTrue(text.contains("Thank you for submitting Myrequests date check"));
    }

    @When("^I click Cta Continue$")
    public void iClickCtaContinue() throws Throwable {
        dateCheck.continueBtnn();
    }

    @Then("^Survey page is displayed$")
    public void surveyPageIsDisplayed() throws Throwable{
        //Thread.sleep(2000);
        String text = driver.findElement(By.xpath("//*[text()='How would you rate your experience today?']")).getText();
        assertTrue(text.contains("How would you rate your experience today?"));
    }

    @When("^I click top nav MyRequests VThree$")
    public void iClickTopNavMyRequestsVThree() throws Throwable {
        dateCheck.myRequestV3Link();
        //Thread.sleep(2000);
    }

    @And("^Request data page is displayed$")
    public void requestDataPageIsDisplayed() throws Throwable{
        //Assert.assertFalse(testAssert.validateElementExistByXpath(driver, "//table[@id='MyRequestTable']"));
        dateCheck.requestTable();
        //Thread.sleep(2000);
    }

    @And("^I clicked Case number column$")
    public void iClickedCaseNumberColumn() throws Throwable {
        //Thread.sleep(2000);
        dateCheck.numberColumn();
    }

    @Then("^The result is displayed$")
    public void theResultIsDisplayed() throws Throwable{
       // Thread.sleep(1000);
        dateCheck.requestDataPage();
    }


}
