package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
private WebDriver mobile;
private By welcomeMessage = By.xpath("//android.widget.TextView[@text='Welcome Back']");
	
	public LoginPage(WebDriver mobile) {
		this.mobile=mobile;	
	}
	
	public By getWelcomeMessageLocator() {
		return welcomeMessage;
	}

}
