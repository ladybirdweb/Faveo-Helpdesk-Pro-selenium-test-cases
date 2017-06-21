package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import action.Login_faveo_admin;

public class TS_26_templete_added extends  Login_faveo_admin {
	@Test
	public void register() throws InterruptedException, IOException
	{
		SoftAssert a=new SoftAssert();
		Thread.sleep(6000);
		//to click on admin panel
		driver.findElement(By.xpath("//a[.='Admin Panel']")).click();
		Thread.sleep(8000);
		//click on templete
		driver.findElement(By.xpath("//i[@class='fa fa-mail-forward fa-stack-1x']")).click();
		Thread.sleep(8000);
		//to click on + 
		driver.findElement(By.xpath(".//*[@id='2create']")).click();
		Thread.sleep(8000);
		//enter techical there
		driver.findElement(By.xpath(".//*[@id='create']/div/div/form/div[2]/div/input")).sendKeys("smiley");
		Thread.sleep(8000);
		//to create set
		driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[3]")).click();
		Thread.sleep(8000);
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		FileUtils.copyFile(scrFile1, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\26.png"));	
	
}
}