package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test_step extends TestRunner {
    TestAssert testAssert;

    public RemoteWebDriver driver = this.connection;

    @Before
    public void updateName(Scenario scenario) {
        driver.executeScript("lambda-name="+scenario.getName());
    }


    @Given("^user is on homepage$")
    public void user_is_on_homepage() throws Throwable {
        Thread.sleep(1000);
        driver.get("http://firmstep.com/");
        Thread.sleep(1000);
    }

    @When("^user click cta News$")
    public void user_click_cta_about_us() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='News']")).click();
        Thread.sleep(1000);
    }

    @Then("^the page is displayed$")
    public void the_page_is_displayed() throws Throwable {
        Thread.sleep(2000);
         driver.findElement(By.xpath("//*[text()='Latest News From Firmstep']")).isDisplayed();
        Thread.sleep(1000);
    }
}
