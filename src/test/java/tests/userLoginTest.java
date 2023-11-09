package tests;

import org.testng.annotations.Test;

import page_objects.LoginPage;

public class userLoginTest extends TestBase {
	LoginPage  loginpage;
	
	@Test
	public void userCanLogin() {
		loginpage = new LoginPage(driver);
		loginpage.UserLogin("mai.fathy", "password");
		
	}

}
