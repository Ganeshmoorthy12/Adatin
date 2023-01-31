package PageObjectModle;

import org.openqa.selenium.WebDriver;

import adactin.com.Baseclass.Baseclass;
import adactin.com.Locators.Homepage;
import adactin.com.Locators.Loginpage;

public class pageobject extends Baseclass {

	public pageobject(WebDriver Xdriver) {
	this.driver=Xdriver;
	
	}
	
	private Loginpage Loginpage;
	
	private Homepage Homepage;

	public Loginpage getLoginpage() {
		if (Loginpage ==null) {
			Loginpage = new Loginpage(driver);	
		}	
		return Loginpage;
	}

	public Homepage getHomepage() {
		if (Homepage == null) {
			Homepage = new Homepage(driver);	
		}
		
		return Homepage;
	}
	
	
		
	}
	
	
	
	

	
	
	
	

