package Shopper_stack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_02 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://shoppersstack.com/user-signin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("Email")).sendKeys("rajireddy.reddy123@gmail.com",Keys.TAB,"Raja$123");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		System.out.println("login operation");
		
	}

}
