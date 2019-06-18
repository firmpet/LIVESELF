package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.StageLoopBackPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;

public class StageLoopBack_step extends TestRunner {

    private StageLoopBackPO loopBack = new StageLoopBackPO(driver);
    private TestAssert testAssert;


    @When("^I navigate to Stage \"([^\"]*)\"$")
    public void iNavigateToStage(String LoopbackURL)throws Throwable {
        loopBack.stageLoop(LoopbackURL);
    }

    @Then("^SELF TEST - Loopback page is displayed$")
    public void selfTESTLoopbackPageIsDisplayed() {
        String text = driver.findElement(By.xpath("//*[text()='[SELF TEST] - Loopback (1)']")).getText();
        assertTrue(text.contains("[SELF TEST] - Loopback (1)"));
    }

    @Then("^Displayed Reference Page$")
    public void referencePageIsDisplayed() throws Throwable{
         Thread.sleep(2000);
        Assert.assertTrue(testAssert.validateElementExistByXpath(driver, "//p[text()='Thank you for submitting [SELF TEST] - Loopback (1)']"));
//        String text = driver.findElement(By.xpath("//p[text()='Thank you for submitting [SELF TEST] - Loopback (1)']")).getText();
//        assertTrue(text.contains("Thank you for submitting [SELF TEST] - Loopback (1)"));
    }

    @And("^I click current Stage two$")
    public void iClickOnCurrentStageTwo() throws Throwable{
        loopBack.requestV3();
    }

    @Then("^click on Cta Continue$")
    public void clickOnCtaContinue() {
        loopBack.ctaContinue();
    }

    @When("^I clicks No radio button$")
    public void iClickNoRadioButton() throws Throwable{
        loopBack.selectOption();
    }

    @And("^click Submit Cta$")
    public void clickSubmitCta() {
        loopBack.submit();
    }

    @Then("^Submit reference page is displayed$")
    public void submission_reference_page_is_displayed() throws Throwable {
        loopBack.referencePage();
    }


}
