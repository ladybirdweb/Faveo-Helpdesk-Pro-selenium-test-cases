package faveo;

import generics.Excel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_188_create_label extends Login_faveo_admin {
	public static 	final String INPUT_PATH="./data/input.xlsx";
	
	
	@Test(priority=1)

public void create() throws InterruptedException, IOException
{Thread.sleep(6000);
//to click on admin
try{
	driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
	Thread.sleep(10000);		// to click on admin
	//click on ticket type
	
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("window.scrollBy(0,800)", "");
	driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[4]/div[2]/div/div/div[5]/div/div/a/span")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[1]/a/span")).click();
	Thread.sleep(6000);		
			// to click on admin
	//int rc = Excel.getRowCount(INPUT_PATH, "label");
	//for(int i=1;i<=rc;i++){

		driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[1]/a/span")).click();
		Thread.sleep(6000);		// to click on +
		
		
		//String tit = Excel.getCellValue(INPUT_PATH, "label", i, 0);
		//String col= Excel.getCellValue(INPUT_PATH, "label", i, 1);
		//String num= Excel.getCellValue(INPUT_PATH, "label", i, 2);
		
	
	
	driver.findElement(By.xpath(".//*[@id='title']")).sendKeys("asdfghjkd");
	Thread.sleep(6000);		
	
	driver.findElement(By.xpath(".//*[@id='color']")).sendKeys("#00FF00");
	Thread.sleep(6000);		
	//driver.findElement(By.xpath(".//*[@id='order']")).sendKeys(num);//colour
	Thread.sleep(6000);	
	driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[2]/div[3]/input")).click();//save
	
	Thread.sleep(10000);
	driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div[1]/a/span")).click();
	Thread.sleep(6000);		
	
	
	

	//}

	














}
catch(Exception e)
{
	log.info("this is"+e);
}
	

}
}