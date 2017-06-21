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
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import action.Login_faveo_admin;

public class TC_25_Banned_email extends Login_faveo_admin {
	@Test
	public void register() throws InterruptedException, IOException
	{
		SoftAssert a=new SoftAssert();
		Thread.sleep(6000);
		//to click on admin panel
		driver.findElement(By.xpath("//a[.='Admin Panel']")).click();
		Thread.sleep(8000);
		//banned emai
		driver.findElement(By.xpath("//i[@class='fa fa-ban fa-stack-1x']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[2]/div[1]/a")).click();
		Thread.sleep(6000);
		List<WebElement> radio = driver.findElements(By.id("ban"));
		for(int i=0;i<=radio.size()-2;i++)
		{
			radio.get(i).click();}
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("agentyodik10@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[3]/input]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		System.out.println("correct");
		
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		FileUtils.copyFile(scrFile1, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\25(2).png"));		
}
}