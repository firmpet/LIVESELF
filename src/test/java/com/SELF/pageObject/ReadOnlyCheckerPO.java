package com.SELF.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ResourceBundle;

public class ReadOnlyCheckerPO {
    ResourceBundle config;
    private WebDriver driver;

    public ReadOnlyCheckerPO(WebDriver driver){

        //To initialise Web element
        this.driver = driver;
        PageFactory.initElements(driver, this);
        config= ResourceBundle.getBundle("ConFig");
    }

    //To initialise Element locators
    @FindBy (xpath = "//*[text()='Next']")
    private WebElement Next;

    @FindBy (id = "linput1")
    private WebElement Input1;

    @FindBy (id = "input1")
    private WebElement TextField1;

    @FindBy (id = "input2")
    private WebElement TextField2;

    @FindBy (id = "input3")
    private WebElement PinField;

    @FindBy (xpath = "//*[@id='input4']")
    private WebElement DropdownField;

    @FindBy (xpath = " //*[@id='input4']/option[2]")
    private WebElement OptionYes;

    @FindBy (xpath = "//*[@id='input5']/span[1]/label")
    private WebElement Input5;

    @FindBy (xpath = "//*[@id='input6']/span[1]/label")
    private WebElement Input6;

    @FindBy (id = "input7")
    private WebElement NumberField;

    @FindBy (id = "input9")
    private WebElement Date;

    @FindBy (id = "input10")
    private WebElement Time;

    @FindBy (id = "input11")
    private WebElement DateTime;



    public void checkerPage(String ReadOnlyCheckerURL)throws Throwable{
        Thread.sleep(2000);
        driver.navigate().to(config.getString("ReadOnlyCheckerURL"));
        Thread.sleep(2000);
    }
    public void ctaNext()throws Throwable{
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        Thread.sleep(2000);
        Next.click();
        Thread.sleep(2000);
    }
    public void linputField()throws Throwable{
        Input1.click();
        Input1.sendKeys("test");
        Thread.sleep(2000);
    }
    public void field1()throws Throwable{
        TextField1.sendKeys("test");
        Thread.sleep(2000);
    }
    public void field2()throws Throwable{
        TextField2.sendKeys("test");
        Thread.sleep(2000);
    }
    public void pin ()throws Throwable{
        PinField.sendKeys("5678");
        Thread.sleep(2000);
    }
    public void fieldSelection()throws Throwable{
        DropdownField.click();
        Thread.sleep(1000);
        OptionYes.click();
        Thread.sleep(2000);
    }
    public void checkbox()throws Throwable{
        Input5.click();
        Thread.sleep(2000);
    }
    public void radioButton()throws Throwable{
        Input6.click();
        Thread.sleep(2000);
    }
    public void enterNumber()throws Throwable{
        NumberField.sendKeys("12");
        Thread.sleep(2000);
    }
    public void enterDate()throws Throwable{
        Date.click();
        Date.sendKeys("31072019");
        Thread.sleep(2000);
    }
    public void enterTime()throws Throwable{
        Time.click();
        Time.sendKeys("1000");
        Thread.sleep(2000);
    }
    public void dateAndTime()throws Throwable{
        DateTime.click();
        DateTime.sendKeys("31072019 1000");
        Thread.sleep(2000);
    }


}
