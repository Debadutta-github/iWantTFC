package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSettings {
	
	@FindBy(xpath = "//p[text()='Sign In']/..")
	private WebElement signIn;

	@FindBy(xpath = "//p[text()='Sign Out']/..")
	private WebElement signOut;
	
	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getSignOut() {
		return signOut;
	}

	public AccountSettings(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
