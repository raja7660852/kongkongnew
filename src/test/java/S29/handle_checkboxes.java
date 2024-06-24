package S29;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_checkboxes {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//step 1: select specific checkbox
		
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//step 2:selct multiple checkboxes
		
		List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		
		// for loop
		
	/*	for(int i=0;i<allcheckbox.size();i++)
		{
			allcheckbox.get(i).click();
		}
	*/
		
		//for each loop
		
	/*	for (WebElement checkbox : allcheckbox)
		{
		  	checkbox.click();
		}
	*/	
		//step 3:seleect 2 or 3 checkboxes
		
	 	for(int i=4;i<allcheckbox.size();i++)
		{
			allcheckbox.get(i).click();
		}
		
	//	step 4:unselect checkboxes if they are selected
		
		for(int i=4;i<allcheckbox.size();i++)
		{
			allcheckbox.get(i).click();
		}
		
		for(int i=0;i<allcheckbox.size();i++)
		{
			if(allcheckbox.get(i).isSelected())
			{
				allcheckbox.get(i).click();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
