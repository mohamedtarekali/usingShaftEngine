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
	public void userCanAddLibrary() {
		new SelectLanguagePage(mobile).selectLanguage().userLogin(excelReader.getCellData("userName") , excelReader.getCellData("password"));
		(new ElementActions(mobile)).click(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ImageView[1]"))
		.click(By.xpath("//android.widget.TextView[@text='Library']")).click(By.id("com.colnn.colnn.colnn:id/add_files_tv"))
		.click(By.id("com.colnn.colnn.colnn:id/choose_image_bt")).click(By.id("com.android.permissioncontroller:id/permission_allow_button"))
		.click(By.id("com.colnn.colnn.colnn:id/choose_image_bt"))
		.click(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]//android.widget.FrameLayout[1]//android.widget.ImageView[1]"))
		.click(By.xpath("//android.widget.TextView[lower-case(@text)='select']"))
		.click(By.id("com.colnn.colnn.colnn:id/tv_publish_date"))
		.click(By.xpath("//android.view.View[@checked='true']//following-sibling::android.view.View[1]"))
		.click(By.id("android:id/button1"));
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		//mobile = DriverFactory.getDriver();
		mobile = DriverFactory.getBrowserStackDriver();
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
