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

public class Web_16_Adminpanel_all_attributes  extends  Login_faveo_admin{
	@Test
	public void register() throws InterruptedException, IOException
	{ 
		Thread.sleep(8000);
	//to click on admin panel
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[1]/a")).click();
		Thread.sleep(5000);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("scroll(0,750); ");
	Thread.sleep(5000);
//	JavascriptExecutor js1=(JavascriptExecutor) driver;
//	js.executeScript("scroll(0,250); ");
//	Thread.sleep(5000);
//	JavascriptExecutor js2=(JavascriptExecutor) driver;
//	js.executeScript("scroll(0,250); ");
//	Thread.sleep(5000);
File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scr,new File("C:\\Users\\yari\\git\\Laxmi\\Screenshots\\web9.png"));
	
	
	
	
	
	
	
	
	
	
	
	
}
}