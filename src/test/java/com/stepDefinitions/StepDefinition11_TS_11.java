package com.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.pages.Page11_TS_11;

public class StepDefinition11_TS_11 {
	
	public WebDriver driver;
	Page11_TS_11 obj;
	@When("Eleven_Driver is loaded")
	public void eleven_driver_is_loaded() {
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		obj = new Page11_TS_11(driver);
		System.out.println("Checked driver");
	}

	@When("Eleven_Property File is loaded")
	public void eleven_property_file_is_loaded() throws IOException {
	    obj.eleven_property_file_is_loaded();
	}

	@Given("Eleven_Directed to the site")
	public void eleven_directed_to_the_site() {
	    obj.eleven_directed_to_the_site();
	}

	@Then("Eleven_Clicked on Sell dropdown")
	public void eleven_clicked_on_sell_dropdown() {
	   obj.eleven_clicked_on_sell_dropdown();
	}

	@When("Eleven_Click on Post Property")
	public void eleven_click_on_post_property() {
	   obj.eleven_click_on_post_property();
	}
	
	@When("Eleven_Click on My Dashboard")
	public void eleven_click_on_my_dashboard() {
	    obj.eleven_click_on_my_dashboard();
	}

	@When("Eleven_Click on Sell Packages")
	public void eleven_click_on_sell_packages() {
	    obj.eleven_click_on_sell_packages();
	}

	@And("Eleven_driver is closed")
	public void eleven_driver_is_closed() {
	    driver.quit();
	}

	@When("Eleven_Click on Property Valuation")
	public void eleven_click_on_property_valuation() {
	    obj.eleven_click_on_property_valuation();
	}

	@When("Eleven_Click on Find an Agent")
	public void eleven_click_on_find_an_agent() {
	    obj.eleven_click_on_find_an_agent();
	}

	@When("Eleven_Click on Rates and Trends")
	public void eleven_click_on_rates_and_trends() {
	    obj.eleven_click_on_rates_and_trends();
	}
}
