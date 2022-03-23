package com.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Page03_TS_03 {
	WebDriver driver;
	Properties prop;
	FileInputStream fs;

	
	public Page03_TS_03(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public void waitTime(int n)
	{
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void three_property_file_is_loaded() throws IOException {
		prop = new Properties();
		fs = new FileInputStream("src\\test\\resources\\Properties\\Property_03_TS_03.properties");
		prop.load(fs);
		System.out.println("Three_Property File is loaded");
	}
	
	public void three_directed_to_the_site() {
		driver.get("https://www.magicbricks.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		waitTime(3000);
	    System.out.println("Directed to site");
	}
	
	public void three_clicked_on_buy() {
		WebElement buy = driver.findElement(By.xpath(prop.getProperty("buy")));
	    buy.click();
	    waitTime(2000);
	    driver.navigate().refresh();
	    waitTime(2000);   	    

	}
	
	public void three_clicked_on_rent() {
		WebElement rent = driver.findElement(By.xpath(prop.getProperty("rent")));
	    rent.click();
	    waitTime(2000);
	    driver.navigate().refresh();
	    waitTime(2000);   
	}

	
	public void three_clicked_on_sell() {
		WebElement sell = driver.findElement(By.xpath(prop.getProperty("sell")));
	    sell.click();
	    waitTime(2000);
	    driver.navigate().refresh();
	    waitTime(2000);
	}

	
	public void three_clicked_on_home_loans() {
		WebElement home_loans = driver.findElement(By.xpath(prop.getProperty("home_loans")));
		home_loans.click();
	    waitTime(2000);
	    driver.navigate().refresh();
	    waitTime(2000);
	}

	
	public void three_clicked_on_property_services() {
		WebElement property_services = driver.findElement(By.xpath(prop.getProperty("property_services")));
		property_services.click();
	    waitTime(2000);
	    driver.navigate().refresh();
	    waitTime(2000);
	}

	
	public void three_clicked_on_mb_advice() {
		WebElement mb_advice = driver.findElement(By.xpath(prop.getProperty("mb_advice")));
		mb_advice.click();
	    waitTime(2000);
	    driver.navigate().refresh();
	    waitTime(2000);
	}

	
	public void three_clicked_on_help() {
		WebElement help = driver.findElement(By.xpath(prop.getProperty("help")));
		help.click();
	    waitTime(2000);
	    driver.navigate().refresh();
	    waitTime(2000);
	}
}
