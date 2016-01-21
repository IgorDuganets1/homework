package kdk.android.simplydo.test;

import com.robotium.solo.Solo;
import android.graphics.Paint;
import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import kdk.android.simplydo.SimplyDoActivity;
import kdk.android.simplydo.R;

public class RobotiumTests extends ActivityInstrumentationTestCase2<SimplyDoActivity> {

	private Solo solo;
	
	public static final String listName="testList";
	public static final String itemName="testItem";
	
	public RobotiumTests() {
		super(SimplyDoActivity.class);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
	}


	public void testAddList()
	{
		addList(listName);
		assertTrue(solo.searchText(listName));
	} 
	

	public void testDeleteList()
	{
		addList(listName+"ForDelete");
		deleteList(listName+"ForDelete");
		assertFalse(solo.searchText(listName+"ForDelete"));
	
	} 

	
	public void testEditList()
	{
		addList(listName);
		editList(listName);
		assertTrue(solo.searchText(listName + "Edited"));
	} 
	

	public void testAddItem()
	{
		addItem(itemName);
		assertTrue(solo.searchText(itemName));
	}
	

	public void testRemoveItem()
	{
		addItem(itemName);
		removeItem(itemName);
		assertFalse(solo.searchText(itemName));
	} 
	

	public void testSelectDeselectItem()
	{
		setStrikeText();
		selecItem();
		assertTrue(strikeTextFlag());
		solo.clickOnText(itemName);
		assertFalse(strikeTextFlag());
		
	} 
	

	public void testAddRemoveStar()
	{
		addStar(itemName);
		assertEquals(true, solo.getCurrentActivity().findViewById(R.id.StarImage).isShown());
		removeStar(itemName);
		assertEquals(false, solo.getCurrentActivity().findViewById(R.id.StarImage).isShown());
		
	} 

	public void testRemoveInactiveItems()
	{	
		isConfirmDeleteAllInactive(false);
		removeInactiveItems();
		assertFalse(solo.searchText(itemName));
	} 
	
	
	public void testSortingOfItemsStarredFirst()
	{
		addItem("aaa");
		createItem("bbb");
		addStarItem("aaa");
		setItemSorting("Starred First");
		solo.clickLongInList(0);
	    assertTrue(solo.waitForText("Remove Star"));
	    solo.goBack();
	    solo.clickLongInList(2);
	    assertTrue(solo.waitForText("Add Star"));
	} 

	public void testSortingOfItemsStarredFirstSortNowButton()
	{
		setItemSorting("Starred First");
		addItem("aaa");
		createItem("bbb");
		addStarItem("aaa");
		solo.sendKey(Solo.MENU);
	   	solo.clickOnText("Sort Now");
		solo.clickLongInList(0);
	    assertTrue(solo.waitForText("Remove Star"));
	    solo.goBack();
	    solo.clickLongInList(2);
	    assertTrue(solo.waitForText("Add Star"));
	}
	
	public void testSortingOfItemsActiveFirstSortNowButton()
	{
		setItemSorting("Active First");
		addItem("aaa");
		createItem("bbb");
		solo.clickOnText("aaa");
		solo.sendKey(Solo.MENU);
	   	solo.clickOnText("Sort Now");
		assertFalse(strikeTextFlag());
	}


	public void testSortingOfItemsActiveFirst()
	{
		addItem("aaa");
		createItem("bbb");
		solo.clickOnText("bbb");
		setItemSorting("Active First");
		assertFalse(strikeTextFlag());
	} 
	
	
	public void testConfirmAllInactiveItems()
	{
		isConfirmDeleteAllInactive(true);
		removeInactiveItems();
		assertTrue(solo.searchText("Delete Inactive?"));
		solo.clickOnText("Yes");
		assertFalse(solo.searchText(itemName)); 
	}  
	
	public void addList(String listName)
	{
		solo.clickOnText("New List Name");
		EditText addListEditText = (EditText) solo.getView(R.id.AddListEditText);
		solo.clearEditText(addListEditText);
		solo.enterText(addListEditText, listName);
		solo.clickOnButton("Add"); 
	}
	
	public void deleteList(String ListName)
	{
		solo.clickLongOnText(ListName);
		solo.clickOnText("Delete");
		solo.clickOnText("Yes");
	}
	
	public void editList(String ListName)
	{
		solo.clickLongOnText(ListName);
		solo.clickOnText("Edit");
		EditText editListLabelEditText = (EditText) solo.getView(R.id.EditListLabelEditText);
		solo.clearEditText(editListLabelEditText);
		solo.enterText(editListLabelEditText, ListName + "Edited");
		solo.clickOnText("OK");
	}
	
	public void createItem(String ItemName)
	{
		solo.clickOnText("New Item Name");
		EditText addListEditText = (EditText) solo.getView(R.id.AddItemEditText);
		solo.clearEditText(addListEditText);
		solo.enterText(addListEditText, ItemName);
		solo.clickOnButton("Add"); 
	}
	
	public void addItem(String ItemName)
	{
		addList(listName + "ForItem");
		solo.clickOnText(listName+"ForItem");
		createItem(ItemName);
	}
	
	public void removeItem(String ItemName)
	{
		solo.clickLongOnText(ItemName);
		solo.clickOnText("Delete");
		solo.clickOnText("Yes");
	}
	
	public void selecItem()
	{
		addItem(itemName);
		solo.clickOnText(itemName);
		solo.clickOnText(itemName);
	}
	
	public void setStrikeText()
	{
		solo.sendKey(Solo.MENU);
	   	solo.clickOnText("Settings");	
	   	solo.clickOnText("Inactive Decoration");	
	   	solo.clickOnText("Strike/Grey");	
	   	solo.goBack();
	 }

	
	public boolean strikeTextFlag()
	{

	TextView someTextView = (TextView) solo.getCurrentActivity().findViewById(R.id.ieText1);
  
    if ((someTextView.getPaintFlags() & Paint.STRIKE_THRU_TEXT_FLAG) > 0)
    { 	boolean e = true;
    	return e;}
    else
    { 	boolean e = false;
    	return e;}
    
	}
	
	public void deselectItem()
	{
		addItem(itemName);
		solo.clickOnText(itemName);
		solo.clickOnText(itemName);
	}
	
	
	public void addStarItem(String ItemName)
	{
		solo.clickLongOnText(ItemName);
		solo.clickLongOnText("Add Star");
	}
	
	public void addStar (String ItemName)
	{
		addItem(ItemName);
		addStarItem(ItemName);
	}
	
	public void removeStar (String ItemName)
	{
	solo.clickLongOnText(ItemName);
	solo.clickLongOnText("Remove Star");
	}
	
	
	public void removeInactiveItems()
	{	
		addItem(itemName);
		solo.clickOnText(itemName);
		solo.sendKey(Solo.MENU);
	   	solo.clickOnText("Delete All Inactive");
	}
	
	public void setItemSorting(String ItemSorting)
	{
		solo.sendKey(Solo.MENU);
	   	solo.clickOnText("Settings");
	   	solo.clickOnText("Item Sorting");
	   	solo.clickOnText(ItemSorting);
	   	solo.goBack();
	}
	
	public void isConfirmDeleteAllInactive(boolean isCheck)
	{	
		solo.sendKey(Solo.MENU);
		solo.clickOnText("Settings");
	
	    boolean actual = solo.isCheckBoxChecked(0);
	   	if(actual != isCheck)
	    {
	    	solo.clickOnText("Confirm Delete All Inactive");	
	    }
	   	solo.goBack();
	}
	

	@Override
	public void tearDown() throws Exception {
	solo.finishOpenedActivities(); }
}
