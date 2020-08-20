package com.newtheme.actions;

import org.openqa.selenium.WebDriver;

import com.ui.LogInPageUI;

import CommonPage.commonFunction;

public class LogInPage extends commonFunction {

	public LogInPage(WebDriver driver) {
		super(driver);
	}

//	public PackageUI clickBTT_DangNhap() {
//		waitVisible(LogInPageUI.DANGNHAP_BTT);
//		click(LogInPageUI.DANGNHAP_BTT);
//
//		return PageFactory.initElements(driver, PackageUI.class);
//	}

	//
	public void inputTIMKIEMGAME_TXT(String value) throws InterruptedException {
		waitVisible(LogInPageUI.TIMKIEMGAME_TXT);
		Thread.sleep(2000);
		input(LogInPageUI.TIMKIEMGAME_TXT, value);
	}

	public void clickKETQUA_TIMKIEM() throws InterruptedException {
		waitVisible(LogInPageUI.TIMKIEM_RESULT);
		Thread.sleep(3000);
		click(LogInPageUI.TIMKIEM_RESULT);
	}

	public void clickDangNhap_BTT() throws InterruptedException {
		waitVisible(LogInPageUI.BTT_DANGNHAP);
		Thread.sleep(1500);
		click(LogInPageUI.BTT_DANGNHAP);
	}

	public String getText_ZingID_ERROR_UserName() {
		waitVisible(LogInPageUI.ERROR_MESSAGE_ZINGID_USERNAME);
		return getText(LogInPageUI.ERROR_MESSAGE_ZINGID_USERNAME);
	}

	public String getText_ZingID_ERROR_PassWord() {
		waitVisible(LogInPageUI.ERROR_MESSAGE_PASSWORD);
		return getText(LogInPageUI.ERROR_MESSAGE_PASSWORD);
	}

	public void input_Username_TXT(String value) {
		waitVisible(LogInPageUI.TXT_USERNAME);
		input(LogInPageUI.TXT_USERNAME, value);
	}

	public void input_Password_TXT(String value) {
		waitVisible(LogInPageUI.TXT_PASSWORD);
		input(LogInPageUI.TXT_PASSWORD, value);
	}

	// Clear by js
	public void clearByJs(String value) {
		executeScriptBrowser(value);
	}

	public String getText_Invalid_Account() {
		waitVisible(LogInPageUI.ERROR_MESSAGE);
		return getText(LogInPageUI.ERROR_MESSAGE);
	}

