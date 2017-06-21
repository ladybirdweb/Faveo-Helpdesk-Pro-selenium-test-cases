package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import action.Login_faveo_admin;

public class TS_21_dept_creation extends  Login_faveo_admin{
	@Test
	public void register() throws InterruptedException, IOException
	{Thread.sleep(6000);
		//to click on admin panel
	driver.findElement(By.xpath("//a[.='Admin Panel']")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("(//i[@class='fa fa-sitemap fa-stack-1x'])[1]")).click();//department
	Thread.sleep(4000);
	driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[2]/div[1]/a")).click();//create department
	driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("quality");//create department name
	Thread.sleep(4000);
	driver.findElement(By.xpath("(.//*[@id='type'])[1]")).click();//public department
	WebElement drop = driver.findElement(By.xpath("//*[@id='manager']"));
	Select s=new Select(drop);
	s.selectByVisibleText("dyama yariahakkal");
	Thread.sleep(4000);
	driver.findElement(By.xpath("html/body")).sendKeys("hello...hmm");
	driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[4]/div[4]/input")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@class='form-group btn btn-primary']")).click();
	Thread.sleep(10000);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("scroll(0, 250);");
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\21.png"));
	
	
	
}
}