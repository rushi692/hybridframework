package com.mindtree.TestCases;

import org.testng.annotations.Test;

import com.mindtree.PageObject.LoginPage;

public class TC_LoginPage extends BaseClass
{
	@Test
	public void loginpage()
	{
		LoginPage lp=new LoginPage(driver);
		log.info("Home page open successfully");
		
		lp.loginHover();
		log.info("Login window hover successfully");
		
		lp.loginClk();
		log.info("click on login btn successfully");
		
	}
	

}
