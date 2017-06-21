package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web70_create_email extends Login_faveo_admin{
	public WebDriver driver;
	@Test
	public void create() throws InterruptedException, IOException{
	
	//to click on admin panel	
		try{
			 Thread.sleep(5000);
				driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[1]/a")).click();
				Thread.sleep(5000);
				//click on email
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[2]/div[2]/div/div/div[1]/div/div/a/span/i")).click();
		Thread.sleep(8000); 
		//click on create email
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div/div/div[1]/a/span")).click();
		Thread.sleep(8000); 
		//write email
		driver.findElement(By.xpath(".//*[@id='email_address']")).sendKeys("ak7627637@gmail.com");
		Thread.sleep(8000); 
		//pass
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("9158656065");
		Thread.sleep(8000); 
		driver.findElement(By.xpath(".//*[@id='email_name']")).sendKeys("Mallikarjun");
		Thread.sleep(8000); 
		Select s=new Select(driver.findElement(By.xpath(".//*[@id='department']")));
		s.selectByIndex(2);
		Select s1=new Select(driver.findElement(By.xpath(".//*[@id='priority']")));
		Thread.sleep(8000); 
		s1.selectByValue("Normal");


		Select s2=new Select(driver.findElement(By.xpath(".//*[@id='help_topic']")));
		Thread.sleep(8000); 
		s2.selectByValue("Support query");
		//to click on enable
		driver.findElement(By.xpath(".//*[@id='fetching_status']")).click();
		Thread.sleep(8000); 
		
		Select s3 = new Select(driver.findElement(By.xpath(".//*[@id='fetching_protocol']")));
		s3.selectByValue("IMAP");
		Thread.sleep(8000); 
		


		Select s4 = new Select(driver.findElement(By.xpath(".//*[@id='fetching_encryption']")));
		s3.selectByValue("SSL");
		Thread.sleep(8000); 
		
		driver.findElement(By.xpath(".//*[@id='fetching_host']")).sendKeys("imap.gmail.com");
		
		driver.findElement(By.xpath(".//*[@id='fetching_port']")).sendKeys("997");
		Select s5 = new Select(driver.findElement(By.xpath(".//*[@id='imap_authentication']")));
		s5.selectByIndex(0);
		

		driver.findElement(By.xpath(".//*[@id='sending_status']")).click();
		
		Select s6 = new Select(driver.findElement(By.xpath(".//*[@id='service']")));
		s6.selectByValue("SMTP");
		Thread.sleep(8000); 
		

		driver.findElement(By.xpath(".//*[@id='sending_host']")).sendKeys("smtp.gmail.com");
		Thread.sleep(8000); 
		
		driver.findElement(By.xpath(".//*[@id='sending_port']")).sendKeys("487");
		Thread.sleep(8000); 
		
		
		Select s7 = new Select(driver.findElement(By.xpath(".//*[@id='sending_encryption']")));
		s7.selectByValue("SSL");
	
		driver.findElement(By.xpath(".//*[@id='form']/div/div[10]/button")).click();
		Thread.sleep(8000); 
		

		String d=driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div/div/div[2]/div/b")).getText();
		
		Thread.sleep(8000); 
		if(d.equals("Success"))
		{
			log.info("pass kano");
			
		}
		Thread.sleep(8000);
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		FileUtils.copyFile(scrFile1, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\70.png"));	
		}
		catch(NoSuchElementException e)
		{
			log.info("this is Exception"+e);
		}
		catch(NullPointerException e)
		{
			log.info("this is Exception"+e);
		}
	
	}
}


