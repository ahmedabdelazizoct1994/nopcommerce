package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);

    }

    private final By registerLink = By.cssSelector("a.ico-register");


    public void openRegistrationPage() {
        getWebElement(registerLink).click();
    }


}
