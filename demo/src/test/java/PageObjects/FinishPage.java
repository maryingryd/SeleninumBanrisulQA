package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

import Framework.Browser.Waits;

public class FinishPage {

    private WebDriver driver;
    private Waits wait;
    
    public FinishPage(WebDriver driver) {
        this.driver = driver;
        wait = new Waits(this.driver);    
    }

    // aqui mapeando texto de finalizacao de pedido "Thank you for your order!"
    public WebElement getFinishText() {
        return driver.findElement(By.className("complete-header"));
    }

    // aqui mapeando botao de menu pra fazer o logout
    public WebElement getMenuHambuguer() {
        return driver.findElement(By.id("react-burger-menu-btn"));
    }
    
    // aqui mapeando o menus pra lougout
    public WebElement getMenuHambuguerLogout() {
        // aqui usou o wait , para esperar um pouco o hamburguer carregar
        return wait.visibilityOfElement(By.id("logout_sidebar_link"));
        //return driver.findElement(By.id("logout_sidebar_link"));
    }
}
