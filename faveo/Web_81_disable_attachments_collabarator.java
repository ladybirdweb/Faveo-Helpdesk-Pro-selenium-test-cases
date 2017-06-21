package faveo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_81_disable_attachments_collabarator extends Login_faveo_admin{
	@Test
	public void disable() throws InterruptedException
	{
		Thread.sleep(6000);
		//to click on admin
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(6000);		// to click on email setting
		driver.findElement(By.xpath("	html/body/div[1]/div/section[2]/div[2]/div[2]/div/div/div[4]/div/div/a/span/i")).click();
		Thread.sleep(6000);	//to diasble collabarators	 
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[2]/div[5]/div/div/input")).click();
		Thread.sleep(6000);	//to diasble collabarators	
		Thread.sleep(6000);		
		//to click on submit
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[3]/input")).click();
		Thread.sleep(6000);		
		//catch the msg
		 String msg = driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[2]/div[1]")).getText();
		Thread.sleep(6000);	
		if(msg.equals("Email updated successfully "))
		{
			log.info("this block is pass");}
			else
				log.info("fail");
		//to click on agents
				driver.findElement(By.xpath("//.//*[@id='navbar-collapse']/ul[1]/li/a")).click();
				Thread.sleep(8000);//to click on notification
				driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[3]/a/span")).click();
				Thread.sleep(8000);//to click on square menu first
				driver.findElement(By.xpath(".//*[@id='seen0']")).click();

}
}