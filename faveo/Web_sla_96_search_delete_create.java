package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_sla_96_search_delete_create  extends Login_faveo_admin {
	@Test(priority=1)
	public void search() throws InterruptedException, IOException
	{try{
		Thread.sleep(6000);
		//to click on admin
		
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(6000);		// to click on help topic 
		
		//to click on sla 
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[3]/div[2]/div/div/div[2]/div/div/a/span/i")).click();
		Thread.sleep(10000);		//to click on drop down to check the range
		 //search
		driver.findElement(By.xpath(".//*[@id='chumper_filter']/label/input")).sendKeys("normal");
		Thread.sleep(6000);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\img(96).png"));
		Thread.sleep(6000);	
		}
	catch(Exception e)
	{
		log.info("exception is"+e);
	}
	driver.navigate().refresh();
	
	}
	
	
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		

