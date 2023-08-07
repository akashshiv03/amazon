package nop_test_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) 
	{
		 WebDriver driver=new ChromeDriver();
		  driver.get("https://demo.nopcommerce.com/");
		  driver.findElement(By.xpath("//a[text()='Log in']")).click();
		  driver.findElement(By.id("Email")).sendKeys("shivramakash96@gmail.com");
		  driver.findElement(By.id("Password")).sendKeys("Akash@123");
		  driver.findElement(By.xpath("//button[text()='Log in']")).click();

	}

}
