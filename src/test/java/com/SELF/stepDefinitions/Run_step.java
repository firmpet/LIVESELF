package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Run_step extends TestRunner {
    TestAssert testAssert;

    public RemoteWebDriver driver = this.connection;

    @Before
    public void updateName(Scenario scenario) {
        driver.executeScript("lambda-name=" + scenario.getName());
    }

    @When("^user click cta Contact us$")
    public void user_click_cta_Contact_us() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"dexp-dropdown\"]/ul/li[5]/a")).click();

    }

    @Then("^the page is displaying$")
    public void the_page_is_displaying() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Contact us']")).isDisplayed();
        Thread.sleep(1000);
    }

}
