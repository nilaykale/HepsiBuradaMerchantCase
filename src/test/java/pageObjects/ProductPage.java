package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class = \"product-detail\"]")
    private WebElement productDetail;

    @FindBy(css = ".box.product > a")
    private List<WebElement> Product;

    @FindBy(id = "product-name")
    private WebElement ProductName;

    @FindBy(id = "addToCart")
    private WebElement AddBasket;

    @FindBy(xpath = "//*[@class=\"checkoutui-Modal-2iZXl\"]")
    private WebElement CloseIcon;

    @FindBy(xpath = "//button[@class ='add-to-basket button small'][1]")
    private  WebElement AddAnotherProduct;

    public void clickProduct(){
        waitForElementToBeVisible(productDetail);
        click(Product.get(0));
        waitForElementToBeVisible(ProductName);
        setProductName(ProductName.getText());
    }

    public void clickBasket(){
        click(AddBasket);
    }

    public void closeIcon(){
        tryClick(CloseIcon);
    }

    public void anotherProduct(){
        click(AddAnotherProduct);
    }
}
