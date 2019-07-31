package com.SELF.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ResourceBundle;

public class ContinueFromDashboardPO {
    ResourceBundle config;
    private WebDriver driver;
    JavascriptExecutor jse = (JavascriptExecutor)driver;

    //To initialise Web element
    public ContinueFromDashboardPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
        config= ResourceBundle.getBundle("ConFig");
    }

    //To initialise Element locator
    @FindBy (xpath = "//*[@id='AF-Form-44914046-5c8f-490e-a55c-5451c2f98513']/div/div/button[2]")
    private WebElement CtaSubmit;



    public void dashPage(String DashPage)throws Throwable{
        driver.navigate().to(config.getString("DashPage"));
        Thread.sleep(2000);
        driver.findElement(By.id("loginLink")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[3]/a")).click();
    }
    public void continueFromDashboard(String ContinueFromDashboard)throws Throwable{
        Thread.sleep(2000);
        driver.navigate().to(config.getString("ContinueFromDashboard"));
        Thread.sleep(2000);
    }

}
