package RegisterScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import CaseStudy.TestMeApp.UtilityClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class RegisterSetUp {
	WebDriver driver;
	@Given("User enters the TestMeApp")
	public void user_enters_the_TestMeApp() {
		driver=UtilityClass.getDriver("chrome");
	     driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@Given("User clicks on the signup link")
	public void user_clicks_on_the_signup_link() {
		driver.findElement(By.linkText("SignUp")).click();
	}

	@And("User enters the signUp page")
	public void user_enters_the_signUp_page() {
		System.out.println("user entered signup page");
	}

	@And("User enters the UserName {string}")
	public void user_enters_the_UserName(String string) {
		driver.findElement(By.id("userName")).sendKeys(string);
	}
	@And("User enters the FirstName {string}")
	public void user_enters_the_FirstName(String string) {
		driver.findElement(By.name("firstName")).sendKeys(string);
	}

	@And("User enters the LastName {string}")
	public void user_enters_the_LastName(String string) {
		  driver.findElement(By.name("lastName")).sendKeys(string);
	}

	@And("User enters the Password {string}")
	public void user_enters_the_Password(String string) {
		 driver.findElement(By.id("password")).sendKeys(string);
	}

	@And("User enters the ConfirmPassword {string}")
	public void user_enters_the_ConfirmPassword(String string) {
		 driver.findElement(By.id("pass_confirmation")).sendKeys(string);
	}

	@And("User enters the Gender {string}")
	public void user_enters_the_Gender(String string) {
		 driver.findElement(By.xpath("//*[@id='gender']")).click();
	}

	@And("User enters the Email {string}")
	public void user_enters_the_Email(String string) {
		driver.findElement(By.id("emailAddress")).sendKeys(string);
	}

	@And("User enters the MobileNumber {string}")
	public void user_enters_the_MobileNumber(String string) {
		driver.findElement(By.id("mobileNumber")).sendKeys(string);
	}

	@And("User enters the DateOfBirth {string}")
	public void user_enters_the_DateOfBirth(String string) {
		driver.findElement(By.name("dob")).sendKeys(string);
	}

	@And("User enters the Address {string}")
	public void user_enters_the_Address(String string) {
		driver.findElement(By.id("address")).sendKeys(string);
	}

	@And("User enters the SecurityQuestion {string}")
	public void user_enters_the_SecurityQuestion(String string) {
		 Select question = new Select(driver.findElement(By.id("securityQuestion")));
		   question.selectByValue("411010");
	}

	@And("User enters the Answer {string}")
	public void user_enters_the_Answer(String string) {
		driver.findElement(By.id("answer")).sendKeys(string);
	}

	@And("User clicks on the Register Button")
	public void user_clicks_on_the_Register_Button() {
		 driver.findElement(By.name("Submit")).click();
	}

	@Then("New user gets Registered")
	public void new_user_gets_Registered() {
	System.out.println("User registered");
	}



}
