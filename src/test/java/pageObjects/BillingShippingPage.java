package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BillingShippingPage {
	WebDriver driver;
	
	// BillingShipping Constructor
	
	public BillingShippingPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	// Billing Locators
	
	@FindBy (xpath = "//input[@id='checkout-address1']")
	WebElement billAddress1Field;
	
	@FindBy (xpath = "//input[@id='checkout-city']")
	WebElement billCityField;
	
	@FindBy (xpath = "//span[normalize-space()='Continue']")
	WebElement billContinueButton;
	
	// Shipping Locators
	
	@FindBy (xpath = "//input[@id='checkout-address1']")
	WebElement shipAddress1Field;
	
	@FindBy (xpath = "//input[@id='checkout-city']")
	WebElement shipCityField;
	
	@FindBy (xpath = "//span[normalize-space()='Continue']")
	WebElement shipContinueButton;
	
	// Review & Pay Locators
	
	@FindBy (xpath = "//select[@id='state_id_select']")
	WebElement selectStateList;
	
	@FindBy (xpath = "//option[normalize-space()='New York (7%)']")
	WebElement selectedState;
	
	// Select Payment Methods
	
	@FindBy (xpath = "//img[contains(@title,'Stripe')]")
	WebElement selectPaymentList;
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	// Method
	
	// Billing Methods
	
	public void enterBillAddress1 (String address1) {
		billAddress1Field.sendKeys(address1);
	}
	
	public void enterBillCity (String city) {
		billCityField.sendKeys(city);
	}
	
	
	 public void clickBillContinueButton() {
	        // Scroll the page to bring the logout button into view
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", billContinueButton); // Scroll to the logout button
	        
	        
	        // Adding explicit wait to ensure the button is clickable
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	        wait.until(ExpectedConditions.elementToBeClickable(billContinueButton));
	        
	        js.executeScript("arguments[0].click();", billContinueButton);
	    }
	 
	 
	 // Shipping Methods
	 
	 public void enterShipAddress1 (String address1) {
			billAddress1Field.sendKeys(address1);
		}
		
		public void enterShipCity (String city) {
			billCityField.sendKeys(city);
		}
		
		
		 public void clickShipContinueButton() {
		        // Scroll the page to bring the logout button into view
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("arguments[0].scrollIntoView(true);", shipContinueButton); // Scroll to the logout button
		        
		        
		        // Adding explicit wait to ensure the button is clickable
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		        wait.until(ExpectedConditions.elementToBeClickable(shipContinueButton));
		        
		        js.executeScript("arguments[0].click();", shipContinueButton);
		    }
		 
		 
		 // Review & Pay
		 
		 public void selectStateField() {
			 selectStateList.click();
		 }
		 
		 public void selectStateItem() {
			 selectedState.click();
		 }
		 
		 // Payment Method 
		 
		 public void selectPayment() {
		        // Scroll the page to bring the logout button into view
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("arguments[0].scrollIntoView(true);", selectPaymentList); // Scroll to the logout button
		        
		        
		        // Adding explicit wait to ensure the button is clickable
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		        wait.until(ExpectedConditions.elementToBeClickable(selectPaymentList));
		        
		        js.executeScript("arguments[0].click();", selectPaymentList);
		    }
		 
		 
		 
		 
	


}
