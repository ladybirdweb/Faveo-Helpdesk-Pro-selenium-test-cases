package faveo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_61_create_permission extends Login_faveo_admin{
	@Test
	public void create() throws InterruptedException{
		
	try{//to click on admin panel
		Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[1]/a")).click();
		Thread.sleep(8000);
		//click on permission
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[1]/div[2]/div/div/div[4]/div/div/a/span/i")).click();
		Thread.sleep(8000); 
	driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-plus']")).click();
	Thread.sleep(8000);
	//to enter value
	driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("normal permission");
	Thread.sleep(8000);
	//to click on chechbox
	driver.findElement(By.xpath("(//input[@type='checkbox'])[position()=1and position()<5] ")).click();
	Thread.sleep(8000);
	//to click on checkbox
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(8000);
	String d=" Alert";
	
	if(d.equalsIgnoreCase(" Alert")){
		driver.findElement(By.xpath(".//*[@id='name']")).sendKeys(Keys.BACK_SPACE);
		Thread.sleep(8000);

		driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("high");
		Thread.sleep(8000);
		//to click on chechbox
		driver.findElement(By.xpath("(//input[@type='checkbox'])[position()=1and position()<5] ")).click();
		Thread.sleep(8000);
		//to click on checkbox
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(8000);

	}
	WebElement confirmation = driver.findElement(By.xpath("	html/body/div[1]/div/section[2]/div/div/div/div[2]/div[1]"));
	if( confirmation.equals("Permission created successfully"))
	{
		log.info("Permission created successfully");
		
	}
	}
	catch(NoSuchElementException e)
	{
	log.info("element is not present to create");
	
	}
	catch(WebDriverException e1)
	{
	 log.info("webdriver Exception"+e1);
	}
	catch(TestNGException e1)
	{
	log.info("testng exception");
	}	}	

	
	
	

}
