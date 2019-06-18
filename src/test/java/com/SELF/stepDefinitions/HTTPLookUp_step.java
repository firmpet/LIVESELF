package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.HTTPLookUpPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

public class HTTPLookUp_step extends TestRunner {

    private HTTPLookUpPO http = new HTTPLookUpPO(driver);


    @When("^I click on Cta HTTP Examples and Testing$")
    public void iClickOnCtaHTTPExamplesAndTesting() throws Throwable {
        http.httpTesting();
    }

    @Then("^HTTP Testing and Example page is displayed$")
    public void httpTestingAndExamplePageIsDisplayed()throws Throwable {
        http.testingPage();
    }

    @When("^I click Cta LookUp in HTTP Get No Token column$")
    public void iClickCtaLookUpInHTTPGetNoTokenColumn() {
        http.lookUpBtn();
    }

    @And("^click Next btn$")
    public void clickNextBtn() {
        http.nextBtn();
    }

    @Then("^I enter Breedname in the field$")
    public void iEnterBreednameInTheField() throws Throwable{
        http.clearField();
        http.insertname();
    }

    @And("^I click Cta LookUp$")
    public void iClickCtaLookUp() {
        http.lookUpbtn();
    }

    @And("^click Next$")
    public void clickNext() {
        http.nextcta();
    }

    @Then("^I click Cta LookUp to fill up the fields$")
    public void iClickCtaLookUpToFillUpTheFields() throws Throwable {
        Thread.sleep(3000);
        http.fillForm();
    }

    @And("^I click on Cta Submit$")
    public void iClickOnCtaSubmit() throws Throwable{

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,500)", "");

        Thread.sleep(3000);
        http.submitLink();
    }

    @Then("^Successful submission page is displayed with reference$")
    public void successfulSubmissionPageIsDisplayedWithReference()throws Throwable {
        http.submitInfo();
    }
}
