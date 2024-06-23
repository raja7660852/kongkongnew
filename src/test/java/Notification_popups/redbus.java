package Notification_popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

//launch chromebrowser 
//navigate to redbus
//handle the notifucation popup
//with the help of robot class

//note-notification popup is throwed by browser .it belongs browser

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class redbus {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		ChromeOptions opt=new ChromeOptions();//step1
		opt.addArguments("--disable-notifications");//step2
		
		WebDriver driver=new ChromeDriver(opt);//step3
		
		driver.get("https://www.redbus.com/");
		driver.manage().window().maximize();
//		Thread.sleep(3000);//we should give thread.sleep that time it will apper
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
