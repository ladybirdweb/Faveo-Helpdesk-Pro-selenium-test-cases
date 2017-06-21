package faveo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Web_96_delete {public WebDriver driver;
@FindBy(xpath=".//*[@id='chumper']/tbody/tr[4]/td[5]/a[2]") public WebElement delete;

public Web_96_delete(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void call()
{
	delete.click();
	
	
}


}



