package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class inspectchrome {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prashanth\\Downloads\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com/");
     driver.findElement(By.xpath("//*[@id='email']")).sendKeys("timpu92");
     driver.findElement(By.cssSelector("#pass")).sendKeys("gdlhh");
     driver.findElement(By.xpath("//*[@id='u_0_o']")).click();
     

	}

}
