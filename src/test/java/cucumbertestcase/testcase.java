package cucumbertestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class testcase
{
WebDriver driver;
	
	@Given("^the browser is launched and navigate to the url$")
	public void the_browser_is_launched_and_navigate_to_the_url()
	{
	   driver=new FirefoxDriver();
	   driver.get("http://opensource.demo.orangehrm.com/");
	}

	@When("^we enter the user name and password$")
	public void we_enter_the_user_name_and_password() 
	{
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin");
	}

	@And("^click on login button$")
	public void click_on_login_button() 
	{
	   
	    driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^welcome admin msg is displayed$")
	public void welcome_admin_msg_is_displayed()  
	{
		String expurl="http://opensource.demo.orangehrm.com/index.php/dashboard";
		String acturl=driver.getCurrentUrl();
		if(acturl.equalsIgnoreCase(expurl))
		{
			System.out.println("login successful");
		}
		else
		{
			System.out.println("login unsuccessful");
		}
		
	}
}
