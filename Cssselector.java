package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cssselector {

	public static void main(String[] args) 
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("salesforce");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("password");
		driver.findElement(By.cssSelector("input[id='Login']")).click();
		
		
	}

}
