package OrgHRM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    VerificationPage verificationPage = new VerificationPage();

    @Given("user is on homepage")
    public void userIsOnHomepage() {
        homePage.homepage();
    }

    @When("user enter all details")
    public void user_enter_all_details() {
       loginPage.usershouldbeLogin();
    }

    @Then("user should login successfully")
    public void user_should_login_successfully() {
        verificationPage.welcomePage();

    }

    }
