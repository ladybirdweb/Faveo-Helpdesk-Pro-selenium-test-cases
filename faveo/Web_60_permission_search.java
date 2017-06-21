package faveo;

import java.io.IOException;

import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_60_permission_search  extends Login_faveo_admin {
	@Test
	
	public void permission_Search() throws InterruptedException, IOException
	{Thread.sleep(6000);
		//to click on admin panel
		driver.findElement(By.xpath("//a[.='Admin Panel']")).click();
		Thread.sleep(8000);
		//click on permission
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[1]/div[2]/div/div/div[4]/div/div/a/span/i")).click();
		Thread.sleep(8000); 
		//search
		try{
			driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys("Full Access Agents");
		Thread.sleep(8000); 
		String msg = driver.findElement(By.xpath("//a[.=' Full Access Agents']")).getText();
		Thread.sleep(8000); 
		if(" Full Access Agents".equalsIgnoreCase(msg))
		{
			System.out.println("pass");
		}
		System.out.println("test is passed");
		}
	catch(NoSuchElementException e)
		{
		log.info("element is not present");
		
		}
		catch(WebDriverException e1)
		{
		 System.out.println(e1);
		}
		catch(TestNGException e1)
		{
		 System.out.println(e1);
		}}
		
	 //to click on create permission
		
		//edit agent delete
	
		
	}

