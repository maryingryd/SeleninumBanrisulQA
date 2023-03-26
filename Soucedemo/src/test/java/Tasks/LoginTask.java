package Tasks;


import org.openqa.selenium.WebDriver;

import PageObjects.LoginPage;
import Validations.LoginValidations;

public class LoginTask {
    private WebDriver driver;
    private LoginPage loginPage;
    private LoginValidations loginValidation;
   
    public LoginTask(WebDriver driver) {       
        this.driver = driver;
        loginPage = new LoginPage(this.driver);
        loginValidation = new LoginValidations(this.driver);       
    }
    // metodo da interação (procedural)

    public void efetuarlogin() {
        loginValidation.validationLoginPage();
        loginPage.getUserNameInput().sendKeys("standard_user");
        loginPage.getPasswordInput().sendKeys("secret_sauce");
        loginPage.getloginButton().click();
    }

}
