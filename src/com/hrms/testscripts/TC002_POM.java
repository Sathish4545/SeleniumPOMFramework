package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.Login;
import com.hrms.pages.Logout;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC002_POM {
	@Test
	public static void tc002() throws Exception{
		BaseClass.openApplication();
		VerifyPage.verifyTitle("ORANGE HRM");
		Login.loginPage("nareshit", "nareshit");
		Logout.logoutPage();
		BaseClass.closeApplication();
	}
}
