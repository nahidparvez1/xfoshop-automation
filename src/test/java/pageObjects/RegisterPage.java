package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
	WebDriver driver;
	
	//Constructor
	
	public RegisterPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// ## Locator to find element ##
	
	//Register - Locators
	
	@FindBy (xpath = "//input[@id='reg-fn']")
	WebElement firstNameField;
	
	@FindBy (xpath = "//input[@id='reg-ln']")
	WebElement lastNameField;
	
	@FindBy (xpath = "//input[@id='reg-email']")
	WebElement regEmailField;
	
	@FindBy (xpath = "//input[@id='reg-phone']")
	WebElement regPhoneField;
	
	@FindBy (xpath = "//input[@id='reg-pass']")
	WebElement regPassField;
	
	@FindBy (xpath = "//input[@id='reg-pass-confirm']")
	WebElement regConPassField;
	
	@FindBy(xpath = "//div[@class='col-12 text-center']//button[@type='submit']")
	WebElement registerButton;
	
	
	
	
	//Login - Locators
	
	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement emailField;
	
	@FindBy(xpath = "//input[@name='login_password']")
	WebElement passField;
	
	@FindBy(xpath = "//span[normalize-space()='Login']")
	WebElement loginButton;
	
	
	// Logout Locators
	
	
//	@FindBy (linkText = "Log out")
//	WebElement lnkLogout;
//	
//	

	
	
	//## Action Method ##
	
	//Register - Methods
	
	public void enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }
	
	public void enterLastName(String lastName) {
		lastNameField.sendKeys(lastName); 
    }
	
	public void enterRegEmail(String regEmail) {
		regEmailField.sendKeys(regEmail);
    }
	
	public void enterRegPhone(String regPhone) {
		regPhoneField.sendKeys(regPhone); 
    }
	
	public void enterRegPass(String regPass) {
		regPassField.sendKeys(regPass);
    }
	
	public void enterRegConPass(String regConPass) {
		regConPassField.sendKeys(regConPass);
    }
	
	public void clickRegisterButton() {
        registerButton.click();
    }
	
	
	
	
	//Login - Methods
	
	public void enterEmail(String email) {
        emailField.sendKeys(email); // Using the WebElement to perform actions
    }
	
	public void enterPass(String pass) {
        passField.sendKeys(pass); // Using the WebElement to perform actions
    }
	
	public void clickLoginButton() {
        loginButton.click();
    }
	
	
	//Logout - Methods
	
//	 public void clickLogoutButton() {
//	        // Scroll the page to bring the logout button into view
//	        JavascriptExecutor js = (JavascriptExecutor) driver;
//	        js.executeScript("arguments[0].scrollIntoView(true);", lnkLogout); // Scroll to the logout button
//	        
//	        
//	        // Adding explicit wait to ensure the button is clickable
//	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//	        wait.until(ExpectedConditions.elementToBeClickable(lnkLogout));
//	        
//	        js.executeScript("arguments[0].click();", lnkLogout);
//	    }
//	
	
	
	

}
