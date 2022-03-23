package com.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.pages.Page09_TS_09;


public class StepDefinition09_TS_09 {
	
	public WebDriver driver;
	Page09_TS_09 obj;


	@When("Nine_Driver is loaded")
	public void nine_driver_is_loaded() {
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		obj = new Page09_TS_09(driver);
		System.out.println("Nine_Checked driver");
	    
	}
	
	@When("Nine_Property File is loaded")
	public void nine_property_file_is_loaded() throws IOException {
		obj.nine_property_file_is_loaded();
	}

	@Given("Nine_Directed to the site")
	public void nine_directed_to_the_site() {
	    obj.nine_directed_to_the_site();
	}

	@Then("Nine_Clicked on Buy dropdown")
	public void nine_clicked_on_buy_dropdown() {
	    obj.nine_clicked_on_buy_dropdown();
	}

	@When("Nine_Click on Ready to Move")
	public void nine_click_on_ready_to_move() {
	    obj.nine_click_on_ready_to_move();
	}

	@Then("Nine_Click on Owner Properites")
	public void nine_click_on_owner_properites() {
	   obj.nine_click_on_owner_properites();
	}

	@When("Nine_Click on Budget Homes")
	public void nine_click_on_budget_homes() {
	    obj.nine_click_on_budget_homes();
	}

	@When("Nine_Click on Premium Homes")
	public void nine_click_on_premium_homes() {
	    obj.nine_click_on_premium_homes();
	}

	@And("Nine_Driver is closed")
	public void nine_driver_is_closed() {
	    driver.quit();
	}
	@When("Nine_Click on Flats in Mumbai")
	public void nine_click_on_flats_in_mumbai() {
	    obj.nine_click_on_flats_in_mumbai();
	}

	@Then("Nine_Click on House for sale in Mumbai")
	public void nine_click_on_house_for_sale_in_mumbai() {
	    obj.nine_click_on_house_for_sale_in_mumbai();
	}

	@When("Nine_Click on Villa in Mumbai")
	public void nine_click_on_villa_in_mumbai() {
	    obj.nine_click_on_villa_in_mumbai();
	}

	@When("Nine_Click on Plot in Mumbai")
	public void nine_click_on_plot_in_mumbai() {
	    obj.nine_click_on_plot_in_mumbai();
	}

	@When("Nine_Click on Office Space in Mumbai")
	public void nine_click_on_office_space_in_mumbai() {
	   obj.nine_click_on_office_space_in_mumbai();
	}

	@When("Nine_Click on Commercial Shops in Mumbai")
	public void nine_click_on_commercial_shops_in_mumbai() {
	   obj.nine_click_on_commercial_shops_in_mumbai();
	}
}
