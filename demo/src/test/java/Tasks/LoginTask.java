package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.LoginPage;

public class LoginTask {
    private WebDriver driver;
    private LoginPage loginPage;

    public LoginTask(WebDriver driver) {       
        this.driver = driver;
        loginPage = new LoginPage(driver);
    }
    // metodo da interação (procedural)

    public void efetuarlogin() {
        loginPage.getUserNameInput().sendKeys("standard_user");
        loginPage.getPasswordInput().sendKeys("secret_sauce");
        loginPage.getloginButton().click();
    }

}
