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

    @FindBy (xpath = "//*[@id='filter']")
    private WebElement WelshField;

    @FindBy (xpath = "//*[@id='filter']/option[2]")
    private WebElement Options;

    @FindBy (css = ".case-row:nth-child(1) .open-task-arrow")
    private WebElement OpenCase;

    @FindBy (linkText = "Continue - Welsh")
    private WebElement ContinueWelsh;

    @FindBy (xpath = "//span[@class='submitText']")
    private WebElement CtaSubmit;






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
        Thread.sleep(1000);
    }
    public void verification()throws Throwable{
        Thread.sleep(2000);
        ContinueWelsh.click();
        Thread.sleep(1000);
    }
    public void submitText()throws Throwable{
        Thread.sleep(1000);
        CtaSubmit.click();
        Thread.sleep(2000);
    }
}
