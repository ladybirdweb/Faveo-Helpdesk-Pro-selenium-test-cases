package faveo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class TC_18_search_agents extends  Login_faveo_admin {
	@Test
	public void register() throws InterruptedException, IOException
	{ Thread.sleep(5000);
	//to click on admin panel
	driver.findElement(By.xpath("//a[.='Admin Panel']")).click();
	Thread.sleep(8000);
//to click on agents
	Thread.sleep(8000);
	driver.findElement(By.xpath("//i[@class='fa fa-user fa-stack-1x']")).click();
	Thread.sleep(6000);
   driver.findElement(By.id(".//*[@id='search-text']")).sendKeys("sqens");
   driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	Thread.sleep(9000);
	driver.findElement(By.xpath("//span[@class='fa fa-search form-control-feedback']")).click();
	Thread.sleep(7000);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("scroll(0, 250);");
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(scrFile, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\18.png"));
		}
}
