package contactsTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUTilities.SeleniumUtility;

public class Windowhandling {
	
	public static void main(String[] args) {
		SeleniumUtility sutil =new SeleniumUtility();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("iphone 11",Keys.ENTER);
         driver.findElement(By.xpath("(//div[normalize-space()='Apple iPhone 11 (Black, 128 GB)'])[1]")).click();
        sutil.handleWindows(driver, "flipkart");
      String text = driver.findElement(By.xpath("(//span[@class='VU-ZEz'])[1]")).getText();
      System.out.println(text);
       System.out.println("successfull");
	}

}
