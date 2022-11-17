package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeOPage {
		
		//declaration for all the webelements present on the Home Page
	    @FindBy(xpath="//a[@class='_1_3w1N']")private WebElement loginpage;
		@FindBy(xpath="")private WebElement logoutbtn;
		
		//initilization
		
		public void HomePage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		
		
		
		
		//utilization
		public WebElement loginFlipkart()
		{
		return loginpage;
		
		}
		
		//logout method
		
		public void logOutmethod()
		{
			logoutbtn.click();
		}

}
