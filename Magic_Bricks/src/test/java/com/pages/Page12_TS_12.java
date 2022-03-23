package com.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Page12_TS_12 {
	
	WebDriver driver;
	ArrayList<String> tabs;
	JavascriptExecutor js;
	Properties prop;
	FileInputStream fs;

		public Page12_TS_12(WebDriver driver)
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
		
		public void twelve_property_file_is_loaded() throws IOException {
			prop = new Properties();
			fs = new FileInputStream("src\\test\\resources\\Properties\\Property_12_TS_12.properties");
			prop.load(fs);
			System.out.println("One_Property File is loaded");
		}
	
	public void twelve_directed_to_the_site() {
		driver.get("https://www.magicbricks.com/");
		
		driver.manage().window().maximize();
		driver.navigate().refresh();
		waitTime(3000);
		System.out.println("Checked site");
	    System.out.println("Twelve_Directed to the site");
	}

	public void twelve_clicked_on_home_loans_dropdown() {
		
		WebElement home_loans_dropdown = driver.findElement(By.xpath(prop.getProperty("home_loans_dropdown")));
		home_loans_dropdown.click();
		waitTime(2000);
		System.out.println("Twelve_Clicked on Home Loans dropdown");
	}

	
	public void twelve_click_on_home_loans() {
		WebElement home_loans = driver.findElement(By.xpath(prop.getProperty("home_loans")));
		home_loans.click();
		scroll_view(driver);
		System.out.println("Twelve_Click on Home Loans");
	}

	
	public void twelve_click_on_balance_transfer() {
		WebElement balance_transfer= driver.findElement(By.xpath(prop.getProperty("balance_transfer")));
		balance_transfer.click();
		scroll_view(driver);
		System.out.println("Twelve_Click on Balance Transfer");
	}

	
	public void twelve_click_on_loan_against_property() {
		WebElement loan_against_property = driver.findElement(By.xpath(prop.getProperty("loan_against_property")));
		loan_against_property.click();
		scroll_view(driver);
		System.out.println("Twelve_Click on Loan Against Property");
	}

	public void twelve_click_on_preapproved_home_loan() {
		WebElement preapproved_home_loan = driver.findElement(By.xpath(prop.getProperty("preapproved_home_loan")));
		preapproved_home_loan.click();
		scroll_view(driver);
		System.out.println("Twelve_Click on Preapproved Home Loan");
	}

	
	public void twelve_click_on_sbi_home_loan() {
		WebElement sbi_home_loan = driver.findElement(By.xpath(prop.getProperty("sbi_home_loan")));
		sbi_home_loan.click();
		scroll_view(driver);
		System.out.println("Twelve_Click on SBI Home Loan");
	}

	public void twelve_click_on_hdfc_ltd_home_loan() {
		WebElement hdfc_ltd_home_loan = driver.findElement(By.xpath(prop.getProperty("hdfc_ltd_home_loan")));
		hdfc_ltd_home_loan.click();
		scroll_view(driver);
		System.out.println("Twelve_Click on HDFC Ltd Home Loan");
	}


	public void twelve_click_on_pnb_hfl_home_loan() {
		WebElement pnb_hfl_home_loan = driver.findElement(By.xpath(prop.getProperty("pnb_hfl_home_loan")));
		pnb_hfl_home_loan.click();
		scroll_view(driver);
		System.out.println("Twelve_Click on PNB HFL Home Loan");
	}

	
	public void twelve_click_on_icici_home_loan() {
		WebElement icici_home_loan = driver.findElement(By.xpath(prop.getProperty("icici_home_loan")));
		icici_home_loan.click();
		scroll_view(driver);
		System.out.println("Twelve_Click on ICICI Home Loan");
	}

	public void twelve_click_on_bajaj_housing() {
		WebElement bajaj_housing = driver.findElement(By.xpath(prop.getProperty("bajaj_housing")));
		bajaj_housing.click();
		scroll_view(driver);
		System.out.println("Twelve_Click on Bajaj Housing");
	}

	public void twelve_click_on_bank_of_badoda() {
		WebElement bank_of_baroda = driver.findElement(By.xpath(prop.getProperty("bank_of_baroda")));
		bank_of_baroda.click();
		scroll_view(driver);
		System.out.println("Twelve_Click on Bank of Badoda");
	}


	

	

}
