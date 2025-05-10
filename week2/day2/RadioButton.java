package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//to open the URL in browser
				driver.get("https://www.leafground.com/radio.xhtml");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//to maximize the browser window
				driver.manage().window().maximize();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//label[contains(text(),'Edge')][1]")).click();
				driver.findElement(By.xpath("//label[@for='j_idt87:city2:0']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//label[@for='j_idt87:city2:0']")).click();
				WebElement radio = driver.findElement(By.xpath("//input[@value='Chennai']"));
				if(radio.isSelected()) {
					System.out.println("The radio button is selected");
				}
				else {
					System.out.println("The radio button is not selected");
				}
				
	}

}
