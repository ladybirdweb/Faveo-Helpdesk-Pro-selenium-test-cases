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

public class Web_156and160_createandDElete extends Login_faveo_admin {
	@Test(priority=1)

	public void create() throws InterruptedException, IOException
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
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[1]/div/a")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[2]/div[1]/div[1]/div/input")).sendKeys("REquest1");
		Thread.sleep(10000);
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[2]/div[1]/div[2]/div/input")).sendKeys("request1");
		Thread.sleep(10000);
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[3]/input")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//a[@href='http://jamboreebliss.com/Dyamanna/public/admin'])[1]")).click();
		Thread.sleep(10000);		// to click on admin
		File scrFil3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFil3, new File("c:\\Users\\Dyamanna\\Screenshots\\img(156).png"));

		
		driver.navigate().refresh();
		
		
	
		JavascriptExecutor j1s=(JavascriptExecutor)driver;
		j1s.executeScript("window.scrollBy(0,600)", "");
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[3]/div[2]/div/div/div[7]/div/div/a/span/i")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='chumper']/tbody/tr[6]/td[4]/a[2]")).click();
		
		driver.switchTo().alert().dismiss();
		File scrFil13 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFil13, new File("c:\\Users\\Dyamanna\\Screenshots\\img(160).png"));

		
		}
	catch(Exception e)
	{
		log.info("thi sis"+e);
	}
	
	
	
	

}

}