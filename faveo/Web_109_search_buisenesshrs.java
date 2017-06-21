package faveo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class Web_109_search_buisenesshrs extends Login_faveo_admin {@Test(priority=1)

public void create() throws InterruptedException, IOException
{Thread.sleep(6000);
//to click on admin

driver.findElement(By.xpath("//a[@href='http://jamboreebliss.com/Dyamanna/public/admin']")).click();
Thread.sleep(6000);		// to click on admin



driver.findElement(By.xpath("html/body/div[1]/div/section[2]/div[3]/div[2]/div/div/div[3]/div/div/a/span/i")).click();
Thread.sleep(6000);		// to click on buiseness hours
driver.findElement(By.xpath(".//*[@id='chumper_filter']/label/input")).sendKeys("def");
Thread.sleep(6000);		// to click on buiseness hours

File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
FileUtils.copyFile(scrFile1, new File("c:\\Users\\Dyamanna\\Screenshots\\img(109).png"));



}
}