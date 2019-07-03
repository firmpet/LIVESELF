package com.SELF.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PKC_LoginPO {
    private WebDriver driver;

    //To initialise Web element
    public PKC_LoginPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //To initialise Web locators
    @FindBy (xpath = "//*[@id='PKCRegisterbtn']/a[2]")
    private WebElement SignInBtn;

    @FindBy (xpath = "//*[@id='username']")
    private WebElement Username;

    @FindBy (xpath = "//*[@id='password']")
    private WebElement Password;

    @FindBy (xpath = "//*[@id='LoginBtnDiv']/button")
    private WebElement LogIn;


    //sign in
    public void SignIn() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(SignInBtn));
        SignInBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(Username));
        Username.sendKeys("support+govscot@firmstep.com");
        wait.until(ExpectedConditions.elementToBeClickable(Password));
        Password.sendKeys("bws_supp0rt");
        wait.until(ExpectedConditions.elementToBeClickable(LogIn));
        LogIn.click();
    }



}
