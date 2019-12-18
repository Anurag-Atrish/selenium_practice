package com.acc.selenium_demo_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testmeapp {
	WebDriver driver;
	@BeforeTest
	public void open_browser(){
		System.out.println("Open browser");
		System.setProperty("webdriver.chrome.driver", "C:\\driver9999\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}
	@Test
	public void testme_signup(){
		driver.findElement(By.linkText("SignUp")).click();
		driver.findElement(By.name("userName")).sendKeys("user12");
		driver.findElement(By.name("firstName")).sendKeys("anurag");
		driver.findElement(By.name("lastName")).sendKeys("atrish");
		driver.findElement(By.name("password")).sendKeys("useracc13");
		driver.findElement(By.name("confirmPassword")).sendKeys("useracc13");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("anuragatrish@gmail.com");
		driver.findElement(By.name("mobileNumber")).sendKeys("9650793083");
		driver.findElement(By.name("dob")).sendKeys("14/04/1997");
		driver.findElement(By.name("address")).sendKeys("A1B-67 janak puri");
		WebElement sq=driver.findElement(By.name("securityQuestion"));
	      Select s1=new Select(sq);
	      s1.selectByVisibleText("What is your Pet Name?");
	      driver.findElement(By.name("answer")).sendKeys("i hate pets");
	      driver.findElement(By.name("Submit")).click();
		
		
		
		
		
		
	}
	@AfterTest
	public void close_browser(){
		System.out.println("Close browser");
		//driver.close();
	}
}
