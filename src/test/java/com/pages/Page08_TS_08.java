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

public class Page08_TS_08 {
	
	WebDriver driver;
	JavascriptExecutor js;
	Properties prop;
	FileInputStream fs;
	File fetch_file;
	FileInputStream excel_file;
	XSSFWorkbook work_file;
	XSSFSheet sheet;
	
	public Page08_TS_08(WebDriver driver)
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
	public void eight_property_file_is_loaded() throws IOException {
		prop = new Properties();
		fs = new FileInputStream("src\\test\\resources\\Properties\\Property_08_TS_08.properties");
		prop.load(fs);
		
		fetch_file = new File("src\\test\\resources\\Excel Files\\All_Excel_Files.xlsx");
		excel_file = new FileInputStream(fetch_file);
		work_file = new XSSFWorkbook(excel_file);
		sheet = work_file.getSheet("Location_Sheet");
		System.out.println("Eight_Property File is loaded");
	}
	
	public void eight_directed_to_the_site() {
		driver.get("https://www.magicbricks.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		waitTime(3000);
		System.out.println("Eight_Directed to site");
	}

	public void eight_clicked_on_commercial() {
		WebElement commercial = driver.findElement(By.xpath(prop.getProperty("commercial")));
	    commercial.click();
	    waitTime(2000);
		
	System.out.println("Eight_Clicked on Commercial");    
	}

	
	public void eight_select_commerical_type() {
		WebElement com_type = driver.findElement(By.xpath(prop.getProperty("com_type")));
	    com_type.click();
	    waitTime(2000);
	    
	    WebElement select_buy_type = driver.findElement(By.xpath(prop.getProperty("select_buy_type")));
	    select_buy_type.click();
	    waitTime(2000);
	System.out.println("Eight_Select Commerical type");    
	}

	public void eight_enter_location() {
		WebElement location_opt = driver.findElement(By.xpath(prop.getProperty("location_opt")));
	    location_opt.click();    
	    waitTime(2000);
	    
		WebElement close_opt = driver.findElement(By.xpath(prop.getProperty("close_opt")));
	    close_opt.click();
	    waitTime(2000);
		
		WebElement input_location = driver.findElement(By.xpath(prop.getProperty("input_location")));
	    input_location.clear();
	    // Current location: Pune
	    input_location.sendKeys(sheet.getRow(5).getCell(0).getStringCellValue());
	    waitTime(2000);
	    //Current Selected location: Pune_East
	    input_location.click();
	    WebElement select_location = driver.findElement(By.xpath(prop.getProperty("select_location")));
	    select_location.click();
	    waitTime(2000);
	System.out.println("Eight_Enter location");    
	}

	
	public void eight_select_property_type() {
		WebElement property_type = driver.findElement(By.xpath(prop.getProperty("property_type")));
		property_type.click();
	    waitTime(2000);
	    
		WebElement commercial_land = driver.findElement(By.xpath(prop.getProperty("commercial_land")));
		commercial_land.click(); 
		waitTime(2000);
		
	    WebElement area = driver.findElement(By.xpath(prop.getProperty("area")));
	    area.click();  
		waitTime(2000);
		// Current minimum area: 10000
		 WebElement min_area = driver.findElement(By.xpath(prop.getProperty("min_area")));
		    min_area.click();
			waitTime(2000);
			// Current maximum area: 25000
			WebElement max_area = driver.findElement(By.xpath(prop.getProperty("max_area")));
		    max_area.click();
			waitTime(2000);	

		System.out.println("Eight_Select Property Type");
	}

	
	public void eight_select_budget() {
		WebElement budget = driver.findElement(By.xpath(prop.getProperty("budget")));
		budget.click();
	    waitTime(2000);
	    // Current Minimum price: 20L
	    WebElement min_price = driver.findElement(By.xpath(prop.getProperty("min_price")));
	    min_price.click();
		waitTime(2000);
		// Current Maximum price: 50L
		WebElement max_price = driver.findElement(By.xpath(prop.getProperty("max_price")));
	    max_price.click();
		waitTime(2000);	
	    System.out.println("Eight_Select Budget");
	}

	
	public void eight_click_on_search() {
		WebElement search_button = driver.findElement(By.xpath(prop.getProperty("search_button")));
	    search_button.click();
	    waitTime(2000);
	    for(int i = 1; i <= 4; i++)
	    {
	    	waitTime(1000);
	    	js.executeScript("window.scrollBy(0,200)");
		    
	    }
	    waitTime(2000);
	    System.out.println("Eight_Click on Search");
	}


}
