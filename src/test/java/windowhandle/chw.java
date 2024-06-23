package windowhandle;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class chw {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//button[@class='whButtons'])[1]")).click();
		
		String pwid = driver.getWindowHandle();
		System.out.println(pwid);
		
		Set<String> allwinds = driver.getWindowHandles();
		System.out.println(allwinds);
		for(String it :allwinds)
		{
			System.out.println(it);
		}
		
		
		
		
		
	}

}
