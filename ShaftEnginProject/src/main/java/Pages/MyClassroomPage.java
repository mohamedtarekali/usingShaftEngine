package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;

public class MyClassroomPage {
	private WebDriver mobile;
	private By libraryItem = By.xpath("//android.widget.TextView[@text='Library']");

	public MyClassroomPage(WebDriver mobile) {
		this.mobile = mobile;
	}
	
	public LibraryPage openLibraryPage() {
		(new ElementActions(mobile)).click(libraryItem);
		return new LibraryPage(mobile);
	}
	
	

}
