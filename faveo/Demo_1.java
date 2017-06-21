package faveo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Demo_1 {
	public  WebDriver driver;
	@BeforeClass()
	public void browser()
	{

		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		driver=new FirefoxDriver();

		driver.get("http://www.faveohelpdesk.com/demo/helpdesk/");	
		
//to click on language modulo
		WebElement drop = driver.findElement(By.className("form-control nav navbar-nav navbar-menu sf-js-enabled sf-arrows"));

		
		Select s=new Select(drop);
		s.selectByVisibleText("English");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		

		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	
	}
	@BeforeMethod()
	public void login()
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
				
	}
	@Test
	 
	public void execution() throws InterruptedException
	{
		
	 //to click on language ..
//WebElement el = driver.findElement(By.xpath("(//i[@class='sub-indicator fa fa-angle-down fa-fw text-muted'])[2]"));
		//to handle drop down
	
//	
	//WebElement eng = driver.findElement(By.xpath(".//*[@id='en']"));
	//Actions	act1=new Actions(driver);    
	//act1.moveToElement(el).perform();
	//Select s=new Select(eng);
	//s.selectByVisibleText(arg0);

//act1.moveToElement(eng).perform();
//act1.doubleClick(el).perform();
//act1.doubleClick(el).perform();


		
		//click on notification and assign work to agents
		Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[3]/a/i")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath(".//*[@id='seen0']/a/div/div[2]/div/span/span")).click();
//		//to click on assign modulo
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[1]/div[1]/div/button[2]")).click();
//		// to  click on assign modulo drop down menu 
//		Thread.sleep(4000);
//		driver.findElement(By.xpath(".//*[@id='asssign']")).click();
//		
//		Thread.sleep(4000);
	}
//		@AfterClass
//		public void logout()
//		{
//		driver.quit();
//		}

	

}
