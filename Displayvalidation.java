package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Displayvalidation {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.southwest.com/");
		System.out.println("Before clicking on hotels ");
		System.out.println(driver.findElement(By.xpath(".//*[@id='air-city-arrival']")).isDisplayed());
		System.out.println("After clicking on hotels ");
		driver.findElement(By.xpath(".//*[@id='booking-form--hotel-tab']/span[1]")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@id='air-city-arrival']")).isDisplayed());
		
	}

}
