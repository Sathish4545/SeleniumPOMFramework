package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class Logout extends BaseClass{
	//Obj
	static By link_Logout = By.linkText("Logout");
	
	//Fun
	public static void logoutPage() {
		driver.findElement(link_Logout).click();
		Reporter.log("Logout completed");
	}
}
