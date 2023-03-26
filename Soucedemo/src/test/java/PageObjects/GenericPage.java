package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	//pagina de verificar carrinho
    public class GenericPage {
        private WebDriver driver;
    
    public GenericPage(WebDriver driver) {
        this.driver = driver;
}
    public WebElement getHomeTextSpan() {
        return driver.findElement(By.xpath("//div[@id='header_container']/div[@class='header_secondary_container']/span"));
    }
    public WebElement getHomePodutoLabel() {
        return driver.findElement(By.className("inventory_item_name"));
    }
    
    
    
}