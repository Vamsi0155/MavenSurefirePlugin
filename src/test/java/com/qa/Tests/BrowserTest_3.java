package com.qa.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserTest_3 
{
public static WebDriver driver;
	
	@Test
	public void browserTest_3() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		String title = driver.getTitle();
		System.out.println("The BrowserTest_3 Title is ::: " +title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
		String title = driver.getTitle();
		System.out.println("The BrowserTest_3 Title is ::: " +title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
		driver.quit();
	}
}
