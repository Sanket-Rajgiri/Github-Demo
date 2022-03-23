package com.pages;

import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;

public class Page02_TS_02 {
	
WebDriver driver;
ArrayList<String> tabs;
Properties prop;
FileInputStream fs;
File fetch_file;
FileInputStream excel_file;
XSSFWorkbook work_file;
XSSFSheet sheet;



	public Page02_TS_02(WebDriver driver)
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
	
	public void two_property_file_is_loaded() throws IOException {
		prop = new Properties();
		fs = new FileInputStream("src\\test\\resources\\Properties\\Property_02_TS_02.properties");
		prop.load(fs);

		fetch_file = new File("src\\test\\resources\\Excel Files\\All_Excel_Files.xlsx");
		excel_file = new FileInputStream(fetch_file);
		work_file = new XSSFWorkbook(excel_file);
		sheet = work_file.getSheet("Login_Sheet");
		System.out.println("Two_Property File is loaded");
	}
	public void two_directed_to_the_site_to_login() throws IOException {
		driver.get("https://www.magicbricks.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		waitTime(3000);
	    System.out.println("Directed to site");
	}

	public void two_clicked_on_login() {
		WebElement login = driver.findElement(By.xpath(prop.getProperty("login")));		
		login.click();
		waitTime(2000);
		WebElement login_button = driver.findElement(By.xpath(prop.getProperty("login_button")));
		login_button.click();
		
		tabs = new ArrayList<String>(driver.getWindowHandles());
		waitTime(2000);
		System.out.println("CLick Login");
	}
	
	public void two_enter_phone_number_and_clicked_next() {
		driver.switchTo().window(tabs.get(1));
		WebElement input_phone_no = driver.findElement(By.xpath(prop.getProperty("input_phone_no")));
		input_phone_no.clear();
		
		input_phone_no.sendKeys(Math.round(sheet.getRow(1).getCell(0).getNumericCellValue()) + "");
		WebElement next_button = driver.findElement(By.xpath(prop.getProperty("next_button")));
		next_button.click();
		waitTime(3000);
		
		System.out.println("Enter Phone Number and clicked Next");
	}

	
	public void two_enter_otp_and_clicked_continue() {
		WebElement continue_button = driver.findElement(By.xpath(prop.getProperty("continue_button")));
		//waitTime(2000);
		//continue_button.click();
		
		System.out.println("Enter otp");
	    System.out.println("Enter OTP and Clicked Continue");
	}

	
	public void two_landed_on_logined_site() {
		driver.navigate().refresh();
	    System.out.println("Landed on logined site");
	}

	
	public void two_returns_to_final_page() {
		driver.switchTo().window(tabs.get(0));
		driver.navigate().refresh();
		waitTime(3000);
		System.out.println("Returns to Final Page");
	}
	
	
	
	public void two_enter_email_id_and_clicked_next() {
		driver.switchTo().window(tabs.get(1));
		WebElement input_email_id = driver.findElement(By.xpath(prop.getProperty("input_email_id")));
		input_email_id.clear();
		input_email_id.sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
		waitTime(2000);
		WebElement next_button = driver.findElement(By.xpath("//button[@id='btnStep1']"));
		next_button.click();
		WebElement input_password = driver.findElement(By.xpath(prop.getProperty("input_password")));
		input_password.clear();
		input_password.sendKeys(sheet.getRow(1).getCell(2).getStringCellValue());
		WebElement login_after_password = driver.findElement(By.xpath(prop.getProperty("login_after_password")));
		login_after_password.click();
		
		waitTime(2000);
		
	    System.out.println("Enter email id and clicked Next");
	}
	
	
	public void two_enter_password_and_clicked_continue() {
	    System.out.println("Enter Password and Clicked Continue");
	}

	
	public void two_enter_invalid_phone_number_and_clicked_next() {
		driver.switchTo().window(tabs.get(1));
		WebElement input_phone_no = driver.findElement(By.xpath(prop.getProperty("input_phone_no")));
		input_phone_no.clear();
		input_phone_no.sendKeys(Math.round(sheet.getRow(1).getCell(3).getNumericCellValue()) + "");
		waitTime(2000);
		WebElement next_button = driver.findElement(By.xpath(prop.getProperty("next_button")));
		next_button.click();
		waitTime(3000);
		System.out.println("Enter invalid Phone Number and clicked Next");
	}

	
	public void two_enter_invalid_email_id_and_clicked_next() {
		driver.switchTo().window(tabs.get(1));
		WebElement input_email_id = driver.findElement(By.xpath(prop.getProperty("input_email_id")));
		input_email_id.clear();
		input_email_id.sendKeys(sheet.getRow(1).getCell(4).getStringCellValue());
		waitTime(2000);
		
		WebElement next_button = driver.findElement(By.xpath(prop.getProperty("next_button")));
		next_button.click();
		waitTime(3000);
	    System.out.println("Enter invalid email id and clicked Next");
	}

	
	public void two_enter_nothing_and_clicked_next() {
		driver.switchTo().window(tabs.get(1));
		WebElement next_button = driver.findElement(By.xpath(prop.getProperty("next_button")));
		next_button.click();
		waitTime(3000);
	    System.out.println("Enter nothing and clicked Next");
	}


}
