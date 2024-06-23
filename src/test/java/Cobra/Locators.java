		package Cobra;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String[] args) throws AWTException, InterruptedException {
 WebDriver driver=new ChromeDriver();
 driver.get("https://demowebshop.tricentis.com/");
 Thread.sleep(3000);
WebElement ra = driver.findElement(By.partialLinkText("ister"));
ra.click();
	
}
}
