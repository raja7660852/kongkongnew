package Cobra;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_tag2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		  WebElement Year = driver.findElement(By.id("year"));
		  Select sel=new Select(Year);
		  List<WebElement> alloptions = sel.getOptions();
		  for(WebElement option:alloptions)
		  {
			  String text=option.getText();
			  System.out.println(text);
			  sel.selectByVisibleText(text);
		  }
		  
		
		
		
		
	}

}
