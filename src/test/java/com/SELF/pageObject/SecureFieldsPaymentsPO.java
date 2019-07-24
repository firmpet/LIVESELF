package com.SELF.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ResourceBundle;

public class SecureFieldsPaymentsPO {
    ResourceBundle config;
    private WebDriver driver;

    //To initialise Web element
    public SecureFieldsPaymentsPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
        config= ResourceBundle.getBundle("ConFig");
    }


    //To initialise Element locator
    @FindBy (xpath = "//*[@id='text1']")
    private WebElement PurposeField;

    @FindBy (xpath = "//*[@id='payamount']")
    private WebElement PayAmountField;

    @FindBy (xpath = "/html/body/div[2]/form[1]/div[3]/div/input")
    private WebElement NameField;

    @FindBy (xpath = "//*[@name='card_no']")
    private WebElement CardNumber;

    @FindBy (xpath = "//*[@name='expiry_date']")
    private WebElement ExpiryDate;

    @FindBy (xpath = "//*[@name='card_security']")
    private WebElement CardSecurity;

    @FindBy (xpath = "/html/body/div[2]/form[1]/input[2]")
    private WebElement CtaSubmit;



    public void fieldPaymentPage(String FieldPaymentURL)throws Throwable{
        driver.navigate().to(config.getString("FieldPaymentURL"));
    }
    public void charges()throws Throwable{
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        Thread.sleep(2000);
        PurposeField.sendKeys("Gardening");
        Thread.sleep(2000);
    }
    public void amountField ()throws Throwable{
        Thread.sleep(2000);
        PayAmountField.sendKeys("100");
        Thread.sleep(2000);
    }
    public void name()throws Throwable{
        Thread.sleep(5000);
        NameField.sendKeys("QA Tester");
        Thread.sleep(2000);
    }
    public void paymentCard()throws Throwable{
        Thread.sleep(2000);
        CardNumber.sendKeys("1111-2222-3333-4444");
        Thread.sleep(2000);
    }
    public void cardExpiryDate()throws Throwable{
        Thread.sleep(2000);
        ExpiryDate.sendKeys("12/19");
        Thread.sleep(2000);
    }
    public void securityNumber()throws Throwable{
        Thread.sleep(2000);
        CardSecurity.sendKeys("201");
        Thread.sleep(2000);
    }
    public void submission()throws Throwable{
        Thread.sleep(2000);
        CtaSubmit.click();
        Thread.sleep(3000);
    }
}
