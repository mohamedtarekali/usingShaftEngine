package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;

public class HomePage {
	
	private WebDriver mobile;
	private By welcomeMessageInHome = By.xpath("//android.widget.TextView[@text='Welcome']");
	private By myClassroomTab = By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ImageView[1]");
		
		public HomePage(WebDriver mobile) {
			this.mobile=mobile;	
		}
		
		public By getWelcomeMessageLocator() {
			return welcomeMessageInHome;
		}
		
		public MyClassroomPage navigateToMyClassroom() {
			(new ElementActions(mobile)).click(myClassroomTab);
			return new MyClassroomPage(mobile);
		}

}
