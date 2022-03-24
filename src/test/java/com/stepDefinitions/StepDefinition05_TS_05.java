package com.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.pages.Page05_TS_05;

public class StepDefinition05_TS_05 {
	public WebDriver driver;
	Page05_TS_05 obj;
	
	@When("Five_Driver is loaded")
	public void five_driver_is_loaded() {
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		obj = new Page05_TS_05(driver);
		System.out.println("Checked driver"); 
	}
	
	@When("Five_Property File is loaded")
	public void five_property_file_is_loaded() throws IOException {
		obj.five_property_file_is_loaded();
	}

	@Given("Five_Directed to the site")
	public void five_directed_to_the_site() {
		obj.five_directed_to_the_site();
	}

	@Then("Five_Clicked on Buy")
	public void five_clicked_on_buy() {
		obj.five_clicked_on_buy();
	}

	@Then("Five_Enter location")
	public void five_enter_location() {
		obj.five_enter_location();
	}

	@And("Five_Select Bhk")
	public void five_select_bhk() {
		obj.five_select_bhk();
	}

	@Then("Five_Select Price")
	public void five_select_price() {
		obj.five_select_price();
	}

	@And("Five_Click on Search")
	public void five_click_on_search() {
		obj.five_click_on_search();
	}
	@And("Five_Driver is closed")
	public void five_Driver_is_closed() {
		driver.quit();
	}

}
