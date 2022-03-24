package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;

public class Page06_TS_06 {
	WebDriver driver;
	JavascriptExecutor js;
	Properties prop;
	FileInputStream fs;
	File fetch_file;
	FileInputStream excel_file;
	XSSFWorkbook work_file;
	XSSFSheet sheet;
	
	public Page06_TS_06(WebDriver driver)
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
	
	public void six_property_file_is_loaded() throws IOException {
		prop = new Properties();
		fs = new FileInputStream("src\\test\\resources\\Properties\\Property_06_TS_06.properties");
		prop.load(fs);
		
		fetch_file = new File("src\\test\\resources\\Excel Files\\All_Excel_Files.xlsx");
		excel_file = new FileInputStream(fetch_file);
		work_file = new XSSFWorkbook(excel_file);
		sheet = work_file.getSheet("Location_Sheet");
		System.out.println("Six_Property File is loaded");
	}
	
	public void six_directed_to_the_site() {
		driver.get("https://www.magicbricks.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		waitTime(3000);
		System.out.println("Six_Directed to site");
	}


	public void six_clicked_on_pg() {
		WebElement pg_opt = driver.findElement(By.xpath(prop.getProperty("pg_opt")));
	    pg_opt.click();
	    waitTime(2000);
	    System.out.println("Six_Clicked on PG");
	}


	public void six_enter_location() {
		WebElement location_opt = driver.findElement(By.xpath(prop.getProperty("location_opt")));
	    location_opt.click();    
	    waitTime(2000);
	    
		WebElement close_opt = driver.findElement(By.xpath(prop.getProperty("close_opt")));
	    close_opt.click();
	    waitTime(2000);
		
		WebElement input_location = driver.findElement(By.xpath(prop.getProperty("input_location")));
	    input_location.clear();
	    // Current location = Whitefield Bangalore
	    input_location.sendKeys(sheet.getRow(3).getCell(0).getStringCellValue());
	    waitTime(2000);
	    
	    input_location.click();
	 // Current location from drop down = Whitefield Bangalore
	    WebElement select_location = driver.findElement(By.xpath(prop.getProperty("select_location")));
	    select_location.click();
	    waitTime(2000);
	    System.out.println("Six_Enter location");
	}


	public void six_select_occpancy_type() {
		WebElement property_type = driver.findElement(By.xpath(prop.getProperty("property_type")));
		property_type.click();
	    waitTime(2000);
	    // Current Gender option = boys
		WebElement gender_type = driver.findElement(By.xpath(prop.getProperty("gender_type")));
		gender_type.click(); // Turn on this option
		waitTime(2000);
		
	    WebElement pg = driver.findElement(By.xpath(prop.getProperty("pg")));
	    pg.click();  // Turn on this option
		waitTime(2000);
	    System.out.println("Six_Select Occpancy Type");
	}


	public void six_select_budget() {
		WebElement budget = driver.findElement(By.xpath(prop.getProperty("budget")));
		budget.click();
	    waitTime(2000);
	    // Current minimum price = 8000
	    WebElement min_price = driver.findElement(By.xpath(prop.getProperty("min_price")));
	    min_price.click();
		waitTime(2000);
		//Current maximum price = 12000
		WebElement max_price = driver.findElement(By.xpath(prop.getProperty("max_price")));
	    max_price.click();
		waitTime(2000);	
	    System.out.println("Six_Select Budget");
	}

	public void six_click_on_search() {
		WebElement search_button = driver.findElement(By.xpath(prop.getProperty("search_button")));
	    search_button.click();
	    waitTime(2000);
	    
	    for(int i = 1; i <= 16; i++)
	    {
	    	waitTime(1000);
	    	js.executeScript("window.scrollBy(0,200)");
		    
	    }
	    
	    System.out.println("Six_Click on Search");
	}
	    
}
