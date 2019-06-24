package com.SELF.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentFamPO {

    private WebDriver driver;

    //To initialise web elements
    public AssignmentFamPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Define element locator
    @FindBy(xpath = "//*[text()='Dashboard and Assignment Process']")
    private WebElement CtaDashboardAndAssignmentProcess;

    @FindBy (className = "_formName")
    private WebElement DashboardPage;

    @FindBy (id = "summary_show")
    private WebElement SummaryField1;

    @FindBy (id = "summary_show")
    private WebElement SummaryField;

//    @FindBy (id = "select1")
//    private WebElement SpecificUserField;

    @FindBy (id = "select1")
    private WebElement UserEmail;

//    @FindBy (id = "assignToSpecificG")
//    private WebElement SpecificGroup;

    @FindBy (id = "assignToSpecificG")
    private WebElement SpecificGroupField;

    @FindBy (className = "submitbutton")
    private WebElement CtaSubmit;

    @FindBy (xpath = "//*[@id='page']/section/section/div/div[1]/p[2]")
    private WebElement SuccessfulSubmission;




    public void dashboardAndAssignmentProcessLink() throws Throwable{
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.id("MyServices")));
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(CtaDashboardAndAssignmentProcess));

        CtaDashboardAndAssignmentProcess.click();
    }
    public void formPage()throws Throwable{
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        Thread.sleep(3000);
        DashboardPage.isDisplayed();
    }

    public void clearField(){
        SummaryField1.clear();
    }

    public void enterText(){
        SummaryField.sendKeys("Summary Test 2019-04-08");
    }

//    public void userField()throws Throwable{
//        Thread.sleep(1000);
//        SpecificUserField.click();
//    }

    public void enterEmail()throws Throwable{
        UserEmail.click();
        UserEmail.sendKeys("petermalt@firmstep.com");
        Thread.sleep(2000);
    }

//    public void groupField()throws Throwable{
//        SpecificGroup.click();
//        Thread.sleep(1000);
//    }

    public void groupName()throws Throwable{
        SpecificGroupField.click();
        SpecificGroupField.sendKeys("CSA");
        Thread.sleep(2000);
    }

    public void submitBtn()throws Throwable{
        CtaSubmit.click();
        Thread.sleep(1000);
    }

    public void formSubmit() throws Throwable{
        Thread.sleep(3000);
        SuccessfulSubmission.isDisplayed();
        Thread.sleep(1000);
    }
}
