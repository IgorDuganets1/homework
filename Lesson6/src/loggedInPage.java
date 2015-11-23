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
	//	driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[3]/ul/li[3]/a/span/span/img")).click();
		driver.findElement(By.id("header-details-user-fullname")).click();
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
