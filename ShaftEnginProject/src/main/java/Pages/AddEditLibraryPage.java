package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;
import com.shaft.gui.element.TouchActions;
import com.shaft.gui.element.TouchActions.SwipeDirection;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AddEditLibraryPage {
	private WebDriver mobile;
	private By educationalSystemDropDown = By.id("com.colnn.colnn.colnn:id/sp_school_edu_sys");
	private By selectedEducationalSystem = By.xpath("//android.widget.TextView[@text='Private Language']");
	private By libraryTitle = By.id("com.colnn.colnn.colnn:id/et_title");
	private By publishDateButton = By.id("com.colnn.colnn.colnn:id/tv_publish_date");
	private By todayDate = By.xpath("//android.view.View[@checked='true']");
	private By confirmDateButton = By.id("android:id/button1");
	private By uploadImageButton = By.id("com.colnn.colnn.colnn:id/choose_image_bt");
	private By allowImagePermissionButton = By.id("com.android.permissioncontroller:id/permission_allow_button");
	private By selectedImageFromGallery = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]//android.widget.FrameLayout[1]//android.widget.ImageView[1]");
	private By selectButton = By.xpath("//android.widget.TextView[lower-case(@text)='select']");
	//private By saveButton = By.xpath("//android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]//android.widget.Button[@text='Save']");

	public AddEditLibraryPage(WebDriver mobile) {
		this.mobile=mobile;
	}
	
	public LibraryPage userAddLibrary() {
		ElementActions.performTouchAction(mobile).tap(educationalSystemDropDown)
		.tap(selectedEducationalSystem)
		.performElementAction()
		.type(libraryTitle, "testLibrary")
		.performTouchAction()
		.tap(publishDateButton)
		.tap(todayDate)
		.tap(confirmDateButton)
		.tap(uploadImageButton)
		.tap(allowImagePermissionButton)
		.tap(uploadImageButton)
		.tap(selectedImageFromGallery)
		.tap(selectButton);
//		.swipeElementIntoView(By.xpath("//android.widget.ScrollView"), saveButton, TouchActions.SwipeDirection.DOWN)
//		.tap(saveButton);
		
		mobile.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+"Save"+"\").instance(0))")).click();
		
		return new LibraryPage(mobile);
	}
}
