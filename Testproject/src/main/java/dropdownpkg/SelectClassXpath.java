package dropdownpkg;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassXpath {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	  driver.manage().window().maximize();
	  
	  //retive the url
	  driver.get("https://www.facebook.com/r.php");
	  
	  
	  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
	  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("dce");
	  driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9000003471");
	  driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("1234");
	 
	 WebElement date=driver.findElement(By.xpath("//select[@id='day']"));
	  Select seldate=new Select(date);
	 seldate.selectByIndex(10); 
	 
	 
	 
	 
	 WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	 Select selmonth=new Select(month);
	 selmonth.selectByValue("10");
	
	
    WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
	 Select selyear=new Select(year);
	 selyear.selectByVisibleText("2005"); 
	 
	
	
	   System.out.println("Completed");
	   
	  
	}

}

	
