package nop_test_05;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import nop_BaseClass_02.Baseclass;
import nop_Utility_01.Utility;
import nop_pom_04.homepage;

  public class Amz_TC_500 extends Baseclass
  { 
  	homepage home;
  	
  	@BeforeClass
  	public void openbrowser() throws InterruptedException
  	{
  		lounch_browser();
  		home =new homepage(driver);
  	}
  	@BeforeMethod 
  	public void loginto_Amazon() throws InterruptedException
  	{
  		home.clickon_homelogin();
  		Reporter.log("click on home login", true);
  		Utility.wait(200);
  		home.enter_email();
  		Reporter.log("Enter the email", true);
  		Utility.wait(200);
  		home.clickon_continuebutton();
  		Reporter.log("Click on continuebutton", true);
  		Utility.wait(200);
  		home.enter_password();
  		Reporter.log("entring password", true);
  		Utility.wait(200);
  		home.clickOn_signInSubmit();	
  		Reporter.log("Click signInsubmitbutton", true);

  	}
  	@Test
  	public void login()
  	{
  		Reporter.log("loginsucseefully");
  	}
  	
}
