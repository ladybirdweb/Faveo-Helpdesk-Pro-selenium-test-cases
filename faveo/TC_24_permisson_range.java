package faveo;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import action.Login_faveo_admin;

public class TC_24_permisson_range extends  Login_faveo_admin {
	@Test
	public void register() throws InterruptedException, IOException
	{
		SoftAssert a=new SoftAssert();
		Thread.sleep(6000);
		//to click on admin panel
		driver.findElement(By.xpath("//a[.='Admin Panel']")).click();
		Thread.sleep(8000);
	//to click on permission
		driver.findElement(By.xpath("//i[@class='fa fa-key fa-stack-1x']")).click();
		Select s=new Select(driver.findElement(By.xpath("//select[@class='form-control input-xs']")));
		Thread.sleep(8000);
		s.selectByValue("25");
		Thread.sleep(8000);
		 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 Thread.sleep(3000);
			// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\24(1).png"));
		Select s1=new Select(driver.findElement(By.xpath("//select[@class='form-control input-xs']")));
		Thread.sleep(8000);
		s1.selectByValue("10");
		Thread.sleep(8000);
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		FileUtils.copyFile(scrFile1, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\24(2).png"));	
		//to click on permission
		driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-plus']")).click();
		//name text field 
		driver.findElement(By.xpath(".//*[@id='name']")).sendKeys(".//*[@id='DataTables_Table_0']/tbody/tr[5]/td[1]/a");
		Thread.sleep(8000);//for radio button to be active
		driver.findElement(By.xpath("(.//*[@id='group_status'])[1]")).click();
		//to click on checkbox
		List<WebElement> check = driver.findElements(By.xpath("//input[@class='checkbox']"));
		for(int i=0;i<=check.size()-1;i++)
		{check.get(i).click();
		}
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[3]")).click();
		 Thread.sleep(6000);
			driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[3]/input")).click();
			
			driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[2]/div[1]")).getText();
			
	}
}