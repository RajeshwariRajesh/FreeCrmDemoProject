import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\D5490-102812G\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver;
		driver =new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='alert']")).click();
	     Alert alert=driver.switchTo().alert();
		
		alert.accept();
		driver.findElement(By.xpath("//input[@name='prompt']")).click();
		Thread.sleep(20);
		alert.sendKeys("xyz");
		

		
		 driver.findElement(By.name("confirmation")).click();
		
		// Capturing alert message.
				String alertMessage = alert.getText();

				// Displaying alert message
				System.out.println(alertMessage);
			
				
	/*	driver.findElement(By.name("prompt")).click();
		driver.switchTo().alert().sendKeys("123"); */
				
				
		
		//Thread.sleep(60);
		//alert1.dismiss();
		
		
	}
	
}



