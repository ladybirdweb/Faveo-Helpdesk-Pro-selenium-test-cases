package faveo;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_buisenesshours_create   extends Login_faveo_admin{

	@Test(priority=1)
		public void create() throws InterruptedException, IOException
		{Thread.sleep(6000);
		//to click on admin
		
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(6000);		// to click on admin
		
		
		
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[3]/div[2]/div/div/div[3]/div/div/a/span/i")).click();
		Thread.sleep(6000);		// to click on buiseness hours
		
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[1]/a")).click();
		Thread.sleep(6000);		// to click on create
		//time zone
		 driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("buiseness1");
		Thread.sleep(6000);		// to click on create
		
		
		 //WebElement frame = driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[2]/div[2]/div[2]/div[2]/iframe"));
			Thread.sleep(6000);	
			
			driver.switchTo().frame(0);
			Thread.sleep(6000);	
			
			
			driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[2]/div[2]/div[2]/div[2]/iframe")).sendKeys("edhgxqg");
			
			Thread.sleep(6000);	
			driver.switchTo().parentFrame();
	//time zone
		
		  Select s = new  Select(driver.findElement(By.xpath("//select[@class='form-control select']")));
		  Thread.sleep(6000);	
		  s.selectByVisibleText("Asia/Kolkata");
		  Thread.sleep(6000);	
		  driver.findElement(By.xpath(" .//*[@id='form_submit']")).click();
		  Thread.sleep(6000);	
		 
}}
