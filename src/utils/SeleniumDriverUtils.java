package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class SeleniumDriverUtils {
	
	 protected static WebDriver driver;
	    
	    public WebDriverException initiateFirefoxDriver(String URL) {
	        System.setProperty("webdriver.gecko.driver", "/geckodriver");
	        driver = new FirefoxDriver();
	        driver.get(URL);
	        return driver;
	    }
	    
	    public WebDriver initiateChromeDriver(String URL) {
	        System.setProperty("webdriver.gecko.driver", "/geckodriver");
	        driver = new ChromeDriver();
	        driver.get(URL);
	        return driver;
	    }
	    
	    public void quitDriver() {
	        driver.quit();
	    }
	    
	    public void waitAction(int timeout) throws InterruptedException {
	        driver.wait(timeout);
	    }

}
