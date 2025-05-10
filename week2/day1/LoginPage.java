package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		//to open the URL in browser
		driver.get("https://www.facebook.com/");
		//to maximize the browser window
		driver.manage().window().maximize();
		//to get the title of browser window
//		String title = driver.getTitle();
//		System.out.println(title);
//		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
//		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
//		driver.findElement(By.className("decorativeSubmit")).click();
//		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		String fbtext=driver.findElement(By.partialLinkText("account")).getText();
		System.out.println(fbtext);
		String title =driver.getTitle();
		System.out.println(title);
	}

}
