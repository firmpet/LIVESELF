package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.LoggingAndUCRNGenPO;
import com.mifmif.common.regex.Generex;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import java.util.ResourceBundle;
import java.util.Set;

public class LoggingAndUCRNGen_step extends TestRunner {
    ResourceBundle config;
    private LoggingAndUCRNGenPO ucrn = new LoggingAndUCRNGenPO(driver);


    @Given("^I launch \"([^\"]*)\" page$")
    public void iLaunchPage(String LogOut) throws Throwable {
        ucrn.startingPage(LogOut);
    }

    @When("^I launch \"([^\"]*)\" page on Inttest$")
    public void i_launch_page_on_Inttest(String AutoTestURL) throws Throwable {
        ucrn.autoTestPage(AutoTestURL);
    }

    @When("^I enter Username$")
    public void iEnterUsername()throws Throwable {
        ucrn.usernameField();
    }

    @And("^I enter Password$")
    public void iEnterPassword() throws Throwable{
        ucrn.passwordField();
    }

    @Then("^I click Log in button$")
    public void iClickLogInButton() throws Throwable{
        ucrn.ctaLogIn();
    }

    @When("^I navigate to \"([^\"]*)\" URL$")
    public void iNavigateToURL(String AdminPeople) throws Throwable {
        ucrn.adminPage(AdminPeople);
    }

    @Then("^I click on Add User toggle$")
    public void iClickOnAddUserToggle() throws Throwable{
        ucrn.ctaAddUser();
    }

    @And("^I enter new User email$")
    public void iEnterNewUserEmail() throws Throwable {

        //Auto Generate Email
        String regex = "releasetesting\\+ucmtestnew0000\\w{10}\\@firmstep\\.com";
        driver.findElement(By.xpath("//*[@id='edit-name']")).sendKeys(new Generex(regex).random());
        Thread.sleep(3000);

        //Copy Auto Generated Email
        Thread.sleep(1000);
        String confirmEmail = driver.findElement(By.xpath("//*[@id='edit-name']")).getAttribute("value").toString();
        Thread.sleep(3000);

        System.out.println(confirmEmail);

        driver.findElement(By.xpath("//*[@id='edit-mail']")).sendKeys(confirmEmail);
        Thread.sleep(3000);

        driver.findElement(By.id("edit-pass-pass1")).sendKeys("firmstep");
        Thread.sleep(3000);

        driver.findElement(By.id("edit-pass-pass2")).sendKeys("firmstep");
        Thread.sleep(3000);

        driver.findElement(By.id("edit-submit")).click();
        Thread.sleep(3000);

        driver.navigate().to("https://releasetesting-dash.achieveservice.com/login/?support");
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[4]/a")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/form/fieldset/div[1]/input[2]")).sendKeys(confirmEmail);
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/form/fieldset/div[2]/input")).sendKeys("firmstep");
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/form/fieldset/div[3]/button")).click();
        Thread.sleep(3000);

        driver.navigate().to("https://releasetesting-forms.achieveservice.com/");
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[3]/a")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='page']/div/nav[1]/div[2]/ul/li/a")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='forms-dropdown-menu']/li[4]/a")).click();
        Thread.sleep(3000);

        //store parent window value in string
        String parentWindow = driver.getWindowHandle();

        //store the set of all windows
        Set<String> allwindows = driver.getWindowHandles();

        for (String childWindow : allwindows) {
            if (!childWindow.equals(parentWindow)) {
                driver.switchTo().window(childWindow);
                driver.manage().window().maximize();
            }
        }

        Thread.sleep(8000);

        driver.findElement(By.xpath("//*[@id='users_table_filter']/label/input")).sendKeys(confirmEmail);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='tbody_users']/tr/td[4]/button")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='ucrn_search_results']/div/label/input")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("save_user")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='tbody_users']/tr/td[4]/button")).click();
        Thread.sleep(4000);

        String ucrn = driver.findElement(By.xpath("//*[@id='user_ucrn']")).getAttribute("value").toString();
        Thread.sleep(4000);

        System.out.println(ucrn);
        Thread.sleep(2000);

        String CopyText = driver.findElement(By.xpath("//*[@id='user_config']/form/div[4]/div/p")).getText();
        Thread.sleep(3000);

        System.out.println(CopyText);

        driver.findElement(By.xpath("//*[@id='btn_show_user_model']")).click();
        Thread.sleep(3000);

        driver.findElement (By.id("new_user_id_input")).sendKeys(CopyText);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='accordion_groups']/div/div[1]/h4/a")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='usergroup_list']/ul/li/ul/li[3]/label")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='usergroup_list']/ul/li/ul/li[4]/label")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='usergroup_list']/ul/li/ul/li[5]/label")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='usergroup_list']/ul/li/ul/li[6]/label")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='usergroup_list']/ul/li/ul/li[7]/label")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='usergroup_list']/ul/li/ul/li[8]/label")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='usergroup_list']/ul/li/ul/li[9]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='usergroup_list']/ul/li/ul/li[10]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='usergroup_list']/ul/li/ul/li[13]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='save_user']")).click();
        Thread.sleep(3000);

        driver.navigate().to("https://releasetesting-inttest.achieveservice.com/login/?support");
