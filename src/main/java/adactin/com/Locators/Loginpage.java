package adactin.com.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin.com.Baseclass.Baseclass;

public class Loginpage extends Baseclass {
	
	public Loginpage(WebDriver Xdriver) {
		this.driver = Xdriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
	}
	
	@FindBy(id="password")
	private WebElement Userpassword;
	
	public WebElement getUserpassword() {
		return Userpassword;
	}
	
	@FindBy(id="login")
	private WebElement Loginbutton;

	public WebElement getLoginbutton() {
		return Loginbutton;
	}
	
	@FindBy(xpath = "//div[@class='auth_error']")
	private WebElement loginerror;

	public WebElement getLoginerror() {
		return loginerror;
	}
	
	
	
	
}
