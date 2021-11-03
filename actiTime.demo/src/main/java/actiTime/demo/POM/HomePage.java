package actiTime.demo.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_tips']")
	private WebElement logoutButton;
	public WebElement getLogoutButton() {
		return logoutButton;
	}
	public void setLogoutButton(WebElement logoutButton) {
		this.logoutButton = logoutButton;
	}
}
