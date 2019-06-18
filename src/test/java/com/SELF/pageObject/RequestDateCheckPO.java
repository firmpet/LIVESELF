package com.SELF.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ResourceBundle;

public class RequestDateCheckPO {

    private WebDriver driver;
    ResourceBundle config;

    //To initialise Web element
    public RequestDateCheckPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
        config= ResourceBundle.getBundle("ConFig");
    }


    //Define element locator
    @FindBy(id = "text1")
    private WebElement TextField;

    @FindBy (xpath = "//span[@class='submitText']")
    private WebElement CtaSubmit;

    @FindBy (xpath = "//*[text()='Continue']")
    private WebElement CtaContinue;

    @FindBy(linkText = "MyRequests V3")
    private WebElement CtaMyRequests;

    @FindBy (xpath = "//table[@id='MyRequestTable']")
    private WebElement RequestTableData;

    @FindBy (xpath = "//tr[@href='#']")
    private WebElement SearchBtn;

    @FindBy (xpath = "//tr[@class='case-table']")
    private WebElement ApplicationPage;



    public void requestDateCheck(String DateURL)  throws Throwable {
        driver.navigate().to(config.getString("DateURL"));
    }
    public void inputText() throws Throwable{
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        Thread.sleep(1000);
        TextField.sendKeys("Testing");
    }
    public void submitBtnn() throws Throwable {
        Thread.sleep(2000);
        CtaSubmit.click();
    }
    public void continueBtnn () throws Throwable {
        Thread.sleep(2000);
        CtaContinue.click();
    }
    public void myRequestV3Link () throws Throwable  {
        Thread.sleep(2000);
        CtaMyRequests.click();
    }
    public void requestTable() throws Throwable {
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.id("MyRequestsV3")));
        Thread.sleep(1000);
        RequestTableData.isDisplayed();
    }
    public void numberColumn() throws Throwable  {
        Thread.sleep(2000);
        SearchBtn.click();
    }
    public void requestDataPage() throws Throwable {
        Thread.sleep(2000);
        ApplicationPage.isDisplayed();
        Thread.sleep(1000);
    }

}
