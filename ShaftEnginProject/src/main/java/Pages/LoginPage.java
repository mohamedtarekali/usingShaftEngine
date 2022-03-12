package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;

public class LoginPage {
	
private WebDriver mobile;
private By welcomeMessage = By.xpath("//android.widget.TextView[@text='Welcome Back']");
private By useName = By.id("com.colnn.colnn.colnn:id/userNameEt");
private By password = By.id("com.colnn.colnn.colnn:id/input_password");
private By loginButton = By.id("com.colnn.colnn.colnn:id/btn_login");
	
	public LoginPage(WebDriver mobile) {
		this.mobile=mobile;	
	}
	
	public HomePage userLogin(String _userName , String _password) {
		(new ElementActions(mobile)).type(useName, _userName).type(password, _password).click(loginButton);
		return new HomePage(mobile);
	}
	
	public By getWelcomeMessageLocator() {
		return welcomeMessage;
	}

}
