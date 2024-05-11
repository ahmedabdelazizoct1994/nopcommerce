package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Collection;


public class UserRegistrationPage extends PageBase 
{
	public UserRegistrationPage(WebDriver driver) {
		super(driver);
	}

	private final By genderRdoBtn = By.id("gender-male");
	private final By fnTxtBox = By.id("FirstName");
	private final By lnTxtBox = By.id("LastName");
	private final By emailTxtBox = By.id("Email");
	private final By passwordTxtBox = By.id("Password");
	private final By confirmPasswordTxtBox = By.id("ConfirmPassword");
	private final By registerBtn = By.id("register-button");
	private final By successMessage = By.cssSelector("div.result");
	private final By logoutLink = By.cssSelector("a.ico-logout");

	public void userRegistration(String firstName , String lastName , String email , String password) {
		clickButton(getWebElement(genderRdoBtn));
		setTextElementText(getWebElement(fnTxtBox), firstName);
		setTextElementText(getWebElement(lnTxtBox), lastName);
		setTextElementText(getWebElement(emailTxtBox), email);
		setTextElementText(getWebElement(passwordTxtBox), password);
		setTextElementText(getWebElement(confirmPasswordTxtBox), password);
		clickButton(getWebElement(registerBtn));
	}

	public void userLogout(){
			clickButton(getWebElement(logoutLink));
		}

	public String successMsg() {
		 return getWebElement(successMessage).getText();
	}
}
