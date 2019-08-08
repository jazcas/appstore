package objects;

import objects.WebDriver;
import objects.WebElement;

public class MyStoreHome {
	
	 WebDriver driver;
	    
	    public MyStoreHome(WebDriver driver) {
	        this.driver = driver;
	    }
	    
	    public WebElement googleSearchBar() {
	        return driver.findElement(By.id("lst-ib"));
	    }
	    

}
