package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_95_SLA_range_10   extends Login_faveo_admin {
	@Test
	public void disable() throws InterruptedException, IOException
	{
		Thread.sleep(6000);
		//to click on admin
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(6000);		// to click on help topic 
		
		//to click on sla 
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[3]/div[2]/div/div/div[2]/div/div/a/span/i")).click();
		Thread.sleep(6000);		//to click on drop down to check the range
		
		Select s= new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
		Thread.sleep(6000);		// to click on help topic 
		s.selectByVisibleText("10");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\img(95).png"));

		Thread.sleep(10000);
		
		
		Select s1= new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
		s1.selectByVisibleText("25");
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile1, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\img(95.1).png"));

		Thread.sleep(10000);
		
		

		Select s2= new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
	
		s2.selectByVisibleText("50");
		File scrFile12= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile12, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\img(95.2).png"));

		Thread.sleep(10000);
		
		
		

		Select s3= new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
		s3.selectByVisibleText("100");
		File scrFile13 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile13, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\img(95.3).png"));

		Thread.sleep(10000);
		
		
		
		
		
		
		
}
}