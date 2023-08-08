package nop_Utility_01;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Utility 
{
	 public static void wait(int waitTimesec) throws InterruptedException
	  {
		  Thread.sleep(waitTimesec);
		  Reporter.log("Waiting for"+ waitTimesec+ "+ millisecond ", true);
	  }
	 public static void takesScreenshot(WebDriver driver) throws IOException
	 {
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest=new File("C:\\Users\\HP\\eclipse-workspace\\nopcom\\takescreenshot\\1.png");
		// FileHandler.copy(src,dest);
		//FileHandler.copy(src, dest);
		 FileUtils.copyFile(src, dest);	 
	 }
	 

}
