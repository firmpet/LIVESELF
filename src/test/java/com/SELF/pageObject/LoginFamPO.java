package com.SELF.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFamPO {

    private WebDriver driver;

    //To initialise Web element
    public LoginFamPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Define element locator
    @FindBy(linkText = "Home")
    private WebElement CtaHome;

    @FindBy (xpath = "//*[text()='Take charge of your world!']")
    private WebElement Homepage;

    @FindBy (linkText = "MyRequests V3")
    private WebElement CtaMyRequest;

    @FindBy (xpath = "//*[text()='My Requests']")
    private WebElement RequestCase;



    public void homeBtn () {
        CtaHome.click();
    }
    public void dashboard(){
        Homepage.isDisplayed();
    }
    public void myRequestBtn(){
        driver.switchTo().defaultContent();
        CtaMyRequest.click();
    }
    public void requestCaseTables(){
        RequestCase.isDisplayed();
    }

}
