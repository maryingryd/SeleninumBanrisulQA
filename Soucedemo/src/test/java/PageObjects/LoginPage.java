package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    
    //Construtor , sempre tem que ter. Exceto os testes cases.
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    
    // Cada elemento tem um metódo
    public WebElement getLogoText() {
        // primeiro exemplo de como fazer
        //WebElement logoText = driver.findElement(By.className("login_logo"));
        //return logoText; 
        return driver.findElement(By.className("login_logo"));
    }
    public WebElement getUserNameInput() {
        return driver.findElement(By.id("user-name"));
    }
    
    public WebElement getPasswordInput () {
        return driver.findElement(By.id("password"));
    }
    
    public WebElement  getloginButton () {
        return driver.findElement(By.id("login-button"));
    }
    
    
}
