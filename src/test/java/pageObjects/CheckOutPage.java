package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	 WebDriver driver;

	    // Constructor
	    public CheckOutPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	//Locator to find element
	 @FindBy(xpath = "//span[normalize-space()='Checkout']")
	 WebElement checkoutButton;

	

	//Action Method
	 
	 public void clickCheckoutButton() {
		 checkoutButton.click();
	 }
	 
	 
	

    

	
	

}

