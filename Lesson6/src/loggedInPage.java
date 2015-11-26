import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loggedInPage 
	{
	private final FirefoxDriver driver;
	
	public loggedInPage(FirefoxDriver driver) 
	{this.driver= driver;}
	
	public profilePage openProfile() 
	{
		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[3]/ul/li[3]/a/span/span/img")).click();
	//	driver.findElement(By.id("header-details-user-fullname")).click();
	//	driver.findElementByCssSelector("html.mozilla body#jira.aui-layout.aui-theme-default.ka.ajax-issue-search-and-view.page-type-navigator.page-type-split div#page header#header nav.aui-header.aui-dropdown2-trigger-group div.aui-header-inner div.aui-header-secondary ul.aui-nav.__skate li#user-options a#header-details-user-fullname.aui-dropdown2-trigger span.aui-avatar.aui-avatar-small span.aui-avatar-inner img");
		driver.findElement(By.id("view_profile")).click();
		return new profilePage(driver);}
	
	public profilePage createIssue()
	{
		driver.findElement(By.xpath(".//*[@id='create_link']")).click();
		return new profilePage(driver);
	}
	
	public profilePage issue(String summary)
	{
		driver.findElement(By.id("summary")).clear();
		driver.findElement(By.id("summary")).sendKeys(summary);
		driver.findElement(By.id("create-issue-submit")).click();
		return new profilePage(driver);}
	
	public searchIssuePage searchIssue(String summary)
	{
		driver.findElement(By.id("quickSearchInput")).clear();
		driver.findElement(By.id("quickSearchInput")).sendKeys(summary+Keys.ENTER);
	//	driver.findElement(By.id("quickSearchInput")).sendKeys(Keys.ENTER);
		return new searchIssuePage(driver);
	}
}
