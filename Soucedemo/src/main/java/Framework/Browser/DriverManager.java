package Framework.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
    
    private static WebDriver driver;
    
    private static WebDriver getMangerDriver(TypeBrowser type) {
        
        switch (type) {
        
        case CHROME: 
            WebDriverManager.chromedriver().setup();
            
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized"); // maximiza aba
            options.addArguments("--incognito"); // aba anonima
            options.addArguments("--remote-allow-origins=*");
            
            driver= new ChromeDriver(options);
            break;
            
        case EDGE:    
            WebDriverManager.edgedriver().setup();
            EdgeOptions options1 = new EdgeOptions();
            options1.addArguments("--start-maximized");
            options1.addArguments("--incognito"); // aba anonima
            driver= new EdgeDriver(options1);
            break;
        
        case FIREFOX:  
            WebDriverManager.firefoxdriver().setup();     
            driver= new FirefoxDriver();
            break;
            
        case HEADLESS:
            WebDriverManager.chromedriver().setup();
            ChromeOptions headlessOptions = new ChromeOptions();
            headlessOptions.addArguments("--headless");
            headlessOptions.addArguments("--window-size(1366,768)");
            driver= new ChromeDriver(headlessOptions);
            break;
        }
        return driver;
    }
    public static WebDriver getDriver(TypeBrowser type) {
        if (driver == null) {
            driver = getMangerDriver(type);
        }
        return driver;
    }
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver =null;
        }
        
    }
}
