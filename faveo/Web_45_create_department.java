package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_45_create_department extends Login_faveo_admin 
{
	@Test
	public void register() throws InterruptedException, IOException
	{Thread.sleep(6000);
		//to click on admin panel
	driver.findElement(By.xpath("//a[.='Admin Panel']")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("(//i[@class='fa fa-sitemap fa-stack-1x'])[1]")).click();//department
	Thread.sleep(4000);
	driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[1]/a/span")).click();//department
	Thread.sleep(4000);
	driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("Mechanical");//department
	Thread.sleep(4000);
	
	Select s=new Select(driver.findElement(By.xpath(".//*[@id='manager']")));//department
	Thread.sleep(4000);
	s.selectByVisibleText("Dyamanna yarihakkal");
	
	driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[5]/input")).click();//department
	Thread.sleep(4000);
	
	
	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\45.png"));

	
	
	
	
	
	
	
	
	
	
	
	}

}
