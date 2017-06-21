package faveo;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_53_team_delete extends Login_faveo_admin {
	@Test
	public void register() throws InterruptedException, IOException
	{Thread.sleep(8000);
		//to click on admin panel
		driver.findElement(By.xpath("//a[.='Admin Panel']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//i[@class='fa fa-users fa-stack-1x']")).click();//to click on team button
		Thread.sleep(8000);  
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='chumper']/tbody/tr[4]/td[5]/form/button")).click();//to click on delete button
		Alert alert = driver.switchTo().alert();  
		alert.accept();
		//alert.dismiss();
		String msg = driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div/div/div[2]/div[1]")).getText();
	if(msg.equalsIgnoreCase("Teams deleted successfully"))
	{
		System.out.println("succesfully deleted");
	}
}
}
