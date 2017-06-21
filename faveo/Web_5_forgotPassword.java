package faveo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web_5_forgotPassword {
	public static  WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.get("http://jamboreebliss.com/Dyamanna/public/");	
		Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='navbar']/nav/ul[2]/li/a/i")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[.='Forgot password']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='main']/div/div/div[2]/div/form/div[1]/input")).sendKeys("dyamanna.yarihakkal@ladybirdweb.com");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[.='Send']")).click();
		Thread.sleep(10000);
		
		//to login gamil server
		//username

		driver.get("https://mail.google.com/mail/u/0/#inbox/15caaba7492b6e8e");
//url
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("dyamanna.yarihakkal@ladybirdweb.com");
		Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		//pass
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("ammaloveu121");
		Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content")).click();
		Thread.sleep(6000);
	
		driver.findElement(By.xpath(".//*[@id=':ar']/a")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/form/div[1]/input")).sendKeys("dyamanna.yarihakkal@ladybirdweb.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("	html/body/div[1]/div[2]/div/form/div[2]/input")).sendKeys("ammaloveu121");
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/form/div[3]/input")).sendKeys("ammaloveu121");
		Thread.sleep(10000);
	driver.findElement(By.xpath("	html/body/div[1]/div[2]/div/form/div[4]/div[2]/button")).click();
		Thread.sleep(4000);
	
		
		
		
		
		
		
	
	}

}
