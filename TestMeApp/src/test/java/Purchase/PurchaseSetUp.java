package Purchase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CaseStudy.TestMeApp.UtilityClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class PurchaseSetUp {
	WebDriver driver;
String expected,actual;
	
	@Given("User registered in TestMeApp")
	public void user_registered_in_TestMeApp() {
		 System.out.println("user enters into loginpage");
		   driver=UtilityClass.getDriver("chrome");
		     driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		     driver.findElement(By.xpath("//*[@id=\'header\']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		     driver.findElement(By.id("userName")).sendKeys("Logesh123");
			 driver.findElement(By.id("password")).sendKeys("123456");
			  driver.findElement(By.name("Login")).click();
			  System.out.println("user navigated to homepage");
			    Assert.assertEquals("Home", driver.getTitle());
		
	}

	@When("User searches a particular product {string}")
	public void user_searches_a_particular_product(String string) {
		driver.findElement(By.id("myInput")).sendKeys(string);
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@And("User trys to proceed to payment page without adding the item in add to cart")
	public void user_trys_to_proceed_to_payment_page_without_adding_the_item_in_add_to_cart() {
		
		   System.out.println("user trys to proceed to payment page");
		   
	}

	@Then("TestMeApp dosen't display the cart icon")
	public void testmeapp_dosen_t_display_the_cart_icon() {
		Assert.assertEquals( driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).getText(),
				"Cart "+ driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]/b")).getText()+" ");
	}
	
	
	
	
	
	
	
	
	
	@Given("User login to testmeapp")
public void user_login_to_testmeapp() {
		System.out.println("user enters into loginpage");
		   driver=UtilityClass.getDriver("chrome");
		     driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		     driver.findElement(By.xpath("//*[@id=\'header\']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		     driver.findElement(By.id("userName")).sendKeys("Logesh123");
			 driver.findElement(By.id("password")).sendKeys("123456");
			  driver.findElement(By.name("Login")).click();
			  System.out.println("user navigated to homepage");
			    Assert.assertEquals("Home", driver.getTitle());
}

@When("User searches a product {string}")
public void user_searches_a_product(String string) {
	driver.findElement(By.id("myInput")).sendKeys(string);
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
}

@When("User Add the item to cart")
public void user_Add_the_item_to_cart() {
   driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
 
  // Assert.assertEquals( driver.findElement(By.xpath("//*[@id=\'header\']/div[1]/div/div/div[2]/div/a[2]")).getText(),
		  // "Cart "+ driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]/b")).getText()+"");
   //System.out.println(driver.findElement(By.xpath("//*[@id=\\'header\\']/div[1]/div/div/div[2]/div/a[2]")).getText());
  // System.out.println(driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]/b")).getText());
   		 
 
   
   
   }




@When("user clicks the cart link")
public void user_clicks_the_cart_link() {
	
	
	
	System.out.println("TestMeapp  displays the cart icon");
	 driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]/b")).click();
	   
	 

	   driver.findElement(By.xpath("//*[@id='cart']/tfoot/tr[2]/td[5]/a")).click();
	   driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	   WebDriverWait wait = new WebDriverWait(driver, 10);
	   
	   wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h3")));
	    
		Assert.assertEquals("Payment Gateway", driver.getTitle());
}

@When("User proceeds to payment page")
public void user_proceeds_to_payment_page() {
	driver.findElement(By.xpath("//*[@id='swit']/div[1]/div/label")).click();
    
	   driver.findElement(By.id("btn")).click();
	    
	   Assert.assertEquals(driver.getTitle(), "Payment Gateway");
	    
	   driver.findElement(By.name("username")).sendKeys("123456");
	    
	   driver.findElement(By.name("password")).sendKeys("Pass@456");
	    
	   driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	    
	   WebDriverWait waitt = new WebDriverWait(driver, 10);
	    
	   waitt.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h4")));
	    
	   driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
	    
	   driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	    
	   Assert.assertEquals(driver.getTitle(), "Order Details");

    
}

@Then("User purchased the product successfully")
public void user_purchased_the_product_successfully() {
   System.out.println("payment done successfully");
}
}

