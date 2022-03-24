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


public class Page04_TS_04 {
WebDriver driver;
JavascriptExecutor js;
Properties prop;
FileInputStream fs;
File fetch_file;
FileInputStream excel_file;
XSSFWorkbook work_file;
XSSFSheet sheet;

	public Page04_TS_04(WebDriver driver)
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
	public void four_property_file_is_loaded() throws IOException {
		prop = new Properties();
		fs = new FileInputStream("src\\test\\resources\\Properties\\Property_04_TS_04.properties");
		prop.load(fs);
		
		fetch_file = new File("src\\test\\resources\\Excel Files\\All_Excel_Files.xlsx");
		excel_file = new FileInputStream(fetch_file);
		work_file = new XSSFWorkbook(excel_file);
		sheet = work_file.getSheet("Location_Sheet");
		System.out.println("Four_Property File is loaded");
	}
	
	public void four_directed_to_the_site() {
		driver.get("https://www.magicbricks.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		waitTime(3000);
		System.out.println("Four_Directed to site");
	}

	public void four_clicked_on_buy() {
		WebElement buy_opt = driver.findElement(By.xpath(prop.getProperty("buy_opt")));
	    buy_opt.click();
	    waitTime(2000);
		System.out.println("Four_Clicked on Buy");
	}

	public void four_enter_location() {
		WebElement location_opt = driver.findElement(By.xpath(prop.getProperty("location_opt")));
		location_opt.click();    
	    waitTime(2000);
	    
		WebElement close_opt = driver.findElement(By.xpath(prop.getProperty("close_opt")));
	    close_opt.click();
	    waitTime(2000);
	    
		WebElement input_location = driver.findElement(By.xpath(prop.getProperty("input_location")));
	    input_location.clear();
	    input_location.sendKeys(sheet.getRow(1).getCell(0).getStringCellValue());
	    waitTime(2000);
	    
	    input_location.click();
	    //Khandagiri_Bhubaneswar
	    WebElement select_location = driver.findElement(By.xpath(prop.getProperty("select_location")));
	    select_location.click();
	    waitTime(2000);
		System.out.println("Four_Enter location");
	}


	public void four_select_plot() {
		WebElement property_type = driver.findElement(By.xpath(prop.getProperty("property_type")));
		property_type.click();
	    waitTime(2000);
	    
	    WebElement flat_opt = driver.findElement(By.xpath(prop.getProperty("flat_opt")));
		flat_opt.click();
		waitTime(2000);
	    
		WebElement house_opt = driver.findElement(By.xpath(prop.getProperty("house_opt")));
		house_opt.click();
		waitTime(2000);
		
	    WebElement plot_opt = driver.findElement(By.xpath(prop.getProperty("plot_opt")));
		plot_opt.click();
		waitTime(2000);
		
		WebElement min_max_range = driver.findElement(By.xpath(prop.getProperty("min_max_range")));
		min_max_range.click();
		waitTime(2000);
		//Current min size = 400
		WebElement min_size = driver.findElement(By.xpath(prop.getProperty("min_size")));
		min_size.click();
		waitTime(2000);
		//Current max size = 1000
		WebElement max_size = driver.findElement(By.xpath(prop.getProperty("max_size")));
		max_size.click();
		waitTime(2000);
		System.out.println("Four_Select Plot");
	}


	public void four_select_price() {
		WebElement price_type = driver.findElement(By.xpath(prop.getProperty("price_type")));
		price_type.click();
	    waitTime(2000);
	    //Min price = 20L
	    WebElement min_price = driver.findElement(By.xpath(prop.getProperty("min_price")));
	    min_price.click();
		waitTime(2000);
		//Max price = 60L
		WebElement max_price = driver.findElement(By.xpath(prop.getProperty("max_price")));
	    max_price.click();
		waitTime(2000);	
		System.out.println("Four_Select Price");
	}


	public void four_click_on_search() {
		WebElement search_button = driver.findElement(By.xpath(prop.getProperty("search_button")));
	    search_button.click();
	    waitTime(2000);
	    
	    for(int i = 1; i <= 16; i++)
	    {
	    	waitTime(1000);
	    	js.executeScript("window.scrollBy(0,200)");
		    
	    }
	    
	  		System.out.println("Four_Click on Search");
	}

}
