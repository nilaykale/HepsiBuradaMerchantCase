package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.BasketPage;


public class BasketPageStepDefinitions extends BaseStepDefinition{
    private final BasketPage basketPage = new BasketPage(driver);

    @Then("^Check the basket$")
    public void checkBasket() throws InterruptedException {basketPage.checkBasket();}
    @Then("^Delete all basket item$")
    public void emptyShoppingCart(){basketPage.emptyShoppingCart();}
}
