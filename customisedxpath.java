package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class customisedxpath {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		/*gmail login*/
		
		driver.get("https://gmail.com/");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("prashanthreddy1992@gmail.com");
		driver.findElement(By.xpath("//*[@name='signIn']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("timpu92");
		driver.findElement(By.xpath("//*[@value='Sign in']")).click();
		
		/*facebook login*/
		/*driver.get("https://facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prashanth");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("prashanth92");
		driver.findElement(By.xpath("//*[@id='u_0_o']")).click(); */
		
		
		

	}

}
