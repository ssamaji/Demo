package common;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

import com.relevantcodes.extentreports.LogStatus;

import pom.HomePage;
import pom.LoginPage;

public class BaseTest 
{
	public WebDriver driver=new FirefoxDriver();
	
	WebDriverWait wait= new WebDriverWait(driver,30);
	
	@BeforeClass
	public void initApplication()
	{
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1/orangehrm-3.3.1");
	}
	
	@AfterClass
	public void cleanApplication()
	{
		driver.quit();
	}

	@BeforeMethod
	public void preCondition(Method method)
	{
		LoginPage l=new LoginPage(driver);
		l.setUserName("admin");
		l.setPassword("manager");
		l.clickLogin();
	}
	
	@AfterMethod
	public void postCondition(ITestResult result)
	{
		
			HomePage homePage=new HomePage(driver);
			homePage.clickWelCome();
			homePage.clickLogout();
			
	}
}
