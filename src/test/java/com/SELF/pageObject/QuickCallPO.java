package com.SELF.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ResourceBundle;

public class QuickCallPO {
    ResourceBundle config;
    private WebDriver driver;

    //To initialise Web element
    public QuickCallPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
        config= ResourceBundle.getBundle("ConFig");
    }


    //To initialise Element locator
    @FindBy (xpath = "//*[@id='genquiry_options']/label[1]")
    private WebElement CtaReleaseTesting;

    @FindBy (xpath = "//*[@id='genquiry_options']/label")
    private WebElement CtaCalculations;

    @FindBy (xpath = "//*[@id='genquiry_options']/label")
    private WebElement CtaConcat;

    @FindBy (xpath = "//*[@id='genquiry_options']/label[1]")
    private WebElement CtaString;

    @FindBy (xpath = "//*[@id=\"avoidcontact_section\"]/div/label[2]")
    private WebElement NoOption;

    @FindBy (xpath = "//*[@id='submit_ge']")
    private WebElement CtaSubmit;

    @FindBy (xpath = "//*[@id='genquiry_options']/label[2]")
    private WebElement CtaNumbers;

    @FindBy (xpath = "//*[@id='avoidcontact_section']/div/label[1]")
    private WebElement CtaYes;

    @FindBy (xpath = "//*[@id='avoidcontact_section']/textarea")
    private WebElement TextField;



    public void releaseBtn()throws Throwable{
        Thread.sleep(2000);
        CtaReleaseTesting.click();
        Thread.sleep(2000);
    }
    public void calculationBtn()throws Throwable{
        CtaCalculations.click();
    }
    public void concatBtn()throws Throwable{
        CtaConcat.click();
    }
    public void stringBtn()throws Throwable{
        CtaString.click();
    }
    public void noRadioBtn()throws Throwable{
        NoOption.click();
    }
    public void submitBtn()throws Throwable{
        Thread.sleep(1000);
        CtaSubmit.click();
        Thread.sleep(4000);
    }
    public void numberField()throws Throwable{
        CtaNumbers.click();
    }
    public void yesRadioBtn()throws Throwable{
        Thread.sleep(1000);
        CtaYes.click();
        Thread.sleep(2000);
    }
    public void enterText()throws Throwable{
        TextField.sendKeys("test");
    }





}
