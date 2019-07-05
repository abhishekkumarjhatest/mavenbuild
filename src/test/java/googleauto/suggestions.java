package googleauto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class suggestions {
	
	
		
		
	public static void main(String args[]){
	
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver	driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		
	
		
	
	
	
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//li")));
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		System.out.println("Auto Suggest List ::" + list.size());
		
		for(WebElement data:list)
			
			
		{
			
			
			System.out.println(data.getText());
			
		
		
	
		
	}
	}
}

