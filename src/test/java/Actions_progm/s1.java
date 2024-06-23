package Actions_progm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class s1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement cmp = driver.findElement(By.xpath("(//a[@href='/computers'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(cmp).perform();
		driver.findElement(By.xpath("(//a[@href='/notebooks'])[1]")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		
		
	}

}
