package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prashanth\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		//driver.findElement(By.xpath("//input[@value='Water']")).click();
		int count=driver.findElements(By.xpath("//input[@name='group2']")).size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.xpath("//input[@name='group2']")).get(i).getAttribute("value");
			System.out.println(text);
			if(text.equals("Beer"))
			{
				driver.findElements(By.xpath("//input[@name='group2']")).get(i).click();
			}
		}
		
	
		
		

	}

}
