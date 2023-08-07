package nop_BaseClass_02;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass
{
	protected WebDriver driver;
  public void lounch_browser()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
  }
  public void close_browser()
  {
	  driver.close();
  }

}
