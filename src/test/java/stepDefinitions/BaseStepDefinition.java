package stepDefinitions;

import helper.DriverManager;
import helper.DriverType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseStepDefinition {

    protected static WebDriver driver;

    protected BaseStepDefinition() {
        if (driver == null) {
            driver = DriverManager.getInstance().getDriver(DriverType.CHROME);
        }
    }

    protected void launchBrowser() {
        driver.manage().window().maximize();
        driver.get("https://www.hepsiburada.com");
    }

}
