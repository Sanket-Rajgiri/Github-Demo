package com.stepDefinitions;
import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.pages.Page03_TS_03;

public class StepDefinition03_TS_03 {
	
	public WebDriver driver;
	Page03_TS_03 obj;

	@When("Three_Driver is loaded")
	public void three_driver_is_loaded() {
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		obj = new Page03_TS_03(driver);
		System.out.println("Checked driver");
	}
	@When("Three_Property File is loaded")
	public void three_property_file_is_loaded() throws IOException {
		obj.three_property_file_is_loaded();
	}

	@Given("Three_Directed to the site")
	public void three_directed_to_the_site() {
		obj.three_directed_to_the_site();
	    System.out.println("Directed to site");
	}

	@Then("Three_Clicked on Buy")
	public void three_clicked_on_buy() {
		obj.three_clicked_on_buy();
	}

	@And("Three_Clicked on Rent")
	public void three_clicked_on_rent() {
		obj.three_clicked_on_rent();	  
	}

	@Then("Three_Clicked on Sell")
	public void three_clicked_on_sell() {
	  obj.three_clicked_on_sell();
	}

	@And("Three_Clicked on Home Loans")
	public void three_clicked_on_home_loans() {
	  obj.three_clicked_on_home_loans();
	}

	@Then("Three_Clicked on Property Services")
	public void three_clicked_on_property_services() {
	  obj.three_clicked_on_property_services();
	}

	@And("Three_Clicked on MB Advice")
	public void three_clicked_on_mb_advice() {
	  obj.three_clicked_on_mb_advice();
	}

	@Then("Three_Clicked on Help")
	public void three_clicked_on_help() {
	  obj.three_clicked_on_help();
	}
	@And("Three_Driver is closed")
	public void three_Driver_is_closed() {
		driver.quit();
	}
}
