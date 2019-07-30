package com.SELF.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ResourceBundle;

public class RunCheckPO {

    ResourceBundle config;
    private WebDriver driver;

    //To initialise Web element
    public RunCheckPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
        config= ResourceBundle.getBundle("ConFig");
    }

    //To initialise Element locators
    @FindBy(xpath = "//*[@id='DataTables_Table_0_filter']/label/input")
    private WebElement SearchingField;

    @FindBy (xpath = "//*[text()='Integration Run Check with Conditions']")
    private WebElement Integration;

    @FindBy (xpath = "//*[text()='Fill']")
    private WebElement Fill;

    @FindBy (xpath = "//*[text()='Submit']")
    private WebElement Submit;

    @FindBy (xpath = "//*[text()='View Data']")
    private WebElement ViewData;


    public void CheckPages(String RunCheckURL)throws Throwable{
        Thread.sleep(2000);
        driver.navigate().to(config.getString("RunCheckURL"));
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[3]/a")).click();
        Thread.sleep(4000);
    }
    public void inputField()throws Throwable{
        Thread.sleep(4000);
        SearchingField.sendKeys("Integration Run Check");
        Thread.sleep(3000);
    }
    public void ctaIntegration()throws Throwable{
        Thread.sleep(2000);
        Integration.click();
        Thread.sleep(2000);
    }
    public void ctaFill()throws Throwable{
        Thread.sleep(1000);
        Fill.click();
        Thread.sleep(2000);
    }
    public void ctaSubmit()throws Throwable{
        Thread.sleep(1000);
        Submit.click();
        Thread.sleep(2000);
    }
    public void ctaViewData()throws Throwable{
        Thread.sleep(2000);
        ViewData.click();
        Thread.sleep(2000);
    }
}
