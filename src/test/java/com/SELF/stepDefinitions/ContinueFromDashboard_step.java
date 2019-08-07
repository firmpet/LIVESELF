package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.ContinueFromDashboardPO;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class ContinueFromDashboard_step extends TestRunner {
    ContinueFromDashboardPO cfd = new ContinueFromDashboardPO(driver);

    @Given("^I launch \"([^\"]*)\"$")
    public void iLaunch(String DashPage) throws Throwable {
        cfd.dashPage(DashPage);
    }

    @When("^I navigate to dash \"([^\"]*)\"$")
    public void i_navigate_to_dash(String ContinueFromDashboard) throws Throwable {
        cfd.continueFromDashboard(ContinueFromDashboard);
    }

    @Then("^click Submit$")
    public void clickSubmit() throws Throwable{
        Thread.sleep(1000);

        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        Thread.sleep(2000);

        String caseNumber = driver.findElement(By.xpath("//*[@id='text1']")).getAttribute("value").toString();
        Thread.sleep(2000);

        System.out.println(caseNumber);
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id='AF-Form-44914046-5c8f-490e-a55c-5451c2f98513']/div/div/button[2]")).click();
        Thread.sleep(2000);

        driver.switchTo().defaultContent();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id='navigation']/div/div/div[1]/a[2]")).click();
        Thread.sleep(2000);

        driver.switchTo().frame(driver.findElement(By.id("CommonDashboard")));
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='dashNewSubTabs']/li[3]/a")).click();
        Thread.sleep(8000);

        driver.findElement(By.xpath("//*[@id='AllCases']/div[1]/div[2]/div/input")).sendKeys(caseNumber);
        Thread.sleep(7000);

        driver.findElement(By.xpath("//*[@id='AllCases']/table/tbody/tr[1]/td[11]/button[2]")).click();
        Thread.sleep(2000);

        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='AF-Form-c334d925-1fbb-42cf-82c0-c9a639603662']/div/div/button[2]")).click();
        Thread.sleep(2000);
    }



}
