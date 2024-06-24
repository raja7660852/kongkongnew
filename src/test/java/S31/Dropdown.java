package S31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
		Select s=new Select(ele);
		
		//select single option from the dropdown
		
	//	s.selectByVisibleText("Canada");
	//	s.selectByIndex(1);
		s.selectByValue("canada");
		
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
		
		//printing all options
	/*	for(int i=0;i<options.size();i++)
		{
			String text = options.get(i).getText();
			System.out.println(text);
		}
	*/	
		for (WebElement option : options) 
		{
			System.out.println(option.getText());
		}
		
	}

}
