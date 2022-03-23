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

public class Page07_TS_07 {
	
	WebDriver driver;
	JavascriptExecutor js;
	Properties prop;
	FileInputStream fs;
	File fetch_file;
	FileInputStream excel_file;
	XSSFWorkbook work_file;
	XSSFSheet sheet;

	
	public Page07_TS_07(WebDriver driver)
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
	public void seven_property_file_is_loaded() throws IOException {
		prop = new Properties();
		fs = new FileInputStream("src\\test\\resources\\Properties\\Property_07_TS_07.properties");
		prop.load(fs);
		
		fetch_file = new File("src\\test\\resources\\Excel Files\\All_Excel_Files.xlsx");
		excel_file = new FileInputStream(fetch_file);
		work_file = new XSSFWorkbook(excel_file);
		sheet = work_file.getSheet("Location_Sheet");
		System.out.println("Seven_Property File is loaded");
	}
	
	public void seven_directed_to_the_site() {
		driver.get("https://www.magicbricks.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		waitTime(3000);
		System.out.println("Seven_Directed to site");
	}
	
	public void seven_clicked_on_plot() {
		WebElement plot = driver.findElement(By.xpath(prop.getProperty("plot")));
	    plot.click();
	    waitTime(2000);
		System.out.println("Seven_Clicked on Plot");
	}

	
	public void seven_enter_location() {
		WebElement location_opt = driver.findElement(By.xpath(prop.getProperty("location_opt")));
	    location_opt.click();    
	    waitTime(2000);
	    
		WebElement close_opt = driver.findElement(By.xpath(prop.getProperty("close_opt")));
	    close_opt.click();
	    waitTime(2000);
		
		WebElement input_location = driver.findElement(By.xpath(prop.getProperty("input_location")));
	    input_location.clear();
	    // Current location: Chennai
	    input_location.sendKeys(sheet.getRow(4).getCell(0).getStringCellValue());
	    waitTime(2000);
	    // Current location: Chennai_South
	    input_location.click();
	    WebElement select_location = driver.findElement(By.xpath(prop.getProperty("select_location")));
	    select_location.click();
	    waitTime(2000);
		System.out.println("Seven_Enter location");
	}

	
	public void seven_select_residential_type() {
		WebElement residential_type = driver.findElement(By.xpath(prop.getProperty("residential_type")));
		residential_type.click();
	    waitTime(2000);
	    
		WebElement residential_plot = driver.findElement(By.xpath("/html/body/section[1]/div/div[1]/div[3]/div[2]/div[2]/div/div/div/div[2]/div[1]/div[1]/label"));
		residential_plot.click(); 
		waitTime(2000);
		WebElement commercial_land = driver.findElement(By.xpath(prop.getProperty("commercial_land")));
		commercial_land.click();// Turn off this option
		waitTime(4000);
		
	    WebElement area = driver.findElement(By.xpath(prop.getProperty("area")));
	    area.click();  
		waitTime(2000);
		//Current Minimum Area = 25000
		 WebElement min_area = driver.findElement(By.xpath(prop.getProperty("min_area")));
		    min_area.click();
			waitTime(2000);
			//Current Maximum Area = 50000
			WebElement max_area = driver.findElement(By.xpath(prop.getProperty("max_area")));
		    max_area.click();
			waitTime(2000);	
		System.out.println("Seven_Select Residential Type");
	}

	
	public void seven_select_budget() {
		WebElement budget = driver.findElement(By.xpath(prop.getProperty("budget")));
		budget.click();
	    waitTime(2000);
	    //Current minimum price = 40L
	    WebElement min_price = driver.findElement(By.xpath(prop.getProperty("min_price")));
	    min_price.click();
		waitTime(2000);
		//Current maximum price = 70L
		WebElement max_price = driver.findElement(By.xpath(prop.getProperty("max_price")));
	    max_price.click();
		waitTime(2000);	

		System.out.println("Seven_Select Budget");
	}

	
	public void seven_click_on_search() {
		WebElement search_button = driver.findElement(By.xpath(prop.getProperty("search_button")));
	    search_button.click();
	    waitTime(2000);
		System.out.println("Seven_Click on Search");
	}


}
