package Shopper_stack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tc_04_women {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://shoppersstack.com/user-signin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("Email")).sendKeys("rajireddy.reddy123@gmail.com",Keys.TAB,"Raja$123");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		driver.findElement(By.id("women")).click();
		driver.findElement(By.xpath("(//button[text()='add to cart'])[1]")).click();
		System.out.println("womens--operation");
		
		
	
		
	}

}
