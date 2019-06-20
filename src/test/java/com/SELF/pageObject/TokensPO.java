package com.SELF.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TokensPO {

    private WebDriver driver;

    //To initialise web elements
    public TokensPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Define element locator
    @FindBy(linkText = "Tokens Process")
    private WebElement CtaTokens;

    @FindBy (xpath = "//*[text()='All Tokens Form']")
    private WebElement TokensDashboard;

    @FindBy (xpath = "//*[text()='Next']")
    private WebElement Ctanext;

    @FindBy (xpath = "//*[@id='AF-Form-2fecdd17-ab4a-43ea-8e99-6ad3c39a14c8']/section[1]/ul/li[2]/a")
    private WebElement AssignmentTokens;

    @FindBy (xpath = "//*[@id='AF-Form-2fecdd17-ab4a-43ea-8e99-6ad3c39a14c8']/div/div/button[3]")
    private WebElement NextBtn;

    @FindBy (xpath = "//*[@id='AF-Form-2fecdd17-ab4a-43ea-8e99-6ad3c39a14c8']/section[1]/ul/li[3]/a")
    private WebElement CaseTokens;

    @FindBy (xpath = "//*[@id='AF-Form-2fecdd17-ab4a-43ea-8e99-6ad3c39a14c8']/section[1]/ul/li[4]/a")
    private WebElement CitizenAndCSATokens;

    @FindBy (xpath = "//*[@id='AF-Form-2fecdd17-ab4a-43ea-8e99-6ad3c39a14c8']/section[1]/ul/li[5]/a")
    private WebElement DateTimeToken;

    @FindBy (xpath = "//*[@id='AF-Form-2fecdd17-ab4a-43ea-8e99-6ad3c39a14c8']/section[1]/ul/li[6]/a")
    private WebElement EscalationToken;

    @FindBy (xpath = "//*[@id='AF-Form-2fecdd17-ab4a-43ea-8e99-6ad3c39a14c8']/section[1]/ul/li[7]/a")
    private WebElement FormTokens;

    @FindBy (xpath = "//*[@id='AF-Form-2fecdd17-ab4a-43ea-8e99-6ad3c39a14c8']/section[1]/ul/li[8]/a")
    private WebElement ProcessTokens;

    @FindBy (xpath = "//*[@id='AF-Form-2fecdd17-ab4a-43ea-8e99-6ad3c39a14c8']/section[1]/ul/li[9]/a")
    private WebElement SubformTokens;

    @FindBy (xpath = "//*[@id='AF-Form-2fecdd17-ab4a-43ea-8e99-6ad3c39a14c8']/section[1]/ul/li[10]/a")
    private WebElement TaskTokens;

    @FindBy (xpath = "//*[@id='AF-Form-2fecdd17-ab4a-43ea-8e99-6ad3c39a14c8']/section[1]/ul/li[11]/a")
    private WebElement MapFieldTokens;

    @FindBy (xpath = "//*[@id='AF-Form-2fecdd17-ab4a-43ea-8e99-6ad3c39a14c8']/section[1]/ul/li[12]/a")
    private WebElement CtaOthers;



    public void tokensBtn() throws Throwable {
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.id("MyServices")));
        CtaTokens.click();
        Thread.sleep(3000);
    }
    public void tokenLists()throws Throwable{
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        Thread.sleep(2000);
        TokensDashboard.isDisplayed();
        Thread.sleep(2000);
    }
    public void nextBtn(){
        Ctanext.click();
    }
    public void assignmentColumn()throws Throwable{
        Thread.sleep(2000);
        AssignmentTokens.isDisplayed();
        Thread.sleep(2000);
    }
    public void nextbtn(){
        NextBtn.click();
    }
    public void caseColumn()throws Throwable{
        Thread.sleep(2000);
        CaseTokens.isDisplayed();
        Thread.sleep(2000);
    }
    public void citizenColumn()throws Throwable{
        Thread.sleep(2000);
        CitizenAndCSATokens.isDisplayed();
        Thread.sleep(2000);
    }
    public void dateTimeColumn()throws Throwable{
        Thread.sleep(2000);
        DateTimeToken.isDisplayed();
        Thread.sleep(2000);
    }
    public void escalationColumn()throws Throwable{
        Thread.sleep(2000);
        EscalationToken.isDisplayed();
        Thread.sleep(2000);
    }
    public void formColumn()throws Throwable{
        Thread.sleep(2000);
        FormTokens.isDisplayed();
        Thread.sleep(2000);
    }
    public void processColumn()throws Throwable{
        Thread.sleep(2000);
        ProcessTokens.isDisplayed();
        Thread.sleep(2000);
    }
    public void subformColumn()throws Throwable{
        Thread.sleep(2000);
        SubformTokens.isDisplayed();
        Thread.sleep(2000);
    }
    public void taskColumn()throws Throwable{
        Thread.sleep(2000);
        TaskTokens.isDisplayed();
        Thread.sleep(2000);
    }
    public void mapColumn()throws Throwable{
        Thread.sleep(2000);
        MapFieldTokens.isDisplayed();
        Thread.sleep(2000);
    }
    public void othersColumn()throws Throwable{
        Thread.sleep(2000);
        CtaOthers.isDisplayed();
        Thread.sleep(2000);
    }


}
