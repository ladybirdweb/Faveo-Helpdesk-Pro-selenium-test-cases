package faveo;

import generics.Excel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_163_create_ticket extends Login_faveo_admin {
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
	j.executeScript("window.scrollBy(0,600)", "");
	
	driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[4]/div[2]/div/div/div[1]/div/div/a/span/i")).click();
	Thread.sleep(10000);		// to click on ticket
	
	
	int rc=Excel.getRowCount(INPUT_PATH, "ticket");
	for(int i=1;i<=rc;i++){
		String time = Excel.getCellValue(INPUT_PATH, "ticket", i, 0);
		String format= Excel.getCellValue(INPUT_PATH, "ticket", i, 1);

	driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[2]/div[1]/div[2]/div/div/input")).sendKeys(time);
	Thread.sleep(3000);		// to click time
	
	
	
	Select s=new Select(driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[2]/div[1]/div[3]/div/select")));
	s.selectByVisibleText("Only once");
	
	driver.findElement(By.xpath(".//*[@id='format']")).sendKeys(format);
	Thread.sleep(5000);		// to click on format
	
	
	driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div/div[3]/input")).click();
	Thread.sleep(5000);
	
	}
	
	
	
	
	
	
	
	
	
	
	
}

catch(Exception e)
{
	log.info("this is"+e);
}
}}
