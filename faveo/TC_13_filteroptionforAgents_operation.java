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

public class TC_13_filteroptionforAgents_operation extends  Login_faveo_admin{
	@Test
	public void register() throws InterruptedException, IOException
	{ Thread.sleep(5000);
	//to click on admin panel
	driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[1]/a")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//i[@class='fa fa-user fa-stack-1x']")).click();
	Thread.sleep(5000);
	//to click on filter option
	driver.findElement(By.xpath("(//span[@class='caret'])[3]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='department-filter']/li[3]/a")).click();//all dept
	Thread.sleep(5000);
	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\13.png"));



}
}