package Cobra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/"); 
		String URL = driver.getCurrentUrl();
		String TITLE = driver.getTitle();
		System.out.println(URL);
		System.out.println(TITLE);
		if(URL.equals(driver.getCurrentUrl())&& TITLE.equals(driver.getTitle()))
				{
			System.out.println(" true");
				}
		else
		{
			System.out.println("false");
		}
		
		
	}

}
