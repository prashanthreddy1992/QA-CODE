package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prashanth\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		
		//handling checkboxes
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_StudentDiscount']")).isSelected());
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_StudentDiscount']")).click();
		//prints boolean value true or false
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_StudentDiscount']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());



	}

}
