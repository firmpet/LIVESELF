package com.SELF.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EscalationSelfPO {

    private WebDriver driver;

    //To Initialise Web elements
    public EscalationSelfPO(WebDriver driver){

        this.driver = driver;

        PageFactory.initElements(driver, this);
    }
}
