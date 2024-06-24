package S29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//alert is not a weblelement
//

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//step 1: normal alert with ok button
		
		driver.findElement(By.xpath("(//button[@id='alertBox'])[1]")).click();
		
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		
		//step 2: conformation alert with ok and cancel button
		
		driver.findElement(By.xpath("(//button[@id='confirmBox'])[1]")).click();
		
		Alert myalert2 = driver.switchTo().alert();
		myalert2.accept();//dismiss
		
		//step 3: promt alert with text ok &cancel
		
		driver.findElement(By.xpath("(//button[@id='promptBox'])[1]")).click();
		
		Alert myalert3 = driver.switchTo().alert();
		myalert3.sendKeys("rajireddy");
		myalert3.accept();//dismiss
		
		
		

	}

}
