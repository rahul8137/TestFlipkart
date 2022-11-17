package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class LoginPage extends BaseTest {
	//declare all the webElements present on Login page
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']") private WebElement username;
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")private WebElement password;
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']") private WebElement loginBtn;





	//initialization


	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}





	//utilzation
	public WebElement getUsn() {
		return username;
	}

	public WebElement getPass() {
		return password;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}


	//valid Login Method

	public void validLoginToFlipkart(String validUsername,String validPassword) throws InterruptedException
	{
		username.sendKeys(validUsername);
		password.sendKeys(validPassword);
		loginBtn.click();
		Thread.sleep(3000);
	}

	//invalid Login Method
	public void invalidLoginToFlipkart(String validUsername,String validPassword) throws InterruptedException
	{
		username.sendKeys(validUsername);
		password.sendKeys(validPassword);
		loginBtn.click();
		Thread.sleep(3000);
		username.clear();
	}

}
