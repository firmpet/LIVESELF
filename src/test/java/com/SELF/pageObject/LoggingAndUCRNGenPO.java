package com.SELF.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ResourceBundle;

public class LoggingAndUCRNGenPO {
    ResourceBundle config;
    private WebDriver driver;

    //To initialise Web Element
    public LoggingAndUCRNGenPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
        config= ResourceBundle.getBundle("ConFig");
    }


    //To initialise Element locators
    @FindBy (id = "edit-name")
    private WebElement Username;

    @FindBy (id = "edit-pass")
    private WebElement Password;

    @FindBy (id = "edit-submit")
    private WebElement LogIn;

    @FindBy (xpath = "/html/body/div[1]/div/section/ul[2]/li/a")
    private WebElement AddUser;





    public void startingPage(String LogOut)throws Throwable{
        Thread.sleep(1000);
        driver.navigate().to(config.getString("LogOut"));
        Thread.sleep(1000);
    }
    public void autoTestPage(String AutoTestURL)throws Throwable{
        driver.navigate().to(config.getString("AutoTestURL"));
        Thread.sleep(1000);
    }
    public void usernameField()throws Throwable{
        Thread.sleep(1000);
        Username.sendKeys("support@firmstep.com");
        Thread.sleep(2000);
    }
    public void passwordField()throws Throwable{
        Password.sendKeys("bws_supp0rt");
        Thread.sleep(2000);
    }
    public void ctaLogIn()throws Throwable{
        LogIn.click();
        Thread.sleep(2000);
    }
    public void adminPage(String AdminPeople)throws Throwable{
        Thread.sleep(2000);
        driver.navigate().to(config.getString("AdminPeople"));
        Thread.sleep(2000);
    }
    public void ctaAddUser()throws Throwable{
        Thread.sleep(1000);
        AddUser.click();
        Thread.sleep(2000);
    }


}
