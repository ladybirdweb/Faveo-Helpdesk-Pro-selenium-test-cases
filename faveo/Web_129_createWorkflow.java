package faveo;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_129_createWorkflow extends Login_faveo_admin {
	
	@Test(priority=1)

	public void create() throws InterruptedException, IOException
	{Thread.sleep(6000);
	//to click on admin
	try{
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(10000);		// to click on admin

		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[3]/div[2]/div/div/div[5]/div/div/a/span/i")).click();
		Thread.sleep(10000);		// to click on create workflow

		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div/div/div[1]/a/span")).click();
		Thread.sleep(10000);		// to click on+


		driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("important");
		Thread.sleep(10000);		// to click enter text field

		List<WebElement> radio = driver.findElements(By.xpath(".//*[@id='inputEmail2']"));
		
//		for(int i=0;i<=radio.size();i++)
//		{
//			radio.get(i).click();
//			 break;
//		}
//		
		
		 driver.findElement(By.xpath(".//*[@id='inputEmail2']")).click();
		 
		 
		driver.findElement(By.xpath("(.//*[@id='execution_order'])[1]")).sendKeys("2");
		Thread.sleep(4000);		// to click enter text field

		Select sss=new Select(driver.findElement(By.xpath("(.//*[@id='execution_order'])[2]")));
		sss.selectByVisibleText("Any");
		Thread.sleep(4000);	
		
		
		driver.findElement(By.xpath(".//*[@id='form']/div[2]/div/div/ul/li[1]/a")).click();
		Thread.sleep(4000);	
		
		Select ss=new Select(driver.findElement(By.xpath(".//*[@id='firstdata']/td[1]/select")));
		ss.selectByVisibleText("Email");
		
		Thread.sleep(10000);	
		
		Select sel=new Select(driver.findElement(By.xpath(".//*[@id='firstdata']/td[2]/select")));
		sel.selectByVisibleText("Equal to");
		
		
		Thread.sleep(10000);	
		
		driver.findElement(By.xpath(".//*[@id='firstdata']/td[3]/input")).sendKeys("dyamanna.yarihakkal@ladybirdweb.com");
		
		
		Thread.sleep(10000);	
		
		
		
		driver.findElement(By.xpath(".//*[@id='form']/div[2]/div/div/ul/li[2]/a")).click();
		
		
		Thread.sleep(10000);	
	Select sq=new Select	(driver.findElement(By.xpath(".//*[@id='selected0']")));
	sq.selectByVisibleText("Assign Agent");
		

	Thread.sleep(10000);	
	

	driver.findElement(By.xpath(".//*[@id='form']/div[2]/div/div/div[2]/input")).click();
	
		
		
}
catch(Exception e)
{
	log.info("exception"+e);
}

}}