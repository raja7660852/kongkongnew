package execution_programes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_02_flipkart {
	@Test(groups = "functional")
public void flipkart() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	System.out.println("Tc_02_flipkart is done");
	
}
}
