package faveo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Web_96_sla_create_pom {
	public WebDriver driver;
	@FindBy(xpath="html/body/div[1]/div/section[2]/div/div/div/div[1]/a") public WebElement create;
	@FindBy(xpath=".//*[@id='name']") public WebElement enter_name;
	@FindBy(xpath="html/body/div[1]/div/section[2]/form/div/div[6]/div[3]/input") public WebElement submit;
	
	public Web_96_sla_create_pom (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void call(String name)
	{
		create.click();
		enter_name.sendKeys(name);
		submit.click();
		
	}
	

}
