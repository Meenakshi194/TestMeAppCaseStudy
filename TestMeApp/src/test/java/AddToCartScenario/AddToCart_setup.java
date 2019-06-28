package AddToCartScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CaseStudy.TestMeApp.UtilityClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddToCart_setup {
	
WebDriver driver;	
	@Given("User is in the Loginpage")
	public void user_is_in_the_Loginpage() {
	   System.out.println("user enters into loginpage");
	   driver=UtilityClass.getDriver("chrome");
	     driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	     driver.findElement(By.xpath("//*[@id=\'header\']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	   
	}

	@When("User enters the username{string}")
	public void user_enters_the_username(String string) {
	   driver.findElement(By.id("userName")).sendKeys(string);
	}

	@And("user enters the password{string}")
	public void user_enters_the_password(String string) {
		 driver.findElement(By.id("password")).sendKeys(string);
	}

	@And("user clicks the login button")
	public void user_clicks_the_login_button() {
	  driver.findElement(By.name("Login")).click();
	}

	@Then("User navigate to the home page")
	public void user_navigate_to_the_home_page() {
	    System.out.println("user navigated to homepage");
	    Assert.assertEquals("Home", driver.getTitle());
	}



	@When("User enters the string {string} in search box")
	public void user_enters_the_string_in_search_box(String string) {
	    driver.findElement(By.id("myInput")).sendKeys(string);
	}

	@When("User clicks on the find details button")
	public void user_clicks_on_the_find_details_button() {
	    driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("user enters the AddTo Cart page")
	public void user_enters_the_AddTo_Cart_page() {
	  
	   Assert.assertEquals("Search", driver.getTitle());
	   System.out.println("user navigates to AddToCart Page");
	}

}
