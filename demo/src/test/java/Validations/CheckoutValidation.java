package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import PageObjects.CheckoutPage;


public class CheckoutValidation {
    private WebDriver driver;
    private CheckoutPage checkoutPage;


    public CheckoutValidation (WebDriver driver ) {
        this.driver=driver;
        checkoutPage = new CheckoutPage (this.driver);
    }
    
    //aqui esta validando se o first name foi preeenchido ou deixado em branco
    //o value é o campo que ao inspecionar na página é o atributo que a ser preenchido com o nome digitado
    public void validationForm() {
        Assertions.assertFalse(checkoutPage.getFirstNameInput().getAttribute("value").equalsIgnoreCase(" ")); 
    }
}
