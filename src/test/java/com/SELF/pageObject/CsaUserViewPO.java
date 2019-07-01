package com.SELF.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.NavigableMap;
import java.util.ResourceBundle;

public class CsaUserViewPO {
    ResourceBundle config;
    private WebDriver driver;

    //To initialised Web element
    public CsaUserViewPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
        config= ResourceBundle.getBundle("ConFig");
    }

    //To initialised element locators
    @FindBy (linkText = "Any CSA User")
    private WebElement CsaUser;

    @FindBy (css = "tr:nth-child(1) > .hidden-xs > .my-edit-task")
    private WebElement CtaContinue;

    @FindBy (xpath = "//*[text()='Cancel']")
    private WebElement CtaCancel;

    @FindBy (xpath = "//button[@type='button'][2]")
    private WebElement NavigateAwayBtn;

    @FindBy (linkText = "Dashboard")
    private WebElement CtaDashboard;

    @FindBy (css = "tr:nth-child(1) > .hidden-xs > .my-view-task")
    private WebElement CtaView;



    public void csaPage(String CsaUserViewURL)throws Throwable{
        driver.navigate().to(config.getString("CsaUserViewURL"));
    }
    public void anyCsaUser()throws Throwable{
        Thread.sleep(1000);
        driver.switchTo().frame(driver.findElement(By.id("CommonDashboard")));
        Thread.sleep(2000);
        CsaUser.click();
        Thread.sleep(2000);
    }
    public void continueBtn()throws Throwable{
        Thread.sleep(1000);
        CtaContinue.click();
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
    }
    public void cancelBtn()throws Throwable{
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        Thread.sleep(2000);
        CtaCancel.click();
        Thread.sleep(1000);
    }
    public void abbort()throws Throwable{
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
        NavigateAwayBtn.click();
        Thread.sleep(1000);
    }
    public void dashboard()throws Throwable{
        Thread.sleep(2000);
        CtaDashboard.click();
        Thread.sleep(2000);
    }
    public void viewBtn()throws Throwable{
        Thread.sleep(2000);
        CtaView.click();
        Thread.sleep(2000);
    }



}
