package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddNewCustomerPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_AddNewCustomer_003 extends BaseClass
{
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(UserName);
		logger.info("Entered UserName");
		lp.setPassword(Password);
		logger.info("Entered Password");
		lp.clickLogin();
		
		//Thread.sleep(3000);
		
		logger.info("Providing Customer Details ...");
		AddNewCustomerPage addCust = new AddNewCustomerPage(driver);
		addCust.clickAddNewCustomer();
		addCust.custName("nikita");
		addCust.custGender("female");
		addCust.custdob("11", "30", "1990");
		Thread.sleep(3000);
		addCust.custAddress("abcd");
		addCust.custCity("Luxembourg");
		addCust.custState("Lux");
		addCust.custPin("42432233");
		addCust.custTelephone("661342699");
		addCust.custEmailid(randomString()+"@gmail.com");
		addCust.custPwd("xyzasdfggh");
		addCust.custSubmit();
		Thread.sleep(3000);
		
		logger.info("Vaildation Started");
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test case passed");
		}
		else
		{
			captureScreenShot(driver, "addNewCustomer");
			Assert.assertTrue(false);
			logger.info("Test case failed");
		}		
	}
	
}
