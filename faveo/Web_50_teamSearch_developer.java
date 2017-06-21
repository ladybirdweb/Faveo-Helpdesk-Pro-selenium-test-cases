package faveo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_50_teamSearch_developer extends  Login_faveo_admin {
	@Test
	public void register() throws InterruptedException, IOException
	{Thread.sleep(6000);
		//to click on admin panel
		driver.findElement(By.xpath("//a[.='Admin Panel']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//i[@class='fa fa-users fa-stack-1x']")).click();//to click on team button
		Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='chumper_filter']/label/input")).sendKeys("developer");//to click osearch  button
		Thread.sleep(8000);
		
}
}
