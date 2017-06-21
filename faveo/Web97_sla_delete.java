package faveo;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web97_sla_delete extends Login_faveo_admin {
	


		@Test
		public void delete()		{
		try{Thread.sleep(6000);
		//to click on admin
		
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(6000);		// to click on help topic 
		
		//to click on sla 
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[3]/div[2]/div/div/div[2]/div/div/a/span/i")).click();
		Thread.sleep(10000);		//to click on drop down to check the range
		 
				Thread.sleep(8000);
				Web_96_delete del=new Web_96_delete (driver);
				del.call();
			Thread.sleep(6000);	
			driver.switchTo().alert().accept();
			Thread.sleep(6000);	

			String delete1 = "SLA plan deleted successfully";
			String actual = driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div/div/div[2]/div[1]")).getText();
						
		if(actual.equalsIgnoreCase(delete1))					{
				log.info("passed");
			}
			File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
			FileUtils.copyFile(scrFile1, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\img(96(1)).png"));
			Thread.sleep(6000);	
		
			driver.navigate().refresh();
			Thread.sleep(10000);	}
		catch(Exception e)		{
			log.info("failed due to "+e);
	}
	}		



}
