package Screenshot_program;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Sreenshot_2 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//div[@aria-label='Electronics']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm=new File("./screenshot/elections.png");
		FileHandler.copy(temp, perm);//filehandler we have to take from selenium package
		
		driver.findElement(By.xpath("//a[text()='Gaming']")).click();
		TakesScreenshot ts1=(TakesScreenshot) driver;
		File temp1 = ts.getScreenshotAs(OutputType.FILE);
		File perm1=new File("./screenshot/gaming.png");
		FileHandler.copy(temp1, perm1);//filehandler we have to take from selenium package
		
		WebElement price = driver.findElement(By.xpath("(//a[contains(text(),'Bes')])[1]/../a[3]/div/div[1]"));
		String p = price.getText();
		System.out.println(p);
		
	}

}
