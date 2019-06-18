package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.DatabaseFamPO;
import com.SELF.pageObject.DatabaseSelfPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class DatabaceSelf_step extends TestRunner {
    private DatabaseSelfPO dataB = new DatabaseSelfPO(driver);

    @When("^I select test from dropdown field and I enter email address in text field in Select List Check column$")
    public void iSelectTestFromDropdownFieldAndIEnterEmailAddressInTextFieldInSelectListCheckColumn() throws Throwable {
        dataB.optionsField();
        dataB.insertText();
        dataB.clear();
        dataB.insertEmail();
    }

    @And("^I fill in firstaname, lastname and email in the fields$")
    public void iFillInFirstanameLastnameAndEmailInTheFields() {
        dataB.fName();
        dataB.lName();
        dataB.emailField();

    }
}
