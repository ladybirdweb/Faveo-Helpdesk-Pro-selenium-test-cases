package faveo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Web_9_Language_change {
	
	public static  WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	
		driver=new FirefoxDriver();
		
	driver.get("http://jamboreebliss.com/Dyamanna/public/");
	
	WebElement lang = driver.findElement(By.xpath(".//*[@id='navbar']/nav/ul[2]/li/a/i)"));
	
	Actions a=new Actions(driver);
	
	Thread.sleep(6000);
	a.moveToElement(lang).perform();
	Thread.sleep(6000);
	a.moveToElement(driver.findElement(By.xpath("//img[.=' English']"))).perform();
	Thread.sleep(6000);
	a.doubleClick(driver.findElement(By.xpath("//img[.=' English']"))).perform();



}
}