package com.SELF.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DateFieldPO {

    private WebDriver driver;

    //To Initialise Web element
    public DateFieldPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Define element locator
    @FindBy(linkText = "Date Fields Manual Test")
    private WebElement CtaDateFieldsManual;

    @FindBy (xpath = "//*[@id='page']/section/header/h1/span")
    private WebElement DateFieldPage;

    @FindBy (id = "date1")
    private WebElement DateFrom;

    @FindBy ( id = "date2")
    private WebElement DateTo;

    @FindBy (id = "time1")
    private WebElement Time;

    @FindBy (xpath = "//*[@id='AF-Form-8f081991-face-4e9b-9b24-f3cbe02f7bdb']/div/div/button[2]")
    private WebElement SubmitForm;

    @FindBy (xpath = "//*[@id='page']/section/section/div/div[1]/p[2]")
    private WebElement SubmissionPage;


    public void dateFieldLink() throws Throwable{
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.id("MyServices")));
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(CtaDateFieldsManual));

        CtaDateFieldsManual.click();
    }
    public void dashboard()throws Throwable{
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        Thread.sleep(2000);
        DateFieldPage.isDisplayed();
    }
    public void dateField(){
        DateFrom.sendKeys("15012019");
    }
    public void dateField1(){
        DateTo.sendKeys("20022019");
    }
    public void timeField(){
        Time.sendKeys("1530");
    }
    public void submitBtn(){
        SubmitForm.click();
    }
    public void submit()throws Throwable{
        Thread.sleep(2000);
        SubmissionPage.isDisplayed();
        Thread.sleep(1000);
    }

}
