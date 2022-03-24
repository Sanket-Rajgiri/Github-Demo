package com.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.pages.Page07_TS_07;

public class StepDefinition07_TS_07 {
	public WebDriver driver;
	Page07_TS_07 obj;

	@When("Seven_Driver is loaded")
	public void seven_driver_is_loaded() {
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		obj = new Page07_TS_07(driver);
		System.out.println("Checked driver");
	}
	
	@When("Seven_Property File is loaded")
	public void seven_property_file_is_loaded() throws IOException {
		obj.seven_property_file_is_loaded();
	}

	@Given("Seven_Directed to the site")
	public void seven_directed_to_the_site() {
	    obj.seven_directed_to_the_site();
	}

	@Then("Seven_Clicked on Plot")
	public void seven_clicked_on_plot() {
	    obj.seven_clicked_on_plot();
	}

	@Then("Seven_Enter location")
	public void seven_enter_location() {
	    obj.seven_enter_location();
	}

	@And("Seven_Select Residential Type")
	public void seven_select_residential_type() {
	    obj.seven_select_residential_type();
	}

	@Then("Seven_Select Budget")
	public void seven_select_budget() {
	    obj.seven_select_budget();
	}

	@And("Seven_Click on Search")
	public void seven_click_on_search() {
	    obj.seven_click_on_search();
	}

	@And("Seven_Driver is closed")
	public void seven_driver_is_closed() {
		driver.quit();
	}
}
