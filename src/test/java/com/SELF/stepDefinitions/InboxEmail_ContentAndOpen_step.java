package com.SELF.stepDefinitions;

import com.SELF.Runner.TestRunner;
import com.SELF.pageObject.InboxEmail_ContentAndOpenPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class InboxEmail_ContentAndOpen_step extends TestRunner {
    InboxEmail_ContentAndOpenPO inbox = new InboxEmail_ContentAndOpenPO(driver);


    @When("^I navigate to \"([^\"]*)\" inbox$")
    public void i_navigate_to_inbox(String CSASelectWorkspace) throws Throwable {
        inbox.inboxEmail(CSASelectWorkspace);
    }

    @And("^I click Inbox modal$")
    public void iClickInboxModal() throws Throwable{
        inbox.ctaInbox();
    }

    @And("^I click on email$")
    public void iClickOnEmail() throws Throwable{
        inbox.message();
    }


}
