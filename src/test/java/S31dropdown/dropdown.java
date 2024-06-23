package S31dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement drpdwnele = driver.findElement(By.xpath("//select[@id='country']"));
		Select s=new Select(drpdwnele);
		
		//select single dopdown
		s.selectByVisibleText("Japan");
		
		//capture the options from dropdown
		List<WebElement> alloptions = s.getOptions();
		System.out.println(alloptions.size());
		
		for(int i=0;i<alloptions.size();i++)
		{
			System.out.println(alloptions.get(i).getText());
		}
		System.out.println("for loop^^");
		
		for (WebElement op : alloptions)
		{
			
			System.out.println("eachloop :"+op.getText());
		}
		
		
	}

}
