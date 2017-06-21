package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_134_priority_inactive  extends Login_faveo_admin {	@Test(priority=1)

public void create() throws InterruptedException, IOException
{Thread.sleep(6000);
//to click on admin
try{
	driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
	Thread.sleep(10000);		// to click on admin
	driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[3]/div[2]/div/div/div[6]/div/div/a/span/i")).click();
	Thread.sleep(10000);		// to click on admin
	//click on edit
	driver.findElement(By.xpath(".//*[@id='chumper']/tbody/tr[3]/td[5]/a[1]")).click();
	Thread.sleep(10000);
	//in active
	driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[2]/div/div[2]/div[2]/div/input[1]")).click();
	Thread.sleep(10000);
	//update
	driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[3]/input")).click();
	Thread.sleep(10000);
	//click on agent panel
	driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[1]/li/a")).click();
	Thread.sleep(10000);
	//click on create ticket
	driver.findElement(By.xpath(".//*[@id='side-bar']/li[2]/a")).click();
	Thread.sleep(10000);
	
	

	JavascriptExecutor js=(JavascriptExecutor)driver;
	//scrolll down
	js.executeScript("window.scrollBy(0,500)", "");
	
	driver.findElement(By.xpath(".//*[@id='form']/div/div[7]/div/div[3]/div/div[2]/select")).click();
	Thread.sleep(10000);
	
	
	
	File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
	FileUtils.copyFile(scrFile1, new File("c:\\Users\\Dyamanna\\Screenshots\\img(133).png"));

	
	
	
	
}
catch(Exception e)

{
	log.info("exception"+e);
}
	
} 

}
