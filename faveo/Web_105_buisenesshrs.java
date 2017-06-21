package faveo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_105_buisenesshrs  extends Login_faveo_admin{

	
	@Test
	public void buiseness() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(6000);		// to click on admin
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[3]/div[2]/div/div/div[3]/div/div/a/span/i")).click();
		Thread.sleep(6000);		// to click on buiseness hours
		
		
		
		
	
	}
	
}
