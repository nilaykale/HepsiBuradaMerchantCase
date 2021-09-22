package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BasketPage extends BasePage {
    public BasketPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "shoppingCart")
    private WebElement BasketButton;

    @FindBy(css = ".product_name_3Lh3t > a")
    private List<WebElement> PRODUCT_NAME_LIST_BASKET;
    @FindBy(css = ".merchant_name_1NA4w > span > a")
    private List<WebElement> STORE_NAME_LIST_BASKET;
    @FindBy(xpath = "//div[@class=\"modal_container_2OlF3\"]//a[@class=\"close_2kUgV\"]")
    private WebElement closePopUpIcon;

    @FindBy(xpath = "//a[@class = \"product_delete_1zR-0\"]")
    private List<WebElement> removeItemButtons;


    public void checkBasket() throws InterruptedException {
        click(BasketButton);
        Thread.sleep(5000);

        for (WebElement productName : PRODUCT_NAME_LIST_BASKET) {
            Assert.assertEquals("-> Sepetteki Urunler Yanlıs!\nSepetteki Urun Adi: " + productName.getText() +
                            "\nEklenen Urun Adi: " + getProductName(),
                    productName.getText(),getProductName());
        }

        for (int productIndex=0; productIndex < getStoreNames().size(); productIndex++) {
            Assert.assertEquals("-> Sepete Yanlis Magazaya Ait Urun Eklenmis!\nMagaza Adi: " + STORE_NAME_LIST_BASKET.get(productIndex).getText(),
                    STORE_NAME_LIST_BASKET.get(productIndex).getText(),getStoreNames().get(productIndex));
        }
    }

    public void emptyShoppingCart() {
        if (removeItemButtons.size() == 0)
            return;

        click(removeItemButtons.get(0));
        click(closePopUpIcon);
        for (WebElement remoteItemButton : removeItemButtons) {
            click(remoteItemButton);
        }
    }
}
