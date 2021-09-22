package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.ProductPage;

public class ProductPageStepDefinitions extends BaseStepDefinition {

    private final ProductPage productPage = new ProductPage(driver);

    @Then("^User chooses product$")
    public void clickProduct(){productPage.clickProduct();}

    @Then("^Add the basket$")
    public void clickBasket(){productPage.clickBasket();}

    @And("^Close the pop-up$")
    public void closeIcon(){productPage.closeIcon();}

    @Then ("^User chooses the same product but another seller$")
    public void anotherProduct(){productPage.anotherProduct();}
}
