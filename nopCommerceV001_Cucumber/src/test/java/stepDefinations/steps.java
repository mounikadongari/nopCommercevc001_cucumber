package stepDefinations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.Logger;

//import java.util.logging.Logger;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import PageObjects.AddCustomersPage;
import PageObjects.LoginPage;
import PageObjects.SearchCustomerPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class steps extends BaseClass {
	
	@Before //it is known as Beforecucumber hook concept
	public void setup() throws IOException
	{    
		
	//	logger = Logger.getLogger("nopCommerce");//Added logger
	//PropertyConfigurator.configure("log4j.properties");
	
	
	
		//Reading properties
		configProp=new Properties();
		FileInputStream configPropfile=new FileInputStream("config.properties");
		configProp.load(configPropfile);
         	String br=configProp.getProperty("browser");
				if(br.equals("chrome"))
				{
					System.setProperty("webdriver.chrome.driver",configProp.getProperty("chromepath"));
		            driver=new ChromeDriver();//System.getProperty("user.dir")+"//browser_drivers//chromedriver.exe
				}else if (br.equals("firefox")) {
					System.setProperty("webdriver.chrome.driver",configProp.getProperty("firefoxpath"));
		            driver=new FirefoxDriver();
				}else if(br.equals("ie")) {
					System.setProperty("webdriver.ie.driver",configProp.getProperty("iepath"));
					driver = new InternetExplorerDriver();
				}
		
		logger.info("***********Launching browser************");
		
		}
	
	
	
	@Given("user Launch Chrome browser")
	public void user_Launch_Chrome_browser() {

		lp=new LoginPage(driver);
	}

	@When("user opens Url {string}")
	public void user_opens_Url(String url) {
		logger.info("***********Opening URL************");
	   driver.get(url);
	   driver.manage().window().maximize();
	}

	@When("user enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String email, String password) {
		logger.info("***********proving login details************");
		lp.setUserName(email);
		lp.setPassword(password);
	   
	}

	@When("click on Login")
	public void click_on_Login() throws Exception {
		logger.info("***********started login********************");
	   lp.clickLogin();
	   Thread.sleep(3000);
	}

	@Then("pagetitle should be {string}")
	public void pagetitle_should_be(String title) {
	    if (driver.getPageSource().contains("Login was unsuccessful")) {
	    	driver.close();
	    	logger.info("***************login passed***************");
	    	Assert.assertTrue(false);
			System.out.println("login succesfull.....");
		} else {
			logger.info("***************loginfailed*******************");
			Assert.assertEquals(title,driver.getTitle());

		}
		
	}

	@When("User click on Log out link")
	public void user_click_on_Log_out_link() throws Exception {
		logger.info("*********************click on logout link*********************");
		lp.clickLogout();
		Thread.sleep(3000);	    
	}

	@Then("page Title should be {string}")
	public void page_Title_should_be(String Weltitle) {
	    if(driver.getPageSource().contains("Your store. Login")) {
	    	Assert.assertEquals(Weltitle,driver.getTitle());
	    	System.out.println("logout succesful....");
	    }else {
	    	Assert.assertTrue(false);
	    }
		
		
	}

	@Then("close browser.")
	public void close_browser() {
		logger.info("************closing the browser***********");
	  driver.quit();
	}
	
// Customer features stepdefinations.......
	
	@Then("User can view Dashboard")
	public void user_can_view_Dashboard() {
	   
		addCus=new AddCustomersPage(driver);
		
		Assert.assertEquals("Customers / nopCommerce administration", addCus.getpageTitle());
	}

	@When("User click on customers Menu")
	public void user_click_on_customers_Menu() throws Exception {
	    Thread.sleep(3000);
	    addCus.clickOnAddnew();
	    
	}

	@When("click on customers Menu Item")
	public void click_on_customers_Menu_Item() throws Exception {
		 Thread.sleep(2000);
	    addCus.clickOnCustomerMenuItem();
	}

	@When("click Add new button")
	public void click_Add_new_button() throws InterruptedException {
	    addCus.clickOnAddnew();
	    Thread.sleep(2000);
	}

	@Then("User can view Add new Customer page")
	public void user_can_view_Add_new_Customer_page() {
		
	    Assert.assertEquals("Add a new customer / nopCommerce administration",addCus.getpageTitle());
	}

	@When("User enter Customer info")
	public void user_enter_Customer_info() throws Exception {
		logger.info("**********Adding new customer*************");
		logger.info("*************providing customer details*************");
	    String email=randomestring()+"@gmail.com";
	    addCus.setEmail(email);
	    addCus.setPassword("test123");
	    //Registered - default
	    //The customer cannot be in both 'guests' and 'registered' customer roles
	    //Add the customer to 'guests' or 'registered' customer role
	    addCus.setCustomerRoles("Guest");
	    Thread.sleep(3000);
	    
	    addCus.setManagerOfVendor("Vendor 2");
	    addCus.setGender("Male");
	    addCus.setFirstName("pavan");
	    addCus.setLastName("kumar");
	    addCus.setDob("12/12/56");
	    addCus.setCompanyName("busyqa");
	    addCus.setAdminContent("This is for testing..........");
	    
	}

	@When("click on Save button")
	public void click_on_Save_button() throws InterruptedException {
		logger.info("*******saving customer data***********");
	   addCus.clickOnSave();
	   Thread.sleep(2000);
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {
	    Assert.assertTrue(driver.getPageSource().contains("The new customer has been added successfully."));
	}

	
	
	// Steps for searching a customer using emailid............
	
	

@When("Enter customer EMail")
public void enter_customer_EMail() {
	logger.info("****************searching customer by email id************");
    Searchcus=new SearchCustomerPage(driver);
    Searchcus.setEmail("victoria_victoria@nopCommerce.com");
	
	
}

@When("Click on search button")
public void click_on_search_button() throws Exception {
    Searchcus.clickSearch();
    Thread.sleep(3000);
}

@Then("User should found Email in the Search table")
public void user_should_found_Email_in_the_Search_table() {
	boolean status=Searchcus.searchCustomerByEmail("victoria_victoria@nopCommerce.com");
Assert.assertEquals(true, status);
}


//Steps for searching a customer by using firstname and lastname

@When("Enter customer FirstName")
public void enter_customer_FirstName() {
	logger.info("***************searching customer by name***********");
    Searchcus=new SearchCustomerPage(driver);
	Searchcus.setFirstName("Victorial");
}

@When("Enter customer LastName")
public void enter_customer_LastName() {
	Searchcus.setLastName("Terces");
  
	
}

@Then("User should found Name in the Search table")
public void user_should_found_Name_in_the_Search_table() {
  boolean status =Searchcus.searchCustomerByname("Victorial Terces");
  Assert.assertEquals(true, status);
}







}
