package faveo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_56_57_permission_range extends  Login_faveo_admin {
	@Test
	public void register() throws InterruptedException, IOException
	{Thread.sleep(6000);
		//to click on admin panel
		driver.findElement(By.xpath("//a[.='Admin Panel']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//i[@class='fa fa-key fa-stack-1x']")).click();
		Thread.sleep(8000);
		Select s=new Select(driver.findElement(By.xpath("//select[@class='form-control input-xs']")));
		Thread.sleep(8000);
		s.selectByValue("10");
		Thread.sleep(8000);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\23.png"));
		//for 25 ranges display
		Select s1=new Select(driver.findElement(By.xpath("//select[@class='form-control input-xs']")));
		Thread.sleep(8000);
		s1.selectByValue("25");
		Thread.sleep(8000);
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		FileUtils.copyFile(scrFile1, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\23(25).png"));		
}
}