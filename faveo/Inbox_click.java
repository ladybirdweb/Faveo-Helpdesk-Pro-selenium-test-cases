package faveo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Inbox_click extends  Login_faveo_admin
{

public  Inbox_click()
{
	super();
}
 
@Test
public void user()
{
	//to click on inbox
	driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[1]/div[1]/a/div/span")).click();
	
}








//	public void admin_panel() throws InterruptedException
//	{
//		
//		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[1]/a")).click();
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[1]/div[2]/div/div/div[1]/div/div/a/span/i")).click();
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[1]/div/div[3]/div/a")).click();
//		// to register
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("dyamanna0143@gmail.com");
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath(".//*[@id='user_name']")).sendKeys("dyamanna");
//		Thread.sleep(5000);
//		
//	
//		driver.findElement(By.xpath("	.//*[@id='first_name']")).sendKeys("dyamanna");
//		Thread.sleep(5000);
//		
//	
//		driver.findElement(By.xpath(".//*[@id='last_name']")).sendKeys("yarihakkal");
//		
//		Thread.sleep(5000);
//	
//		driver.findElement(By.xpath("	html/body/div[1]/div/section[2]/form/div/div[2]/div[3]/div[1]/input")).sendKeys("0836");
//	
//		driver.findElement(By.xpath(".//*[@id='phone_number']")).sendKeys("8722005");
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[2]/div[3]/div[3]/input")).sendKeys("91");
//		
//		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[2]/div[3]/div[4]/input")).sendKeys("9035716424");
//		Thread.sleep(5000);
//
//
//		driver.findElement(By.xpath("(.//*[@id='active'])[1]")).click();
//		
//		driver.findElement(By.xpath("(.//*[@id='role'])[2]")).click();
//		Thread.sleep(5000);
//		
//
//		 driver.findElement(By.xpath("(//select[@class='form-control select'])[1]")).click();
//		 Thread.sleep(5000);
//			
//
//	
//	}
}
