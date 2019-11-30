package com.qa.Appium;

import org.testng.annotations.Test;

public class AppiumTest 
{
	@Test(priority=1)
	public void nativeApplication()
	{
		System.out.println("The Native Application is Launched");
	}
	
	@Test(priority=2)
	public void hybridApplication()
	{
		System.out.println("The Hybrid Application is Launched");
	}
}
