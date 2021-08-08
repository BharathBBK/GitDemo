package Academy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {
	
	public static void main (String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/");
		
		List<WebElement> popup = driver.findElements(By.xpath("//button[text()='NO THANKS']"));
		
		Thread.sleep(15000);
		
		if(popup.size() > 0) {
			driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
			System.out.println("into the if loop");
		} else if (driver.findElement(By.xpath("//button[text()='NO THANKS']")).isDisplayed()) {
			driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
			System.out.println("into the if else");
			Thread.sleep(3000);
			
		}
		
		driver.quit();
		
		System.out.println("successfully deleted");
		
		
	}

}
