package com.ted;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class TedTest extends UiAutomatorTestCase {

	String videoSearchString ="Bill Clinton";

	
  	public void testSearchVideo() throws UiObjectNotFoundException
	{
		findAndRunApp();
		searchVideo(videoSearchString);
		getUiDevice().pressDPadDown();
	//	UiObject searchResult = new UiObject(new UiSelector().className("android.widget.CheckedTextView").resourceId("com.ted.android:id/title"));
		UiObject searchResult = new UiObject(new UiSelector().className("android.widget.CheckedTextView").textContains(videoSearchString)); 
		assertTrue(videoSearchString,searchResult.exists());
	
				
	}

	public void testAddToBookmarksVideo() throws UiObjectNotFoundException
	{
		findAndRunApp();
		searchVideo(videoSearchString);
		addBookmark(videoSearchString);
		UiObject searchResult = new UiObject(new UiSelector().textContains(videoSearchString));
		assertTrue(videoSearchString,searchResult.exists());
	
	}
  	
	private void findAndRunApp() throws UiObjectNotFoundException 
	{
		getUiDevice().pressHome();
		UiObject appsTab = new UiObject(new UiSelector().text("TED"));
		appsTab.click();
	}
	
	public void searchVideo (String videoSearchString) throws UiObjectNotFoundException
	{
		UiObject searchVideoButton = new UiObject(new UiSelector().className("android.widget.TextView").resourceId("com.ted.android:id/menu_search")); 
		searchVideoButton.clickAndWaitForNewWindow();
		UiObject textBox = new UiObject(new UiSelector().className("android.widget.EditText").resourceId("android:id/search_src_text"));
	    textBox.setText(videoSearchString);
	    UiDevice device = UiDevice.getInstance();
	    device.pressEnter();
	}

	public void addBookmark(String videoSearchString) throws UiObjectNotFoundException
	{
		UiObject checkedVideo = new UiObject(new UiSelector().className("android.widget.CheckedTextView").textContains(videoSearchString)); 
		checkedVideo.clickAndWaitForNewWindow();
		UiObject addBookmarkButton = new UiObject(new UiSelector().className("android.widget.ImageView").resourceId("com.ted.android:id/menu_bookmark")); 
		addBookmarkButton.clickAndWaitForNewWindow();
		getUiDevice().pressBack();
		getUiDevice().pressBack();
		UiObject myTalksButton = new UiObject(new UiSelector().className("android.widget.CheckedTextView").text("My Talks")); 
		myTalksButton.clickAndWaitForNewWindow();
		UiObject bookmarksButton = new UiObject(new UiSelector().className("android.widget.CheckedTextView").text("Bookmarks")); 
		bookmarksButton.clickAndWaitForNewWindow();
	}
}
