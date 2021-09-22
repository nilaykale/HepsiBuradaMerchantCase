package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "myAccount")
    private WebElement loginSection;

    @FindBy(xpath = "//a[contains(text(),'Giriş Yap')]")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"SearchBoxOld\"]//input")
    private WebElement searchBar;

    @FindBy(xpath = "//div[@class=\"SearchBoxOld-buttonContainer\"]")
    private WebElement searchButton;


    public void login(){
        click(loginSection);
        click(loginButton);
    }

    public void searchItem(String text){
        sendKeys(searchBar, text);
        click(searchButton);
    }

}