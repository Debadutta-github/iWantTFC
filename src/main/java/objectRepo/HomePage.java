package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(xpath = "//img[@alt='iWantTFC Logo']")
	private WebElement iWantLogo;
	
	@FindBy(xpath = "//p[normalize-space()='Home']")
	private WebElement homeTab;
	
	@FindBy(xpath = "//p[normalize-space()='Movies']")
	private WebElement moviesTab;
	
	@FindBy(xpath = "//p[normalize-space()='Shows']")
	private WebElement showsTab;
	
	@FindBy(xpath = "//p[normalize-space()='My Watchlist']")
	private WebElement myWaychlistTab;
	
	@FindBy(xpath = "//img[@class='absolute inset-0 object-cover']")
	private WebElement gmaTab;
	
	@FindBy(xpath = "//img[@alt='search-icon']")
	private WebElement searchIcon;
	
	@FindBy(xpath = "//img[@alt='account-arrow']")
	private WebElement accountArrow;

	public WebElement getiWantLogo() {
		return iWantLogo;
	}

	public WebElement getHomeTab() {
		return homeTab;
	}

	public WebElement getMoviesTab() {
		return moviesTab;
	}

	public WebElement getShowsTab() {
		return showsTab;
	}

	public WebElement getMyWaychlistTab() {
		return myWaychlistTab;
	}

	public WebElement getGmaTab() {
		return gmaTab;
	}

	public WebElement getSearchIcon() {
		return searchIcon;
	}

	public WebElement getAccountArrow() {
		return accountArrow;
	}
	
	
	
}
