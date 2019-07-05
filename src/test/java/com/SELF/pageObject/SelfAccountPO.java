package com.SELF.pageObject;

import com.SELF.Runner.TestRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ResourceBundle;

public class SelfAccountPO {
    ResourceBundle config;
    private WebDriver driver;

    //To initialise Web element
    public SelfAccountPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
        config= ResourceBundle.getBundle("ConFig");
    }

    //To initialise element locators
    @FindBy (css = "#fieldEnglish")
    private WebElement FieldWelsh;

    @FindBy (xpath = "//*[text()='Continue']")
    private WebElement ContinueCta;

    @FindBy (xpath = "//*[@id='filter']")
    private WebElement WelshField;

    @FindBy (xpath = "//*[@id='filter']/option[2]")
    private WebElement Options;

    @FindBy (xpath = "//*[@id='MyRequestTable']/tbody/tr[1]/td[1]")
    private WebElement OpenCase;

    @FindBy (linkText = "Continue - Welsh")
    private WebElement ContinueWelsh;

    @FindBy (xpath = "//*[text()='Submit']")
    private WebElement CtaSubmit;
    //*[@id="AF-Form-e9886ef3-d5c3-44f6-802d-70e00261f636"]/div/div/button[2]



    public void languageFormPage(String WelshURL)throws Throwable{
        Thread.sleep(2000);
        driver.navigate().to(config.getString("WelshURL"));
        Thread.sleep(2000);
    }
    public void textField()throws Throwable{
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='fillform-frame-1']")));
        Thread.sleep(2000);
        FieldWelsh.click();
        FieldWelsh.sendKeys("Test");
        Thread.sleep(3000);
    }
    public void continueBtn()throws Throwable{
        Thread.sleep(3000);
        ContinueCta.click();
        Thread.sleep(2000);
    }
    public void filterField()throws Throwable {
        driver.switchTo().frame(driver.findElement(By.id("MyRequestsV3")));
        Thread.sleep(2000);
        WelshField.click();
        Thread.sleep(2000);
    }
    public void openWelsh()throws Throwable{
        Thread.sleep(1000);
        Options.click();
        Thread.sleep(4000);
    }
    public void selectCase()throws Throwable{
        Thread.sleep(2000);
        OpenCase.click();
        Thread.sleep(4000);
    }
    public void verification()throws Throwable{
        Thread.sleep(2000);
        ContinueWelsh.click();
        Thread.sleep(2000);
    }
    public void submitText()throws Throwable{
        Thread.sleep(2000);
        CtaSubmit.click();
        Thread.sleep(3000);
    }
}
