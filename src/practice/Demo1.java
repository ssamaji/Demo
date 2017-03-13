package practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import common.BaseTest;
import pom.HomePage;

public class Demo1 extends BaseTest
{
	
	@Test
	public void actionSelect()
	{
		HomePage h=new HomePage(driver);
		
		WebElement leave=driver.findElement(By.xpath("//b[.='Leave']"));
		h.moveToElement(leave);
		leave.click();
		
		WebElement month = driver.findElement(By.id("leaveperiod_cmbStartMonth"));
		Select select=new Select(month);
		select.selectByValue("1");
		
		System.out.println("hi");
		
		WebElement date=driver.findElement(By.name("leaveperiod[cmbStartDate]"));
		date.click();
		
		WebElement target = driver.findElement(By.xpath(".//*[@id='leaveperiod_cmbStartDate']/option[7]"));
		Actions action=new Actions(driver);
		action.moveToElement(target).click().perform();
		
	}
	
	
	
	
}
