package Window_handling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class win_scenario1 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
//		//parent window
//		String parentwid = driver.getWindowHandle();
//		System.out.println("patentwindow id : "+parentwid +driver.getTitle());
//		driver.findElement(By.id("newWindowBtn")).click();
//		Set<String> childwidids = driver.getWindowHandles();
//		for (String childwindow : childwidids) 
//		{
//			System.out.println(childwindow  +driver.getTitle());
//			if(!childwindow.equals(parentwid))
//			{
//				driver.switchTo().window(childwindow);
//			driver.manage().window().maximize();
//				driver.findElement(By.id("firstName")).sendKeys("rajreddy");
//				Thread.sleep(3000);
//				driver.close();
//				
//			}
//		}
//		driver.switchTo().window(parentwid);
//		driver.findElement(By.xpath("//input[@class='whTextBox']")).sendKeys("back");
		
		//parent window
				String parentwid = driver.getWindowHandle();
				System.out.println("patentwindow id : "+parentwid +driver.getTitle());
				driver.findElement(By.id("newTabBtn")).click();
				Set<String> childwidids = driver.getWindowHandles();
				for (String childwindow : childwidids) 
				{
					System.out.println(childwindow  +driver.getTitle());
					if(!childwindow.equals(parentwid))
					{
						driver.switchTo().window(childwindow);
					driver.manage().window().maximize();
					driver.findElement(By.id("alertBox")).click();
					System.out.println(driver.switchTo().alert().getText());
					driver.switchTo().alert().accept();
		             System.out.println(driver.findElement(By.id("output")).getText());	
		            driver.navigate().back();	
					}
				}
					driver.switchTo().window(parentwid);
		driver.findElement(By.xpath("//input[@class='whTextBox']")).sendKeys("back");
		
		
		
		
	}

}
