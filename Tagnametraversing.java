package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tagnametraversing {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//div[@id='reg_form_box']/div[1]/div[1]/div/div/input")).sendKeys("prashanth reddy");
		driver.findElement(By.xpath("//div[@id='reg_form_box']/div[1]/div[2]/div/div/input")).sendKeys("ganta");
		driver.findElement(By.xpath("//div[@id='reg_form_box']/div[8]/button")).click();
		

	}

}
