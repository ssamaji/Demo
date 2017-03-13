package practice;

import org.testng.annotations.Test;

import common.BaseTest;
import pom.HomePage;

public class Upload extends BaseTest
{
	@Test
	public void upload()
	{
		HomePage h=new HomePage(driver);
		h.moveToConfi();
		
		
	}
}
