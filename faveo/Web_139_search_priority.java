package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_139_search_priority  extends Login_faveo_admin{
	@Test(priority=1)

	public void create() throws InterruptedException, IOException
	{Thread.sleep(6000);
	//to click on admin
	try{
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(10000);		// to click on admin
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[3]/div[2]/div/div/div[6]/div/div/a/span/i")).click();
		Thread.sleep(10000);
		//click on search
		driver.findElement(By.xpath(".//*[@id='chumper_filter']/label/input")).sendKeys("low");
		Thread.sleep(10000);
		File scrFil3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFil3, new File("c:\\Users\\Dyamanna\\Screenshots\\img(139).png"));

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
		
catch(Exception e)
{
	log.info("exception"+e);
}
}
}