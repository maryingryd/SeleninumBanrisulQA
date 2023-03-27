package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import PageObjects.CheckoutPage;
import PageObjects.FinishPage;

public class FinishValidation {
    private WebDriver driver;
    private FinishPage finishPage;

    //contrutor
    public FinishValidation(WebDriver driver) {
        this.driver = driver;
        finishPage = new FinishPage(this.driver);
    }
    
    //metodo de validação
    
    public void validationMensagemCompra() {
        Assertions.assertEquals("Thank you for your order!", finishPage.getFinishText().getText());
    }
    
    
}
