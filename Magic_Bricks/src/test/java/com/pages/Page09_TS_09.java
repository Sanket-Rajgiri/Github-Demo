package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Page09_TS_09 {

	WebDriver driver;
	JavascriptExecutor js;
	ArrayList<String> tabs;
	Properties prop;
	FileInputStream fs;
	
	public Page09_TS_09(WebDriver driver)
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
		for(int i = 1; i <= 16; i++)
	    {
			waitTime(1000);
	    	js.executeScript("window.scrollBy(0,200)");
	    }
		driver.close();
		driver.switchTo().window(tabs.get(0));
		waitTime(3000);
	}
	
	public void nine_property_file_is_loaded() throws IOException {
		prop = new Properties();
		fs = new FileInputStream("src\\test\\resources\\Properties\\Property_09_TS_09.properties");
		prop.load(fs);
		System.out.println("Nine_Property File is loaded");
	}
	
	public void nine_directed_to_the_site() {
		driver.get("https://www.magicbricks.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		waitTime(3000);
		System.out.println("Nine_Directed to site");
	}

	
	public void nine_clicked_on_buy_dropdown() {
		WebElement buy_dropdown = driver.findElement(By.xpath(prop.getProperty("buy_dropdown")));
		buy_dropdown.click();
		waitTime(2000);
		System.out.println("Nine_Clicked on Buy dropdown");    
	}

	public void nine_click_on_ready_to_move() {
		WebElement ready_to_move = driver.findElement(By.xpath(prop.getProperty("ready_to_move")));
		ready_to_move.click();
		scroll_view(driver);
		System.out.println("Nine_Click on Ready to Move");	    
	}

	public void nine_click_on_owner_properites() {
		WebElement owner_properties = driver.findElement(By.xpath(prop.getProperty("owner_properties")));
		owner_properties.click();
		scroll_view(driver);
	    System.out.println("Nine_Click on Owner Properites");
	}

	public void nine_click_on_budget_homes() {
		WebElement budget_homes = driver.findElement(By.xpath(prop.getProperty("budget_homes")));
		budget_homes.click();
		scroll_view(driver);
	    System.out.println("Nine_Click on Budget Homes");
	}

	public void nine_click_on_premium_homes() {
		WebElement premium_homes = driver.findElement(By.xpath(prop.getProperty("premium_homes")));
		premium_homes.click();
		scroll_view(driver);
	    System.out.println("Nine_Click on Premium Homes");
	}
	
	public void nine_click_on_flats_in_mumbai() {
		WebElement flats_in_mumbai = driver.findElement(By.xpath(prop.getProperty("flats_in_mumbai")));
		flats_in_mumbai.click();
		scroll_view(driver);
	    System.out.println("Nine_Click on Flats in Mumbai");
	}


	public void nine_click_on_house_for_sale_in_mumbai() {
		WebElement house_for_sale_in_mumbai = driver.findElement(By.xpath(prop.getProperty("house_for_sale_in_mumbai")));
		house_for_sale_in_mumbai.click();
		scroll_view(driver);
	    System.out.println("Nine_Click on House for sale in Mumbai");
	}

	
	public void nine_click_on_villa_in_mumbai() {
		WebElement villa_in_mumbai = driver.findElement(By.xpath(prop.getProperty("villa_in_mumbai")));
		villa_in_mumbai.click();
		scroll_view(driver);
	    System.out.println("Nine_Click on Villa in Mumbai");
	}

	
	public void nine_click_on_plot_in_mumbai() {
		WebElement plot_in_mumbai = driver.findElement(By.xpath(prop.getProperty("plot_in_mumbai")));
		plot_in_mumbai.click();
		scroll_view(driver);
	    System.out.println("Nine_Click on Plot in Mumbai");
	}

	
	public void nine_click_on_office_space_in_mumbai() {
		WebElement office_space_in_mumbai = driver.findElement(By.xpath(prop.getProperty("office_space_in_mumbai")));
		office_space_in_mumbai.click();
		scroll_view(driver);
	    System.out.println("Nine_Click on Office Space in Mumbai");
	}

	
	public void nine_click_on_commercial_shops_in_mumbai() {
		WebElement commercial_shops_in_mumbai = driver.findElement(By.xpath(prop.getProperty("commercial_shops_in_mumbai")));
		commercial_shops_in_mumbai.click();
		scroll_view(driver);
	    System.out.println("Nine_Click on Commercial Shops in Mumbai");
	}
	
	

}
