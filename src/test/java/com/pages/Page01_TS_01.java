package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;

public class Page01_TS_01 {
	
WebDriver driver;
ArrayList<String> tabs;
JavascriptExecutor js;
Properties prop;
FileInputStream fs;
File fetch_file;
FileInputStream excel_file;
XSSFWorkbook work_file;
XSSFSheet url_sheet;

	public Page01_TS_01(WebDriver driver)
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


	
	
	public void one_property_file_is_loaded() throws IOException {
		prop = new Properties();
		fs = new FileInputStream("src\\test\\resources\\Properties\\Property_01_TS_01.properties");
		prop.load(fs);
		System.out.println("One_Property File is loaded");
	}
	
	public void one_directed_to_the_site() throws IOException {
		driver.get("https://www.magicbricks.com/");		
		driver.manage().window().maximize();
		//driver.navigate().refresh();
		waitTime(3000);
		System.out.println("Checked site");
	}


	public void one_click_on_magic_bricks_logo() {
		driver.navigate().refresh();
		WebElement logo = driver.findElement(By.xpath(prop.getProperty("logo")));
		logo.click();
		waitTime(3000);
		driver.navigate().refresh();
	}


	public void one_click_on_location() {
		driver.navigate().refresh();
		WebElement location = driver.findElement(By.xpath(prop.getProperty("location")));
		location.click();
		waitTime(3000);
		driver.navigate().refresh();
		System.out.println("Checked location");
	}

	public void one_click_on_mb_prime() {
		driver.navigate().refresh();
		WebElement prime = driver.findElement(By.xpath(prop.getProperty("prime")));
		prime.click();
		waitTime(3000);
		driver.navigate().refresh();
		System.out.println("Checked prime");
	}

	public void one_click_on_login() {
		driver.navigate().refresh();
		WebElement login = driver.findElement(By.xpath(prop.getProperty("login")));
		login.click();
		waitTime(3000);
		driver.navigate().refresh();
		System.out.println("Checked login");
	}
	public void one_click_on_post_property() {
		driver.navigate().refresh();
		WebElement post_property = driver.findElement(By.xpath(prop.getProperty("post_property")));
		post_property.click();
		tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		waitTime(3000);
		driver.close();
		driver.switchTo().window(tabs.get(0));
		driver.navigate().refresh();
		waitTime(3000);
		System.out.println("One_Click on Post Property");
	}


}
