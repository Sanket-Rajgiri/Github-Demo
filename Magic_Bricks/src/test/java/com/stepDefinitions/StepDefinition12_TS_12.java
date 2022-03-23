package com.stepDefinitions;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.pages.Page12_TS_12;

public class StepDefinition12_TS_12 {
	public WebDriver driver;
	Page12_TS_12 obj;
	
	@When("Twelve_Driver is loaded")
	public void one_driver_is_loaded() {
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		obj = new Page12_TS_12(driver);
		System.out.println("Checked driver");
	}
	
	@When("Twelve_Property File is loaded")
	public void one_property_file_is_loaded() throws IOException {
		obj.twelve_property_file_is_loaded();
	}

	@Given("Twelve_Directed to the site")
	public void twelve_directed_to_the_site() {
	    obj.twelve_directed_to_the_site();
	}

	@Then("Twelve_Clicked on Home Loans dropdown")
	public void twelve_clicked_on_home_loans_dropdown() {
	    obj.twelve_clicked_on_home_loans_dropdown();
	}

	@When("Twelve_Click on Home Loans")
	public void twelve_click_on_home_loans() {
	    obj.twelve_click_on_home_loans();
	}

	@When("Twelve_Click on Balance Transfer")
	public void twelve_click_on_balance_transfer() {
	    obj.twelve_click_on_balance_transfer();
	}

	@When("Twelve_Click on Loan Against Property")
	public void twelve_click_on_loan_against_property() {
	    obj.twelve_click_on_loan_against_property();
	}

	@When("Twelve_Click on Preapproved Home Loan")
	public void twelve_click_on_preapproved_home_loan() {
	    obj.twelve_click_on_preapproved_home_loan();
	}

	@And("Twelve_driver is closed")
	public void twelve_driver_is_closed() {
	    driver.quit();
	}
	
	@When("Twelve_Click on SBI Home Loan")
	public void twelve_click_on_sbi_home_loan() {
	    obj.twelve_click_on_sbi_home_loan();
	}

	@When("Twelve_Click on HDFC Ltd Home Loan")
	public void twelve_click_on_hdfc_ltd_home_loan() {
	    obj.twelve_click_on_hdfc_ltd_home_loan();
	}

	@When("Twelve_Click on PNB HFL Home Loan")
	public void twelve_click_on_pnb_hfl_home_loan() {
	    obj.twelve_click_on_pnb_hfl_home_loan();
	}

	@When("Twelve_Click on ICICI Home Loan")
	public void twelve_click_on_icici_home_loan() {
	   obj.twelve_click_on_icici_home_loan();
	}

	@When("Twelve_Click on Bajaj Housing")
	public void twelve_click_on_bajaj_housing() {
	    obj.twelve_click_on_bajaj_housing();
	}

	@When("Twelve_Click on Bank of Badoda")
	public void twelve_click_on_bank_of_badoda() {
	    obj.twelve_click_on_bank_of_badoda();
	}

}
