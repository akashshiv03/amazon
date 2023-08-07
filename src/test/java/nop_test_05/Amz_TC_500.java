package nop_test_05;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import nop_BaseClass_02.Baseclass;
import nop_pom_04.homepage;

public class Amz_TC_500 extends Baseclass
{ homepage home;
	
	@BeforeClass
	public void openbrowser()
	{
		lounch_browser();
		home =new homepage();
		}
	
}
