package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option= new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(option);
		//to open the URL in browser
		driver.get("http://leaftaps.com/opentaps/");
		//to maximize the browser window
		driver.manage().window().maximize();
		String username = "sriyoo0982134";
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
		driver.findElement(By.id("accountName")).sendKeys(username);
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		WebElement dropdown = driver.findElement(By.name("industryEnumId"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Computer Software");
		WebElement dropdown1 = driver.findElement(By.name("ownershipEnumId"));
		Select select1 = new Select(dropdown1);
		select1.selectByVisibleText("S-Corporation");
		WebElement dropdown2 = driver.findElement(By.name("dataSourceId"));
		Select select2 = new Select(dropdown2);
		select2.selectByValue("LEAD_EMPLOYEE");
		WebElement dropdown3 = driver.findElement(By.name("marketingCampaignId"));
		Select select3 = new Select(dropdown3);
		select3.selectByIndex(6);
		WebElement dropdown4 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select select4 = new Select(dropdown4);
		select4.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		String username2 = driver.findElement(By.xpath("(//span[@class='tabletext']) [3]")).getText();
		System.out.println(username2);
		if(username2.contains(username)) {
			System.out.println("The user name matches");
		}
		else {
			System.out.println("The user name doesn't match");
		}
	
		
	}

}
