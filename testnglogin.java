package allureport;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import allureport.login;

public class testnglogin 

{
	
	login log=new login();
	  @Test
	  public void f() throws InterruptedException 
	  {
		  Thread.sleep(2000);
		  //nt.login("stc123", "12345");
		  String ss="http://localhost/avactis/home.php";
			
			//Assert.assertEquals(ss,log.);
			//System.out.print(driver.getTitle());
		  
	  }
	  @BeforeMethod
	  public void beforeMethod()  
	  {
		  
	  }

	  @AfterMethod
	  public void afterMethod() 
	  {
		  //nt.close1();
	  }

}
