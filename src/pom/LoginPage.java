package pom;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.BasePage;

public class LoginPage extends BasePage{
	@FindBy(id="txtUsername")
	private WebElement txtUsername;
	
	@FindBy(id="txtPassword")
	private WebElement txtPassword;
	
	@FindBy(id="btnLogin")
	private WebElement btnLogin;
	
	@FindBy(xpath="//div[@id='divLogo']/img")
	private WebElement logo;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String un){
		txtUsername.sendKeys(un);
	}

	public void setPassword(String pw){
		txtPassword.sendKeys(pw);
	}
	
	public void clickLogin(){
		btnLogin.click();
	}
	
	
}












