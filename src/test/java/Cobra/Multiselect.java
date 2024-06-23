package Cobra;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		WebElement ele = driver.findElement(By.id("cars"));
		Select s=new Select(ele);
		if(s.isMultiple())
		{
		s.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
		s.selectByVisibleText("INR 300 - INR 399 ( 1 ) ");
		s.deselectByVisibleText("INR 200 - INR 299 ( 3 )");
		}
		else
		{
			System.out.println("nott");	
			
		}
	}

}
