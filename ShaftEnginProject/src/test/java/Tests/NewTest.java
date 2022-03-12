package Tests;

import org.testng.annotations.Test;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserFactory;
import com.shaft.tools.io.ReportManager;
import com.shaft.validation.Validations;

import Pages.LoginPage;
import Pages.SelectLanguagePage;

import org.testng.annotations.BeforeMethod;

import java.util.logging.LogManager;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class NewTest {
	private WebDriver mobile;

	@Test
	public void userSuccessfullySelectLanguage() {
		new SelectLanguagePage(mobile).selectLanguage();
		Validations.assertThat().element(mobile, new LoginPage(mobile).getWelcomeMessageLocator()).exists().perform();
	}

	@BeforeMethod
	public void beforeMethod() {
		mobile = DriverFactory.getDriver();
	}

	@AfterMethod
	public void afterMethod() {
		DriverFactory.closeAllDrivers();
	}

	@BeforeClass
	public void beforeClass() {
	}

}
