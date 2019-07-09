package com.SELF.pageObject;

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

    @FindBy (xpath = "//h2[text()='Language Process Welsh']") //(xpath = "//*[@id='filter']")
    private WebElement WelshField;

    @FindBy (linkText = "Continue - Welsh")
    private WebElement ContinueWelsh;

    @FindBy (xpath = "//*[@id='AF-Form-e9886ef3-d5c3-44f6-802d-70e00261f636']/div/div/button[2]")     //*[text()='Submit']
    private WebElement CtaSubmit;

    @FindBy (xpath = "//*[text()='Continue']")
    private WebElement ContinueCta;





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
    public void filterField()throws Throwable {
        driver.switchTo().frame(driver.findElement(By.id("MyRequestsV3")));
        Thread.sleep(2000);
        WelshField.click();
        Thread.sleep(2000);
    }
    public void verification()throws Throwable{
        Thread.sleep(2000);
        ContinueWelsh.click();
        Thread.sleep(2000);
    }
    public void submitText()throws Throwable{
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        Thread.sleep(2000);
        CtaSubmit.click();
        Thread.sleep(2000);
    }
    public void ctaContinue()throws Throwable{
        ContinueCta.click();
        Thread.sleep(1000);
    }
}
