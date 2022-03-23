package com.stepDefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.pages.Page01_TS_01;

public class StepDefinition01_TS_01 {
	
	public WebDriver driver;
	Page01_TS_01 obj;
	
	@When("One_Driver is loaded")
	public void one_driver_is_loaded() {
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		obj = new Page01_TS_01(driver);
		System.out.println("Checked driver");
	}
	
	@When("One_Property File is loaded")
	public void one_property_file_is_loaded() throws IOException {
		obj.one_property_file_is_loaded();
	}

	@Then("One_Directed to the site")
	public void one_directed_to_the_site() throws IOException  {
		obj.one_directed_to_the_site();
	}

	@And("One_Click on Magic Bricks Logo")
	public void one_click_on_magic_bricks_logo() {
		obj.one_click_on_magic_bricks_logo();
	}

	@Then("One_Click on Location")
	public void one_click_on_location() {
		obj.one_click_on_location();
	}

	@And("One_Click on MB Prime")
	public void one_click_on_mb_prime() {
		obj.one_click_on_mb_prime();
	}

	@Then("One_Click on Login")
	public void one_click_on_login() {
		obj.one_click_on_login();
	}
	@Then("One_Click on Post Property")
	public void one_click_on_post_property() {
		obj.one_click_on_post_property();
	}
	@And("One_Driver is closed")
	public void one_Driver_is_closed() {
		driver.close();
	}

}
