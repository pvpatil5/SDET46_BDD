package stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;

public class Login 
{
	WebDriver driver;

	@Given("launch browser")
	public void launch_browser() {
	   driver= new ChromeDriver();
	}

	@Then("enter url")
	public void enter_url() {
	    driver.get("http://localhost:8080");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("enter username")
	public void enter_username() {
	   driver.findElement(By.name("user_name")).sendKeys("admin");
	}

	@Then("enter password")
	public void enter_password() {
		   driver.findElement(By.name("user_password")).sendKeys("12345");
	}

	@Then("click on login btn")
	public void click_on_login_btn() {
		driver.findElement(By.id("submitButton")).click();
	}
	
	
	@Then("enter url {string}")
	public void enter_url(String url) {
		   driver.get(url);
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("enter username {string}")
	public void enter_username(String un) {
		  driver.findElement(By.name("user_name")).sendKeys(un);
	}

	@Then("enter password {string}")
	public void enter_password(String pwd) {
		   driver.findElement(By.name("user_password")).sendKeys(pwd);
	}

	@Then("enter usernameforfb {string}")
	public void enter_usernameforfb(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("enter passwordforfb {string}")
	public void enter_passwordforfb(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("click on login btn on fb")
	public void click_on_login_btn_on_fb() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	
	
}
