package common;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasePage {
 
  public WebDriver driver;
  public String configFile;
  public long timeout;
  
  public BasePage(WebDriver driver)
  {
	  this.driver=driver;
  }
  
  public void waitTillElementIsVisible(WebElement element){
	  new WebDriverWait(driver,timeout)
	  .until(ExpectedConditions.visibilityOf(element));
  }
  
  public void verifyURLis(String expectedUrl){
	  new WebDriverWait(driver,timeout).until(ExpectedConditions.urlToBe(expectedUrl));
  }
  
  public void verifyURLhas(String expectedUrl){
	  new WebDriverWait(driver,timeout).until(ExpectedConditions.urlContains(expectedUrl));
  }
  
  public void moveToElement(WebElement element){
	  Actions actions=new Actions(driver);
	  actions.moveToElement(element).perform();
  }
  
}
