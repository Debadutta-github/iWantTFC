package genericUtility;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {

	/**
	 * This method is used to maximize the window
	 * 
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	/**
	 * This method is used to capture the size of window
	 * 
	 * @param driver
	 * @return
	 */
	public Dimension getSize(WebDriver driver) {
		return driver.manage().window().getSize();
		
	}
	
	/**
	 * This method is used to switch driver control to window based on url	
	 * @param driver
	 * @param url
	 */
	public void switchToWindow(WebDriver driver, String url) {
		Set<String> allWindowIds = driver.getWindowHandles();
		
		for(String id : allWindowIds) {
			driver.switchTo().window(id);
			String actUrl = driver.getCurrentUrl();
			if(actUrl.contains(url)) {
				break;
			}
		}
	}
	
	/**
	 * This method is used to right click
	 * 
	 * @param driver
	 */
	public void rightClick(WebDriver driver) {
		Actions act = new Actions(driver);
		act.contextClick().perform();
	}
	
	/**
	 * This method is used to click and hold the element
	 * @param driver
	 * @param element
	 */
	public void clickAndHold(WebDriver driver, WebElement element) {
		Actions act1 = new Actions(driver);
		act1.clickAndHold(element).perform();
	}
	
	/**
	 * This method is used to move the mouse to the targeted element
	 * @param driver
	 * @param element
	 */
	public void mouseHover(WebDriver driver, WebElement element) {
		Actions act2 = new Actions(driver);
		act2.moveToElement(element).perform();
	}
	
	/**
	 * This method is used to drag and drop the element
	 * @param driver
	 * @param srcElement
	 * @param tarElement
	 */
	public void dragAndDrop(WebDriver driver, WebElement srcElement, WebElement tarElement) {
		Actions act3 = new Actions(driver);
		act3.dragAndDrop(srcElement, tarElement);		
	}
	
	/**
	 * This method is used to change the frame through index
	 * 
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	
	/**
	 * This method is used to switch the frame through name or id
	 * 
	 * @param driver
	 * @param nameOrId
	 */
	public void switchToFrame(WebDriver driver, String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	
	/**
	 * This method is used to switch the frame through frame element
	 * 
	 * @param driver
	 * @param element
	 */
	public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
	
	/**
	 * This method is used to switch the frame back to the main page
	 * @param driver
	 */
	public void switchBackToMainPage(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	/**
	 * This method is used to select dropdown by index number of list
	 * 
	 * @param element
	 * @param index
	 */
	public void selectByDropDownIndex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	/**
	 * This method is used to select the dropdown by visible text
	 * 
	 * @param element
	 * @param text
	 */
	public void selectByVisibleText(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	/**
	 * This method is used to select the dropdown by value attribute
	 * @param element
	 * @param value
	 */
	public void selectByDropDownValue(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	
	/**
	 * This method is used to switch to pop up window 
	 * 
	 * @param driver
	 */
	public void switchToAlert(WebDriver driver) {
		driver.switchTo().alert();
	}
	
	/**
	 * This method used to switch to pop up window and accept it 
	 * 
	 * @param driver
	 */
	public void switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This method used to switch to pop up window and dismiss
	 * 
	 * @param driver
	 */
	public void switchToAlertAndDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * This method is used to switch to pop up window and send some data
	 * @param driver
	 * @param data
	 */
	public void switchToAlertAndSendKeys(WebDriver driver, String data) {
		driver.switchTo().alert().sendKeys(data);
	}
	
	public void jsScroll(WebDriver driver, int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + ", " + y + ")");
	}
}

