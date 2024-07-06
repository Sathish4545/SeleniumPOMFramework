package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.AddEmp;
import com.hrms.pages.Login;
import com.hrms.pages.Logout;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC001_POM extends BaseClass{
//Test case steps
	
	@Test
	public static void tc001() throws Exception{
		BaseClass.openApplication();
		VerifyPage.verifyTitle("OrangeHRM - New Level of HR Management");
		Login.loginPage("nareshit", "nareshit");
		AddEmp.enterFrame(0);
//		AddEmp.addEmployee("Rohit", "Sharma", "C:\\Users\\Sathish\\Downloads\\100_Java_interview_Questions[1].pdf");
		AddEmp.exitFrame();
		Logout.logoutPage();
		BaseClass.closeApplication();
	}
}
