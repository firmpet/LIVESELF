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
    @FindBy (xpath = "//*[@id='DataTables_Table_0_filter']/label/input")
    private WebElement SearchingField;

    @FindBy (xpath = "//*[text()='Integration Run Check with Conditions']")
    private WebElement Integration;

    @FindBy (xpath = "//*[text()='Fill']")
    private WebElement Fill;

    @FindBy (xpath = "//*[text()='Submit']")   //  //*[@id='AF-Form-4b9e8e0e-3421-48bd-bfb0-3d1a339c2c28']/div/div/button[2]
    private WebElement Submit;

    @FindBy (xpath = "//*[text()='View Data']")
    private WebElement ViewData;

    @FindBy (xpath = "//*[@id='FS-Case-2047565086']/td[1]/div/span")  //   //td[@class=' submission']
    private WebElement Reference;

    @FindBy (xpath = "//*[@id='5d3ad6a37abf4']/td[1]/div/span")
    private WebElement Stage3;

    @FindBy (xpath = "/html/body/div[2]/form[1]/input[2]")
    private WebElement PaymentSubmit;

    @FindBy (xpath = "//*[@id='5d3ad6a2adc5c']/td[1]/div/span")
    private WebElement Stage2;

    @FindBy (id = "Test1")
    private WebElement Field1;

    @FindBy (id = "Test3")
    private WebElement Field3;

    @FindBy (id = "Test4")
    private WebElement Field4;

    @FindBy (id = "Test5")
    private WebElement Field5;

    @FindBy (xpath = "//*[text()='Next Task']")
    private WebElement NextTask;

    @FindBy (xpath = "//*[@id='page']/div/nav[1]/div[2]/ul/li/a")
    private WebElement TestUser;

    @FindBy (xpath = "//*[@id='forms-dropdown-menu']/li[5]/a")
    private WebElement IntegrationManager;

    @FindBy (xpath = "//*[@id='link_logs']")
    private WebElement LogSection;

    @FindBy (xpath = "//*[@id='maintable-list_filter']/label/input")
    private WebElement Search;



    public void CheckPages(String RunCheckURL)throws Throwable{
        Thread.sleep(2000);
        driver.navigate().to(config.getString("RunCheckURL"));
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[3]/a")).click();
        Thread.sleep(2000);
    }
    public void inputField()throws Throwable{
        Thread.sleep(1000);
        SearchingField.sendKeys("Integration Run Check");
        Thread.sleep(3000);
    }
    public void ctaIntegration()throws Throwable{
        Thread.sleep(1000);
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
        Thread.sleep(1000);
        ViewData.click();
        Thread.sleep(2000);
    }
    public void caseID()throws Throwable{
        Thread.sleep(2000);
        Reference.click();
        Thread.sleep(2000);
    }
    public void ctaStage3()throws Throwable{
        Thread.sleep(2000);
        Stage3.click();
        Thread.sleep(3000);
    }
    public void payment()throws Throwable{
        Thread.sleep(2000);
        PaymentSubmit.click();
        Thread.sleep(5000);
    }
    public void ctaStage2()throws Throwable{
        Thread.sleep(2000);
        Stage2.click();
        Thread.sleep(2000);
    }
    public void test1Field()throws Throwable{
        Thread.sleep(2000);
        Field1.sendKeys("Yes");
        Thread.sleep(2000);
    }
    public void test3Field()throws Throwable{
        Thread.sleep(2000);
        Field3.sendKeys("Yes");
        Thread.sleep(2000);
    }
    public void test4Field()throws Throwable{
        Thread.sleep(2000);
        Field4.sendKeys("Yes");
        Thread.sleep(2000);
    }
    public void test5Field()throws Throwable{
        Thread.sleep(2000);
        Field5.sendKeys("Yes");
        Thread.sleep(2000);
    }
    public void ctaNextTask()throws Throwable{
        Thread.sleep(2000);
        NextTask.click();
        Thread.sleep(2000);
    }
    public void ctaTestUser()throws Throwable{
        Thread.sleep(3000);
        TestUser.click();
        Thread.sleep(3000);
    }
    public void integration()throws Throwable{
        Thread.sleep(3000);
        IntegrationManager.click();
        Thread.sleep(3000);
    }
    public void logsLink()throws Throwable{
        Thread.sleep(3000);
        LogSection.click();
        Thread.sleep(3000);
    }
    public void inputSearch()throws Throwable{
        Thread.sleep(3000);
        Search.sendKeys("FS-Case-2047565086");
        Thread.sleep(3000);
    }

}


