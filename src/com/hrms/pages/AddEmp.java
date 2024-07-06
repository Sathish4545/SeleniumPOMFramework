package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class AddEmp extends BaseClass{
	//Obj
	static By lName = By.name("txtEmpLastName");
	static By fName = By.name("txtEmpFirstName");
	static By photo = By.name("photofile");
	
	
	//Fun
	public static void enterFrame(int index) {
		driver.switchTo().frame(index);
		Reporter.log("Enter into frame");
	}
	
	public static void addEmployee(String lastName, String firstName, String doc) {
		driver.findElement(lName).sendKeys(lastName);
		driver.findElement(fName).sendKeys(firstName);
		WebElement element = driver.findElement(photo);
		element.sendKeys(doc);
		element.click();
		Reporter.log("Add new Employee");
	}
	
	public static void exitFrame() {
		driver.switchTo().defaultContent();
		Reporter.log("Exit from frame");
	}

	
}
