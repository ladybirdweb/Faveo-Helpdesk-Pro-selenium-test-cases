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

public class Web_128_edit_workflow extends Login_faveo_admin{
	@Test(priority=1)

	public void create() throws InterruptedException, IOException
	{Thread.sleep(6000);
	//to click on admin
	try{
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(10000);		// to click on admin

		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[3]/div[2]/div/div/div[5]/div/div/a/span/i")).click();
		Thread.sleep(10000);		// to click on create workflow

		driver.findElement(By.xpath(".//*[@id='chumper']/tbody/tr[1]/td[8]/a[1]")).click();
		Thread.sleep(10000);	
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div[2]/div/div/ul/li[3]/a")).click();
		Thread.sleep(10000);	
		Select ss=new Select(driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div[1]/div/div[4]/div/select")));
		ss.selectByVisibleText("Emails");
		Thread.sleep(10000);	
		String text = driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div/div/div[2]/div[1]")).getText();
		String up=" Workflow updated successfully";
		
		if(text.equalsIgnoreCase("up"))
		{
			log.info("updated succussfuly");
		}
		
		
	}
	catch(Exception e)
	{
		log.info("exception is+"+e);
	}
	
	

	File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
	FileUtils.copyFile(scrFile1, new File("c:\\Users\\Dyamanna\\Screenshots\\img(128).png"));
//25
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}}
