package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Testbase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class vehiclestepdefinition extends Testbase {
	
	WebDriver driver;
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Exception {
	      Testbase.intialization();
      System.out.println(driver.getTitle());
     }

	@When("^user enters vehicle registration number$")
	public void user_enters_vehicle_registration_number() throws Exception {
	
		driver.findElement(By.id("vehicleReg")).sendKeys("OV12UYY");
		  
	}
	@When("^User clicks on find vehicle$")
	public void user_clicks_on_find_vehicle() throws Exception {
		
		driver.findElement(By.xpath("//span[contains(text(),'Find vehicle')]")).click();
	}

	@Then("^user get results for that vehicle$")
	public void user_get_results_for_that_vehicle() throws Exception{
		
		System.out.println(driver.findElement(By.xpath("//div[@class='result']")).isDisplayed());
		driver.close();
			


	}



}
