package pompkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registerpage {
	
	WebDriver driver; //declaration
	
	By link=By.linkText("REGISTER");
	
	public void clicklink()
	{
		driver.findElement(link).click();
		
	}
 public registerpage(WebDriver driver) //(WebDriver d)
 {
	 this.driver=driver; 
	  // driver=d; //use this way also
 }
 }