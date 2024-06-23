package execution_programes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_03_myntra {
	@Test(groups = "endtoend")
	   public void myntra() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		System.out.println("Tc_03_myntra is done");
		
	}

}
