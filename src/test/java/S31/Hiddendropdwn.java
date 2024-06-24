package S31;

import java.time.Duration;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendropdwn {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//step 1: login to the application
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).submit();
		//step 2: clicking on pim 
		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")).click();
		//step 3: selct dropdown xpath
		driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		Thread.sleep(4000);
		//step 4: click on paricular option from dropdown
		driver.findElement(By.xpath("//span[normalize-space()='HR Manager']")).click();
		//step 5:count number of options
		List<WebElement> elets = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println(elets.size());
		//Step 6: print all the options from dropdown
		for(WebElement e: elets)
		{
			
			System.out.println(e.getText());
		}
	}

}
