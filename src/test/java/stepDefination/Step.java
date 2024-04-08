package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step {
      
	WebDriver driver;
	
	@Given("user open a chrome browser and enters a url")
	public void user_open_a_chrome_browser_and_enters_a_url() {
		
	   WebDriverManager.chromedriver().setup();
	   
	    driver = new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   
	   driver.get("https://v1.training-support.net/selenium/simple-form");
	}

	@When("user enters values of firstname, lastname, email, contact number,message")
	public void user_enters_values_of_firstname_lastname_email_contact_number_message() {
	   
		driver.findElement(By.id("firstName")).sendKeys("Manisha");
		
		driver.findElement(By.id("lastName")).sendKeys("Rana");
		
		driver.findElement(By.id("email")).sendKeys("manishasonamela@gmail.com");
		
		driver.findElement(By.id("number")).sendKeys("9182392290");
		
		driver.findElement(By.xpath("//textarea")).sendKeys("Hello");
		
	}

	@And("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		
		driver.findElement(By.xpath("//input[@value='submit']")).click();
	    
	}

	@Then("A pop up alert should be displayed")
	public void a_pop_up_alert_should_be_displayed() {
	   
		System.out.println("A alert pop up is displayed");
	}

}
