package faveo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class TC_17_recordsperpage extends Login_faveo_admin {
	@Test
	public void select_range() throws IOException, InterruptedException
	{ Thread.sleep(5000);
		//to click on admin panel
		driver.findElement(By.xpath("//a[.='Admin Panel']")).click();
		Thread.sleep(8000);
	//to click on agents
		Thread.sleep(8000);
		driver.findElement(By.xpath("//i[@class='fa fa-user fa-stack-1x']")).click();
		Thread.sleep(5000);
		Select drop4 = new Select(driver.findElement(By.xpath("//select[@class='form-control input-xs']")));
		drop4.selectByIndex(0);
		Thread.sleep(8000);
		 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\17.png"));
		Thread.sleep(8000);
		Select drop5 = new Select(driver.findElement(By.xpath("//select[@class='form-control input-xs']")));
		drop4.selectByIndex(1);
		Thread.sleep(8000);
		File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile2, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\18(10).png"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[.='Next']")).click();
		Thread.sleep(8000);
		 File scrFile3= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile3, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\18(25).png"));	
}
	
	
}
