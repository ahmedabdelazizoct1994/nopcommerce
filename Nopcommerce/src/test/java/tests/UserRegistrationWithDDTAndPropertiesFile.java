package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import data.LoadProperties;
import pages.HomePage;
import pages.UserRegistrationPage;


public class UserRegistrationWithDDTAndPropertiesFile extends TestBase
{
	HomePage homeObject ; 
	UserRegistrationPage registerObject ; 
	String firstname = LoadProperties.userData.getProperty("firstname");
	String lastname = LoadProperties.userData.getProperty("lastname"); 
	String email = LoadProperties.userData.getProperty("email"); 
	String Password = LoadProperties.userData.getProperty("password");

	@Test
	public void UserCanRegisterSuccessfully() {

		homeObject = new HomePage(driver);
		homeObject.openRegistrationPage();
		registerObject = new UserRegistrationPage(driver);
		registerObject.userRegistration(firstname, lastname, email, Password);
		Assert.assertTrue(registerObject.successMsg().contains("Your registration completed"), "Success message does not contain expected text.");
	}}