package com.acc.selenium_demo_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hdfc_netbanking {
	WebDriver driver;
	@BeforeTest
	public void open_browser(){
		System.out.println("Open browser");
		System.setProperty("webdriver.chrome.driver", "C:\\driver9999\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.93656605.1614000060.1576131731-668372484.1576131731");

	}
	@Test
	public void hdfc_login(){
		int nof= driver.findElements(By.tagName("frame")).size();
		System.out.println("total frames"+" " +nof);
		driver.switchTo().frame(0);
		driver.findElement(By.name("fldLoginUserId")).sendKeys("14787");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("footer");
		driver.findElement(By.linkText("Privacy Policy")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//img[@alt='continue']")).click();
		
		
	}
	@AfterTest
	public void close_browser(){
		System.out.println("Close browser");
		driver.close();
	}

}
