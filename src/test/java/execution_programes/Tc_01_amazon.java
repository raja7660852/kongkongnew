package execution_programes;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tc_01_amazon {
	WebDriver driver;
	@Test(groups = "functional")
	@Parameters("browser")
	public void amazon(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		 else if(browser.equalsIgnoreCase("edge")) 
		{
			driver=new EdgeDriver();
		}
		 else if (browser.equalsIgnoreCase("firefox"))
		 {
			 driver=new FirefoxDriver();
			
		}
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
	}

}
