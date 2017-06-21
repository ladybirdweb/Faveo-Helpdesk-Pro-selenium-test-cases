package faveo;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_52_team_creation extends Login_faveo_admin {
	@Test
	public void register() throws InterruptedException, IOException
	{Thread.sleep(6000);
		//to click on admin panel
	driver.findElement(By.xpath("//a[.='Admin Panel']")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//i[@class='fa fa-users fa-stack-1x']")).click();//click on team
	driver.findElement(By.xpath("//a[.='Create team']")).click();//create team
	Thread.sleep(6000);
	driver.findElement(By.xpath(" //input[@name='name']")).sendKeys("public 2");//createteam name
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement drop=driver.findElement(By.xpath(".//*[@id='team_lead']"));//public department
	Select s=new Select(drop);
	s.selectByVisibleText("Dyamanna yarihakkal");
	Thread.sleep(4000);
	
	List<WebElement> radio = driver.findElements(By.xpath("(.//*[@id='status'])"));//create team
	for(int i=0;i<=radio.size();i++)
	{
		radio.get(i).click();
		break;
	}
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
	Thread.sleep(5000);
	String text = driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div/div/div[2]/div[1]")).getText();
	Thread.sleep(6000);
	if(text.equalsIgnoreCase("Teams created successfully"))
	{
		System.out.println("passed");
	}
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\22.png"));
	
	
	
}
}