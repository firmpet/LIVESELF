package com.SELF.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InterfaceCheckPO {
    private WebDriver driver;

    //To initialise Web element
    public InterfaceCheckPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Define element locator
    @FindBy(linkText = "FAQs")
    private WebElement FAQsCta;

    @FindBy (xpath = "//*[text()='Frequently Asked Questions']")
    private WebElement FAQPage;

    @FindBy (linkText = "Services")
    private WebElement CtaServices;

    @FindBy (name = "search")
    private WebElement ServicesPage;

    @FindBy (linkText = "Dashboard")
    private WebElement CtaDashboard;

    @FindBy (xpath = "//*[text()='New Forms']")
    private WebElement DashboardPage;

    @FindBy (linkText = "MyRequests V3")
    private WebElement CtaMyRequest;

    @FindBy (xpath = "//*[text()='My Requests']")
    private WebElement RequestCases;

    @FindBy (linkText = "Capita Connect v3")
    private WebElement CtaCapitalConnect;

    @FindBy (xpath = "//*[text()='Online Services']")
    private WebElement OnlineServices;



    public void faqsBtn() {
        FAQsCta.click();
    }
    public void contentPage()throws Throwable{
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.id("NewFAQs")));
        Thread.sleep(3000);
        FAQPage.isDisplayed();
        Thread.sleep(1000);
    }
    public void serviceBtn() throws Throwable{
        driver.switchTo().defaultContent();;
        Thread.sleep(2000);
        CtaServices.click();
    }
    public void pagecontents()throws Throwable{
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.id("MyServices")));
        Thread.sleep(2000);
        ServicesPage.isDisplayed();
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
    }
    public void dashbtn(){
        CtaDashboard.click();
    }
    public void casesTable()throws Throwable{
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.id("CommonDashboard")));
        Thread.sleep(1000);
        DashboardPage.isDisplayed()  ;
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
    }
    public void requestLink() {
        CtaMyRequest.click();
    }
    public void casesLog() throws Throwable {
        Thread.sleep(3000);
        RequestCases.isDisplayed();
        Thread.sleep(2000);
    }
    public void connectNav() throws Throwable {
        Thread.sleep(1000);
        CtaCapitalConnect.click();
    }
    public void serviceLists()throws Throwable{
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.id("CapitaConnect")));
        Thread.sleep(3000);
        OnlineServices.isDisplayed();
        Thread.sleep(2000);
    }
}
