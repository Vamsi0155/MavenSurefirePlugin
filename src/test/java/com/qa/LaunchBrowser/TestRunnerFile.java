package com.qa.LaunchBrowser;

import org.testng.TestNG;

public class TestRunnerFile 
{
	public static TestNG testng;
	
	public static void main(String args[])
	{
		testng = new TestNG();
		
		testng.setTestClasses(new Class[] {ChromeBrowserTest_1.class, ChromeBrowserTest_2.class});
		testng.run();
		
		//Below Code is For ExtentReportListener.
		//ExtentReportListener extentReportListener = new ExtentReportListener();
		//testng.addListener(extentReportListener);
	}
}
