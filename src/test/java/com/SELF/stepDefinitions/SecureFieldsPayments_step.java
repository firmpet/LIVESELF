package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.SecureFieldsPaymentsPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SecureFieldsPayments_step extends TestRunner {
    SecureFieldsPaymentsPO secure = new SecureFieldsPaymentsPO(driver);


    @When("^I navigate to \"([^\"]*)\" page$")
    public void i_navigate_to_page(String FieldPaymentURL) throws Throwable {
        Thread.sleep(2000);
        secure.fieldPaymentPage(FieldPaymentURL);
    }

    @Then("^I enter text in the field$")
    public void iEnterTextInTheField() throws Throwable{
        secure.charges();
    }

    @And("^I enter payment amount in the second field$")
    public void iEnterPaymentAmountInTheSecondField() throws Throwable{
        secure.amountField();
    }

    @When("^I enter full name in the field$")
    public void iEnterFullNameInTheField() throws Throwable{
        secure.name();
    }

    @And("^I enter full card number in the field$")
    public void iEnterFullCardNumberInTheField() throws Throwable{
        secure.paymentCard();
    }

    @And("^I enter expiry date$")
    public void iEnterExpiryDate() throws Throwable{
        secure.cardExpiryDate();
    }

    @And("^I enter card security date$")
    public void iEnterCardSecurityDate()throws Throwable {
        secure.securityNumber();
    }

    @Then("^I clicks Submit$")
    public void iClicksSubmit()throws Throwable {
        secure.submission();
    }
}
