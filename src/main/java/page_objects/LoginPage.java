package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="user-name")
	WebElement userNameTxt ; 

	@FindBy(id="password")
	WebElement passwordTxt ; 

	@FindBy(id="login-button")
	WebElement loginBtn ; 
	
	public void UserLogin(String username , String password) 
	{
		setTextElementText(userNameTxt, username);
		setTextElementText(passwordTxt, password);
		clickButton(loginBtn);
	}

	

}
