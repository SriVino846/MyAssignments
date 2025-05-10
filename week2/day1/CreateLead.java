package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions option= new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(option);
		//to open the URL in browser
		driver.get("http://leaftaps.com/opentaps/");
		//to maximize the browser window
		driver.manage().window().maximize();
		//to get the title of browser window
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Accounts")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Sriyoo1234");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.id("numberEmployees")).sendKeys("15");
		driver.findElement(By.id("officeSiteName")).sendKeys("Leaf Taps");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(10000);
		String title1=driver.getTitle();
		System.out.println(title1);
		driver.quit();
		
		
		
	}

}
