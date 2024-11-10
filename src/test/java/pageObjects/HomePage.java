package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	//Constructor
	
	public HomePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Locator to find element
	
	
	// Login/Register
	
	@FindBy (linkText = "Login/Register")
	WebElement lnkSignin;
	
	
	
	// Categories
	
	 @FindBy(xpath = "//h4[normalize-space()='Categories']")
	 WebElement categoriesDropdown;
	 
	    
	 @FindBy(xpath = "//span[normalize-space()='Electronics']")
	 WebElement electronicsOption;
	 
	
	//Action Method
	
	public void clickSignin () {
		lnkSignin.click();
	}
	
	 //"Categories" dropdown
	
    public void clickCategories() {
        categoriesDropdown.click();
    }
    
    //"Electronics" from the dropdown
    
    public void clickElectronics() {
        electronicsOption.click();
    }
    
    

	
	

}
