package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Browser.Waits;
import PageObjects.FinishPage;
import PageObjects.LoginPage;
import Validations.FinishValidation;
import Validations.LoginValidations;

public class FinishTask {
    public WebDriver driver;
    private FinishPage finishPage;
    private FinishValidation finishValidation;
    private LoginValidations loginValidation;
    private Waits wait;
    private LoginPage loginPage;

    // contrutor

    public FinishTask(WebDriver driver) {
        this.driver = driver;
        finishPage = new FinishPage(this.driver);
        finishValidation = new FinishValidation(this.driver);
        wait = new Waits(this.driver);
        loginValidation = new LoginValidations(this.driver);
        loginPage = new LoginPage(this.driver);
    }

    public void finalizarCompra() {
        finishValidation.validationMensagemCompra();
        finishPage.getMenuHambuguer().click();
        // wait.loadElement(finishPage.)
        finishPage.getMenuHambuguerLogout().click();
        wait.loadElement(loginPage.getLogoText());
        loginValidation.validationLoginPage();

    }
}
