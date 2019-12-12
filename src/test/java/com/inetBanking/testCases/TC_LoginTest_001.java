package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void LoginTest() throws IOException
	{
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(UserName);
		logger.info("Entered UserName");
		
		lp.setPassword(Password);
		logger.info("Entered Password");
		lp.clickLogin();
		
		//System.out.println(driver.getTitle());
		if(driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Test case passed");
		}
		else
		{
			captureScreenShot(driver, "LoginTest");
			Assert.assertTrue(false);
			logger.info("Test case failed");
		}
		
	}
}
