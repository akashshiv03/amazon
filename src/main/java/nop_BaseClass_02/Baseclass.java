package nop_BaseClass_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import nop_Utility_01.Utility;

public class Baseclass
{
	protected WebDriver driver;
  public void lounch_browser() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  Reporter.log("Launching the browser", true);
	  Utility.wait(200);
  }
  public void close_browser() throws InterruptedException
  {
	  Utility.wait(200);
	  driver.close();
	  Reporter.log("Close the browser", true);
  }

}
