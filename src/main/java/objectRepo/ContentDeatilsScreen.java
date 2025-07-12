package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContentDeatilsScreen {
	
	@FindBy(xpath = "//div[@id='play']//div")
	private WebElement playBtn;
	
	@FindBy(id = "watchlist")
	private WebElement watchlistBtn;
	
	@FindBy(id = "share")
	private WebElement shareBtn;
		
	public WebElement getPlayBtn() {
		return playBtn;
	}

	public WebElement getWatchlistBtn() {
		return watchlistBtn;
	}

	public WebElement getShareBtn() {
		return shareBtn;
	}

	public ContentDeatilsScreen(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
