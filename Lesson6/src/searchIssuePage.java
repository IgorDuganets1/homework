import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class searchIssuePage {

private FirefoxDriver driver;
	
	public searchIssuePage (FirefoxDriver driver)
	{
		this.driver= driver;
		
		}
	
	public Object getIssueName() 
	  {
		return driver.findElement(By.xpath(".//*[@id='content']/div[1]/div[4]/div/div/div/div/div/div/div/div[1]/div[1]/div/div[1]/div[2]/div/ol/li/a/span[2]")).getText();
	  } 
	
}
