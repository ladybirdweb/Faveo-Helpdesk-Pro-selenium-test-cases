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

public class Web_135to138_range_priority extends Login_faveo_admin
{

	
	
	@Test(priority=1)

public void create() throws InterruptedException, IOException
{Thread.sleep(6000);
//to click on admin
try{
	driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
	Thread.sleep(10000);		// to click on admin
	driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[3]/div[2]/div/div/div[6]/div/div/a/span/i")).click();
	Thread.sleep(10000);
	Select s=new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));	
	s.selectByVisibleText("25");
	Thread.sleep(10000);

	File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
	FileUtils.copyFile(scrFile1, new File("c:\\Users\\Dyamanna\\Screenshots\\img(135).png"));

	
	
	
	Select s1=new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));	
	s1.selectByVisibleText("10");
	Thread.sleep(10000);
	

	File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
	FileUtils.copyFile(scrFile2, new File("c:\\Users\\Dyamanna\\Screenshots\\img(136).png"));

	
	
	
	Select s2=new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));	
	s2.selectByVisibleText("50");
	Thread.sleep(10000);

	File scrFil3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
	FileUtils.copyFile(scrFil3, new File("c:\\Users\\Dyamanna\\Screenshots\\img(137).png"));

	
	
	
	
	Select s3=new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));	
	s3.selectByVisibleText("100");
	Thread.sleep(10000);
	
	

	File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
	FileUtils.copyFile(scrFile3, new File("c:\\Users\\Dyamanna\\Screenshots\\img(138).png"));

	
	
	
	
	
}
catch(Exception e)
{
	log.info("this is"+e);
}

}}