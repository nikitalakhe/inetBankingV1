package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig 
{
	Properties pro ;
	
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");
		FileInputStream fis;
		try 
		{
			fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} 
		catch (Exception e) 
		{
			System.out.println("Exception is " +e.getMessage());
		}
	}
	public String getApplicationURL()
	{
		String url = pro.getProperty("URL");
		return url;
	}
	public String getUserName()
	{
		String username = pro.getProperty("UserName");
		return username;
	}
	public String getPassword()
	{
		String password = pro.getProperty("Password");
		return password;
	}
	
}
