package com.acc.selenium_demo_practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class selenium_demo_day2 {
	@BeforeTest
	public void launch_browser(){
		System.out.println("launch browser");
		
	}
	
	@AfterTest
	public void close_browser(){
		System.out.println("close browser");
		
	}
	
	@BeforeMethod
	public void beforemethod(){
		System.out.println("@BeforeMethod");
		
	}
	
	@AfterMethod
	public void aftermethod(){
		System.out.println("@AfterMethod");
		
	}
	@Test(priority=3,enabled=true)
	public void facebook(){
		System.out.println("I am using facebook");
	}
	
	@Test(priority=1,enabled=true)
	public void gOogle(){
		System.out.println("I am using google");
	}
	
	@Test(priority=2)
	public void gmail(){
		System.out.println("I am using gmail");
		
	}
	
}
