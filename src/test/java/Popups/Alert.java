package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//selinium.unhandleedexception-it comes when we perform without handling alert popup we will perform another alertpopup .
//noalertpresent exception-there is no alert popup but we perform alertpopup handling 
public class Alert {
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		//simplealert
		 driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		 Thread.sleep(3000);
		 org.openqa.selenium.Alert alt = driver.switchTo().alert();
		 alt.dismiss();//dismiss also works like as accept in simple alert 
		 
		 Thread.sleep(3000);
		 
		 //conformationalert
		 driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		 System.out.println(alt.getText());
		 alt.accept();
		// alt.dismiss();
		 
		 
	    Thread.sleep(3000);
		 //promtpopup
      	driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	    alt.sendKeys("hello");
	    alt.accept();
		 
		 
		 
		 
		
	
		 
		 
		 
		 
		 
		 
		
	}

}
