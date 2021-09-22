package stepDefinitions;

import io.cucumber.java.en.Then;
import pageObjects.LoginPage;

public class LoginPageStepDefinitions extends BaseStepDefinition {

    private final LoginPage loginPage = new LoginPage(driver);

    @Then("^User enters (.*) and (.*)$")
    public void login(String email, String password){
        loginPage.login(email, password);
    }

}
