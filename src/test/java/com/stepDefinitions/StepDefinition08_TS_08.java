package com.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.pages.Page08_TS_08;

public class StepDefinition08_TS_08 {
	public WebDriver driver;
	Page08_TS_08 obj;

	@When("Eight_Driver is loaded")
	public void eight_driver_is_loaded() {
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		obj = new Page08_TS_08(driver);
		System.out.println("Eight_Checked driver");
	}
	
	@When("Eight_Property File is loaded")
	public void eight_property_file_is_loaded() throws IOException {
		obj.eight_property_file_is_loaded();
	}

	@Given("Eight_Directed to the site")
	public void eight_directed_to_the_site() {
	    obj.eight_directed_to_the_site();
	}

	@Then("Eight_Clicked on Commercial")
	public void eight_clicked_on_commercial() {
	    obj.eight_clicked_on_commercial();
	}

	@Then("Eight_Select Commerical type")
	public void eight_select_commerical_type() {
	    obj.eight_select_commerical_type();
	}

	@And("Eight_Enter location")
	public void eight_enter_location() {
	    obj.eight_enter_location();
	}

	@And("Eight_Select Property Type")
	public void eight_select_property_type() {
	    obj.eight_select_property_type();
	}

	@Then("Eight_Select Budget")
	public void eight_select_budget() {
	    obj.eight_select_budget();
	}

	@And("Eight_Click on Search")
	public void eight_click_on_search() {
	    obj.eight_click_on_search();
	}

	@And("Eight_Driver is closed")
	public void eight_driver_is_closed() {
		driver.quit();
	}
}
