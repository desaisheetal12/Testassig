package pomtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pompkg.registertest;

public class regtest {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		registertest rgpage=new registertest(driver);
		rgpage.clicklink();
		rgpage.setfirstname("abc");
		rgpage.setlastname("dce");
		
		rgpage.setphone("9856234178");
		rgpage.setuseremail("ss@gmail.com");

		rgpage.setaddress("Near jalana road Aurangabad");
        rgpage.setcity("Auranagabd");
		rgpage.setstate("Maharashrta");
		rgpage.setpostalcod("3456677");
		
		rgpage.setcountry("India");
		  
		rgpage.setemail("abcdce");
		rgpage.setpassword("1234");
		rgpage.setconfpassword("1234");
		
		rgpage.submit();
		
          System.out.println("Completed");
	
	}

}

