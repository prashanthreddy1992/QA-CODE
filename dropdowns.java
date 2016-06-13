package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\prashanth\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.goindigo.in/");
	
	//dynamic dropdown
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='roundWay']/form/ul/li[1]/input[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@data-val='DIB']")).click();
	/*Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='destinations-value city-name-value']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='roundWay']/form/ul/li[2]/div/ul/li[3]"));
	Thread.sleep(2000);*/
	
	//static dropdown
	driver.findElement(By.xpath("//input[@class='count travellers-count']")).click();
	Select dropdown=new Select(driver.findElement(By.xpath("//select[@name='indiGoRoundTripSearch.PassengerCounts[0].Count']")));
	dropdown.selectByIndex(1);
	Select child=new Select(driver.findElement(By.xpath("//select[@name='indiGoRoundTripSearch.PassengerCounts[1].Count']")));
	child.selectByVisibleText("0");
	
	
	}

}
