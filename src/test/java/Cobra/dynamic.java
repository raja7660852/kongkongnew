package Cobra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/apple-iphone-12-black-128-gb/p/itmf1f0a58f1ecd7?pid=MOBFWBYZK3HACR72&lid=LSTMOBFWBYZK3HACR72FZHMHH&marketplace=FLIPKART&q=iphone+12&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=2b1ef699-974f-4b55-b2e0-74d822cbb70d.MOBFWBYZK3HACR72.SEARCH&ppt=sp&ppn=sp&ssid=fi4yyizg1s0000001709118753946&qH=7b7504afcaf2e1ea");
	  String gg = driver.findElement(By.xpath("//span[text()='Apple iPhone 12 (Black, 128 GB)']/../../../div[4]/div/div/div[1]")).getText();
	  System.out.println(gg);
	  System.out.println("hiiii");
	  driver.quit();
	}

}
