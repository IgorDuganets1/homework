import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.firefox.FirefoxDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class jiraTestPage {
	
	private FirefoxDriver driver;
	private final String SUMMARY="Newest Test Issue №5";

	
	@Before
	public void startBrowser() 
	{driver= new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	driver.get(
			"https://id.atlassian.com/login?application=jac&continue=https%3A%2F%2Fjira.atlassian.com%2Fprojects%2FDEMO");}

	@After public void closeBrowser() 
			{driver.close();}
	
		
	@Test
	public void test_1_NewIssueCreated(){
		
		startPage home2=new startPage(driver);
		loggedInPage loggedin=home2.login("svv.tes@gmail.com", "1234567890");
	
		loggedin.createIssue();
		loggedin.issue(SUMMARY);
	
		filterPage filter=loggedin.openIssueCreatedWindow();
		assertTrue(filter.getSummaryIssue().equals(SUMMARY));
	}	
	
	
	@Test
	public void test_2_UpdateIssue(){
		
		startPage home2=new startPage(driver);
		loggedInPage loggedin=home2.login("svv.tes@gmail.com", "1234567890");
		profilePage profile=loggedin.openProfile();
		filterPage filter=profile.openReportedAndOpen();
		filter.updateClick();
		filter.updateIssueType();
	//	System.out.println("test_2 getIssueType :"+filter.getIssueType()); // контроль значення яке пійде в порівняння
		assertFalse(filter.getIssueType().equals("Bug"));
	}
	
	@Test
	public void test_3_ExistingIssueFoundJiraSearch(){
		startPage home2=new startPage(driver);
		loggedInPage loggedin=home2.login("svv.tes@gmail.com", "1234567890");
		searchIssuePage search=loggedin.searchIssue(SUMMARY);
//		System.out.println("test 3 getIssueName:"+search.getIssueName());
		assertTrue(search.getIssueName().equals(SUMMARY));
	}
}
