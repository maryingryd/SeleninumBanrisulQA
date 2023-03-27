package TestCases;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.WebDriver;

import Framework.TestBase;
import Tasks.CheckoutTask;
import Tasks.FinishTask;
import Tasks.LoginTask;
import Tasks.ProdutoTask;
//Aqui herda Test Base, pois testcases, não tem construtor e this.driver;

public class RealizarCompraComSucessoDataClassTest extends TestBase {
    private WebDriver driver = getDriverManager();
    LoginTask loginTask = new LoginTask(driver);
    ProdutoTask produtoTask = new ProdutoTask(driver);
    CheckoutTask checkoutTask = new CheckoutTask(driver);
    FinishTask finishTask = new FinishTask(driver);

    @ParameterizedTest
    @MethodSource("Framework.Utils.DataClass#loginTestData")

    public void realizarCompra(String user, String password) {
        loginTask.efetuarloginParametrizado(user, password);
        produtoTask.selecionarProduto();
        checkoutTask.preencherForm();
        finishTask.finalizarCompra();
    }

}
