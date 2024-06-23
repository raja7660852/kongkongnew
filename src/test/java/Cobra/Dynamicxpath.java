package Cobra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicxpath {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/apple-iphone-13-pink-128-gb/p/itm6e30c6ee045d2?pid=MOBG6VF5GXVFTQ5Y&lid=LSTMOBG6VF5GXVFTQ5YWKHB1V&marketplace=FLIPKART&q=iphone+13&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=organic&iid=1946f97b-14dd-456d-9867-1b5208de59e5.MOBG6VF5GXVFTQ5Y.SEARCH&ppt=hp&ppn=homepage&ssid=lofviyq8i80000001709116136195&qH=c68a3b83214bb235");
	driver.manage().window().maximize();
	String OffPer=driver.findElement(By.xpath("//span[@class=\"B_NuCI\"]/../../../div[4]/div[1]/div[1]/div[3]/span")).getText();
    System.out.println(OffPer);
    String OldPrice=driver.findElement(By.xpath("//span[@class=\"B_NuCI\"]/../../../div[4]/div[1]/div[1]/div[2]")).getText();
	System.out.println(OldPrice);
	String Price=driver.findElement(By.xpath("//span[@class=\"B_NuCI\"]/../../../div[4]/div[1]/div[1]/div[1]")).getText();
	System.out.println(Price);
driver.quit();
	}

}
