package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginFam_step extends TestRunner {
    TestAssert testAssert;

    public RemoteWebDriver driver = this.connection;

    @Before
    public void updateName(Scenario scenario) {
        driver.executeScript("lambda-name="+scenario.getName());
    }

    @And("^I click on Cta Home$")
    public void i_click_on_Cta_Home() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div/div/div[1]/a[2]")).click();
    }

    @Then("^Home page is displayed$")
    public void homePageIsDisplayed() throws Throwable{
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Take charge of your world!']")).isDisplayed();
    }

    @When("^I click Cta FAQs$")
    public void iClickCtaFAQs() {
        driver.findElement(By.linkText("FAQs")).click();
    }

    @Then("^FAQs dashboard is displayed$")
    public void faqsDashboardIsDisplayed() throws Throwable{
        Thread.sleep(1000);
        driver.findElement(By.xpath("//h2[text()='Frequently Asked Questions']")).isDisplayed();
    }

    @When("^I click Cta MyRequests V$")
    public void iClickCtaMyRequestsV() {
        driver.findElement(By.linkText("MyRequests V3")).click();
    }

    @Then("^MyRequest V page is displayed$")
    public void myrequestVPageIsDisplayed() throws Throwable{
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='My Requests']")).isDisplayed();
    }

    @After
    public void close_the_browser(Scenario scenario) {
        driver.executeScript("lambda-status=" + (scenario.isFailed() ? "failed" : "passed"));
        driver.quit();
    }
}
