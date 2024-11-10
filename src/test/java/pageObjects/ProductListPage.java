package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductListPage {
    WebDriver driver;

    // Constructor
    public ProductListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // ## Locators ##
    
 // Product Selection
    
    @FindBy(xpath = "//i[@class='fas fa-list']")
    WebElement listView;
    
    
    @FindBy(xpath = "//a[contains(text(),'Dropshipping EIS 2.4 inch LCD Full HD 720P Recordi')]")
  
    WebElement firstProduct;
 
    
    // Method to click the second product from the list
    
    
 // Method to click the second product
    
    public void clickListView () {
    	listView.click();
    }
    
    
  //a[contains(text(),'New product 2019 Refurbished used smart phone for ')]
    public void clickFirstProduct() {
        firstProduct.click();
    }

   
}
