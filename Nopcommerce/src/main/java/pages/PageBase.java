package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

    protected WebDriver driver;

    public PageBase(WebDriver driver) {
        this.driver = driver; // Initialize the driver field
        PageFactory.initElements(driver, this);
    }

    public WebElement getWebElement(By locator) {
        return driver.findElement(locator);
    }

    protected static void clickButton(WebElement button) {
        button.click();
    }

    protected static void setTextElementText(WebElement textElement, String value) {
        textElement.sendKeys(value);
    }


}
