package com.SELF.Runner;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

import java.util.ResourceBundle;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"com.SELF.stepDefinitions"},
        tags = {"@reg"},
        format = {
                "pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        },plugin = "json:target/cucumber-reports/CucumberTestReport.json")

public class TestRunner {

    private TestNGCucumberRunner testNGCucumberRunner;

    public static WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUpCucumber() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @BeforeMethod(alwaysRun = true)
    @Parameters("browser")
    public void setUpClass(String browser) throws Exception {


        //Driver Path
        WebDriverManager.iedriver().setup();
        driver = new InternetExplorerDriver();

//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//
//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();

        //Maximize page
        driver.manage().window().maximize();

        //Launch Browser
        ResourceBundle conFig = ResourceBundle.getBundle("conFig");
        driver.get(conFig.getString("URL"));


        //Browser Capabilities
        //Internet Explorer
        DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
        capabilities.setCapability("disable-popup-blocking",true);
        capabilities.setCapability("unexpectedAlertBehaviour","accept");
        capabilities.setCapability("nativeEvents",false);
        capabilities.setCapability("RequireWindowFocus ", true);
        capabilities.setCapability("ignoreProtectedModeSettings",true);
        capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);

        capabilities.setJavascriptEnabled(true);
        capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
        capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
        capabilities.setCapability(InternetExplorerDriver.ENABLE_ELEMENT_CACHE_CLEANUP, true);
        capabilities.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);


       //Chrome Browser
        capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
        capabilities.setCapability("unexpectedAlertBehaviour","ignore");
        ChromeOptions opts = new ChromeOptions();
        opts.addArguments("start-maximized");
        capabilities.setCapability(ChromeOptions.CAPABILITY, opts);

    }


    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }

    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();

    }
    @AfterMethod

    public void afterMethod() {

        // Close the driver

        driver.quit();

    }
}

