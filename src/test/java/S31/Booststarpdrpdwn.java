package S31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booststarpdrpdwn {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		//Step 1:select single dopdown
		
	//	driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//Step 2 :captutre all options and findout size
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//label"));
		System.out.println("number of options:"+options.size());
		
		//printing options from dropdown
		for (WebElement op : options) 
		{
			String text=op.getText();
			System.out.println(text);
			//select multiple options
			if(text.equalsIgnoreCase("java")||text.equalsIgnoreCase("python"))
			{
				op.click();
			}
		}
		boolean sel = driver.findElement(By.xpath("//input[@value='Java']")).isSelected();
		System.out.println(sel);
	
	
	}

}