	//
//	public String getText_Title_Game() {
//		waitVisible(LogInPageUI.TITLEGAME_LBL);
//		return getText(LogInPageUI.TITLEGAME_LBL);
//	}
//
//	public void clickQuickLogin_Icon() {
//		waitVisible(LogInPageUI.EMAIL_ICON);
//		click(LogInPageUI.EMAIL_ICON);
//	}
//
//	public void clickDropDown_CumMayChu(WebElement ele) {
//		waitVisible(LogInPageUI.DROPDOWN_CUMMAYCHU);
//		ele.click();
//	}
//
//	public void selectDropdown_CumMayChu(WebElement ele, String locator) {
//		waitVisible(locator);
//		selectCombobox_Special(ele, locator);
//	}
//
//	//
//	public void clickDropDown_MayChu(WebElement ele) {
//		waitVisible(LogInPageUI.DROPDOWN_MAYCHU);
//		ele.click();
//	}
//
//	public void selectDropdown_MayChu(WebElement ele, String locator) {
//		waitVisible(locator);
//		selectCombobox_Special(ele, locator);
//	}
//
//	//
//	public void clickDropDown_NhanVat(WebElement ele) {
//		ele.click();
//	}
//
//	public void selectDropdown_NhanVat(WebElement ele, String locator) {
//		waitVisible(locator);
//		selectCombobox_Special(ele, locator);
//	}
//
//	public void clickBTT_Thoat() {
//		waitVisible(LogInPageUI.THOAT_BTT);
//		click(LogInPageUI.THOAT_BTT);
//	}
//
//	public void clickZingID_Icon() {
//		if (checkElementDisplay(LogInPageUI.ZING_ICON)) {
//			waitVisible(LogInPageUI.ZING_ICON);
//			click(LogInPageUI.ZING_ICON);
//		}
//	}
//
//	public void clickZalo_Icon() {
//		if (checkElementDisplay(LogInPageUI.ZALO_ICON)) {
//			waitVisible(LogInPageUI.ZALO_ICON);
//			click(LogInPageUI.ZALO_ICON);
//		}
//	}
//
//	public void clickFaceBook_Icon() {
//		if (checkElementDisplay(Log)) {
//			waitVisible(LogInPageUI.FACEBOOK_ICON);
//			click(LogInPageUI.FACEBOOK_ICON);
//		}
//	}
//
//	public void clickXacNhan_ID_NHANVAT() {
//		waitVisible(LogInPageUI.ID_NHANVAT_BTT);
//		click(LogInPageUI.ID_NHANVAT_BTT);
//	}
//
//	public void clickIDNHANVAT_FORM_BTT_XACNHAN() {
//		waitVisible(LogInPageUI.IDNHANVAT_FORM_BTT_XACNHAN);
//		click(LogInPageUI.IDNHANVAT_FORM_BTT_XACNHAN);
//	}
//
//	public String getText_IDNHANVAT_FORM_MESS() {
//		waitVisible(LogInPageUI.IDNHANVAT_FORM_MESS_ERROR);
//
//		return getText(LogInPageUI.IDNHANVAT_FORM_MESS_ERROR);
//	}
//
//	public void clickIDNHANVAT_FORM_DROPDOWN_MAYCHU() {
//		waitVisible(LogInPageUI.IDNHANVAT_FORM_DROPDOWN_MAYCHU);
//		click(LogInPageUI.IDNHANVAT_FORM_DROPDOWN_MAYCHU);
//	}
//
//	public void selectIDNHANVAT_FORM_DROPDOWN_OPTION_MAYCHU(String value) {
//		waitVisible(LogInPageUI.IDNHANVAT_FORM_DROPDOWN_OPTION_MAYCHU);
//		selectDropdown(LogInPageUI.IDNHANVAT_FORM_DROPDOWN_OPTION_MAYCHU, value);
//	}
//
//	public void inputIDNHANVAT_FORM_TXT_NHANVAT(String value) {
//		waitVisible(LogInPageUI.IDNHANVAT_FORM_TXT_NHANVAT);
//		input(LogInPageUI.IDNHANVAT_FORM_TXT_NHANVAT, value);
//	}
//
//	public void cleanIDNHANVAT_FORM_TXT_NHANVAT() {
//		waitVisible(LogInPageUI.IDNHANVAT_FORM_TXT_NHANVAT);
//		clear(LogInPageUI.IDNHANVAT_FORM_TXT_NHANVAT);
//	}
//
//	public void clickIDNHANVAT_FORM_ROLE_ID() {
//		waitVisible(LogInPageUI.IDNHANVAT_FORM_BTT_ROLE_ID);
//		click(LogInPageUI.IDNHANVAT_FORM_BTT_ROLE_ID);
//	}
//
//	public void clickIDNHANVAT_FORM_POPUP_BTT_XACNHAN() {
//		waitVisible(LogInPageUI.IDNHANVAT_FORM_POPUP_BTT_XACNHAN);
//		click(LogInPageUI.IDNHANVAT_FORM_POPUP_BTT_XACNHAN);
//	}
//
//	public void clickIDNHANVAT_FORM_POPUP_BTT_HUY() {
//		waitVisible(LogInPageUI.IDNHANVAT_FORM_POPUP_BTT_HUY);
//		click(LogInPageUI.IDNHANVAT_FORM_POPUP_BTT_HUY);
//	}

}
