package com.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.newtheme.actions.LogInPage;

import CommonPage.CommonTestcase;

public class LogInScript extends CommonTestcase {
	WebDriver driver;

	LogInPage loginPage;

	@Parameters({ "browser", "version", "url" })

	@BeforeClass

	public void beforeClass(String browser, String version, String url) {

//		inititalReport("NhutBM_Webpay_TestCase_Login.html");
		driver = openMultiBrowser(browser, version, url);

		loginPage = PageFactory.initElements(driver, LogInPage.class);

	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		loginPage.openUrl("https://pay.zing.vn/");
		
		System.out.println("Title: " + loginPage.getTitle());

		loginPage.inputTIMKIEMGAME_TXT("vo lam truyen ky mobile");

		loginPage.clickKETQUA_TIMKIEM();
	}

	@Test
	public void testcase_01_Dont_input_username_password() throws InterruptedException {

//		logTestCase("ZingID: Don't input username + password");

		loginPage.openUrl("https://pay.zing.vn/");

		loginPage.inputTIMKIEMGAME_TXT("vo lam truyen ky mobile");

		loginPage.clickKETQUA_TIMKIEM();

		System.out.println("Title: " + loginPage.getTitle());

	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		getResult(result);
	}

	@AfterClass
	public void afterClass() {

		exportReport();
//		driver.quit();
	}
}
