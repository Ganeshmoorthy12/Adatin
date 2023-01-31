package adactin.com.Stepdefination;




import PageObjectModle.pageobject;
import adactin.com.Baseclass.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepdefination extends Baseclass {

	pageobject obj= new pageobject(driver);

	@Given("user launch the {string} browser")
	public void user_launch_the_browser(String string) {
	Browserlaunch();
	maximize();
	}

	@Given("user navigate url {string}")
	public void user_navigate_url(String string) {
	   geturl(string);
	}

	@Then("user verify the login page")
	public void user_verify_the_login_page() {
	 
	}

	@Then("user Enter the user name {string}")
	public void user_enter_the_user_name(String string) {
	elementsendkey(obj.getLoginpage().getUsername(), string);
	  
	}

	@Then("User Enter the password {string}")
	public void user_enter_the_password(String string) {
		elementsendkey(obj.getLoginpage().getUserpassword(), string);
	 
	}

	@Then("user click the login Button")
	public void user_click_the_login_button() {
	   elementclick(obj.getLoginpage().getLoginbutton());
	}

	@Then("User verfy the login sucessfully")
	public void user_verfy_the_login_sucessfully() {
	
	
	  
	}

	@Then("User verify error message{string}")
	public void user_verify_error_message(String string) {

		
	}




}
