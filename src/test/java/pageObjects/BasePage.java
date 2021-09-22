package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public abstract class BasePage {

    protected WebDriver driver;
    private static String productName;
    private ArrayList<String> storeNames = new ArrayList<>();

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected void click(WebElement element){
        waitForElementToBeClickable(element);
        element.click();
    }

    protected  void sendKeys(WebElement element, String keys){
        waitForElementToBeVisible(element);
        element.sendKeys(keys);
    }

    protected void waitForElementToBeVisible(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    private void waitForElementToBeClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public String getProductName(WebElement element) {

        return productName;
    }
    public String getProductName() {
        return productName;
    }
    public List<String> getStoreNames() {
        return storeNames;
    }

    public void setProductName(String name) {
        productName = name;
    }

    protected void tryClick(WebElement element) {
        try {
            element.click();
        } catch (Exception ignored) {
        }
    }

    public Boolean isExist(WebElement element) {
        waitForElementToBeVisible(element);
        return element.isDisplayed();
    }
}
