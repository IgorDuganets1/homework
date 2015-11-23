import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
	
	public filterPage updateIssueType(String type) {
		
		driver.findElement(By.xpath(".//*[@id='issuetype-single-select']/span")).click();
//		driver.findElement(By.xpath(".//*[contains(@id,'new-feature')]")).click();
//		driver.findElement(By.xpath(".//*[contains(@id,'new-feature')]")).click();
		driver.findElement(By.id("issuetype-field")).clear();
		driver.findElement(By.id("issuetype-field")).sendKeys(type);
		
	//	Actions actions = new Actions(this.driver);

	//	WebElement customers = driver.findElement(By.xpath(".//*[@id='issuetype-single-select']/span"));

	//	WebElement receivingCalls = driver.findElement(By.xpath(".//*[contains(@id,'new-feature')]"));

	//	actions.moveToElement(customers).click(receivingCalls);

	//	Actions muveAndClick = (Actions) actions.build();

	//	muveAndClick.perform();
		
	//	WebElement username = driver.findElement(By.xpath(".//*[contains(@id,'new-feature')]"));
	//	   System.out.println("filterPage :" + username.getText());
	//	   username.click();
	//	   username.sendKeys(Keys.ENTER);
	//	driver.findElement(By.xpath(".//*[contains(@id,'new-feature')]")).sendKeys(Keys.ENTER);
	//	driver.findElement(By.xpath(".//*[contains(@id,'new-feature')]")).click();
	//	driver.findElement(By.xpath("//li[@id='new-feature-2']/a")).click();
	//	WebElement a = driver.findElement(By.xpath(".//*[contains(@id,'new-feature')]"));
	//	a.sendKeys(Keys.ENTER);
	//	a.click();
		
	//	WebElement dropDownListBox = driver.findElement(By.id("issuetype-single-select"));

	//	Select clickThis = new Select(dropDownListBox);

	//	clickThis.selectByVisibleText("New Feature");
		
		
	//	driver.findElement(By.xpath(".//*[@id='issuetype-single-select']/span")).click();
	//	driver.findElement(By.xpath("//li[@id='new-feature-2']/a")).click();
		driver.findElement(By.id("edit-issue-submit")).click();
		return new filterPage(driver);
	}
	
	public Object getIssueType()
	{
		return driver.findElement(By.id("type-val")).getText();
	}
	
	//*[@id='type-val']
	
}
