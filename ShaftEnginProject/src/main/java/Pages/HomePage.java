package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver mobile;
	private By welcomeMessageInHome = By.xpath("//android.widget.TextView[@text='Welcome']");
		
		public HomePage(WebDriver mobile) {
			this.mobile=mobile;	
		}
		
		public By getWelcomeMessageLocator() {
			return welcomeMessageInHome;
		}

}
