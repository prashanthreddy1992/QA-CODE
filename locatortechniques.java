package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locatortechniques {

	public static void main(String[] args)
	{
	WebDriver driver=new FirefoxDriver();
	/*driver.get("http://www.qaclickacademy.com/index.php");
	//xpath locator.
	driver.findElement(By.xpath(".//*[@id='homepage']/header/div[2]/div/nav/ul/li[2]/a")).click(); */
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("timpu92");
	driver.findElement(By.name("pass")).sendKeys("prashanth92");
	driver.findElement(By.partialLinkText("a")).click();
	driver.findElement(By.xpath(".//*[@id='u_0_o']")).click();
	
    
	}

}
