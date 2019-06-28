package com.SELF.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ResourceBundle;

public class ReceptionFaceToFacePO {
    ResourceBundle config;
    private WebDriver driver;

    //To initialise web elements
    public ReceptionFaceToFacePO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
        config=ResourceBundle.getBundle("ConFig");
    }

    //Define element locator
    @FindBy (css = "#reception > .thumbnail-like")
    private WebElement Reception;

    @FindBy (xpath = "//h3[text()='Issue Ticket']")
    private WebElement IssueTicketPage;

    @FindBy (xpath = "/html/body/div[1]/div[6]/div/div/form/div[1]/div[4]/div/label[1]")
    private WebElement Individual;

    @FindBy (xpath = "//*[@id='title_id']")
    private WebElement CtaTitle;

    @FindBy (xpath = "//option[@value='3']")
    private WebElement SelectTitle;

    @FindBy (xpath = "//*[@id='first_name']")
    private WebElement FirstName;

    @FindBy (xpath = "//*[@id='last_name']")
    private WebElement LastName;

    @FindBy (css = ".btn-submit")
    private WebElement CtaSubmit;

    @FindBy (xpath = "//*[@name='source_id']")
    private WebElement ServiceRadioBtn;



    public void csaSelectWorkspace(String ReceptionF2FURL)throws Throwable{
        Thread.sleep(2000);
        driver.navigate().to(config.getString("ReceptionF2FURL"));
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[3]/a")).click();
        Thread.sleep(2000);
    }
    public void receptionModal()throws Throwable{
        Thread.sleep(2000);
        Reception.click();
        Thread.sleep(2000);
    }
    public void displayPage()throws Throwable{
        Thread.sleep(2000);
        IssueTicketPage.isDisplayed();
        Thread.sleep(2000);
    }
    public void selectIndividual()throws Throwable{
        Thread.sleep(1000);
        Individual.click();
        Thread.sleep(1000);
    }
    public void titleOption()throws Throwable{
        CtaTitle.click();
        SelectTitle.click();
        Thread.sleep(2000);
    }
    public void name()throws Throwable {
        Thread.sleep(2000);
        FirstName.click();
        FirstName.sendKeys("Tester");
        Thread.sleep(2000);
    }
    public void secondName()throws Throwable{
        Thread.sleep(3000);
        LastName.click();
        LastName.sendKeys("Testers");
        Thread.sleep(2000);
    }
    public void submit()throws Throwable{
        Thread.sleep(4000);
        CtaSubmit.click();
        Thread.sleep(3000);
    }
    public void releaseTesting()throws Throwable{
        Thread.sleep(2000);
        ServiceRadioBtn.click();
        Thread.sleep(2000);
    }


}
