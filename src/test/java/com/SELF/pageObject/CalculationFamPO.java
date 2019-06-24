package com.SELF.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculationFamPO {

    private WebDriver driver;

    //To initialise web elements
    public CalculationFamPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Define element locator
    @FindBy(linkText = "Calculations Process")
    private WebElement CtaCalculationsProcess;

    @FindBy(xpath = "//*[@id='page']/section/header/h1/span")
    private WebElement CalculationsForm;

    @FindBy (id = "comma")
    private   WebElement InputField;

    @FindBy (xpath = "//*[@id=\"AF-Form-03d61b5e-1366-4d86-ae3b-82548965e417\"]/section[2]/section/div[2]/div/span/div")
    private WebElement Title;

//    @FindBy (id = "tree")
//    private WebElement TreeField;

    @FindBy (id = "tree")
    private WebElement TreeDropdownField;

    @FindBy (id = "bench")
    private WebElement BenchField;

//    @FindBy (id = "bench")
//    private WebElement BenchDropdownField;

//    @FindBy (id = "lamppost")
//    private WebElement LamppostField;

    @FindBy (id = "lamppost")
    private WebElement LamppostDropdownField;

    @FindBy (className = "fa-chevron-right")
    private WebElement BtnNext;

    @FindBy (xpath = "//*[@id=\"AF-Form-03d61b5e-1366-4d86-ae3b-82548965e417\"]/section[1]/ul/li[3]")
    private WebElement StringManipulationColumn;

    @FindBy (css = "#AF-Form-03d61b5e-1366-4d86-ae3b-82548965e417 > div > div > button.btn.btn-af.nextbutton.pull-right")
    private WebElement CtaNext;

    @FindBy (xpath = "//*[@id='AF-Form-03d61b5e-1366-4d86-ae3b-82548965e417']/section[1]/ul/li[4]")
    private WebElement SubformsColumn;

    @FindBy(xpath = "//*[text()='Add Record']")
    private WebElement AddRecord;

    @FindBy (id = "amountToBeSummed")
    private WebElement AmountField;

    @FindBy (xpath = "//span[text()='Add Record']")
    private WebElement CtaAddRecord;

    @FindBy (xpath = "//*[@id='AF-Form-03d61b5e-1366-4d86-ae3b-82548965e417']/section[2]/section/div[2]/div/div[1]/table/tbody/tr/td[2]")
    private WebElement TotalSum;

    @FindBy (xpath = "//*[@id='AF-Form-03d61b5e-1366-4d86-ae3b-82548965e417']/div/div/button[3]")
    private WebElement CtaSubmit;

    @FindBy (xpath = "//*[@id='page']/section/section/div/div[1]/p[2]")
    private WebElement SuccessfulPage;



    public void calculationsProcessLink() throws Throwable{
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.id("MyServices")));
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(CtaCalculationsProcess));

        CtaCalculationsProcess.click();
    }

    public void calculationsColumn()throws Throwable{
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        Thread.sleep(2000);
        CalculationsForm.isDisplayed();
    }
    public void insertText()throws Throwable{
        Thread.sleep(2000);
        InputField.sendKeys("Footpath,Park,Road,Cycle Track");
        Thread.sleep(1000);
    }
    public void pageTitle()throws Throwable{
        Thread.sleep(1000);
        Title.isDisplayed();
        Thread.sleep(2000);
    }
//    public void inputField(){
//        TreeField.click();
//    }
    public void insertText1()throws Throwable{
        Thread.sleep(3000);
        TreeDropdownField.click();
        TreeDropdownField.sendKeys("Yes");
        Thread.sleep(1000);
    }
//    public void inputField1(){
//        BenchDropdownField.click();
//    }
    public void insertText2()throws Throwable{
        Thread.sleep(2000);
        BenchField.click();
        BenchField.sendKeys("Yes");
        Thread.sleep(1000);
    }
//    public void inputField2(){
//        LamppostField.click();
//    }
    public void insertText3()throws Throwable{
        Thread.sleep(2000);
        LamppostDropdownField.click();
        LamppostDropdownField.sendKeys("Yes");
        Thread.sleep(1000);
    }
    public void nextbtn()throws Throwable{
        Thread.sleep(2000);
        BtnNext.click();
    }
    public void stringManSection()throws Throwable{
        Thread.sleep(2000);
        StringManipulationColumn.isDisplayed();
        Thread.sleep(2000);
    }
    public void nextBtn()throws Throwable{
        Thread.sleep(2000);
        CtaNext.click();
        Thread.sleep(1000);
    }
    public void subforms()throws Throwable{
        Thread.sleep(2000);
        SubformsColumn.isDisplayed();
        Thread.sleep(2000);
    }
    public void recordBtn()throws Throwable{
        Thread.sleep(2000);
        AddRecord.click();
        Thread.sleep(2000);
    }
    public void textField()throws Throwable{
        Thread.sleep(3000);
        AmountField.sendKeys("50");
        Thread.sleep(3000);
    }
    public void addRecordBtn()throws Throwable{
        Thread.sleep(3000);
        CtaAddRecord.click();
        Thread.sleep(3000);
    }
    public void sum()throws Throwable{
        Thread.sleep(2000);
        TotalSum.isDisplayed();
        Thread.sleep(3000);
    }
    public void submitBtn()throws Throwable{
        Thread.sleep(2000);
        CtaSubmit.click();
    }
    public void submitPage()throws Throwable{
        Thread.sleep(2000);
        SuccessfulPage.isDisplayed();
        Thread.sleep(4000);
    }


}
