package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import action.Login_faveo_admin;

public class Web_101_create_sla extends Login_faveo_admin{
	
	@Test
	public void create() throws InterruptedException, IOException{
		SoftAssert a=new SoftAssert();
		Thread.sleep(6000);
		//to click on admin
		try{
		driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
		Thread.sleep(6000);		
		
	//to click on agent panel
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[1]/li/a	")).click();
		Thread.sleep(6000);		
		//click on users
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[1]/li[2]/a")).click();
		Thread.sleep(10000);		
		
		//to click on org
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//a[.='Create organization']")).click();
		Thread.sleep(6000);
		
		
		
		driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("sony new ");
		Thread.sleep(6000);
		
		

		driver.findElement(By.xpath(".//*[@id='website']")).sendKeys("http://www.sonynew.com");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@class='form-group btn btn-primary']")).click();
		Thread.sleep(12000);
		
		
		
	String msg = driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[2]/div[1]")).getText();
		
		String exp=" Organization created successfully";
		if(msg.equalsIgnoreCase(exp))
		{
			log.info("successfully created");
		}
		
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[1]/a	")).click();
		Thread.sleep(12000);
		//to click on sla 
				driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[3]/div[2]/div/div/div[2]/div/div/a/span/i")).click();
				Thread.sleep(10000);		
				
		//create sla
				driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div/div/div[1]/a")).click();
				Thread.sleep(10000);		
				
				
				driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("emergency5");
				Thread.sleep(10000);	
				
				
				WebElement drop = driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[4]/table/tbody/tr[2]/td[1]/select"));
				Thread.sleep(10000);
				Select s=new Select(drop);
				s.selectByVisibleText("Normal");
				//to enter time in hours
				

				driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[4]/table/tbody/tr[2]/td[2]/div[1]/input")).sendKeys("1");
				Thread.sleep(2000);	

				WebElement sel = driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[4]/table/tbody/tr[2]/td[2]/div[2]/select"));
				Thread.sleep(6000);	
				
				Select se=new Select(sel);
				se.selectByVisibleText("Hrs");
				

				driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[4]/table/tbody/tr[2]/td[3]/div[1]/input")).sendKeys("1");
				Thread.sleep(2000);	

				
				WebElement ssss = driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[4]/table/tbody/tr[2]/td[3]/div[2]/select"));
				Thread.sleep(6000);	
				
				
				Select sele=new Select(ssss);
				sele.selectByVisibleText("Hrs");
				
				driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[6]/div[3]/input")).click();
				Thread.sleep(10000);	
				a.assertAll();

				String dsuu=" Success! SLA plan created successfully";
				String dggg = driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div/div/div[2]/div[1]")).getText();
				if(dsuu.equalsIgnoreCase(dggg))
				{
					log.info("created  succusfully");
				}
				File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
				FileUtils.copyFile(scrFile1, new File("c:\\Users\\Dyamanna\\Screenshots\\img(101).png"));}
		catch(Exception e)
		{
			log.info(e);
		}

				
}}

