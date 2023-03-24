package TestCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import Framework.TestBase;
import Tasks.LoginTask;
import Tasks.ProdutoTask;
//Aqui herda Test Base, pois testcases, não tem construtor e this.driver;
public class RealizarCompraComSucessoTest extends TestBase {
    private WebDriver driver = getDriverManager();
    LoginTask loginTask = new LoginTask (driver);
    ProdutoTask produtoTask = new ProdutoTask(driver);
    
    
    @Test
    public void realizarCompra () {
        loginTask.efetuarlogin();
        produtoTask.selecionarProduto();
    }
      

}
