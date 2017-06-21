package faveo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import action.Login_client;
import action.Login_faveo_admin;
import action.Open_browser;

public class Create_agent extends  Login_faveo_admin  {

	@Test
	public void register() throws InterruptedException
	{	Thread.sleep(10000);
		//to click on admin panel
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[1]/a")).click();
		Thread.sleep(5000);
		//to click on agents
		driver.findElement(By.xpath("//i[@class='fa fa-user fa-stack-1x']")).click();
		Thread.sleep(5000);
		//to click on create agent
		driver.findElement(By.xpath("//a[.='Create agent']")).click();
		Thread.sleep(5000);
		//email
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("dyamanna0143@gmail.com");
		//username
		driver.findElement(By.xpath(".//*[@id='user_name']")).sendKeys("dyaman");
		Thread.sleep(5000);
		//first name
		driver.findElement(By.xpath(".//*[@id='first_name']")).sendKeys("Dyamanfefe");
		//last name
		driver.findElement(By.xpath(".//*[@id='last_name']")).sendKeys("yarihakkal");
		Thread.sleep(5000);
		//Ext
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[2]/div[3]/div[1]/input")).sendKeys("0836");
		//phone num
		driver.findElement(By.xpath(".//*[@id='phone_number']")).sendKeys("277277");
		Thread.sleep(3000);
		//for contry
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[2]/div[3]/div[3]/input")).sendKeys("91");
		Thread.sleep(3000);
		//mobile num
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[2]/div[3]/div[4]/input")).sendKeys("9035716424");
		Thread.sleep(3000);
		//for radio button active
		//driver.findElement(By.xpath("(.//*[@id='active'])[1]")).click();
		//Thread.sleep(3000);
		//agent
		driver.findElement(By.xpath("(.//*[@id='role'])[2]")).click();
		//permission
		Thread.sleep(3000);
		WebElement drop = driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[2]/div[6]/div[1]/select"));
		  Thread.sleep(3000);
		//ot select edit
		  Select s=new Select(drop);
		  s.selectByIndex(1);	  
		//select dept//
			driver.findElement(By.xpath("//input[@type='search']")).sendKeys("co");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//li[.='computer']")).click();
			//time zone
			WebElement drop1 = driver.findElement(By.xpath("(//select[@class='form-control select'])[2]"));
			Thread.sleep(3000);
			Select s2=new Select(drop1);
			s2.selectByVisibleText("Asia/Kolkata");
			//level one
			driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[2]/div[7]/div[1]/input")).click();
			Thread.sleep(3000);
			//to click on send email notification
		 	driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[2]/div[9]/input")).click();
				Thread.sleep(3000);
			//to click on submit
			driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[3]/input")).click();
			Thread.sleep(4000);
	}
	

}
