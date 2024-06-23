package Cobra;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pagedown_robot {
	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement d = driver.findElement(By.className("Pke_EE"));
		d.sendKeys("google pixel");
		d.submit();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		WebElement doo = driver.findElement(By.xpath("//div[contains(text(),'Google Pixel Buds Pro with A')]/../../div[2]/div/div/div[3]/span"));
		String offer=doo.getText();
		
		System.out.println(offer);
		if(offer.contains("3"))
		{
			System.out.println("worth varma worth");
		}
		else
		{
			System.out.println("pavala figure");
		}
		
	}

}
