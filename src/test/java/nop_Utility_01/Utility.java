package nop_Utility_01;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Utility {
  @Test
  public void takescreenshot()
  {

	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File Dest=new File("C:\\seleniumjar\\Screenshot\\screenshot\\1.png");
	  FileHandler.copy(src, Dest);
  }
//  public void implicitlywait()
//  {
//	  driver.ma
//  }
}
