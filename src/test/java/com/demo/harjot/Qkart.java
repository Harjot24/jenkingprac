package com.demo.harjot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Qkart {
	private static WebDriver driver;
	@BeforeMethod
	public void launch() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harjot Singh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("https://crio-qkart-frontend-qa.vercel.app/");
	    driver.getCurrentUrl();	    
	}
	
	@Test
	public void test1() {
	WebElement search =	driver.findElement(By.xpath("//input[@placeholder=\"Search for items/categories\"]"));	
		search.click();
		search.isSelected();
		
	}
	
	
	@Test
	public void test2() {
		driver.findElement(By.xpath("//input[@placeholder=\"Search for items/categories\"]")).sendKeys("Router");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
        WebElement product = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-yg30e6\"]"));
       
        
		Assert.assertEquals(product.getText(), "Router");
	}
	
	@Test
	public void Test3() {
		
		
		
	}
	
	
}
