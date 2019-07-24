package com.SELF.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ResourceBundle;

public class ConditionsCheckPO {
    ResourceBundle config;
    private WebDriver driver;

    //To initialise Web element
    public ConditionsCheckPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
        config= ResourceBundle.getBundle("ConFig");
    }

    //To initialise Web locators
    @FindBy (xpath = "//*[@id='DataTables_Table_0_filter']/label/input")
    private WebElement SearchField;

    @FindBy (xpath = "//*[@id='AF-Process-d206e7e0-058b-49f9-978b-a995042cf50e']/td[1]/div/div/h5/span[1]/span[2]")
    private WebElement Result;

    @FindBy (xpath = "//*[text()='Fill']")
    private WebElement CtaFill;

    @FindBy (xpath = "//*[text()='Yes']")
    private WebElement CtaYes;

    @FindBy (xpath = "//input[@id='text1']")
    private WebElement TextField;

    @FindBy (xpath = "//input[@id='text2']")
    private WebElement TextField2;

    @FindBy (xpath = "//span[text()='Submit']")
    private WebElement Submit;


    public void formsLogin(String FormsURL)throws Throwable{
        driver.get(config.getString("FormsURL"));
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[3]/a")).click();
        Thread.sleep(2000);
    }
    public void fieldSearch()throws Throwable{
        Thread.sleep(1000);
        SearchField.sendKeys("Run on Input Change Multiple Runs");
        Thread.sleep(4000);
    }
    public void searchResult()throws Throwable{
        Thread.sleep(2000);
        Result.click();
        Thread.sleep(2000);
    }
    public void fillBtn()throws Throwable{
        Thread.sleep(3000);
        CtaFill.click();
        Thread.sleep(2000);
    }
    public void yesBtn()throws Throwable{
        Thread.sleep(2000);
        CtaYes.click();
        Thread.sleep(2000);
    }
    public void inputField1()throws Throwable{
        Thread.sleep(2000);
        TextField2.clear();
        TextField.sendKeys("3");
        Thread.sleep(2000);
    }
    public void inputField2()throws Throwable{
        Thread.sleep(2000);
        TextField2.clear();
        TextField2.sendKeys("2 test");
        Thread.sleep(2000);
    }
    public void ctaSubmit()throws Throwable{
        Submit.click();
        Thread.sleep(2000);
    }
}
