import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class filterPage {
	
private FirefoxDriver driver;
	
	public filterPage (FirefoxDriver driver)
	{
		this.driver= driver;
		
		}
	
	public Object getSummaryIssue() 
	  {
		return driver.findElement(By.id("summary-val")).getText();
		
	  } 
	
	public filterPage updateClick(){
		driver.findElement(By.xpath(".//*[@id='edit-issue']/span[2]")).click();
		return new filterPage(driver);
	}
	
	public filterPage updateIssueType() {
		
	
		driver.findElement(By.xpath(".//*[@id='issuetype-single-select']/span")).click();
		 driver.findElement(By.id("issuetype-field")).sendKeys(Keys.ARROW_DOWN);
         driver.findElement(By.id("issuetype-field")).sendKeys(Keys.ENTER);

		driver.findElement(By.id("edit-issue-submit")).click();

		return new filterPage(driver);
	}
	
	public Object getIssueType()
	{
		return driver.findElement(By.cssSelector("html.mozilla body#jira.aui-layout.aui-theme-default.ka.ajax-issue-search-and-view.page-type-navigator.page-type-split div#page section#content div.navigator-container div.navigator-body div.contained-content div.navigator-group div.results-panel.navigator-item div.navigator-content div.details-layout div div.aui-group.split-view div.aui-item.detail-panel div.issue-container.skinny div#issue-content.issue-edit-form div.issue-body-content div.aui-group.issue-body div.aui-item.issue-main-column div#details-module.module.toggle-wrap div.mod-content ul#issuedetails.property-list.two-cols li.item div.wrap span#type-val.value.editable-field.inactive")).getText();
	}
	
	
}
