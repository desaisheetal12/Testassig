package pompkg;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class registertest {

	
	//@FindBy Annotation
	WebDriver driver;
	
	/*@FindBy(how=HOW.LINK_TEXT,using="REGISTER")
	 WebElement link;*/
	
      @FindBy(how=How.LINK_TEXT,using="REGISTER")
       WebElement link;
      
      @FindBy(name="firstName")
      WebElement fname;
      
    //  @FindBy(name="lastName") //we can use this code insted of below code
   //   WebElement lanme;
      
      @FindBy(how=How.NAME,using="lastName")
      WebElement lname;
      
      @FindBy(how=How.NAME,using="phone")
      WebElement phone;
      
      @FindBy(how=How.NAME,using="userName")
      WebElement userName;
      
      @FindBy(how=How.NAME,using="address1")
      WebElement address1;
      
      @FindBy(how=How.NAME,using="city")
      WebElement city;
      
      @FindBy(how=How.NAME,using="state")
      WebElement state;
      
      @FindBy(how=How.NAME,using="postalCode")
      WebElement postalCode;
      
      @FindBy(how=How.NAME,using="country")
      WebElement country;

      
      @FindBy(how=How.NAME,using="email")
      WebElement email;
      
      @FindBy(how=How.NAME,using="password")
      WebElement password;
      
      @FindBy(how=How.NAME,using="confirmPassword")
      WebElement confirmPassword;
      
      
      @FindBy(how=How.NAME,using="submit")
      WebElement submit;
      
      
      
  public void clicklink()
  {
	  link.click();
	  
  }
  public void setfirstname(String fn)
  {
	  fname.sendKeys(fn);
	  
  }
 public void setlastname(String ln)
 {
	 lname.sendKeys(ln);
 }
 
    public void setphone(String ph)
 
       {
	     phone.sendKeys(ph);
       }
 
 public void setuseremail(String emailid)
 
 {
	 userName.sendKeys(emailid);
 }
 
public void setaddress(String address)
 
 {
	 address1.sendKeys(address);
 }
 
public void setcity(String cty)

{
	city.sendKeys(cty);
}
 
public void setstate(String st)

{
	state.sendKeys(st);
}
public void setpostalcod(String pstcod)

{
	postalCode.sendKeys(pstcod);
}
public void setcountry(String ctry)

{
	country.sendKeys(ctry);
}

 
public void setemail(String emailid)


{
	email.sendKeys(emailid);
}
 
public void setpassword(String pass)

{
	 password.sendKeys(pass);
}


public void setconfpassword(String confpassword)

{
	confirmPassword.sendKeys(confpassword);
}

public void submit()
{
	  submit.click();
	  
}


 public registertest(WebDriver d)
 
 {
	driver=d;
	 PageFactory.initElements(driver,this);
 }
}
   