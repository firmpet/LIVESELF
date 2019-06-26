package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.CaseViewPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class CaseView_step extends TestRunner {

    private CaseViewPO caseV = new CaseViewPO(driver);
    TestAssert testAssert;

    @When("^I navigate to Case View \"([^\"]*)\"$")
    public void iNavigateToCaseView(String URLpage) throws Throwable {
        caseV.caseViewPage(URLpage);
    }

    @Then("^Case View should displayed$")
    public void caseViewShouldDisplayed()throws Throwable {
        caseV.casePage();
    }

    @When("^I enter credentials in the fields$")
    public void iEnterCredentialsInTheFields() throws Throwable{
        caseV.caseName();
        caseV.numbers();

        //Upload File from C drive
        driver.findElement(By.className("resumable-browse-file")).sendKeys("C:\\Users\\Joshua Ayoade\\Pictures\\IP ss.PNG");
        //Thread.sleep(2000);
        //driver.findElement(By.className("upload-button")).click();
    }

    @When("^I click Cta MyRequests VThree$")
    public void iClickCtaMyRequestsVThree() throws Throwable{
        caseV.requestV3Link();
    }

    @And("^Searched for reference$")
    public void searchedForReference() throws Throwable{
        caseV.refTable();
    }

    @And("^click Cta Continue$")
    public void clickCtaContinue()throws Throwable {
        caseV.continueBtn();
    }

    @Then("^Case view page is displayed$")
    public void caseViewPageIsDisplayed()throws Throwable {
        caseV.caseView();
    }

    @When("^I enter new credentials in the fields$")
    public void iEnterNewCredentialsInTheFields() throws Throwable {
        caseV.textField();
        caseV.numberField();

        //Upload File from C drive
        driver.findElement(By.className("resumable-browse-file")).sendKeys("C:\\Users\\Joshua Ayoade\\Pictures\\IP ss.PNG");
        //Thread.sleep(1000);
    }

    @Then("^Submission reference page is displayed$")
    public void submissionReferencePageIsDisplayed() {
        Assert.assertFalse(testAssert.validateElementExistByXpath(driver, "//*[@id='current-tasks']/div/div[1]/h4"));
    }

    @When("^I click Cta Dashboard$")
    public void iClickCtaDashboard() throws Throwable{
        driver.navigate().to("https://releasetesting-self.achieveservice.com/CommonDashboard");

        Thread.sleep(2000);
    }

    @And("^Searched for case reference$")
    public void searchedForCaseReference() throws Throwable{
        caseV.searchField();
        caseV.nextStage();
    }

    @Then("^I clicks Cta Continue$")
    public void iClicksCtaContinue() throws Throwable{
        caseV.continues();
    }

    @When("^I entered credentials in the fields$")
    public void iEnteredCredentialsInTheFields() throws Throwable {
        Thread.sleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,5000)", "");

        caseV.inputText();
        caseV.inputNumber();

        //Upload File from C drive
        driver.findElement(By.className("resumable-browse-file")).sendKeys("C:\\Users\\Joshua Ayoade\\Pictures\\IP ss.PNG");
    }

    @Then("^results page is displayed with stages number$")
    public void resultsPageIsDisplayedWithStagesNumber() {
        Assert.assertFalse(testAssert.validateElementExistByXpath(driver, "//*[@id='heading3']/p"));

    }

}
