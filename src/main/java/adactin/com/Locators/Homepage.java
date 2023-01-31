package adactin.com.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin.com.Baseclass.Baseclass;

public class Homepage extends Baseclass {
	
	public Homepage(WebDriver Xdriver) {
		this.driver=Xdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username_show")
	private WebElement Loginsucessfully;


	public WebElement getLoginsucessfully() {
		return Loginsucessfully;
	}

}
