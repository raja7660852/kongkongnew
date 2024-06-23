package S32webtables;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class staticwebtables {
	@Test
	public static void table() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

	 
	 //step 1:find rows number
	 
	int row = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	System.out.println(row);
//	int allrow = driver.findElements(By.tagName("tr")).size();
//	System.out.println(allrow);
	
	//step 2:find cols &print rows
    int col = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
    System.out.println(col);
 //   int allcols = driver.findElements(By.tagName("th")).size();
//    System.out.println(allcols);
    
    //step 3: Read data specific col
   String Ptext = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
	System.out.println(Ptext);
	
	//step 4 :Read data from all the row & cols
	
	for(int r=2;r<=row;r++)
	{
		for(int c=1;c<=col;c++)
		{
			String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
			System.out.print(value+"\t");
		}
	
		System.out.println( );
	}
	
	//total pricces of price list
	int total = 0;
	for(int r=2;r<=row;r++)
	{
		String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+4+"]")).getText();
	
		total=total+Integer.parseInt(price);
		
	}
	System.out.println(total);
	

	
	
	}

}
