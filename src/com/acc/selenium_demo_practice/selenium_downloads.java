package com.acc.selenium_demo_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class selenium_downloads {


  WebDriver driver;
  @BeforeTest
  public void open_browser(){
	System.out.println("Open browser");
	System.setProperty("webdriver.chrome.driver", "C:\\driver9999\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("https://selenium.dev/selenium/docs/api/java/index.html");
}
  @Test
  public void sel_down(){
	  int nof= driver.findElements(By.tagName("frame")).size();
		System.out.println("total frames"+" " +nof);
		driver.switchTo().frame("classFrame");
	  driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
	  driver.switchTo().defaultContent();
	  driver.switchTo().frame("packageListFrame");
	  driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
	  driver.switchTo().defaultContent();
	  driver.switchTo().frame("packageFrame");
	  driver.findElement(By.linkText("CommandProcessor")).click();
	  
	  
  }
  @AfterTest
  public void close_browser(){
	  System.out.println("Close browser");
	  driver.close();
  }
}

