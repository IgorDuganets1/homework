import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class profilePage {
	
	private FirefoxDriver driver;
	
	public profilePage (FirefoxDriver driver)
	{
		this.driver= driver;
		
		}
	
	public Object getUserName() 
	  {
		return driver.findElement(By.id("up-user-title-name")).getText();
	  } //temporarychanges
	
	public filterPage openReportedAndOpen() 
	{
		driver.findElement(By.id("filters")).click();
		driver.findElement(By.id("rep_open")).click();
		return new filterPage(driver);}
}
