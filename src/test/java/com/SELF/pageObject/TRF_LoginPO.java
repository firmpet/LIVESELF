package com.SELF.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TRF_LoginPO {

    private WebDriver driver;

    //To initiate web elements
    public TRF_LoginPO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Define element locator
    @FindBy(id = "loginLink")
    private WebElement loginLink;

    @FindBy(xpath = "/html/body/div/div/div/div/div[4]/a")
    private WebElement trfButton;

    @FindBy(linkText = "Services")
    private WebElement servicesButton;

    //sign in
    public void Login() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(loginLink));
        loginLink.click();
        wait.until(ExpectedConditions.elementToBeClickable(trfButton));
        trfButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(servicesButton));
        servicesButton.click();
    }
}
