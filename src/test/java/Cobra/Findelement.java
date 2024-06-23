package Cobra;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println("no of links :"+allLinks.size());
		System.out.println(allLinks);
		for(WebElement Lnks :allLinks)
		{
			System.out.println(Lnks.getText());
		}
		
		 
	}

}