//        driver.navigate().to("https://releasetesting-daily.achieveservice.com/login/?support");
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[3]/a")).click();
        Thread.sleep(6000);

        driver.findElement(By.xpath("//*[text()='Settings']")).click();
        Thread.sleep(6000);

        driver.findElement(By.xpath("//*[text()=' CSA Accounts']")).click();
        Thread.sleep(7000);

        driver.findElement(By.id("AddCSAMapping")).click();
        Thread.sleep(6000);

        driver.findElement(By.xpath("//*[@id='alias']")).sendKeys(CopyText);
        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("releasetesting");
        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("new");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='skip_ucrn_step']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='ucrn']")).sendKeys(ucrn);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[text()='Save changes']")).click();
        Thread.sleep(5000);

        driver.navigate().to("https://releasetesting-inttest.achieveservice.com/login/?logout");
//        driver.navigate().to("https://releasetesting-daily.achieveservice.com/login/?logout");
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div/p/a")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[4]/a")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div/form/fieldset/div[1]/input[2]")).sendKeys(confirmEmail);
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div/form/fieldset/div[2]/input")).sendKeys("firmstep");
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div/form/fieldset/div[3]/button")).click();
        Thread.sleep(6000);

        driver.findElement(By.xpath("//a[@id='phone']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='query']")).sendKeys("test");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='query-button']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='AddCase-0']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='module-srt-selector']/div[2]/div[2]/select/option[1]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='module-srt-selector']/div[2]/div[3]/select/option")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='module-srt-selector']/div[2]/div[4]/select/option[1]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='module-srt-selector']/button")).click();
        Thread.sleep(25000);

        driver.switchTo().frame(driver.findElement(By.id("form_one")));
        Thread.sleep(3000);

        //driver.findElement(By.id("comma")).sendKeys("Footpath,Park,Road,Cycle Track");

        driver.findElement(By.xpath("//*[text()='Footpath']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[text()='Park']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[text()='Road']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[text()='Cycle Track']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='AF-Form-03d61b5e-1366-4d86-ae3b-82548965e417']/div/div/button[2]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='tree']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='tree']/option[2]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='bench']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='bench']/option[2]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='lamppost']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='lamppost']/option[2]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='AF-Form-03d61b5e-1366-4d86-ae3b-82548965e417']/div/div/button[3]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='AF-Form-03d61b5e-1366-4d86-ae3b-82548965e417']/div/div/button[3]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='AF-Form-03d61b5e-1366-4d86-ae3b-82548965e417']/section[2]/section/div[2]/div/fieldset/button")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='amountToBeSummed']")).sendKeys("30");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='AF-Form-14e5cfb1-979c-45d8-90e2-4dd38d6a2b0c']/div/div/button[2]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='AF-Form-03d61b5e-1366-4d86-ae3b-82548965e417']/div/div/button[3]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[text()='Index']")).click();
        Thread.sleep(3000);

        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id='civi-search-field']")).sendKeys("test");
        Thread.sleep(3000);

    }

}
