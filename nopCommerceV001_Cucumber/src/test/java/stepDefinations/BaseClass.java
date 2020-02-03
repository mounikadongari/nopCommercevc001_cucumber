package stepDefinations;

import java.util.Properties;

//import java.util.logging.Logger;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import PageObjects.AddCustomersPage;
import PageObjects.LoginPage;
import PageObjects.SearchCustomerPage;

public class BaseClass {

	public WebDriver driver;
	public LoginPage lp;
	public AddCustomersPage addCus;
	public SearchCustomerPage Searchcus;
	public  Logger logger ;
	public Properties configProp;
	
	//in java we have a RandomStringUtils class
	//for generating random emailid
	public static String randomestring() {
		String generatedString1 =RandomStringUtils.randomAlphabetic(5);
		return(generatedString1);
		}
}
