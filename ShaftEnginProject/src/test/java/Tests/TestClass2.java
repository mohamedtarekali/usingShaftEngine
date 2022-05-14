package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.element.ElementActions;
import com.shaft.tools.io.ExcelFileManager;

import Pages.SelectLanguagePage;

public class TestClass2 {
	private WebDriver mobile;
	private ExcelFileManager excelReader;
	
	@Test
	public void userCanSuccessfullyAddLibrary() {
		new SelectLanguagePage(mobile).selectLanguage()
		.userLogin(excelReader.getCellData("userName") , excelReader.getCellData("password"))
		.navigateToMyClassroom()
		.openLibraryPage()
		.openAddEditLibraryPage()
		.userAddLibrary();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		mobile = DriverFactory.getDriver();
		//mobile = DriverFactory.getBrowserStackDriver();
	}

	@AfterMethod
	public void afterMethod() {
		DriverFactory.closeAllDrivers();
	}
	
	@BeforeClass
	public void beforeClass() {
		excelReader = new ExcelFileManager(System.getProperty("testDataFolderPath") + "LoginData.xlsx");
	}
	
}
