package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.hrms.utility.*;


public class Login extends BaseClass{
	//Obj
		static By txt_loginname = By.name("txtUserName");
		static By txt_password = By.name("txtPassword");
		static By btn_login = By.name("Submit");
		
		//Fun
		public static void loginPage(String un, String pw) throws Exception{
			driver.findElement(txt_loginname).sendKeys(un);
			driver.findElement(txt_password).sendKeys(pw);
			driver.findElement(btn_login).click();
			Thread.sleep(2000);
			Reporter.log("Login completed");
			
			
		}
}
