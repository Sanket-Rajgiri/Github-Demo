package com.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.pages.Page04_TS_04;

public class StepDefinition04_TS_04 {
	public WebDriver driver;
	Page04_TS_04 obj;
	
	@When("Four_Driver is loaded")
	public void four_driver_is_loaded() {
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		obj = new Page04_TS_04(driver);
		System.out.println("Checked driver");
	}
	
	@When("Four_Property File is loaded")
	public void four_property_file_is_loaded() throws IOException {
		obj.four_property_file_is_loaded();
	}

	@Given("Four_Directed to the site")
	public void four_directed_to_the_site() {
		obj.four_directed_to_the_site();
	}

	@Then("Four_Clicked on Buy")
	public void four_clicked_on_buy() {
		obj.four_clicked_on_buy();
	}

	@Then("Four_Enter location")
	public void four_enter_location() {
		obj.four_enter_location();
	}

	@And("Four_Select Plot")
	public void four_select_plot() {
		obj.four_select_plot();
	}

	@Then("Four_Select Price")
	public void four_select_price() {
		obj.four_select_price();
	}

	@And("Four_Click on Search")
	public void four_click_on_search() {
		obj.four_click_on_search();
	}
	@And("Four_Driver is closed")
	public void four_Driver_is_closed() {
		driver.quit();
	}

}
