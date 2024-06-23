package windowhandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//launch chrome
//navigate to shopperstack 
//choose any product
//click on compare button 
//maximize ebay window
//and search for iphones




public class S1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/5");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//*[name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-2c7buj']")).click();
		String pwd = driver.getWindowHandle();
		System.out.println(pwd);
		
		Set<String> allwds = driver.getWindowHandles();
		System.out.println(allwds);
		
		for(String wids :allwds)
		{
			driver.switchTo().window(wids);
			String curl = driver.getCurrentUrl();
			//String title=driver.getTitle();
			System.out.println(curl);
			if(curl.contains("ebay"))
			{
				driver.manage().window().maximize();
				Thread.sleep(7000);
				WebElement ebay = driver.findElement(By.xpath("//input[@id='gh-ac']"));
				ebay.sendKeys("iphone");
				ebay.submit();
			}
		}
		
		
		
	}

}
