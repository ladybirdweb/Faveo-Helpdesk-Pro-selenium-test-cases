package faveo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_62_permission_delete  extends Login_faveo_admin{
	@Test
	public void delete() throws InterruptedException{
	try{//to click on admin panel
		Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[1]/a")).click();
		Thread.sleep(8000);
		//click on permission
		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[1]/div[2]/div/div/div[4]/div/div/a/span/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[6]/td[3]/form/button")).click();
	Thread.sleep(8000);
	Alert alert = driver.switchTo().alert();
	alert.accept();
	//alert.dismiss();
	String msg = driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div/div/div[2]/div[1]")).getText();	
	
	if(msg.equalsIgnoreCase("Permission deleted successfully"))
			{
		log.info("Permission deleted successfully");
			}
	}
	catch(NoSuchElementException e)
		{
		log.info("element is not present");
		
		}
		catch(WebDriverException e1)
		{
		 log.info("webdriver Exception"+e1);
		}
		catch(TestNGException e1)
		{
		log.info("testng exception");
		}	
	}
			
}	
				
	
	
	