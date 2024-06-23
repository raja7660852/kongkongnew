package windowhandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Multiplechild {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//click on button
		driver.findElement(By.xpath("//button[@id='newWindowsBtn']")).click();
		
		//fetch parent window id
		String pwd = driver.getWindowHandle();
		System.out.println(pwd);
		
		//fetch all window ids
		
		Set<String> allwids = driver.getWindowHandles();
		System.out.println(allwids);
		Thread.sleep(3000);
		
		for(String wid:allwids)
		{
			driver.switchTo().window(wid);
			String URL = driver.getCurrentUrl();
			System.out.println(URL);
		if(URL.contains("basic-controls"))
		{
			driver.manage().window().maximize();
			driver.close();
		}
		}
		
		
	}

}
