package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class Page10_TS_10 {
	
	WebDriver driver;
	JavascriptExecutor js;
	ArrayList<String> tabs;
	Properties prop;
	FileInputStream fs;
	
	public Page10_TS_10(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		js = (JavascriptExecutor) driver;
		
	}
	public void waitTime(int n)
	{
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void scroll_view(WebDriver driver)
	{
		tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		waitTime(2000);
		for(int i = 1; i <= 8; i++)
	    {
			waitTime(1000);
	    	js.executeScript("window.scrollBy(0,200)");
	    }
		driver.close();
		driver.switchTo().window(tabs.get(0));
		waitTime(3000);
	}
	
	public void ten_property_file_is_loaded() throws IOException  {
		prop = new Properties();
		fs = new FileInputStream("src\\test\\resources\\Properties\\Property_10_TS_10.properties");
		prop.load(fs);
		System.out.println("Ten_Property File is loaded");
	}


	public void ten_directed_to_the_site() {
		driver.get("https://www.magicbricks.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		waitTime(3000);
		System.out.println("Checked site");
		
	}


	public void ten_clicked_on_rent_dropdown() {
		WebElement rent_dropdown = driver.findElement(By.xpath("/html/body/header/section[2]/div/ul/li[2]/a"));
		rent_dropdown.click();
		waitTime(2000);
		System.out.println("Ten_Clicked on Rent dropdown");
		
	}


	public void ten_click_on_owner_properties() {
		WebElement owner_properties = driver.findElement(By.xpath(prop.getProperty("owner_properties")));
		owner_properties.click();
		scroll_view(driver);
		waitTime(2000);
		System.out.println("Ten_Click on Owner Properties");
		
	}


	public void ten_click_on_verified_properites() {
		WebElement verified_properites = driver.findElement(By.xpath(prop.getProperty("verified_properites")));
		verified_properites.click();
		scroll_view(driver);
		waitTime(2000);
		System.out.println("Ten_Click on Verified Properites");
	}


	public void ten_click_on_furnished_homes() {
		WebElement furnished_homes = driver.findElement(By.xpath(prop.getProperty("furnished_homes")));
		furnished_homes.click();
		scroll_view(driver);
		waitTime(2000);
		System.out.println("Ten_Click on Furnished Homes");
	}


	public void ten_click_on_bachelor_friendly_homes() {
		WebElement bachelor_friendly_homes = driver.findElement(By.xpath(prop.getProperty("bachelor_friendly_homes")));
		bachelor_friendly_homes.click();
		scroll_view(driver);
		waitTime(2000);
		System.out.println("Ten_Click on Bachelor Friendly Homes");
	}


	public void ten_click_on_immediately_available() {
		WebElement immediately_available = driver.findElement(By.xpath(prop.getProperty("immediately_available")));
		immediately_available.click();
		scroll_view(driver);
		waitTime(2000);
		System.out.println("Ten_Click on Immediately Available");
	}

	public void ten_click_on_flat_for_rent_in_mumbai() {
		WebElement flat_for_rent_in_mumbai = driver.findElement(By.xpath(prop.getProperty("flat_for_rent_in_mumbai")));
		flat_for_rent_in_mumbai.click();
		scroll_view(driver);
		waitTime(2000);
		System.out.println("Ten_Click on Flat for rent in Mumbai");
	}

	public void ten_click_on_house_for_rent_in_mumbai() {
		WebElement house_for_rent_in_mumbai = driver.findElement(By.xpath(prop.getProperty("house_for_rent_in_mumbai")));
		house_for_rent_in_mumbai.click();
		scroll_view(driver);
		waitTime(2000);
		System.out.println("Ten_Click on House for rent in Mumbai");
	}


	public void ten_click_on_villa_for_rent_in_mumbai() {
		WebElement villa_for_rent_in_mumbai = driver.findElement(By.xpath(prop.getProperty("villa_for_rent_in_mumbai")));
		villa_for_rent_in_mumbai.click();
		scroll_view(driver);
		waitTime(2000);
		System.out.println("Ten_Click on Villa for rent in Mumbai");
	}

	public void ten_click_on_pg_in_mumbai() {
		WebElement pg_in_mumbai = driver.findElement(By.xpath(prop.getProperty("pg_in_mumbai")));
		pg_in_mumbai.click();
		scroll_view(driver);
		waitTime(2000);
		System.out.println("Ten_Click on PG in Mumbai");
	}

	
	public void ten_click_on_office_space_in_mumbai() {
		WebElement office_space_in_mumbai = driver.findElement(By.xpath(prop.getProperty("office_space_in_mumbai")));
		office_space_in_mumbai.click();
		scroll_view(driver);
		waitTime(2000);
		System.out.println("Ten_Click on Office Space in Mumbai");
	}


	public void ten_click_on_commercial_shops_in_mumbai() {
		WebElement commercial_shops_in_mumbai = driver.findElement(By.xpath(prop.getProperty("commercial_shops_in_mumbai")));
		commercial_shops_in_mumbai.click();
		scroll_view(driver);
		waitTime(2000);
		System.out.println("Ten_Click on Commercial Shops in Mumbai");
	}


	public void ten_click_on_coworking_space_in_mumbai() {
		WebElement coworking_space_in_mumbai = driver.findElement(By.xpath(prop.getProperty("coworking_space_in_mumbai")));
		coworking_space_in_mumbai.click();
		scroll_view(driver);
		waitTime(2000);
		System.out.println("Ten_Click on Coworking Space in Mumbai");
	}

	
	public void ten_click_on_under_ten_k() {
		WebElement under_ten_k = driver.findElement(By.xpath(prop.getProperty("under_ten_k")));
		under_ten_k.click();
		scroll_view(driver);
		waitTime(2000);
		System.out.println("Ten_Click on Under ten_k");
	}


	public void ten_click_on_ten_k_to_fifteen_k() {
		WebElement ten_k_to_fifteen_k = driver.findElement(By.xpath(prop.getProperty("ten_k_to_fifteen_k")));
		ten_k_to_fifteen_k.click();
		scroll_view(driver);
		waitTime(2000);
		System.out.println("Ten_Click on ten_k to fifteen_k");
	}

	public void ten_click_on_fifteen_k_to_twentyfive_k() {
		WebElement fifteen_k_to_twentyfive_k = driver.findElement(By.xpath(prop.getProperty("fifteen_k_to_twentyfive_k")));
		fifteen_k_to_twentyfive_k.click();
		scroll_view(driver);
		waitTime(2000);
		System.out.println("Ten_Click on fifteen_k to twentyfive_k");
	}

	public void ten_click_on_above_twnetyfive_k() {
		WebElement above_twnetyfive_k = driver.findElement(By.xpath(prop.getProperty("above_twnetyfive_k")));
		above_twnetyfive_k.click();
		scroll_view(driver);
		waitTime(2000);
		System.out.println("Ten_Click on above twnetyfive_k");
	}

	public void ten_click_on_localities() {
		WebElement localities = driver.findElement(By.xpath(prop.getProperty("localities")));
		localities.click();
		scroll_view(driver);
		waitTime(2000);
		System.out.println("Ten_Click on Localities");
	}

	public void ten_click_on_buy_vs_rent() {
		WebElement buy_vs_rent = driver.findElement(By.xpath(prop.getProperty("buy_vs_rent")));
		buy_vs_rent.click();
		scroll_view(driver);
		waitTime(2000);
		System.out.println("Ten_Click on Buy vs Rent");
	}

	public void ten_click_on_find_an_agent() {
		WebElement find_an_agent = driver.findElement(By.xpath(prop.getProperty("find_an_agent")));
		find_an_agent.click();
		scroll_view(driver);
		waitTime(2000);
		System.out.println("Ten_Click on Find an Agent");
	}

	public void ten_click_on_share_requirement() {
		WebElement share_requirement = driver.findElement(By.xpath(prop.getProperty("share_requirement")));
		share_requirement.click();
		scroll_view(driver);
		waitTime(2000);
		System.out.println("Ten_Click on Share requirement");
	}


	public void ten_click_on_property_services() {
	    WebElement property_services = driver.findElement(By.xpath(prop.getProperty("property_services")));
	    property_services.click();
		scroll_view(driver);
		waitTime(2000);
		System.out.println("Ten_Click on Property Services");
	}


	public void ten_click_on_rent_agreement() {
		WebElement rent_agreement = driver.findElement(By.xpath(prop.getProperty("rent_agreement")));
		rent_agreement.click();
		scroll_view(driver);
		waitTime(2000);
		System.out.println("Ten_Click on Rent Agreement");
	}

	
	public void ten_click_on_pay_rent() {
		WebElement pay_rent = driver.findElement(By.xpath(prop.getProperty("pay_rent")));
		pay_rent.click();
		scroll_view(driver);
		waitTime(2000);
		System.out.println("Ten_Click on Pay Rent");
	}


	
	

}
