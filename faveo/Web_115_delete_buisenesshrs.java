package faveo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_115_delete_buisenesshrs extends Login_faveo_admin{
	@Test(priority=1)
	public void create() throws InterruptedException, IOException
	{Thread.sleep(6000);
	//to click on admin
	try{
	driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
	Thread.sleep(6000);		// to click on admin
	driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[3]/div[2]/div/div/div[3]/div/div/a/span/i")).click();
	Thread.sleep(6000);
	
	driver.findElement(By.xpath(".//*[@id='chumper']/tbody/tr[4]/td[4]/a[2]")).click();
	driver.switchTo().alert().accept();
	Thread.sleep(6000);
	log.info("deleted");
	
	
	}
	
	catch(Exception e){
		log.info("exception "+e );
}
}}