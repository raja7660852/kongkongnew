package Shopper_stack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_01 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/signup");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.id("First Name")).sendKeys("Raj",Keys.TAB,"Reddy",Keys.TAB);
		driver.findElement(By.id("Male")).click();
		driver.findElement(By.id("Phone Number")).sendKeys("7660852923",Keys.TAB
				,"rajireddy.reddy123@gmail.com",Keys.TAB,"Raja$123",Keys.TAB,Keys.TAB,"Raja$123");
		driver.findElement(By.id("Terms and Conditions")).click();
		driver.findElement(By.id("btnDisabled")).click();
		System.out.println("register operation");
		
		
	}

}
