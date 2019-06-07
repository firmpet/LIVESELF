package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;


public class EscalationForm_step extends TestRunner {
    TestAssert testAssert;

    public RemoteWebDriver driver = this.connection;

    @Before
    public void updateName(Scenario scenario) {
        driver.executeScript("lambda-name="+scenario.getName());
    }

    @Given("^user is on home page$")
    public void user_is_on_home_page() throws Throwable {
        driver.get("https://releasetesting-self.achieveservice.com");
        Thread.sleep(2000);
    }

    @When("^I login with valid credentials$")
    public void iLoginWithValidCredentials() throws Throwable{
        driver.findElement(By.xpath("//*[text()='Login']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[5]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("username")).sendKeys("joshuaayoade@firmstep.com");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("....");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div/div/form/fieldset/div[3]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Services")).click();
        Thread.sleep(1000);
    }

    @And("^I click on Cta Escalation Test Process$")
    public void iClickOnCtaEscalationTestProcess() throws Throwable{
        driver.switchTo().frame(driver.findElement(By.id("MyServices")));
        Thread.sleep(1000);
        driver.findElement(By.linkText("Escalation Test Process 23022018")).click();
    }

    @Then("^Escalation Form One is displayed$")
    public void escalationFormOneIsDisplayed() {
        Assert.assertFalse(testAssert.validateElementExistByXpath(driver, "//*[text()='Escalation Form One']"));
    }

    @When("^I entered Testing in the Text field$")
    public void iEnteredTestingInTheTextField() {

    }

    @And("^I click Cta Submit$")
    public void iClickCtaSubmit() {

    }

    @Then("^Submission successful page is displayed$")
    public void submissionSuccessfulPageIsDisplayed() {

    }

    @When("^I click on Cta MyRequests VThree$")
    public void iClickOnCtaMyRequestsVThree() {

    }

    @Then("^My Request page is displayed with Data logs$")
    public void myRequestPageIsDisplayedWithDataLogs() {

    }

    @And("^I enter Case ID in the Search field$")
    public void iEnterCaseIDInTheSearchField() {

    }

    @Then("^The case log info is display with stages indicated$")
    public void theCaseLogInfoIsDisplayWithStagesIndicated() {
    }

    @After
    public void close_the_browser(Scenario scenario) {
        driver.executeScript("lambda-status=" + (scenario.isFailed() ? "failed" : "passed"));
        driver.quit();
    }
}
