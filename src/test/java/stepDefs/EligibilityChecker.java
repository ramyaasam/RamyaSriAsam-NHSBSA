package stepDefs;

import com.nhs.tests.pages.EligibilityCheckerPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EligibilityChecker {

    EligibilityCheckerPage eligibilityCheckerPage = new EligibilityCheckerPage();

    @Given("^I am a person from Wales")
    public void i_enter_my_country(){
        eligibilityCheckerPage.setCountryDetails();
    }

    @When("^I put my circumstances in the Checker tool")
    public void i_enter_my_details_on_checkerTool(){
        eligibilityCheckerPage.enterEligibility();
    }

    @Then("^I should get a result of whether I will get help or not")
    public void verify_the_result(){eligibilityCheckerPage.validateEligibility();}
}
