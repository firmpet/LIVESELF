package com.SELF.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ResourceBundle;

public class PhoneTeamRaisePO {
    ResourceBundle config;
    private WebDriver driver;

    //To initialise Web elements
    public PhoneTeamRaisePO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
        config=ResourceBundle.getBundle("ConFig");
    }

    //Define element locator
    @FindBy (xpath = "//a[@id='phone']")
    private WebElement PhoneModal;

    @FindBy (xpath = "//input[@id='query']")
    private WebElement SearchField;

    @FindBy (xpath = "//*[@id='query-button']")
    private WebElement CtaSearch;

    @FindBy (id = "AddCase-0")
    private WebElement CtaRaiseCase;

    @FindBy (xpath = "//*[text()='Release Testing']")
    private WebElement ServiceOption;

    @FindBy (xpath = "//*[@id='module-srt-selector']/div[2]/div[3]/select/option")
    private WebElement ReasonOption;

    @FindBy (xpath = "//option[. = 'Calculations']")
    private WebElement TypeOption;

    @FindBy (xpath = "//*[text()='Select']")
    private WebElement CtaSelect;

    @FindBy (xpath = "//input[@id='comma']")
    private WebElement TextField;

    @FindBy (css = "#AF-Form-03d61b5e-1366-4d86-ae3b-82548965e417 > div > div > button.btn.btn-af.nextbutton.pull-right")
    private WebElement CtaNext;

    @FindBy (xpath = "//*[@id='tree']")
    private WebElement Tree;

    @FindBy (xpath = "//option[@value='yes']")
    private WebElement OptionTree;

    @FindBy (xpath = "//*[@id='bench']")
    private WebElement Bench;

    @FindBy (xpath = "//option[@value='yes']")
    private WebElement OptionBench;

    @FindBy (xpath = "//*[@id='lamppost']")
    private WebElement Lamp;

    @FindBy (xpath = "//option[@value='yes']")
    private WebElement OptionLamp;

    @FindBy (xpath = "//button[text()='Add Record']")
    private WebElement AddRecord;

    @FindBy (xpath = "//*[@id='amountToBeSummed']")
    private WebElement Amount;

    @FindBy (xpath = "//span[text()='Add Record']")
    private WebElement CtaAddRecord;

    @FindBy (xpath = "//*[@id='AF-Form-03d61b5e-1366-4d86-ae3b-82548965e417']/div/div/button[3]")
    private WebElement CtaSubmit;



    public void csaSelectWorkspace (String CSASelectWorkspace) throws Throwable{
        Thread.sleep(2000);
        driver.navigate().to(config.getString("CSASelectWorkspace"));
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[3]/a")).click();
        Thread.sleep(2000);
    }
    public void phoneCase () throws Throwable {
        Thread.sleep(3000);
        PhoneModal.click();
        Thread.sleep(3000);
    }
    public void textField () throws Throwable{
        Thread.sleep(2000);
        SearchField.sendKeys("test");
        Thread.sleep(2000);
    }
    public void searchBtn ()throws Throwable{
        CtaSearch.click();
        Thread.sleep(2000);
    }
    public void addRaiseCase ()throws Throwable{
        Thread.sleep(1000);
        CtaRaiseCase.click();
        Thread.sleep(2000);
    }
    public void releaseTesting ()throws Throwable{
        Thread.sleep(1000);
        ServiceOption.click();
        Thread.sleep(2000);
    }
    public void reasonField()throws Throwable{
        Thread.sleep(1000);
        ReasonOption.click();
        Thread.sleep(2000);
    }
    public void calculation()throws Throwable{
        Thread.sleep(1000);
        TypeOption.click();
        Thread.sleep(2000);
    }
    public void select()throws Throwable{
        Thread.sleep(1000);
        CtaSelect.click();
        Thread.sleep(2000);
    }
    public void texts ()throws Throwable{
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.id("form_one")));
        Thread.sleep(4000);
        TextField.click();
        TextField.sendKeys("Footpath,Park,Road,Cycle Track");
        Thread.sleep(3000);
    }
    public void next()throws Throwable{
        Thread.sleep(2000);
        CtaNext.click();
        Thread.sleep(2000);
    }
    public void treeOption()throws Throwable {
        Thread.sleep(3000);
        Tree.click();
        OptionTree.click();
        Thread.sleep(2000);
    }
    public void benchOption()throws Throwable {
        Thread.sleep(3000);
        Bench.click();
        OptionBench.click();
        Thread.sleep(2000);
    }
    public void lampOption() throws Throwable{
        Thread.sleep(3000);
        Lamp.click();
        OptionLamp.click();
        Thread.sleep(2000);
    }
    public void amount()throws Throwable{
        Thread.sleep(3000);
        AddRecord.click();
        Thread.sleep(2000);
        Amount.sendKeys("50");
        Thread.sleep(2000);
        CtaAddRecord.click();
        Thread.sleep(2000);
    }
    public void submit()throws Throwable{
        Thread.sleep(2000);
        CtaSubmit.click();
        Thread.sleep(2000);
    }


}
