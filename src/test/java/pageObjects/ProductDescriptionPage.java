package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductDescriptionPage {
    WebDriver driver;

    // Constructor
    public ProductDescriptionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // ## Locators ##
    
    @FindBy(xpath = "//span[normalize-space()='Add to Cart']")
    WebElement addToCartButton;
    
    @FindBy(xpath = "//i[@class='icon-shopping-cart']")
    WebElement cartIcon;

    // ## Action Methods ##
    
    // Method to click the "Add to Cart" button
    public void clickAddToCart() {
        addToCartButton.click();
    }
    
    public void clickCartIcon() {
    	cartIcon.click();
    }
}
