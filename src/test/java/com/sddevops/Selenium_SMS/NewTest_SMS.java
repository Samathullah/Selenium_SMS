package com.sddevops.Selenium_SMS;

import org.openqa.selenium.By;
//import necessary Selenium WebDriver classes
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class NewTest_SMS {

	// declare Selenium WebDriver
	private WebDriver webDriver;

	@Test
	//public void f() {
	//}

	//public void checkName() {
		// Load website as a new page
		//webDriver.navigate().to("http://localhost:8090/SMS/smslogin.jsp");
		//WebElement we = webDriver.findElement(By.name("staff"));

		//System.out.println("staff we: " + we.getAttribute("role"));
		//Assert.assertEquals(we.getAttribute("role"), "contentinfo");
	//}
	
	public void checkTitle() {
		  //Load website as a new page
		  webDriver.navigate().to("http://localhost:8090/SMS/smslogin.jsp");
		  
		  //Assert the title to check that we are indeed in the correct website
		  Assert.assertEquals(webDriver.getTitle(), "Staff Management");
		  
		  System.out.println("title: "+webDriver.getTitle());
		  
		  //Retrieve link using it's class name and click on it
		  //webDriver.findElement(By.className("link")).click();

		  //Assert the new title to check that the title contain Wikipedia and the button had successfully bring us to the new page
		  //Assert.assertTrue(webDriver.getTitle().contains("Wikipedia"));
		  //System.out.println("new title: "+webDriver.getTitle());
	  }

	@BeforeTest
	public void beforeTest() {
		String chromeDriverDir = "C:\\Users\\sama9\\Desktop\\chromedriver-win64\\chromedriver.exe";

		  System.setProperty("webdriver.chrome.driver", chromeDriverDir);

		  //initialize FirefoxDriver at the start of test
		  webDriver = new ChromeDriver(); 
	}

	@AfterTest
	public void afterTest() {
		 //Quit the ChromeDriver and close all associated window at the end of test
		  //webDriver.close();
		  //test
	}

}
