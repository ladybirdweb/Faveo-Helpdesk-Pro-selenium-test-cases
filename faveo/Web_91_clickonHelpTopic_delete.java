package faveo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_91_clickonHelpTopic_delete extends Login_faveo_admin {
	@Test
	public void disable() throws InterruptedException
	{
		Thread.sleep(6000);
		//to click on admin
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(6000);		// to click on help topic 
		
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[3]/div[2]/div/div/div[1]/div/div/a/span/i")).click();
		Thread.sleep(10000);		// to click on help topic 
		
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[2]/table/tbody/tr[5]/td[6]/form/button")).click();
		Thread.sleep(6000);		// to click on delete topic 
	
		driver.switchTo().alert().accept();
		
		String s="Helptopic deleted successfully ";
		String element = driver.findElement(By.xpath("div[@class='alert alert-success alert-dismissable']")).getText();

	
		if(s.equalsIgnoreCase(element))
		{
			log.info("deleted successfully ");
		}
		
		
			}
} 