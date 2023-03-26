package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//pagina de checkout 
public class CheckoutPage {

	private WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	// aqui mapeando o campo do primeiro nome que espera um input
	public WebElement getFirstNameInput() {
		return driver.findElement(By.id("first-name"));
	}

	// aqui mapeando o campo do ultimo nome que espera um input
	public WebElement getLastNameInput() {
		return driver.findElement(By.id("last-name"));
	}

	// aqui mapeando o campo do cep que espera um input
	public WebElement getPostalCodeInput() {
		return driver.findElement(By.id("postal-code"));
	}

	// aqui mapeando o campo do cep que espera um click no botao
	public WebElement getContinueButton() {
		return driver.findElement(By.id("continue"));
	}

	// aqui mapeando o campo do cep que espera um click no botao
	public WebElement getFinishButton() {
		return driver.findElement(By.id("finish"));
	}

}
