package com.qa.Web;

import org.testng.annotations.Test;

public class Web 
{
	@Test(priority=1)
	public void browserOpened()
	{
		System.out.println("The Browser is Opened");
	}
	
	@Test(priority=2)
	public void applicationLaunched()
	{
		System.out.println("The Application is Launched");
	}
}
