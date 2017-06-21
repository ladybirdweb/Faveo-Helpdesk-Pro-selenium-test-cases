package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_147to151_ticketTypes_search    extends Login_faveo_admin{
	@Test(priority=1)

	public void delete() throws InterruptedException, IOException
	{Thread.sleep(6000);
	//to click on admin
	try{
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(10000);		// to click on admin
		//click on ticket type
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)", "");
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[3]/div[2]/div/div/div[7]/div/div/a/span/i")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath(".//*[@id='chumper_filter']/label/input")).sendKeys("pr");
		Thread.sleep(10000);
		File scrFil34 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFil34, new File("c:\\Users\\Dyamanna\\Screenshots\\img(151).png"));
		
		driver.navigate().refresh();
		Select s=new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));	
		s.selectByVisibleText("25");
	
		
		File scrFil3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFil3, new File("c:\\Users\\Dyamanna\\Screenshots\\img(147).png"));

		
		Thread.sleep(10000);
		Select s1=new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));	
		s1.selectByVisibleText("10");
	
		
		File scrFil31= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFil31, new File("c:\\Users\\Dyamanna\\Screenshots\\img(148).png"));

	
		
		Thread.sleep(10000);
		Select s12=new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));	
		s12.selectByVisibleText("100");
	
		
		File scrFil312= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFil312, new File("c:\\Users\\Dyamanna\\Screenshots\\img(149).png"));

	
	
	
		Thread.sleep(10000);
		Select s120=new Select(driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select")));	
		s120.selectByVisibleText("50");
	
		
		File scrFil3120= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFil3120, new File("c:\\Users\\Dyamanna\\Screenshots\\img(150).png"));

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	catch(Exception e)
	{
		log.info("this is"+e);
	}

}
}