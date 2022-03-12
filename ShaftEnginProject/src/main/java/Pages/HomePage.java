package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver mobile;
	private By welcomeMessageInHome = By.id("com.colnn.colnn.colnn:id/status");
		
		public HomePage(WebDriver mobile) {
			this.mobile=mobile;	
		}
		
		public By getWelcomeMessageLocator() {
			return welcomeMessageInHome;
		}

}
