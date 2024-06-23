package Cobra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebshop {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("input[id='FirstName']")).sendKeys("raj");
		driver.findElement(By.xpath("input[id='LastName']")).sendKeys("reddy");
		 driver.findElement(By.xpath("input[id='Email']")).sendKeys("murali.raj366.mr@gmail.com");
		driver.findElement(By.xpath("input[id='Password']")).sendKeys("Reddy123");
		driver.findElement(By.xpath("input[id='ConfirmPassword']")).sendKeys("Reddy123");
		driver.findElement(By.name("input[name='register-button']")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("input[class='email']")).sendKeys("murali.raj366.mr@gmail.com");
		driver.findElement(By.xpath("input[class='password']")).sendKeys("Reddy123");
		driver.findElement(By.className("input[class='button-1 login-button']"));
		
		
		
	}

}
