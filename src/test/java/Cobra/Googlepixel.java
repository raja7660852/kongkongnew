package Cobra;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlepixel {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
	WebElement r = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
			 r.sendKeys("google pixel");
			 r.submit();
			 List<WebElement> n= driver.findElements(By.xpath("//div[@class='_4rR01T']"));
			 for(WebElement m :n)
			 {
				 System.out.println(m.getText());
			 }
			List<WebElement> rat = driver.findElements(By.xpath("//div[@class='_3LWZlK']"));
			for(WebElement ratings :rat)
			{
				System.out.println(ratings.getText());
			}
			driver.quit();
	}
	

}
