package com.SELF.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class CapitaSSO_WirralPO {
    private WebDriver driver;

    //To initialise Web element
    public CapitaSSO_WirralPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //To initialise element locator
    @FindBy (linkText = "Capita Connect v3")
    private WebElement CtaCapitaConnect;

    @FindBy (id = "dashboard_button")
    private WebElement MyServicesDashboard;

    @FindBy (xpath = "//*[text()='Add Service']")
    private WebElement AddServicesPage;

    @FindBy (xpath = "//*[@id='accordionTile11']/div/div[2]/div/div[1]/div")
    private WebElement CouncilTax;

    @FindBy (xpath = "//*[@id='accordionTile12']/div/div[2]/div/div[1]/div")
    private WebElement BusinessRates;

    @FindBy (xpath = "//*[@id='addServices']/div[3]/div/input[2]")
    private WebElement CtaConfirm;

    @FindBy (xpath = "//*[@id='tile_ct']/div/div[3]/span/a")
    private WebElement RemoveCouncilTax;

    @FindBy (xpath = "//*[@id='tile_nr']/div/div[3]/span")
    private WebElement RemoveBusinessRates;



    public void capitaConnectBtn()throws Throwable{
        Thread.sleep(2000);
        CtaCapitaConnect.click();
        Thread.sleep(2000);
    }
    public void ctaMyServices()throws Throwable{
        driver.switchTo().frame(driver.findElement(By.id("CapitaConnect")));
        Thread.sleep(1000);
        MyServicesDashboard.click();
        Thread.sleep(4000);

        //store parent window value in string
        String parentWindow = driver.getWindowHandle();

        //store the set of all windows
        Set<String> allwindows= driver.getWindowHandles();

        for (String childWindow : allwindows) {
            if(!childWindow.equals(parentWindow))
            {
                driver.switchTo().window(childWindow);
                driver.manage().window().maximize();
            }
        }

        Thread.sleep(1000);
    }
    public void ctaAddServices()throws Throwable{
        Thread.sleep(2000);
        AddServicesPage.click();
        Thread.sleep(2000);
    }
    public void ctaAddCouncilTax()throws Throwable{
        Thread.sleep(1000);
        CouncilTax.click();
        Thread.sleep(2000);
    }
    public void ctaAddBusinessRates()throws Throwable{
        Thread.sleep(1000);
        BusinessRates.click();
        Thread.sleep(2000);
    }
    public void confirm()throws Throwable{
        Thread.sleep(3000);
        CtaConfirm.click();
        Thread.sleep(2000);
    }
    public void councilTaxAccount()throws Throwable{
        Thread.sleep(2000);
        RemoveCouncilTax.click();
        Thread.sleep(3000);
    }
    public void businessRatesAccount()throws Throwable{
        Thread.sleep(2000);
        RemoveBusinessRates.click();
        Thread.sleep(3000);
    }



}
