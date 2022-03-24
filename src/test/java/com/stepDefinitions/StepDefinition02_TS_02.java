package com.stepDefinitions;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.pages.Page02_TS_02;

public class StepDefinition02_TS_02 {
	
	public WebDriver driver;
	Page02_TS_02 obj;
	
	@When("Two_Driver is loaded")
	public void one_driver_is_loaded() {
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		obj = new Page02_TS_02(driver);
		System.out.println("Checked driver");
	}
	@When("Two_Property File is loaded")
	public void two_property_file_is_loaded() throws IOException {
		obj.two_property_file_is_loaded();
	}
	
	@Given("Two_Directed to the site to login")
	public void two_directed_to_the_site_to_login() throws IOException {
		obj.two_directed_to_the_site_to_login();
	    System.out.println("Directed to site");
	}

	@And("Two_Clicked on Login")
	public void two_clicked_on_login() {
		obj.two_clicked_on_login();
		System.out.println("CLick Login");
	}
	
	@Then("Two_Enter Phone Number and clicked Next")
	public void two_enter_phone_number_and_clicked_next() {
		obj.two_enter_phone_number_and_clicked_next();
	    System.out.println("Enter Phone Number and clicked Next");
	}

	@And("Two_Enter OTP and Clicked Continue")
	public void two_enter_otp_and_clicked_continue() {
		obj.two_enter_otp_and_clicked_continue();
	    System.out.println("Enter OTP and Clicked Continue");
	}

	@Then("Two_Landed on logined site")
	public void two_landed_on_logined_site() {
		obj.two_landed_on_logined_site();
	    System.out.println("Landed on logined site");
	}

	@And("Two_Returns to Final Page")
	public void two_returns_to_final_page() {
		obj.two_returns_to_final_page();
		System.out.println("Returns to Final Page");
	}
	
	
	@Then("Two_Enter email id and clicked Next")
	public void two_enter_email_id_and_clicked_next() {
		obj.two_enter_email_id_and_clicked_next();
	    System.out.println("Enter email id and clicked Next");
	}
	@And("Two_Enter Password and Clicked Continue")
	public void two_enter_password_and_clicked_continue() {
		obj.two_enter_password_and_clicked_continue();
	    System.out.println("Enter Password and Clicked Continue");
	}

	@And("Two_Enter invalid Phone Number and clicked Next")
	public void two_enter_invalid_phone_number_and_clicked_next() {
		obj.two_enter_invalid_phone_number_and_clicked_next();
		System.out.println("Enter invalid Phone Number and clicked Next");
	}

	@Then("Two_Enter invalid email id and clicked Next")
	public void two_enter_invalid_email_id_and_clicked_next() {
		obj.two_enter_invalid_email_id_and_clicked_next();
	    System.out.println("Enter invalid email id and clicked Next");
	}

	@And("Two_Enter nothing and clicked Next")
	public void two_enter_nothing_and_clicked_next() {
		obj.two_enter_nothing_and_clicked_next();
	    System.out.println("Enter nothing and clicked Next");
	}
	@And("Two_Driver is closed")
	public void two_Driver_is_closed() {
		driver.quit();
	}

}
