package basics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Invokebrowser {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new  FirefoxDriver();
		driver.get("http://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
