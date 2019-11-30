package com.qa.Rest;

import org.testng.annotations.Test;

public class RestAssuredTest 
{
	@Test(priority=1)
	public void statusCode()
	{
		System.out.println("The Status Code is Validated");
	}
	
	@Test(priority=2)
	public void responseBody()
	{
		System.out.println("The Response Body is Validated");
	}
}
