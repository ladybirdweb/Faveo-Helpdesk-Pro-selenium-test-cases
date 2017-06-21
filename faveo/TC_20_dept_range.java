package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class TC_20_dept_range extends Login_faveo_admin {
	@Test
	public void register() throws InterruptedException, IOException
	{Thread.sleep(6000);
		//to click on admin panel
	driver.findElement(By.xpath("//a[.='Admin Panel']")).click();
	Thread.sleep(8000);
driver.findElement(By.xpath("(//i[@class='fa fa-sitemap fa-stack-1x'])[1]")).click();//department
	Thread.sleep(4000); 
	WebElement drop = driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select"));//department search
	Select s=new Select(drop);
	s.selectByIndex(0);
		Thread.sleep(4000);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\20(10).png"));
		Thread.sleep(8000);
	WebElement drop1 = driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select"));//department search
	Select s1=new Select(drop1);
		s1.selectByValue("25");
		Thread.sleep(4000);
		File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\20(25).png"));
		Thread.sleep(8000);
	}
}