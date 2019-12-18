package com.acc.selenium_demo_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class scenario_rediff {
	WebDriver driver;
	  @BeforeTest
	  public void open_browser(){
		System.out.println("Open browser");
		System.setProperty("webdriver.chrome.driver", "C:\\driver9999\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
	}
	  
	  @Test
	  public void rediff_reg(){
		  driver.findElement(By.linkText(" Create Account")).click();
		  driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("user12");
		  driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("user12@rediffmail.com");
		  driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
		  driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[9]/td[3]/input")).sendKeys("user_acc12");
		  driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[11]/td[3]/input")).sendKeys("user_acc12");
		  driver.findElement(By.xpath("//table[@id='iv_altemail']/table/tbody/tr[1]/td[3]/input")).sendKeys("user121@gmail.com");
		  driver.findElement(By.xpath("//table[@id='mobno']")).sendKeys("9810258760");
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	  }
	  
	  @AfterTest
	  public void close_browser(){
		  System.out.println("Close browser");
		  driver.close();
	  }

}
