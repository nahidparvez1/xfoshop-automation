
package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OrderSuccessPage {
	 WebDriver driver;

    // Constructor
    public OrderSuccessPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

	//Locator to find element
    
    // Thanks message
    
    @FindBy(xpath = "//h3[@class='card-title text-success' and text()='Thank you for your order!']")
    WebElement chkConfirmationMessage;
    
    
	// Order number
    
    @FindBy(xpath = "//span[@class='text-medium']")
    WebElement orderNumberElement;
    
    // LogOut button
  //  @FindBy(className = "icon-user")
    
    @FindBy(xpath = "//i[@class='icon-user pr-2']")
    WebElement userIcon;

    
   // @FindBy(linkText = "Logout")
    @FindBy (xpath = "//a[normalize-space()='Logout']")
	WebElement logoutButton;

	

	//Action Method
    
    // Confirmation Message
	
    public String getConfirmationMessage()
    {
    	String confMessage = chkConfirmationMessage.getText();
    	System.out.println(confMessage);
    	return confMessage;
    }
    
    // Order number Validation
   
    
    public String validateOrderNumberLength() {
        String orderNumber = orderNumberElement.getText();  // Extract the order number
        System.out.println("Order Number: " + orderNumber); // Optional: Print for debug
        return orderNumber;
        
     
    }
    
    // User Icon
    
    public void clickUserIcon() {
    	userIcon.click();
    }
    
    // Logout Button
    
    public void clickLogoutButton() {
    	logoutButton.click();
    }
    
   
	

    

	
	

}


