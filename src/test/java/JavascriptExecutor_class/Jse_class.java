package JavascriptExecutor_class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jse_class {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/tyy/4io/~cs-5fqj6bs23u/pr?sid=tyy,4io&collection-tab-name=Samsung+Galaxy+F15+5G&param=3568");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
//		jse.executeScript("window.scrollTo(0,300)");//if we give multipletimes,its scrolling from strating point
//		Thread.sleep(3000);
//		jse.executeScript("window.scrollTo(0,300)");
		
//		jse.executeScript("window.scrollBy(0,300)");;//if we give multipletimes,its scrolling where the end from 2nd time scrollby
//		Thread.sleep(2000);
//		jse.executeScript("window.scrollBy(0,300)");
		
		WebElement yt = driver.findElement(By.xpath("//img[contains(@src,'//static-assets-web.flixcart.com/fk-p-linchpin-web/fk-cp-zion/img/Y')]"));
		jse.executeScript("arguments[0].scrollIntoView(true)",yt );
	}

}
