package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Utils.FileOperation;
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

    public void efetuarloginParametrizado(String user, String password) {
        loginValidation.validationLoginPage();
        loginPage.getUserNameInput().sendKeys(user);
        loginPage.getPasswordInput().sendKeys(password);
        loginPage.getloginButton().click();
    }

    public void efetuarloginProperties() {
        loginValidation.validationLoginPage();
        loginPage.getUserNameInput().sendKeys(FileOperation.getProperties("user").getProperty("user"));
        loginPage.getPasswordInput().sendKeys(FileOperation.getProperties("user").getProperty("password"));
        loginPage.getloginButton().click();

    }
}
