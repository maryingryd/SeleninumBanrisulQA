package TestCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import Framework.TestBase;
import Tasks.LoginTask;
//Aqui herda Test Base, pois testcases, não tem construtor e this.driver;
public class RealizarCompraComSucessoTest extends TestBase {
    private WebDriver driver = getDriverManager();
    LoginTask loginTask = new LoginTask (driver);
    
    @Test
    public void realizarCompra () {
        loginTask.efetuarlogin();
    }
      

}
