package Cobra;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Communitypoll {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> poll = driver.findElements(By.xpath("//input[@type='radio']"));
		for (WebElement e:poll) 
		{
			Thread.sleep(3000);
			e.click();
		}
		driver.quit();
	}
	

}
