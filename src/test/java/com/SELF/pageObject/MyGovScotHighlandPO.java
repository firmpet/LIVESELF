package com.SELF.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ResourceBundle;

public class MyGovScotHighlandPO {
    ResourceBundle config;
    private WebDriver driver;

    //To initialise Web element
        public MyGovScotHighlandPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
        config= ResourceBundle.getBundle("ConFig");
    }

    //To initialise Web locators
    @FindBy (xpath = "//*[@id='self-content']/p[2]/a[2]/img")
    private WebElement SignInPortal;

    @FindBy (xpath = "//*[@id='username']")
    private WebElement Username;

    @FindBy (xpath = "//*[@id='password']")
    private WebElement Password;

    @FindBy (xpath = "//*[@id='LoginBtnDiv']/button")
    private WebElement LogIn;





    public void highlandCouncil(String HighlandCouncil)throws Throwable{
            Thread.sleep(2000);
            driver.navigate().to(config.getString("HighlandCouncil"));
            Thread.sleep(2000);
    }
    public void ctaSign()throws Throwable{
        Thread.sleep(1000);
        SignInPortal.click();
        Thread.sleep(1000);
    }
    public void ctaUsername()throws Throwable{
        Thread.sleep(1000);
        Username.sendKeys("support+govscot@firmstep.com");
        Thread.sleep(1000);
    }
    public void ctaPassword()throws Throwable{
        Thread.sleep(1000);
        Password.sendKeys("bws_supp0rt");
        Thread.sleep(1000);
    }
    public void ctaLogin()throws Throwable{
        Thread.sleep(2000);
        LogIn.click();
        Thread.sleep(2000);
    }

}
