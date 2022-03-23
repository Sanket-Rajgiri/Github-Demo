package com.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Page11_TS_11 {

	WebDriver driver;
	ArrayList<String> tabs;
	JavascriptExecutor js;
	Properties prop;
	FileInputStream fs;

		public Page11_TS_11(WebDriver driver)
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
			for(int i = 1; i <= 6; i++)
		    {
				waitTime(1000);
		    	js.executeScript("window.scrollBy(0,200)");
		    }
			driver.close();
			driver.switchTo().window(tabs.get(0));
			waitTime(3000);
		}

		public void eleven_property_file_is_loaded() throws IOException {
			prop = new Properties();

			fs = new FileInputStream("src\\test\\resources\\Properties\\Property_11_TS_11.properties");
			prop.load(fs);
			System.out.println("Eleven_Property File is loaded");
		}

		
		public void eleven_directed_to_the_site() {
			driver.get("https://www.magicbricks.com/");
			
			driver.manage().window().maximize();
			driver.navigate().refresh();
			waitTime(3000);
			System.out.println("Checked site");
		    System.out.println();
		}


		public void eleven_clicked_on_sell_dropdown() {
			WebElement sell_dropdown = driver.findElement(By.xpath(prop.getProperty("sell_dropdown")));
			sell_dropdown.click();
			waitTime(2000);
			System.out.println("Eleven_Clicked on sell dropdown");
		}

		
		public void eleven_click_on_post_property() {
			WebElement post_property = driver.findElement(By.xpath(prop.getProperty("post_property")));
			post_property.click();
			scroll_view(driver);
			System.out.println("Eleven_Click on Post Property");
		}
		
		
		public void eleven_click_on_my_dashboard() {
			WebElement my_dashboard = driver.findElement(By.xpath(prop.getProperty("my_dashboard")));
			my_dashboard.click();
			scroll_view(driver);
			System.out.println("Eleven_Click on My Dashboard");
		}


		public void eleven_click_on_sell_packages() {
			WebElement sell_packages = driver.findElement(By.xpath(prop.getProperty("sell_packages")));
			sell_packages.click();
			scroll_view(driver);
			System.out.println("Eleven_Click on Sell Packages");
		}
		
		
		public void eleven_click_on_property_valuation() {
			WebElement property_valuation = driver.findElement(By.xpath(prop.getProperty("property_valuation")));
			property_valuation.click();
			scroll_view(driver);
			waitTime(2000);
			System.out.println("Eleven_Click on Property Valuation");
		}

	
		public void eleven_click_on_find_an_agent() {
			WebElement find_an_agent = driver.findElement(By.xpath(prop.getProperty("find_an_agent")));
			find_an_agent.click();
			scroll_view(driver);
			System.out.println("Eleven_Click on Find an Agent");
		}

		
		public void eleven_click_on_rates_and_trends() {
			WebElement rates_and_trends = driver.findElement(By.xpath(prop.getProperty("rates_and_trends")));
			rates_and_trends.click();
			scroll_view(driver);
			waitTime(2000);
			System.out.println("Eleven_Click on Rates and Trends");
		}


}
