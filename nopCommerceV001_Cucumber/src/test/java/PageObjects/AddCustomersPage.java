package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomersPage {

public WebDriver ldriver;//intiate driver and loginpage


public AddCustomersPage(WebDriver rdriver)//create constructer of the class
{   ldriver=rdriver;
	PageFactory.initElements(ldriver , this);
}

// first capture the locators ;
By lnkCustomers_menu=By.xpath("//body[@class='skin-blue sidebar-mini']/div[@class='wrapper']/div[@class='main-sidebar']/div[@class='sidebar']/ul[@class='sidebar-menu tree']/li[@class='treeview active current-active-item']/a/span[1]\");////a[@href='#'//span[contains(text(),'Customers')]");
By lnkCustomers_menuitem=By.xpath("//li[@class='treeview menu-open']//ul[@class='treeview-menu']//li//span[@class='menu-item-title'][contains(text(),'Customers')]");////span[@class='menu-item-title'][contains(text(),'customer]

		By btnAddnew=By.xpath("//a[@class='btn bg-blue']"); //add new
		
		By txtEmail=By.xpath("//input[@id='Email']");//input[@id='Email']
		By txtPassword=By.xpath("//input[@id='Password']");//input[@id='password']
		
		By txtcustomerRoles=By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");
		
		//By txtcustomerRoles=By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");
		
		By lstitemAdministrators=By.xpath("//span[contains(text(),'Administrators')]");
		By lstitemRegistered=By.xpath("//li[contains(text(),'Registered')]");
	    By lstitemGuests=By.xpath("//li[contains(text(),'Guests')]");
	    By lstitemVendors=By.xpath("//li[contains(text(),'Vendors')]");
	    
	    By drpmgrOfVendor=By.xpath("//select[@id='VendorId']");//*[@id='VendorId']
	    By rdMaleGender=By.id("Gender_Male");
	    By rdFemaleGender=By.id("Gender_Female");
	    
	    By txtFirstName=By.xpath("//input[@id='FirstName']");
	    By txtLastName=By.xpath("//input[@id='LastName']");
	    
	    By txtDob=By.xpath("//input[@id='DateOfBirth']");
	    By txtCompanyName=By.xpath("//input[@id='Company']");
	    
	    By txtAdminContent=By.xpath("//textarea[@id='AdminComment']");
	    
	    By btnSave=By.xpath("//button[@name='save']");
	    
	
	    
	    //Action Methods;
	  
	    
	    public String getpageTitle() {
			return ldriver.getTitle();
		}
	 
	    
	    public void clickOnCustomersMenu() {
	    	ldriver.findElement(lnkCustomers_menu).click();
	    }
	
	    public void clickOnCustomerMenuItem() {
	    	ldriver.findElement(lnkCustomers_menuitem).click();
	    	
	    	 }
	    
	    public void clickOnAddnew() {
	    	ldriver.findElement(btnAddnew).click();
	    	
	    }
	    
	    public void setEmail(String email) {
	    	ldriver.findElement(txtEmail).sendKeys(email);
	    }
	
	    public void setPassword(String password) {
	    	
	    	ldriver.findElement(txtPassword).sendKeys(password);
	    }
	    public void setCustomerRoles(String role)throws InterruptedException
	    {
	    	if(!role.equals("Vendors"))//if role vendors should not delete Register as per
	    	{
	    		ldriver.findElement(By.xpath("//*[@id=\"SelectedCustomerRoleTds_taglist\"]/li/span"));
	    	}
	    	ldriver.findElement(txtcustomerRoles).click();
	    	WebElement listitem;
	    	Thread.sleep(3000);
	    	if(role.equals("Administrators"))
	    	{
	    		listitem=ldriver.findElement(lstitemAdministrators);
	    		
	    		
	    	}else if(role.equals("Guests"))
	    	{
	    		listitem=ldriver.findElement(lstitemGuests);
	    		}
	    else if(role.equals("Registered"))
	    {
	    	listitem=ldriver.findElement(lstitemRegistered);
	    	
	    }else if(role.equals("vendors"))
	    {
	    	listitem=ldriver.findElement(lstitemVendors);
	    }else
	    {
	    	listitem=ldriver.findElement(lstitemGuests);
	    	
	    }listitem.click();
	    //Thread.sleep(3000);
	    
	    JavascriptExecutor js=(JavascriptExecutor)ldriver;
	    js.executeScript("arguments[0].click();",listitem );
	    }
	    
	    public void setManagerOfVendor(String value)
	    {
	    	Select drp=new Select(ldriver.findElement(drpmgrOfVendor));
	    	drp.selectByVisibleText(value);
	    }
	    public void setGender(String gender)
	    {
	    	if(gender.equals("Male"))
	    	{
	    		ldriver.findElement(rdMaleGender).click();
	    	}else if(gender.equals("Female"))
	    	{
	    		ldriver.findElement(rdFemaleGender).click();
	    		
	    	}else
	    	{
	    		ldriver.findElement(rdMaleGender).click();//default
	    		
	    		
	    	}
	    }
	    
	    public void setFirstName(String fname)
	    {
	    	ldriver.findElement(txtFirstName).sendKeys(fname);
	    	
	    }
	    public void setLastName(String lname)
	    {
	    	ldriver.findElement(txtLastName).sendKeys(lname);
	    	
	    }
	    public void setDob(String dob)
	    {
	    	ldriver.findElement(txtDob).sendKeys(dob);
	    }
	    public void setCompanyName(String comname)
	    {
	    	ldriver.findElement(txtCompanyName).sendKeys(comname);
	    }
	    public void setAdminContent(String content)
	    {
	    	ldriver.findElement(txtAdminContent).sendKeys(content);
	    }
	    public void clickOnSave()
	    {
	    	ldriver.findElement(btnSave).click();
	    	
	    }
}
