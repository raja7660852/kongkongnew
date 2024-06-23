package S31dropdown;

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
		
		//select single dopdown
	//	driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//captutre the labels
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//label"));
		System.out.println(options.size());
		
		for (WebElement op : options) 
		{
			String s=op.getText();
			System.out.println(s);
			if(s.equalsIgnoreCase("java")||s.equalsIgnoreCase("python"))
			{
				op.click();
			}
		}
		boolean sel = driver.findElement(By.xpath("//input[@value='Java']")).isSelected();
		System.out.println(sel);
	
	
	}

}
