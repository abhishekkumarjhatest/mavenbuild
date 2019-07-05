package googleauto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class maps {
	
	public static void main(String args[]) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver	driver=new FirefoxDriver();
		driver.get("https://www.google.com/maps");
		
		driver.findElement(By.id("searchbox-directions")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[contains(.,'DELAYS')])")));
		
		driver.findElement(By.xpath("(//input[@class='tactile-searchbox-input'])[3]")).sendKeys("hebbal");
		
		driver.findElement(By.xpath("(//input[@class='tactile-searchbox-input'])[4]")).sendKeys("chandra layout");
		
		driver.findElement(By.xpath("(//button[@class='searchbox-searchbutton'])[3]")).click();
		
		WebDriverWait wait1 = new WebDriverWait(driver,30);
		wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h1[@class='section-directions-trip-title']")));
		
		List<WebElement> details = driver.findElements(By.xpath("//h1[@class='section-directions-trip-title']"));
		
		
		
		for(WebElement data:details){
			
			System.out.println(data.getText());
		}
		
		
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		
		
		
		
		
		
	}		
	

}
