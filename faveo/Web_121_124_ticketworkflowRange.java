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

public class Web_121_124_ticketworkflowRange extends Login_faveo_admin{
	@Test(priority=1)

	public void create() throws InterruptedException, IOException
	{Thread.sleep(6000);
	//to click on admin
	try{
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(10000);		// to click on admin

		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[3]/div[2]/div/div/div[5]/div/div/a/span/i")).click();
		Thread.sleep(10000);		// to click on create workflow

	//for display 10
		Select s=new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
		
		s.selectByVisibleText("10");
		Thread.sleep(10000);	

		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile1, new File("c:\\Users\\Dyamanna\\Screenshots\\img(121).png"));
//25
		
		
			Select s1=new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
			
			s1.selectByVisibleText("25");
			Thread.sleep(10000);	

			File scrFile11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
			FileUtils.copyFile(scrFile11, new File("c:\\Users\\Dyamanna\\Screenshots\\img(122).png"));
	//25
			

			//for display 50
				Select s2=new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
				
					s2.selectByVisibleText("50");
				Thread.sleep(10000);	

					File scrFile12 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
					FileUtils.copyFile(scrFile12, new File("c:\\Users\\Dyamanna\\Screenshots\\img(123).png"));

		//100
					Select s3=new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));
					
					s3.selectByVisibleText("100");
					Thread.sleep(10000);	

					File scrFile13 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
					FileUtils.copyFile(scrFile13, new File("c:\\Users\\Dyamanna\\Screenshots\\img(124).png"));
		
					
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	catch(Exception e)
	{
		log.info("exception is+"+e);
	}
	}

}
