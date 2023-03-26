package Validations;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import PageObjects.LoginPage;

public class LoginValidations {
    
    private WebDriver driver;
    private LoginPage loginPage;
    
    //construtor
    public LoginValidations(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(this.driver);
    }
    
    public void validationLoginPage() { 
        Assertions.assertTrue(loginPage.getLogoText().isDisplayed());
    }
    
    
}
