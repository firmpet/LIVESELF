package com.SELF.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TricksManualPO {

    private WebDriver driver;

    //To initialise Web element
    public TricksManualPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Define element locator
    @FindBy(linkText = "Useful Tricks Manual Test")
    private WebElement CtaTricksManual;

    @FindBy (xpath = "//*[text()='Useful Tricks Forms']")
    private WebElement TricksPage;

    @FindBy (id = "text1")
    private WebElement Firstname;

    @FindBy (id = "text2")
    private WebElement Lastname;

    @FindBy (id = "selectdisplay")
    private WebElement SelectField;

    @FindBy (id = "selectdisplay")
    private WebElement InsertText;

    @FindBy (id = "text3")
    private WebElement NumberField;

    @FindBy (id = "text4")
    private WebElement NumbersField;

    @FindBy (id = "dateOfBirth")
    private WebElement DOBField;

    @FindBy (id = "thisFieldHasAVal")
    private WebElement PostCode;

    @FindBy (id = "iShowWhenTheAbov")
    private WebElement ValidateField;

    @FindBy (xpath = "//p[text()='Thank you for submitting Useful Tricks Forms']")
    private WebElement RefPage;



    public void tricksManual () throws Throwable{
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.id("MyServices")));
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(CtaTricksManual));

        CtaTricksManual.click();
        Thread.sleep(3000);
    }
    public void formPage()throws Throwable{
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        Thread.sleep(2000);
        TricksPage.isDisplayed();
    }
    public void fName()  {
        Firstname.sendKeys("David");
    }
    public void lName()  {
        Lastname.sendKeys("Daniel");
    }
    public void dropdownField(){
        SelectField.click();
    }
    public void texts()  {
        InsertText.sendKeys("Yes");
    }
    public void digit()  {
        NumberField.sendKeys("2");
    }
    public void digits()  {
        NumbersField.sendKeys("3");
    }
    public void dob() throws Throwable  {
        Thread.sleep(1000);
        DOBField.click();
        DOBField.sendKeys("20112018");
        Thread.sleep(1000);
    }
    public void postal()  {
        PostCode.sendKeys("EC2A 2DT");
    }
    public void verifier() {
        ValidateField.sendKeys("Validity");
    }
    public void submitPage() throws Throwable {
        Thread.sleep(2000);
        RefPage.isDisplayed();
        Thread.sleep(3000);
    }

}
