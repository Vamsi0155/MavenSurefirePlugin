package com.qa.TestUtilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestUtility 
{
	public static String getSystemDate() 
	{
		DateFormat dateFormat = new SimpleDateFormat("_ddMMyyyy_HHmmss");
		Date date = new Date();
		return dateFormat.format(date);
	}
}
