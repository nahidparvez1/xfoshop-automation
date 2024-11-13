package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.BillingShippingPage;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;
import pageObjects.OrderSuccessPage;
import pageObjects.ProductDescriptionPage;
import pageObjects.ProductListPage;
import pageObjects.RegisterPage;
import pageObjects.TransactionsPage;

public class TC001_LoginClick {
	WebDriver driver;
	
	@BeforeMethod
	public void setup () {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://qa.xfoshop.com/");
	}
	
	
	
	
	@Test
	public void verify_login_click () throws InterruptedException {
		
		HomePage hp = new HomePage(driver);
		
		ProductListPage plp = new ProductListPage(driver);
		
		ProductDescriptionPage pdp = new ProductDescriptionPage(driver);
		
		RegisterPage regpage = new RegisterPage (driver);
		
		CheckOutPage cop = new CheckOutPage(driver);
		
		BillingShippingPage bsp = new BillingShippingPage(driver);
		
		TransactionsPage tp = new TransactionsPage(driver);
		
		OrderSuccessPage osp = new OrderSuccessPage(driver);
		
		Thread.sleep(1000);
		
		
		hp.clickSignin();
		
		
		
		
		//Register
		
		regpage.enterFirstName("meow");
		regpage.enterLastName("tester");
		regpage.enterRegEmail("meowtester5@gmail.com");
		regpage.enterRegPhone("123456789");
		regpage.enterRegPass("abc123");
		regpage.enterRegConPass("abc123");
		Thread.sleep(1000);
		regpage.clickRegisterButton();
		
		
		
		//login
		
		regpage.enterEmail ("meowtester5@gmail.com");
		regpage.enterPass ("abc123");
		Thread.sleep(2000);
		regpage.clickLoginButton();
		
		// Buy Product
		
		 hp.clickCategories();
	     Thread.sleep(1000);
	     hp.clickElectronics();
	     Thread.sleep(2000);
	     plp.clickListView();
	     Thread.sleep(2000);
	     plp.clickFirstProduct();
	     Thread.sleep(2000);
	     pdp.clickAddToCart(); // Add to Cart
	     Thread.sleep(1000);
	     pdp.clickDismissPopup();
	     pdp.clickCartIcon(); // click on Cart Icon
	     Thread.sleep(2000);
	     cop.clickCheckoutButton();
	     
	     // Billing Info
	     
	     bsp.enterBillAddress1("Queens");
	     bsp.enterBillCity("South Richmond Hill");
	     Thread.sleep(2000);
	     bsp.clickBillContinueButton();
	     
	     // Shipping Info
	     
	     bsp.enterShipAddress1("Queens");
	     bsp.enterShipCity("South Richmond Hill");
	     Thread.sleep(2000);
	     bsp.clickShipContinueButton();
	     
	     // State/City Selector
	     
	     Thread.sleep(2000);
	     bsp.selectStateField();
	     Thread.sleep(1000);
	     bsp.selectStateItem();
	     
	     // Select Payment Method
	     
	     Thread.sleep(2000);
	     bsp.selectPayment();
	     Thread.sleep(2000);
	     
	     // Transactions Page
	     
	     tp.enterCardNumber("4242424242424242");
	     tp.enterMonth("02");
	     tp.enterYear("2026");
	     tp.enterCVV("655");
	     Thread.sleep(2000);
	     tp.clickStripeButton();
	     
	    
	     
	     // Order number validation
	     
	     String orderNumber = osp.validateOrderNumberLength();
	     int orderNumberLength = orderNumber.length(); 

	     if (orderNumberLength == 10) {
	         System.out.println("Order ID validated successfully!");  // Validation success
	     } else {
	         System.out.println("Invalid order ID");  // Validation failed
	     }
	    
	     
	     //Order Success Page
	     
	     String confmsg = osp.getConfirmationMessage();
	     Assert.assertEquals(confmsg, "Thank you for your order!");

	     
   
		
		//logout after all process
		Thread.sleep(15000);
		osp.clickUserIcon();
		osp.clickLogoutButton();
		
	     
	     
		
	}
	
	
	/*
	@AfterMethod
	public void tearDown () {
		driver.quit();
		
	}
	*/
	
	

}
