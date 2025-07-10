package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = "//input[@placeholder='Email Address']")
	private WebElement emailAddTextField;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//button[normalize-space()='Continue']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//button[contains(text(),'Confirm')]")
	private WebElement confirmCookie;
	
	@FindBy(xpath = "//span[contains(text(),'Login with Facebook')]/..")
	private WebElement loginWithFb;
	
	@FindBy(xpath = "//span[contains(text(),'Login with Apple')]/..")
	private WebElement loginWithAppleId;
	
	@FindBy(xpath = "//span[contains(text(),'Login with TV Provider')]/..")
	private WebElement loginWithTvProvider;
	
	@FindBy(linkText = "Create Account")
	private WebElement createAccount;
	
	@FindBy(linkText = "Forgot Password?")
	private WebElement forgotPassword;
	
	public WebElement getConfirmCookie() {
		return confirmCookie;
	}

	public WebElement getLoginWithFb() {
		return loginWithFb;
	}

	public WebElement getLoginWithAppleId() {
		return loginWithAppleId;
	}

	public WebElement getLoginWithTvProvider() {
		return loginWithTvProvider;
	}

	public WebElement getCreateAccount() {
		return createAccount;
	}

	public WebElement getForgaotPassword() {
		return forgotPassword;
	}

	public WebElement getEmailAddTextField() {
		return emailAddTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
}
