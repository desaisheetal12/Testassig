package pompkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registerpage1 {

	
	WebDriver driver;
	
	By fname=By.name("firstName");
	By lname=By.name("lastName");
	
	public void setfirstname(String fn)
	{
		driver.findElement(fname).sendKeys(fn);
		
	}
	public void setlastname(String ln)
	{
		driver.findElement(lname).sendKeys(ln);
	}
	
	public registerpage1(WebDriver d)
	{
		//this.driver=driver;
		driver=d;
		
	}
}
