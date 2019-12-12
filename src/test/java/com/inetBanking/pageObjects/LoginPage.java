package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver ldriver ;
	
	public LoginPage(WebDriver rdriver) 
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	WebElement userName ;
	
	@FindBy(name="password")
	WebElement passWord ;
	
	@FindBy(name="btnLogin")
	WebElement login ;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/ul[1]/li[15]/a[1]")
	WebElement logout ;
	
	public void setUserName(String uName)
	{
		userName.sendKeys(uName);
	}
	public void setPassword(String password)
	{
		passWord.sendKeys(password);
	}
	public void clickLogin()
	{
		login.click();
	}
	public void clickLogout()
	{
		logout.click();
		System.out.println("clicked logout");
		
	}
}
