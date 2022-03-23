package com.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.pages.Page06_TS_06;

public class StepDefinition06_TS_06 {
	public WebDriver driver;
	Page06_TS_06 obj;
	
	@When("Six_Driver is loaded")
	public void six_driver_is_loaded() {
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		obj = new Page06_TS_06(driver);
		System.out.println("Checked driver");
	}

	@When("Six_Property File is loaded")
	public void six_property_file_is_loaded() throws IOException {
		obj.six_property_file_is_loaded();
	}
	
	@Given("Six_Directed to the site")
	public void six_directed_to_the_site() {
		obj.six_directed_to_the_site();
	    System.out.println("Six_Directed to the site");
	}

	@Then("Six_Clicked on PG")
	public void six_clicked_on_pg() {
	    obj.six_clicked_on_pg();
	}

	@Then("Six_Enter location")
	public void six_enter_location() {
	    obj.six_enter_location();
	}

	@And("Six_Select Occpancy Type")
	public void six_select_occpancy_type() {
	    obj.six_select_occpancy_type();
	}

	@Then("Six_Select Budget")
	public void six_select_budget() {
	    obj.six_select_budget();
	}

	@And("Six_Click on Search")
	public void six_click_on_search() {
	    obj.six_click_on_search();
	}

	@And("Six_Driver is closed")
	public void six_driver_is_closed() {
		driver.quit();
	}

}
