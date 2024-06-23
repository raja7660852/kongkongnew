package Cobra;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_ {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		 WebElement options = driver.findElement(By.id("month"));
		Select sel=new Select(options);
		System.out.println(sel.isMultiple());
		if(sel.isMultiple()==false)
		{
			sel.selectByVisibleText("Dec");
		}
		else
		{
			System.out.println("not implemented");
		}
	}

}
