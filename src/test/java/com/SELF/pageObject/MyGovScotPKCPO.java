package com.SELF.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ResourceBundle;

public class MyGovScotPKCPO {
    ResourceBundle config;
    private WebDriver driver;

    //To initialise Web element
    public MyGovScotPKCPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
        config= ResourceBundle.getBundle("ConFig");
    }

    //To initiallise Web locators
    @FindBy (xpath = "//*[@id='main-links']/div/div[1]/div[1]/a")
    private WebElement StreetLighting;



    public void perth_Kinross(String PerthKinrossCouncil)throws Throwable{
        Thread.sleep(2000);
        driver.navigate().to(config.getString("PerthKinrossCouncil"));
        Thread.sleep(2000);
    }
    public void lightingPost()throws Throwable{
        Thread.sleep(2000);
        StreetLighting.isDisplayed();
        Thread.sleep(2000);
    }

}
