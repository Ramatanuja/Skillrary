package genericlibraries;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	private WebDriver driver;
	public WebDriver openApplication(String browser,String url,long time)
	{
		switch(browser) {
		
		case"chrome":driver=new ChromeDriver();break;
		case"firefox":driver=new FirefoxDriver();break;
		case"edge":driver=new EdgeDriver();break;
		default:System.out.println("Invalid browser");
		}
		driver.manage().window().maximize();
		driver.get(url);
		
	  return driver; 
	}
	public WebElement explicitwait(WebElement element,long time) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		
		return (WebElement) wait.until(ExpectedConditions.visibilityOf(element));
		(Exception e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		(Exception e) {
			//TODO Auto-generated ctch block
			e.printStackTrace();
		}
	}
	   public void doubleClickOnElement(WebElement element)
	   {
		   Actions a=new Actions(driver);
		   a.doubleClick(element).perform();
	   }
	   public void DragAndDropElement(WebElement Source,WebElement target) 
	   {
		   Actions a=new Actions(driver);
		   a.dragAndDrop(Source, target).perform();
	   }
	   public void mouseHover(WebElement element)
	   {
		   Actions a=new Actions(driver);
		   a.moveToElement(element).perform();
	   }
	   public void dropdown(WebElement categoryDropdown, int index) {
		   //TODO Auto-generated method stub
	   }
	

}
