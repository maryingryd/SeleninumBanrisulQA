package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Framework.Browser.Waits;

public class FinishPage {

	private WebDriver driver;
	
	public FinishPage(WebDriver driver) {
		this.driver = driver;
		new Waits(this.driver);
	}

	// aqui mapeando texto de finalizacao de pedido "Thank you for your order!"
	public WebElement getFinishText() {
		return driver.findElement(By.id("checkout_complete_container"));
	}

	// aqui mapeando botao de menu pra fazer o logout
	public WebElement getMenuHambuguer() {
		return driver.findElement(By.id("react-burger-menu-btn"));
	}
	
	// aqui mapeando o menus pra lougout
	public WebElement getMenuHambuguerLogout() {
		return driver.findElement(By.id("logout_sidebar_link"));
	}
}
