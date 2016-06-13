package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class chromedriver {

	public static void main(String[] args) 
	{
	//chrome driver
		
	/*System.setProperty("webdriver.chrome.driver","C:\\Users\\prashanth\\Downloads\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com"); */

	//internet explorer driver
		System.setProperty("webdriver.ie.driver","C:\\Users\\prashanth\\Downloads\\IEDriverServer.exe");
	WebDriver driver=new InternetExplorerDriver();
	driver.get("https://www.google.com");
	

	}

}
