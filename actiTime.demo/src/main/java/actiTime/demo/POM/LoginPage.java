package actiTime.demo.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(id="username")
	private WebElement usernameTextField;
	
	@FindBy(name="pwd") private WebElement passwordTextField;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginButton;
	
	//business logic method
		public void login(String username, String password) 
		{
			usernameTextField.sendKeys(username);
			passwordTextField.sendKeys(password);
			loginButton.click();
		}
	
}
