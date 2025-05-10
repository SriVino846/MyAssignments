package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Sriyoo");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sri");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("yoo");
		
		WebElement dd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(dd);
		select.selectByIndex(4);
		
		WebElement dd1 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select select1 = new Select(dd1);
		select1.selectByValue("IND_HEALTH_CARE");
		
		WebElement dd2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select select2 = new Select(dd2);
		select2.selectByVisibleText("S-Corporation");
		
		driver.findElement(By.name("submitButton")).click();
		String title1= driver.getTitle();
		System.out.println(title1);
		
		if(title1.contains("opentaps"))
		{
			System.out.println("Right page opened");
		}
		else
		{
			System.out.println("Wrong page opened");
		}
		driver.quit();
		
		
		
		
		
	}

}
