package faveo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import action.Login_faveo_admin;

public class Department_index2 extends Login_faveo_admin {
	public Department_index2  ()
	 {
		super();
	 }

	@Test
	public void call() throws InterruptedException, IOException
	{
		Thread.sleep(5000);
		//to click on admin panel
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[1]/a")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[1]/div[2]/div/div/div[2]/div/div/a/span/i")).click();
		Thread.sleep(5000);
		//tp click on department and second option
		 WebElement drop = driver.findElement(By.xpath(".//*[@id='chumper_length']/label/select"));
		Thread.sleep(5000);
		Select s = new Select(drop);
		s.selectByIndex(2);
		

}
}