package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_102_createsla extends Login_faveo_admin{

	@Test(priority=1)
		public void create() throws InterruptedException, IOException
		{Thread.sleep(6000);
		//to click on admin
		
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(6000);		// to click on help topic 
		
		//to click on sla 
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[3]/div[2]/div/div/div[2]/div/div/a/span/i")).click();
		Thread.sleep(10000);		//to click on drop down to check the range
		 
			try{
		 Web_96_sla_create_pom po=new  Web_96_sla_create_pom(driver);
		 Thread.sleep(7000);
		 po.call("normal164");
			File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
			FileUtils.copyFile(scrFile2, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\img(96(2)).png"));
			Thread.sleep(6000);	
			 String msg4 = "Success! SLA plan created successfully"; 
			String actual4 = driver.findElement(By.xpath(" html/body/div[1]/div/section[2]/div/div/div/div[2]/div[1]")).getText();
			 Thread.sleep(6000);	
		if(msg4.equalsIgnoreCase(actual4))
			
		{
			
			log.info("created succussfully");
		}
			
		}
		
		catch(Exception e)
		{
			log.info("failed due to"+e);
		}

}}
