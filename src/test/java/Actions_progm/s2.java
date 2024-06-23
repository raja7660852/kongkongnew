package Actions_progm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class s2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text()='Gaming']")).click();
		WebElement rating = driver.findElement
				(By.xpath("(//a[@target='_blank'])[2]/../a[3]/div/div[3]/span"));
		String text = rating.getText();
		System.out.println(text);
		
		
		
	}

}
