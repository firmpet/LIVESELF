package com.SELF.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ResourceBundle;

public class InboxEmail_ContentAndOpenPO  {
    ResourceBundle config;
    private WebDriver driver;

    //To initialise Web element
    public InboxEmail_ContentAndOpenPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
        config= ResourceBundle.getBundle("ConFig");
    }


    //To initialise Element locator
    @FindBy (xpath = "//*[@id='inboxnew_7706']")
    private WebElement InboxModal;

    @FindBy (xpath = "//*[@id='app-inbox']/div/div[2]/div[1]/div[2]/div[1]/div[1]/p[2]")
    private WebElement InboxMessage;



    public void inboxEmail(String CSASelectWorkspace)throws Throwable{
        Thread.sleep(2000);
        driver.navigate().to(config.getString("CSASelectWorkspace"));
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[3]/a")).click();
        Thread.sleep(2000);
    }
    public void ctaInbox()throws Throwable{
        Thread.sleep(2000);
        InboxModal.click();
        Thread.sleep(2000);
    }
    public void message()throws Throwable{
        Thread.sleep(2000);
        InboxMessage.click();
        Thread.sleep(2000);
    }

}
