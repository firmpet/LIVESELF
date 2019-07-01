package com.SELF.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebLoginPO {


    private WebDriver driver;

    //To initiate web elements
    public WebLoginPO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Define element locator
    @FindBy(id = "loginLink")
    private WebElement loginLink;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[4]/a")
    private WebElement trfButton;

    @FindBy(xpath = "//input[@name='username']")
    private WebElement Username;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement Password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement SignIn;


    //Define element locator
//    @FindBy(id = "loginLink")
//    private WebElement loginLink;
//
//    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[3]/a")
//    private WebElement trfButton;




    //sign in
    public void DashLogin() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(loginLink));
        loginLink.click();
        wait.until(ExpectedConditions.elementToBeClickable(trfButton));
        trfButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(Username));
        Username.sendKeys("releasetesting+anycsauser@firmstep.com");
        wait.until(ExpectedConditions.elementToBeClickable(Password));
        Password.sendKeys("bws_supp0rt");
        wait.until(ExpectedConditions.elementToBeClickable(SignIn));
        SignIn.click();
    }
}
