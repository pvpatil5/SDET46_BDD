package stepdefination;

import org.openqa.selenium.WebDriver;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login_hook
{
//	WebDriver driver;
//
	@Given("launch browser")
	public void launch_browser() {
		 System.out.println("browser launched ");
	}

	@Then("enter url")
	public void enter_url() {
		 System.out.println("url entered ");
	}

	@Then("enter username")
	public void enter_username() {
		 System.out.println("username entered ");
	}

	@Then("enter password")
	public void enter_password() {
		 System.out.println("pwd entered ");
	}

	@Then("click on login btn")
	public void click_on_login_btn() {
		 System.out.println("login btn clicked");
	}
	
	
	@Then("enter url {string}")
	public void enter_url(String url) {
		 System.out.println("url entered at runtime ");
	}

	@Then("enter username {string}")
	public void enter_username(String un) {
		 System.out.println("un entered at runtime ");
	}

	@Then("enter password {string}")
	public void enter_password(String pwd) {
		   System.out.println("pwd entered at runtime ");
	}

	
	
}
