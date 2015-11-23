import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class jiraTestPage {
	
	private FirefoxDriver driver;
	private final String SUMMARY="Newest Test Issue lesson 6";

	@Ignore
	@Before
	public void startBrowser() 
	{driver= new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.get(
			"https://id.atlassian.com/login?application=jac&continue=https%3A%2F%2Fjira.atlassian.com%2Fprojects%2FDEMO");}
	
//	@After public void closeBrowser() 
//			{driver.close();}
	
	@Ignore
	@Test
	public void testProfileUserName(){
		startPage home= new startPage(driver);
		loggedInPage loggedin= home.login("svv.tes@gmail.com", "1234567890");
		profilePage profile= loggedin.openProfile();
		assertTrue(profile.getUserName().equals("testuser"));}
	
	@Ignore
	@Test
	public void testNewIssueCreated(){
		startPage home2=new startPage(driver);
		loggedInPage loggedin=home2.login("svv.tes@gmail.com", "1234567890");
	//	loggedin.createIssue();
	//	loggedin.issue(SUMMARY);
		profilePage profile= loggedin.openProfile();
		filterPage filter=profile.openReportedAndOpen();
		assertTrue(filter.getSummaryIssue().equals(SUMMARY));
	}	
	
	
	@Test
	public void testUpdateIssue(){
		
		startPage home2=new startPage(driver);
		loggedInPage loggedin=home2.login("svv.tes@gmail.com", "1234567890");
		profilePage profile=loggedin.openProfile();
		filterPage filter=profile.openReportedAndOpen();
		System.out.println("1"+filter.getIssueType()); // контроль початкового типа ішью
		filter.updateClick();
		String type = "Bug";   // встановити тип ішью Баг
		filter.updateIssueType(type);
		System.out.println("2"+filter.getIssueType()); // контроль значення яке пійде в порівняння
		assertTrue(filter.getIssueType().equals(type));
	}
	
	
	@Ignore
	@Test
	public void testExistingIssueFoundJiraSearch(){
		startPage home2=new startPage(driver);
		loggedInPage loggedin=home2.login("svv.tes@gmail.com", "1234567890");
		//createIssuePage issue=loggedin.createIssue();
	//	loggedin.createIssue();
	//	loggedin.issue(SUMMARY);
		searchIssuePage search=loggedin.searchIssue(SUMMARY);
	//	System.out.println(search.getIssueName());
		assertTrue(search.getIssueName().equals(SUMMARY));
	}
}
