package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.RunCheckPO;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import java.util.Set;

public class RunCheck_step extends TestRunner {
    private RunCheckPO sample = new RunCheckPO(driver);

    @Given("^I go to \"([^\"]*)\"$")
    public void iGoTo(String RunCheckURL) throws Throwable {
        sample.CheckPages(RunCheckURL);
    }

    @Then("^I look for Integration run check$")
    public void iLookForIntegrationRunCheck() throws Throwable {
        sample.inputField();
        sample.ctaIntegration();
    }

    @When("^I click on Cta Filll$")
    public void iClickOnCtaFilll() throws Throwable {
        sample.ctaFill();
    }

    @Then("^I click on Submitt$")
    public void iClickOnSubmitt() throws Throwable {
        String copiedText = driver.findElement(By.xpath("//*[@id='ID']")).getAttribute("value").toString();

        System.out.println(copiedText);

        Thread.sleep(4000);

        sample.ctaSubmit();
        Thread.sleep(4000);

        sample.ctaViewData();
        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[@id='DataTables_Table_1_filter']/label/input")).sendKeys(copiedText);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[@class='submission-action']")).click();
        Thread.sleep(3000);

        //Stage 3
        driver.findElement(By.xpath("//td[text()='Stage 3']//parent::*/td[@class='submission sorting_3']/div[@class='submission-file']/span[@class='submission-action']")).click();
        Thread.sleep(3000);

        sample.ctaSubmit();
        Thread.sleep(4000);

        driver.findElement(By.xpath("/html/body/div[2]/form[1]/div[3]/div/input")).sendKeys("QA TESTER");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@name='card_no']")).sendKeys("1111222233334444");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@name='expiry_date']")).sendKeys("12/19");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@name='card_security']")).sendKeys("201");
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[2]/form[1]/input[2]")).click();
        Thread.sleep(4000);

        sample.ctaViewData();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(copiedText);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[@class='submission-action']")).click();
        Thread.sleep(3000);

        //Stage 2
        driver.findElement(By.xpath("//td[text()='Stage 2']//parent::*/td[@class='submission sorting_3']/div[@class='submission-file']/span[@class='submission-action']")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("Test1")).sendKeys("Yes");
        Thread.sleep(3000);

        driver.findElement(By.id("Test3")).sendKeys("Yes");
        Thread.sleep(3000);

        driver.findElement(By.id("Test4")).sendKeys("Yes");
        Thread.sleep(3000);

        driver.findElement(By.id("Test5")).sendKeys("Yes");
        Thread.sleep(3000);

        sample.ctaSubmit();
        Thread.sleep(3000);

        sample.ctaViewData();
        Thread.sleep(3000);

        //Stage 3
        driver.findElement(By.xpath("//*[@id='DataTables_Table_2_filter']/label/input")).sendKeys(copiedText);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[@class='submission-action']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[text()='Next Task']")).click();
        Thread.sleep(3000);

        sample.ctaSubmit();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[2]/form[1]/div[3]/div/input")).sendKeys("QA TESTER");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@name='card_no']")).sendKeys("1111222233334444");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@name='expiry_date']")).sendKeys("12/19");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@name='card_security']")).sendKeys("201");
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[2]/form[1]/input[2]")).click();
        Thread.sleep(4000);

        //Navigate to Integration Manager
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='page']/div/nav[1]/div[2]/ul/li/a")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[@class='link_integrations']")).click();
        Thread.sleep(3000);

        //store parent window value in string
        String parentWindow = driver.getWindowHandle();

        //store the set of all windows
        Set<String> allwindows= driver.getWindowHandles();

        for (String childWindow : allwindows) {
            if(!childWindow.equals(parentWindow))
            {
                driver.switchTo().window(childWindow);
                driver.manage().window().maximize();
            }
        }

        Thread.sleep(1000);

        driver.findElement(By.id("link_logs")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='maintable-list_filter']/label/input")).sendKeys(copiedText);
        Thread.sleep(3000);













        }


    }
