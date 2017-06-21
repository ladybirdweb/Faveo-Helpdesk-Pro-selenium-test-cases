package faveo;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_1 {


	public  FirefoxDriver driver;
		@BeforeClass()
		public void browser()
		{

			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver=new FirefoxDriver();

			driver.get("http://www.faveohelpdesk.com/demo/helpdesk/");	
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			

			//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		
		}
		@BeforeMethod()
		public void login() throws InterruptedException
		{
			//to click on login modulo
			driver.findElement(By.xpath(".//*[@id='navbar']/nav/ul[2]/li/a/i")).click();
			//
					//username
					driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[1]/input")).sendKeys("demo_admin");
					
					//password
					driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[1]/form/div[2]/input")).sendKeys("demopass");
					//click on login button
					driver.findElement(By.xpath(".//*[@id='login-form']/div[1]/div[2]/div/button")).click();
					
	Thread.sleep(5000);
		
		}
	
		@Test
		public void admin_panel() throws InterruptedException
		{
			
			driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[1]/a")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[1]/div[2]/div/div/div[1]/div/div/a/span/i")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[1]/div/div[3]/div/a")).click();
			// to register
			Thread.sleep(5000);
			
			driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("dyamanna0143@gmail.com");
			Thread.sleep(5000);
			
			driver.findElement(By.xpath(".//*[@id='user_name']")).sendKeys("dyamanna");
			Thread.sleep(5000);
			
		
			driver.findElement(By.xpath("	.//*[@id='first_name']")).sendKeys("dyamanna");
			Thread.sleep(5000);
			
		
			driver.findElement(By.xpath(".//*[@id='last_name']")).sendKeys("yarihakkal");
			
			Thread.sleep(5000);
		
			driver.findElement(By.xpath("	html/body/div[1]/div/section[2]/form/div/div[2]/div[3]/div[1]/input")).sendKeys("0836");
		
			driver.findElement(By.xpath(".//*[@id='phone_number']")).sendKeys("8722005");
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[2]/div[3]/div[3]/input")).sendKeys("91");
			
			driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[2]/div[3]/div[4]/input")).sendKeys("9035716424");
			Thread.sleep(5000);


			driver.findElement(By.xpath("(.//*[@id='active'])[1]")).click();
			
			driver.findElement(By.xpath("(.//*[@id='role'])[2]")).click();
			Thread.sleep(5000);
			

			 driver.findElement(By.xpath("(//select[@class='form-control select'])[1]")).click();
			 Thread.sleep(5000);
				

//			
//			Select s=new Select(drop);
//			s.selectByVisibleText(arg0);

	
		}



//		@AfterClass
//	public void logout() throws InterruptedException
//		{
//		driver.quit();
//		
//		Thread.sleep(5000);
//	
		
		}











