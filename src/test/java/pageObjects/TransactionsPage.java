package pageObjects;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TransactionsPage {
	WebDriver driver;
	
	//Constructor
	
	public TransactionsPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Locators
	
	@FindBy (xpath = "//input[@name='card' and @placeholder='Card Number']")
	WebElement cardNumberField;
	
	@FindBy (xpath = "//input[@name='month' and @placeholder='Expiration Month']")
	WebElement monthField;
	
	@FindBy (xpath = "//input[@name='year' and @placeholder='Expiration Year']")
	WebElement yearField;
	
	@FindBy (xpath = "//input[@name='cvc' and @placeholder='CVV']")
	WebElement cvvField;
	
	@FindBy (xpath = "//button[@type='submit' and .//span[normalize-space(text())='Chekout With Stripe']]")
	WebElement checkStripeButton;
	

	
	

	
	


	 
	
	//Action Method
	
	public void enterCardNumber(String cardNumber) {
		cardNumberField.sendKeys(cardNumber);
	}
	
	public void enterMonth(String month) {
		monthField.sendKeys(month);
	}
	
	public void enterYear(String year) {
		yearField.sendKeys(year);
	}
	
	public void enterCVV(String cvv) {
		cvvField.sendKeys(cvv);
	}
	
	
	 public void clickStripeButton() {
	        checkStripeButton.click();
	    }
	 
	
	
	
    

	
	

}
