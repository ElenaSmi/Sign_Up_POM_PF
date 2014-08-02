package core;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConformationPage {
	WebDriver driver;
    
    /*Constructor*/
    public ConformationPage(WebDriver wd) {
        driver = wd;
    }
    
    public void verifyBackbutton(WebElement buttonId, String titleSubmitPage){
    	buttonId.click();
    	assertEquals(driver.getTitle(), titleSubmitPage);
    	
    }
    
    public String verifyContent(WebElement webElementId,String baseUrl){
    		   		
    	String actualContent = webElementId.getText();
    	return actualContent;
    		
    }

}
