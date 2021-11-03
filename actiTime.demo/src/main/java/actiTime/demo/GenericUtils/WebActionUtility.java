package actiTime.demo.GenericUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebActionUtility {
	WebDriver driver;
	JavascriptExecutor js;
	Actions action;
	public WebActionUtility(WebDriver driver) {
		this.driver = driver;
		js=(JavascriptExecutor)driver;
		action= new Actions(driver);
	}
	public void enterData(WebElement targetElement, String keysToEnter) {
		targetElement.clear();
		targetElement.sendKeys(keysToEnter);
	}
	public void clickOnElement(WebElement targetElement) {
		targetElement.click();
	}
	public void jsClick(WebElement targetElement) {
		js.executeAsyncScript("arguments[0].click()", targetElement);
	}
	public void enterJsData(WebElement targetElement, String keysToEnter) {
		js.executeAsyncScript("arguments[0].value='"+keysToEnter+"'", targetElement);
	}
	public void mouseHovering(WebElement targetElement) {
		action.moveToElement(targetElement).perform();
		action.click();
	}
	public void rightClick(WebElement targetElement) {
		action.contextClick(targetElement).perform();
	}
	public void doubleClick(WebElement targetElement) {
		action.doubleClick(targetElement).perform();
	}
	public void dragAndDrop(WebElement source, WebElement destination) {
		action.dragAndDrop(source, destination).perform();
	}
}
