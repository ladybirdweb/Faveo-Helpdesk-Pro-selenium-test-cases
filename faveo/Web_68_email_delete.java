package faveo;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_68_email_delete   extends Login_faveo_admin{
	@Test
	public void delete() throws InterruptedException{
	//to click on admin panel
		Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[1]/a")).click();
		Thread.sleep(8000);
		//click on email
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[2]/div[2]/div/div/div[1]/div/div/a/span/i")).click();
		Thread.sleep(8000);
		//click on delete button
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[6]/form/button")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(6000);
		String s="Deleted";
		if(s.equalsIgnoreCase("Deleted"))
		{
			log.info("successfully deleted");
		}

}
}