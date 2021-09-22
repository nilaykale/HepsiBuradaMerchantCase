package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.HomePage;

public class HomePageStepDefinitions extends BaseStepDefinition {

    private final HomePage homePage = new HomePage(driver);

    @Given("^User is on homepage$")
    public void launchBrowser() {
        super.launchBrowser();
    }

    @Then("^User navigates to login page$")
    public void login() {
        homePage.login();
    }

    @Then("^User searches (.*)$")
    public  void search(String itemName){
        homePage.searchItem(itemName);
    }


}
