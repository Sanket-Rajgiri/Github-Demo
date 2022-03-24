package com.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.pages.Page10_TS_10;

public class StepDefinition10_TS_10 {
	public WebDriver driver;
	Page10_TS_10 obj;
	
	@When("Ten_Driver is loaded")
	public void ten_driver_is_loaded() {
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		obj = new Page10_TS_10(driver);
		System.out.println("Checked driver");
	}

	@When("Ten_Property File is loaded")
	public void ten_property_file_is_loaded()  throws IOException {
	    obj.ten_property_file_is_loaded();
	}

	@Given("Ten_Directed to the site")
	public void ten_directed_to_the_site() {
	    obj.ten_directed_to_the_site();
	}

	@Then("Ten_Clicked on Rent dropdown")
	public void ten_clicked_on_rent_dropdown() {
	    obj.ten_clicked_on_rent_dropdown();
	}

	@When("Ten_Click on Owner Properties")
	public void ten_click_on_owner_properties() {
	   obj.ten_click_on_owner_properties();
	}

	@Then("Ten_Click on Verified Properites")
	public void ten_click_on_verified_properites() {
		obj.ten_click_on_verified_properites();
	}

	@When("Ten_Click on Furnished Homes")
	public void ten_click_on_furnished_homes() {
	    obj.ten_click_on_furnished_homes();
	}

	@When("Ten_Click on Bachelor Friendly Homes")
	public void ten_click_on_bachelor_friendly_homes() {
	  obj.ten_click_on_bachelor_friendly_homes();
	}

	@When("Ten_Click on Immediately Available")
	public void ten_click_on_immediately_available() {
	    obj.ten_click_on_immediately_available();
	}

	@And("Ten_Driver is closed")
	public void ten_driver_is_closed() {
	    driver.quit();
	}

	@When("Ten_Click on Flat for rent in Mumbai")
	public void ten_click_on_flat_for_rent_in_mumbai() {
	   obj.ten_click_on_flat_for_rent_in_mumbai();
	}

	@When("Ten_Click on House for rent in Mumbai")
	public void ten_click_on_house_for_rent_in_mumbai() {
	    obj.ten_click_on_house_for_rent_in_mumbai();
	}

	@When("Ten_Click on Villa for rent in Mumbai")
	public void ten_click_on_villa_for_rent_in_mumbai() {
	    obj.ten_click_on_villa_for_rent_in_mumbai();
	}

	@When("Ten_Click on PG in Mumbai")
	public void ten_click_on_pg_in_mumbai() {
	    obj.ten_click_on_pg_in_mumbai();
	}

	@When("Ten_Click on Office Space in Mumbai")
	public void ten_click_on_office_space_in_mumbai() {
	   obj.ten_click_on_office_space_in_mumbai();
	}

	@When("Ten_Click on Commercial Shops in Mumbai")
	public void ten_click_on_commercial_shops_in_mumbai() {
	    obj.ten_click_on_commercial_shops_in_mumbai();
	}

	@When("Ten_Click on Coworking Space in Mumbai")
	public void ten_click_on_coworking_space_in_mumbai() {
	    obj.ten_click_on_coworking_space_in_mumbai();
	}


	@When("Ten_Click on Under ten_k")
	public void ten_click_on_under_ten_k() {
	    obj.ten_click_on_under_ten_k();
	}

	@When("Ten_Click on ten_k to fifteen_k")
	public void ten_click_on_ten_k_to_fifteen_k() {
	   obj.ten_click_on_ten_k_to_fifteen_k();
	}

	@When("Ten_Click on fifteen_k to twentyfive_k")
	public void ten_click_on_fifteen_k_to_twentyfive_k() {
	    obj.ten_click_on_fifteen_k_to_twentyfive_k();
	}

	@When("Ten_Click on above twnetyfive_k")
	public void ten_click_on_above_twnetyfive_k() {
	    obj.ten_click_on_above_twnetyfive_k();;
	}

	

	@When("Ten_Click on Localities")
	public void ten_click_on_localities() {
	    obj.ten_click_on_bachelor_friendly_homes();
	}

	@When("Ten_Click on Buy vs Rent")
	public void ten_click_on_buy_vs_rent() {
	    obj.ten_click_on_buy_vs_rent();
	}

	@When("Ten_Click on Find an Agent")
	public void ten_click_on_find_an_agent() {
	    obj.ten_click_on_find_an_agent();
	}

	@When("Ten_Click on Share requirement")
	public void ten_click_on_share_requirement() {
	    obj.ten_click_on_share_requirement();
	}

	@When("Ten_Click on Property Services")
	public void ten_click_on_property_services() {
	   obj.ten_click_on_property_services();
	}

	@When("Ten_Click on Rent Agreement")
	public void ten_click_on_rent_agreement() {
	   obj.ten_click_on_rent_agreement();
	}

	@When("Ten_Click on Pay Rent")
	public void ten_click_on_pay_rent() {
	    obj.ten_click_on_pay_rent();
	}	

}
