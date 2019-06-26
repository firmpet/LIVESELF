package com.SELF.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ResourceBundle;

public class CaseViewPO {
    ResourceBundle config;
    private WebDriver driver;

    //To initialise web elements
    public CaseViewPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
        config= ResourceBundle.getBundle("ConFig");
    }

    //Define element locator
    @FindBy(xpath = "//*[text()='Stage 1 Case View']")
    private WebElement Stage1CaseView;

    @FindBy (id = "text")
    private WebElement TextField;

    @FindBy (id = "number1")
    private WebElement NumberField;

    @FindBy (linkText = "MyRequests V3")
    private WebElement MyRequestsV3Cta;

    @FindBy (xpath = "//*[@id='MyRequestTable']/tbody/tr[1]/td[1]")
    private WebElement Reference;

    @FindBy (linkText = "Continue")
    private WebElement CtaContinue;

    @FindBy (xpath = "//*[@id='current-tasks']/div/div[1]/h4")
    private WebElement Stage2CaseView;

    @FindBy (id = "text1")
    private WebElement Stage2NameField;

    @FindBy (id = "number11")
    private WebElement Stage2NumberField;

    @FindBy (xpath = "//*[@id='AllProcesses']/div[1]/div[1]/select[3]")
    private WebElement SearchRef;

    @FindBy (xpath = "//option[@value='Stage 3']")
    private WebElement Stage3;

    @FindBy(xpath = "//*[@id='AllProcesses']/table/tbody/tr[1]/td[11]/button[2]")
    private WebElement ContinueCta;

    @FindBy (id = "text12")
    private WebElement Stage3Text;

    @FindBy(id = "number12")
    private WebElement Stage3Number;



    public void caseViewPage(String URLpage) throws Throwable{
        Thread.sleep(2000);
        driver.navigate().to(config.getString("URLpage"));
    }
    public void casePage()throws Throwable{
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        Thread.sleep(2000);
        Stage1CaseView.isDisplayed();
        Thread.sleep(2000);
    }
    public void caseName() {
        TextField.sendKeys("Lambeth");
    }
    public void numbers()  throws Throwable{
        NumberField.sendKeys("4234");
        Thread.sleep(2000);
    }
    public void requestV3Link()throws Throwable{
        Thread.sleep(2000);
        driver.navigate().to("https://releasetesting-self.achieveservice.com/en");
        Thread.sleep(2000);
        MyRequestsV3Cta.click();
    }
    public void refTable()throws Throwable{
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.id("MyRequestsV3")));
        Thread.sleep(2000);
        Reference.click() ;
        Thread.sleep(1000);
    }
    public void continueBtn()throws Throwable{
        Thread.sleep(2000);
        CtaContinue.click();
        Thread.sleep(1000);
    }
    public void caseView()throws Throwable{
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        Thread.sleep(1000);
        Stage2CaseView.isDisplayed();
        Thread.sleep(2000);
    }
    public void textField()throws Throwable{
        Thread.sleep(2000);
//        int size = driver.findElements(By.tagName("iframe")).size();
//        System.out.println("Total Frames --" + size);
        driver.switchTo().frame(1);

        Stage2NameField.sendKeys("Testing");
    }

    public void numberField() throws Throwable{
        Stage2NumberField.sendKeys("9870");
        Thread.sleep(2000);
    }

    public void searchField()throws Throwable {
        driver.switchTo().frame(driver.findElement(By.id("CommonDashboard")));
        Thread.sleep(2000);
        SearchRef.click();
    }
    public void nextStage () throws Throwable{
        Thread.sleep(3000);
        Stage3.click();
        Thread.sleep(3000);
    }
    public void continues() throws Throwable{
        ContinueCta.click();
        Thread.sleep(1000);
    }
    public void inputText()throws Throwable{
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        //Thread.sleep(2000);

//        int size = driver.findElements(By.tagName("iframe")).size();
//        System.out.println("Total Frames --" + size);
        driver.switchTo().frame(2);
        Stage3Text.sendKeys("Testing");

    }
    public void inputNumber(){
        Stage3Number.sendKeys("3526");
    }

}
