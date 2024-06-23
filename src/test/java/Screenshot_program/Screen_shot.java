package Screenshot_program;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

//launch chrome browser
//navigate to flipkart
//perform login opertion
//takesscreenshot of next page

public class Screen_shot {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		WebElement log = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		log.sendKeys("9176608529222");
		log.submit();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm=new File("./screenshot/flipkartlogin.png");
		FileHandler.copy(temp, perm);//filehandler we have to take from selenium package
		
	}

}
