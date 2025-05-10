package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver=new ChromeDriver();
		//to open the URL in browser
				driver.get("https://leafground.com/checkbox.xhtml");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//to maximize the browser window
				driver.manage().window().maximize();
				Thread.sleep(5);
				//Click Notification Check Box
				driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]")).click();
				WebElement checkbox =driver.findElement(By.xpath("//input[@id='j_idt87:j_idt91_input']"));
				System.out.println(checkbox.isSelected());
				if (checkbox.isSelected()) {
					System.out.println("The notification check box is checked");
				} else {
					System.out.println("The notification check box is not selected");
				}
				driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
				//Click Basic Check Box
				WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='j_idt87:j_idt89_input']"));
				if(checkbox1.isSelected()) {
					System.out.println("The basic check box is selected");
				}
				else {
					System.out.println("The basic check box is not selected");
				}	
				//Click on Choose your favorite language
				driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
				//Click on Tri State
				driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();
				WebElement checkbox2 = driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']"));
				String state = driver.findElement(By.xpath("//p[contains(text(),'State')]")).getText();
				System.out.println("The state is" + state);
				//click on toggle switch
				driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
				Thread.sleep(5000);
				String state2= driver.findElement(By.xpath("//span[contains(text(),'Checked')]")).getText();
				System.out.println("The State is" + state2);
				WebElement checkbox3 = driver.findElement(By.xpath("//input[@id='j_idt87:j_idt102_input']"));
				if(checkbox3.isEnabled()) {
					System.out.println("Check box is enabled");
				}
				{
					System.out.println("Check box is disabled");
				}
				//select multiple options
//				driver.findElement(By.xpath("//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all']")).click();
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("//label[contains(text(),'Paris')][1]")).click();
				driver.findElement(By.xpath("//ul[@data-label = 'Cities']")).click();
		    	driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		    	driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		    	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
				
	}

}
