package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class VerifyPage extends BaseClass{
	public static void verifyTitle(String title) {
//		System.out.println(driver.getTitle());
		if(driver.getTitle().equals(title)){
			Reporter.log("Title is matching");
		}else {
			Reporter.log("Title is not matched");
		}
	}
}
