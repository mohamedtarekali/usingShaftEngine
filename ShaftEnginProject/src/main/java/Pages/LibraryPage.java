package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;

public class LibraryPage {
	private WebDriver mobile;
	private By addFilesButton = By.id("com.colnn.colnn.colnn:id/add_files_tv");

	public LibraryPage(WebDriver mobile) {
		this.mobile = mobile;
	}
	
	public AddEditLibraryPage openAddEditLibraryPage() {
		(new ElementActions(mobile)).click(addFilesButton);
		return new AddEditLibraryPage(mobile);
	}

}
