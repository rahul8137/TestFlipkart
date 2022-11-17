package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import pagePackage.LoginPage;

public class TestValidLogin extends BaseTest  {
    @Test
	public void testValidLogin() throws IOException, InterruptedException 
	{

		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		String validusername = flib.readPropertyData(PROP_PATH,"username");
		String validpassword = flib.readPropertyData(PROP_PATH, "password");
		lp.validLoginToFlipkart(validusername,validpassword);
		
	}

}
