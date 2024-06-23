package contactsTests;
import org.testng.annotations.Test;

public class ReadDataFromcmdline {
	@Test
	public void read()
	{
		String UN = System.getProperty("username");
		String PWD = System.getProperty("password");
		System.out.println(UN);
		System.out.println(PWD);
	}
	
	@Test
	public void reading()
	{
		System.out.println("reading");
	}

}
