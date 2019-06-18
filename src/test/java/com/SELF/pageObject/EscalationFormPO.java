package com.SELF.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EscalationFormPO {

    private WebDriver driver;

    //To initialise web elements
    public EscalationFormPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Define element locator
    @FindBy(linkText = "Escalation Test Process 23022018")
    private WebElement ctaEscalation;

    @FindBy (className = "Escalation Form One")
    private WebElement EscalationForm;

    @FindBy (xpath = "//*[@id='enterSomeText']")
    private WebElement testField;

    @FindBy (className = "submitText")
    private WebElement CtaSubmit;

    @FindBy (css = "#page>section>section>div>div.submission-message-content.clearfix>p:nth-child(2)")
    private WebElement SubmitSuccessfully;

    @FindBy (linkText = "MyRequests V3")
    private WebElement CtaMyRequestsV3;

    @FindBy (id = "hello-title")
    private WebElement MyRequestPage;

    @FindBy (id = "MyRequestTable")
    private WebElement MyRequestTable;

    @FindBy (xpath= "//td[@class='open-task']")
    private WebElement Search;

    @FindBy (xpath = "//h3[text()='Stage 1']")
    private WebElement CaseLogs;



    public void escalations() throws InterruptedException {
        driver.switchTo().frame(driver.findElement(By.id("MyServices")));
        //Thread.sleep(1000);
//        WebDriverWait wait = new WebDriverWait(driver, 20);
//        wait.until(ExpectedConditions.elementToBeClickable(ctaEscalation));
        ctaEscalation.click();
    }

    public void enterTest()throws Throwable{
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        testField.sendKeys("Testing");
    }
    public void submitBtn(){
        CtaSubmit.click();
    }
    public void submissionPage() throws Throwable{
        Thread.sleep(3000);
        SubmitSuccessfully.isDisplayed();
    }
    public void myRequestsV3Link() throws Throwable{
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        CtaMyRequestsV3.click();
    }
    public void searchField() throws Throwable{
        driver.switchTo().frame(driver.findElement(By.id("MyRequestsV3")));
        Search.click();
    }
    public void caseLogsPage()throws Throwable{
        CaseLogs.isDisplayed();
    }
}
