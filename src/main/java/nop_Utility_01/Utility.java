package nop_Utility_01;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility 
{
	public void takesScreenshot(WebDriver driver) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Dest=new File("C:\\seleniumjar\\Screenshot\\screenshot\\1.png");
		FileHandler.copy(src, Dest);
	}
	 public static void wait(int waitTimesec) throws InterruptedException
	  {
		  Thread.sleep(waitTimesec);
		  Reporter.log("Waiting for"+ waitTimesec+ "+ millisecond ", true);
	  }
	 

}
