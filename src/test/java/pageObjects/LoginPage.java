package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "txtUserName")
    private WebElement emailField;

    @FindBy(id = "txtPassword")
    private  WebElement passwordField;

    @FindBy(id = "btnLogin")
    private  WebElement loginButton;

    @FindBy(xpath = "//span[text()='Hesabım']")
    private WebElement HESABIM_TITLE;

    public void login(String email, String password){
        sendKeys(emailField, email);
        sendKeys(passwordField, password);
        click(loginButton);
        Assert.assertTrue("-> Giris Yapilamadi!", isExist(HESABIM_TITLE));
    }

}
