package com.inetBanking.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;
import com.inetBanking.utilities.XLUtils;

public class TC_LoginTestDDT_002 extends BaseClass
{
	@Test(dataProvider = "LoginData")
	public void LoginTestDDT(String uname , String pwd) throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(uname);
		logger.info("Entered Username");
		
		lp.setPassword(pwd);
		logger.info("Entered Password");
		
		lp.clickLogin();
		//Thread.sleep(3000);
		if(isAlertPresent() == true)
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Login Failed");
		}
		else
		{
			Assert.assertTrue(true);
			Thread.sleep(3000);
			lp.clickLogout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			logger.warn("Login Passed");
			Thread.sleep(3000);
		}
	}
	
	public boolean isAlertPresent()
	{
		try
		{
			driver.switchTo().alert();
			logger.info("Alert true");
			return true;
		}
		catch(NoAlertPresentException e)
		{
			logger.info("Alert false");
			return false ;
		}
	}
	
	@DataProvider(name="LoginData")
	String[][] getData() throws IOException
	{
		String path = System.getProperty("user.dir")+"/src/test/java/com/inetBanking/testData/LoginData.xlsx";
		int rowcount = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][] = new String[rowcount][colcount];
		for(int i=1;i<=rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
	return logindata;	
		
	}
}
