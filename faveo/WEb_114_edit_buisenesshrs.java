package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class WEb_114_edit_buisenesshrs extends Login_faveo_admin{
	@Test(priority=1)
	public void create() throws InterruptedException, IOException
	{Thread.sleep(6000);
	//to click on admin
	try{
	driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
	Thread.sleep(6000);		// to click on admin
	
	
	
	driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[3]/div[2]/div/div/div[3]/div/div/a/span/i")).click();
	Thread.sleep(6000);		// to click on buiseness hours
	
	//edit new

	driver.findElement(By.xpath(".//*[@id='chumper']/tbody/tr[3]/td[4]/a[1]")).click();
	Thread.sleep(10000);		
	WebElement drop = driver.findElement(By.xpath("(.//*[@id='month'])[1]"));
	Select s=new Select(drop);
	s.selectByVisibleText("August");
	
	Thread.sleep(10000);		
	WebElement drop1 = driver.findElement(By.xpath(".//*[@id='day']"));
	Select s1=new Select(drop1);
	s1.selectByValue("15");
	
	driver.findElement(By.xpath("(.//*[@id='holyday_name'])[1]")).sendKeys("Independence day");
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='example2']/thead/tr/td[3]/a[1]")).click();
	Thread.sleep(5000);		
	driver.findElement(By.xpath(".//*[@id='form_submit']")).click();
	
//	if(msgs.equalsIgnoreCase("Business Hours Edit Successfully "))
//	
//	{
//		log.info("successfully edited");
//	}
	Thread.sleep(5000);	
File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
FileUtils.copyFile(scrFile1, new File("c:\\Users\\Dyamanna\\Screenshots\\img(114).png"));
	}
	catch(Exception e)
	{
		log.info("exception"+e);
	}


	
	
	
	
}
}