package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import PageObjects.GenericPage;

public class GenericValidation {
    
    private WebDriver driver;
    private GenericPage genericPage;
    
    public GenericValidation (WebDriver driver ) {
        this.driver=driver;
        genericPage = new GenericPage (this.driver);
    }
    
    //exemplo de metodo para validacao de elemento generico de cada pagina, teria que criar um metodo para cada texto;
    public void validationPageProducts() {
        String label = genericPage.getHomeTextSpan().getText();
        Assertions.assertEquals("Products", label);
        
    }
    //seria um metodo generico para validar em todas as telas o elemento generico. Exemplo de metodo dinamico para validacao das paginas onde ira receber por um parametro qual texto esperado para comparacao
    public void validationPages(String texto) {       
        String label = genericPage.getHomeTextSpan().getText();
        Assertions.assertEquals(texto, label);        
    }
    public void validationProduto() {          
        Assertions.assertTrue(genericPage.getHomePodutoLabel().isDisplayed());
    }
    
}
