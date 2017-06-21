package faveo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class TC_9_viewoption_Bannedusers  extends  Login_faveo_admin{
	@Test
	public void register() throws InterruptedException, IOException
	{ Thread.sleep(5000);
	//to click on admin panel
	driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[1]/a")).click();
	Thread.sleep(5000);
	//to click on agents
	driver.findElement(By.xpath("//i[@class='fa fa-user fa-stack-1x']")).click();
	Thread.sleep(5000);
	//to click on view
	 driver.findElement(By.xpath("(//span[@class='caret'])[2]")).click();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//a[.='Banned users']")).click();
	 Thread.sleep(5000);
	 System.out.println("all banned users ");
	 
	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	// Now you can do whatever you need to do with it, for example copy somewhere
	FileUtils.copyFile(scrFile, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\9.png"));


 


}
}