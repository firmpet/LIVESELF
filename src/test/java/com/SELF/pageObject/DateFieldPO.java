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

    @FindBy (xpath = "//*[@id='date1']")
    private WebElement DateFrom;

    @FindBy ( id = "date2")
    private WebElement DateTo;

    @FindBy (id = "time1")
    private WebElement Time;

    @FindBy (xpath = "//*[@id='AF-Form-8f081991-face-4e9b-9b24-f3cbe02f7bdb']/div/div/button[2]")
    private WebElement SubmitForm;

    @FindBy (xpath = "//p[text()='Thank you for submitting Date Fields Manual Test Form']")
    private WebElement SubmissionPage;


    public void dateFieldLink() throws Throwable{
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.id("MyServices")));
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(CtaDateFieldsManual));

        CtaDateFieldsManual.click();
        Thread.sleep(1000);
    }
    public void dashboard()throws Throwable{
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        Thread.sleep(2000);
        DateFieldPage.isDisplayed();
        Thread.sleep(2000);
    }
    public void dateField()throws Throwable{
        DateFrom.click();
        DateFrom.sendKeys("15012019");
        Thread.sleep(2000);
    }
    public void dateField1()throws Throwable{
        DateTo.click();
        DateTo.sendKeys("20022019");
        Thread.sleep(2000);
    }
    public void timeField()throws Throwable{
        Time.click();
        Time.sendKeys("1530");
        Thread.sleep(1000);
    }
    public void submitBtn()throws Throwable{
        Thread.sleep(2000);
        SubmitForm.click();
        Thread.sleep(2000);
    }
    public void submit()throws Throwable{
        Thread.sleep(3000);
        SubmissionPage.isDisplayed();
        Thread.sleep(4000);
    }

}
