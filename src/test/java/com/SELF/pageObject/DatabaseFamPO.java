package com.SELF.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatabaseFamPO {

    private WebDriver driver;

    //To initialise web elements
    public DatabaseFamPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Define element locator
    @FindBy(xpath = "//*[text()='Database Integration Test']")
    private WebElement CtaDatabaseIntegration;

    @FindBy (id = "select1")
    private WebElement Select1Field;

    @FindBy (className = "lookup-option")
    private WebElement CtaTest;

    @FindBy (id = "text1")
    private WebElement Email;

    @FindBy (className = "nextbutton")
    private WebElement Next;

    @FindBy (xpath = "//*[text()='subform 1']")
    private WebElement ReadOnlySubformColumn;

    @FindBy (className = "fa-chevron-right")
    private WebElement CtaNext;

    @FindBy (xpath = "//*[@id='AF-Form-2193724e-7b47-44d7-bf73-03c8b98b7033']/section[1]/ul/li[3]/a")
    private WebElement CtaAddAEntry;

    @FindBy (id = "LastNameadd")
    private WebElement EnterName;

    @FindBy(id = "FirstNameadd")
    private WebElement FirstName;

    @FindBy(id = "emailadd")
    private WebElement EnterEmail;

    @FindBy(xpath = "//*[text()='Submit']")
    private WebElement Submit;

    @FindBy(xpath = "//p[text()='Thank you for submitting Database Integration Stage One Form']")
    private WebElement SubmissionPage;



    public void databaseIntegrationBtn() throws Throwable{
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.id("MyServices")));
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(CtaDatabaseIntegration));

        CtaDatabaseIntegration.click();
    }
    public void enterText() throws Throwable {
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        Select1Field.click();
    }
    public void testBtn() {
        CtaTest.click();
    }
    public void enterEmail() throws Throwable {
        Thread.sleep(1000);
        Email.clear();
        Thread.sleep(2000);
        Email.sendKeys("support@firmstep.com");
    }
    public void nextBtn() throws Throwable{
        Thread.sleep(1000);
        Next.click();
    }

    public void readOnlySubform() throws Throwable{
        Thread.sleep(2000);
        ReadOnlySubformColumn.isDisplayed();
        Thread.sleep(1000);
    }

    public void nextLink() {
        CtaNext.click();
    }

    public void enterData() {
        CtaAddAEntry.isDisplayed();
    }

    public void textField() {
        EnterName.sendKeys("Dan");
    }

    public void nameField()throws Throwable {
        Thread.sleep(1000);
        FirstName.sendKeys("Daniel");
    }

    public void email()throws Throwable {
        Thread.sleep(2000);
        EnterEmail.sendKeys("test@example.com");
    }

    public void submitBtn()throws Throwable {
        Thread.sleep(1000);
        Submit.click();
        Thread.sleep(2000);
    }
    public void successPage() throws Throwable{
        Thread.sleep(3000);
        SubmissionPage.isDisplayed();
        Thread.sleep(3000);
    }
}
