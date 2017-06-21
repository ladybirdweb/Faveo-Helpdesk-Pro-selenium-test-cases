package faveo;

import java.io.IOException;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_51_editTeam_showshould_shown extends Login_faveo_admin {
	@Test
	public void register() throws InterruptedException, IOException
	{Thread.sleep(8000);
		//to click on admin panel
		driver.findElement(By.xpath("//a[.='Admin Panel']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//i[@class='fa fa-users fa-stack-1x']")).click();//to click on team button
		Thread.sleep(8000); 
		driver.findElement(By.xpath(".//*[@id='chumper']/tbody/tr[1]/td[5]/form/a")).click();//to click on edit button
		Thread.sleep(8000); 
		List<WebElement> radio = driver.findElements(By.xpath("(.//*[@id='status'])[1]"));//to click on radio button
		Thread.sleep(8000); 
		for(int i=0;i<=radio.size();i++)
		{
			radio.get(i).click();
			break;
		}
		Thread.sleep(8000); 
		driver.findElement(By.xpath("//input[@value='Update']")).click();//to click on update  button
		driver.getPageSource();
		Thread.sleep(8000); 
		String att = driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div/div/div/div[2]/div[1]")).getText();//to click on update  button
		if(att.equalsIgnoreCase("Teams updated successfully"));
		{
			System.out.println("test is passed");
		}		
}
}

