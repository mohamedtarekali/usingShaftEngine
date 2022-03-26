package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;

public class SelectLanguagePage {

	private WebDriver mobile;
	private By englishLanguage = By.xpath("//android.widget.TextView[@text='English']");
	private By confirmButton = By.id("com.colnn.colnn.colnn:id/btn_confirm");

	public SelectLanguagePage(WebDriver mobile) {
		this.mobile = mobile;
	}

	public LoginPage selectLanguage() {
		(new ElementActions(mobile)).click(englishLanguage).click(confirmButton);
		return new LoginPage(mobile);
	}

}
