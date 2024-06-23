package contactsTests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUTilities.SeleniumUtility;

public class Framehandling {
	public static void main(String[] args) throws InterruptedException {
	SeleniumUtility sutil =new SeleniumUtility();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	WebElement  kk=	driver.findElement(By.xpath("(//frame)[1]"));
	int count=0;
//		for(WebElement p:kk)
//		{
			
			//System.out.println(p.getSize());
			sutil.handleFrame(driver, kk);
			driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Rajireddy");
			Thread.sleep(3000);
			count++;
			sutil.defaultcontentFrame(driver);
		//}
			WebElement  kk1=	driver.findElement(By.xpath("(//frame)[2]"));
			sutil.handleFrame(driver, kk1);
			driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Praveen");
			Thread.sleep(3000);
			count++;
			sutil.defaultcontentFrame(driver);
//		System.out.println(count);
			WebElement  kk2=	driver.findElement(By.xpath("(//frame)[3]"));
			sutil.handleFrame(driver, kk2);
			driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Vamshi");
			Thread.sleep(3000);
			count++;
			sutil.defaultcontentFrame(driver);
			System.out.println(count);
		driver.quit();
	
	}

}
