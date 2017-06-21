package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class TC_19_search__Department extends Login_faveo_admin {
	@Test
	public void register() throws InterruptedException, IOException
	{Thread.sleep(6000);
		//to click on admin panel
	driver.findElement(By.xpath("//a[.='Admin Panel']")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("(//i[@class='fa fa-sitemap fa-stack-1x'])[1]")).click();//department
	Thread.sleep(4000);
	driver.findElement(By.xpath(".//*[@id='chumper_filter']/label/input")).sendKeys("hr");//department
	Thread.sleep(4000);
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\19.png"));
	

}
}
