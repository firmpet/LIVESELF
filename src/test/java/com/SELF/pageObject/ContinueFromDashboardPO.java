package com.SELF.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ResourceBundle;

public class ContinueFromDashboardPO {
    ResourceBundle config;
    private WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor)driver;

    //To initialise Web element
    public ContinueFromDashboardPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
        config= ResourceBundle.getBundle("ConFig");
    }

    //To initialise Element locator
    @FindBy (xpath = "//*[@id='AF-Form-44914046-5c8f-490e-a55c-5451c2f98513']/div/div/button[2]")
    private WebElement CtaSubmit;

    @FindBy (xpath = "//*[@id='navigation']/div/div/div[1]/a[2]")
    private WebElement CtaDashboard;

    @FindBy (xpath = "//*[@id='dashNewSubTabs']/li[3]/a")
    private WebElement CtaAllCases;

    @FindBy (xpath = "//option[@value='Stage 2']")
    private WebElement Stage2;

    @FindBy (xpath = "//*[@id='next']")
    private WebElement CtaNext;

    @FindBy (xpath = "//*[text()='Continue from Dashboard']")
    private WebElement Service;



    public void dashPage(String DashPage)throws Throwable{
        driver.navigate().to(config.getString("DashPage"));
        Thread.sleep(2000);
        driver.findElement(By.id("loginLink")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[3]/a")).click();
    }
    public void continueFromDashboard(String ContinueFromDashboard)throws Throwable{
        Thread.sleep(2000);
        driver.navigate().to(config.getString("ContinueFromDashboard"));
        Thread.sleep(2000);
    }
    public void submit()throws Throwable{
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        Thread.sleep(2000);
        CtaSubmit.click();
        Thread.sleep(2000);
    }
    public void dashboard()throws Throwable{
        driver.findElement(By.xpath("//*[@id='page']/section/section/div/div[1]/p[4]/span")).getText();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        CtaDashboard.click();
        Thread.sleep(2000);
    }
    public void allCases()throws Throwable{
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.id("CommonDashboard")));
        Thread.sleep(3000);
        CtaAllCases.click();
        Thread.sleep(3000);
    }
    public void ctaStage2()throws Throwable{
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='AllCases']/div[1]/div[1]/select[3]")).click();
        Thread.sleep(2000);
        Stage2.click();
        Thread.sleep(3000);
    }
    public void next()throws Throwable{
        Thread.sleep(3000);
        ((JavascriptExecutor) driver).executeScript("scroll(0,1000)");
        Thread.sleep(5000);
        CtaNext.click();
        Thread.sleep(10000);
    }
    public void caseRef()throws Throwable{
        Thread.sleep(2000);
        Service.click();
        Thread.sleep(2000);
    }



}
