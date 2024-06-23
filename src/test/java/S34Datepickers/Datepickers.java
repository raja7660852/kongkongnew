package S34Datepickers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickers {
	public static void selectfuturedate(WebDriver driver,String month,String Year,String Date) {
		
		while(true)
		{
			String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(currentmonth.equals(month) && currentyear.equals(Year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//Next
	//		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//previous
		}
		
		//select the particular date
		
		 List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		 for (WebElement date : alldates) 
		 {
			if(date.getText().equals(Date))
			{
				date.click();
				break;
			}
		}
		
	}	
	
public static void selectpastdate(WebDriver driver,String month,String Year,String Date) {
		
		while(true)
		{
			String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(currentmonth.equals(month) && currentyear.equals(Year))
			{
				break;
			}
		//	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//Next
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//previous
		}
		
		//select the particular date
		
		 List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		 for (WebElement date : alldates) 
		 {
			if(date.getText().equals(Date))
			{
				date.click();
				break;
			}
		}
		
	}	
	
		public static void main(String[] args) {
				
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//switch to frame
		driver.switchTo().frame(0);
		
		//step 1: Using sendkeys 
	//	driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("20/05/2024");
		
		//Step 2:
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//step 3: select year and month
		String Date="10";
		String month = "April";
		String year = "2022";
		//selecpastdate(driver, month, year, Date);
		selectpastdate(driver, month, year, Date);

		}
}


