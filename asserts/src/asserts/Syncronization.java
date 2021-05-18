package asserts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Syncronization {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");       
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        
        
        driver.manage().deleteAllCookies();
		
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//WebDriverWait wait=new WebDriverWait(driver, 120);
		
        //WebDriverWait wait=new WebDriverWait(driver, 120);
		
	 
		
		/*driver.findElement(By.id("lst-ib")).sendKeys("hadoop tutorial");
		//Thread.sleep(5000);
		//wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@class='sbsb_b']/li/div/div[@class='sbqs_c']")));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@class='sbsb_b']/li/div/div[@class='sbqs_c']")));
		List<WebElement> var = driver.findElements(By.xpath("//ul[@class='sbsb_b']/li/div/div[@class='sbqs_c']"));
		for(WebElement itr:var)
		{  
			
			System.out.println(itr.getAttribute("innerHTML"));
			if(itr.getText().contains("hadoop tutorial"))
			{
				itr.click();
				break;
			}
			
		}	
		
*/
	}

}
