package nop_pom_04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage 
  {
	
		@FindBy(xpath="(//a[@data-nav-role=\"signin\"])[1]")private WebElement home_login;
		@FindBy(id="ap_email")private WebElement email;
		@FindBy(id="continue")private WebElement continuebutton1;
		@FindBy(id="ap_password")private WebElement password;
		@FindBy(id="signInSubmit")private WebElement signInSubmit;
		
	public  homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickon_homelogin()
	{
		home_login.click();
	}
	public void enter_email()
	{
		email.sendKeys("shivramakash96@gmail.com");
	}
	public void clickon_continuebutton()
	{
		continuebutton1.click();
	}
	public void enter_password()
	{
		password.sendKeys("Akash@123");
	}
	public void clickOn_signInSubmit()
	{
		signInSubmit.click();
	}

}
