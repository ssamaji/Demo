package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import common.BasePage;
import common.BaseTest;
import pom.HomePage;

public class Demo extends BaseTest
{
	@Test
	public void contextClick() throws InterruptedException
	{
		 HomePage h=new HomePage(driver);
		
		WebElement leave=driver.findElement(By.xpath("//b[.='Leave']"));
		h.moveToElement(leave);
		Actions action=new Actions(driver);
		action.contextClick(leave).perform();
		action.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).click().perform();
		Thread.sleep(1000);
	}

}
