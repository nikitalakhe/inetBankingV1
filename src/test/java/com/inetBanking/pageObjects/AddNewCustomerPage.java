package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage 
{
	WebDriver ldriver ;
	
	public AddNewCustomerPage(WebDriver rdriver) 
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH , using="/html/body/div[3]/div/ul/li[2]/a")
	WebElement addNewCustomer; 
	
	@FindBy(how = How.NAME , using="name")
	WebElement customerName ;
	
	@FindBy(how = How.NAME , using="rad1")
	WebElement genderName ;
	
	@FindBy(how = How.NAME , using="dob")
	WebElement dateOfBirth ;
	
	@FindBy(how = How.NAME , using="addr")
	WebElement Address ;
	
	@FindBy(how = How.NAME , using="city")
	WebElement City ;
	
	@FindBy(how = How.NAME , using="state")
	WebElement State ;
	
	@FindBy(how = How.NAME , using="pinno")
	WebElement pin ;
	
	@FindBy(how = How.NAME , using="telephoneno")
	WebElement telephone ;
	
	@FindBy(how = How.NAME , using="emailid")
	WebElement emailId ;
	
	@FindBy(how = How.NAME , using="password")
	WebElement pwd ;
	
	@FindBy(how = How.NAME , using="sub")
	WebElement submit ;
	
	public void clickAddNewCustomer()
	{
		addNewCustomer.click();
	}
	public void custName(String cname)
	{
		customerName.sendKeys(cname);
	}
	public void custGender(String cgender)
	{
		customerName.click();
	}
	public void custdob(String mm,String dd,String yy)
	{
		dateOfBirth.sendKeys(mm);
		dateOfBirth.sendKeys(dd);
		dateOfBirth.sendKeys(yy);
	}
	public void custAddress(String caddr)
	{
		Address.sendKeys(caddr);
	}
	public void custCity(String ccity)
	{
		City.sendKeys(ccity);
	}
	public void custState(String cstate)
	{
		State.sendKeys(cstate);
	}
	public void custPin(String cpin)
	{
		pin.sendKeys(String.valueOf(cpin));
	}
	public void custTelephone(String ctelephone)
	{
		telephone.sendKeys(ctelephone);
	}
	public void custEmailid(String cemailid)
	{
		emailId.sendKeys(cemailid);
	}
	public void custPwd(String cpwd)
	{
		pwd.sendKeys(cpwd);
	}
	public void custSubmit()
	{
		submit.click();;
	}
	
	
}	
