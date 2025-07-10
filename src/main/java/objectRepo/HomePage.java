package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	
	private WebDriver driver;
	
	public WebElement getShowElementBy(String tray, String show) {
	    String xpath = "//p[contains(text(),'" + tray + "')]/../..//img[@alt='" + show + "']/..";
	    return driver.findElement(By.xpath(xpath));
	}
	
	public String getShow(String tray, String show) {
	    String x = "//p[contains(text(),'" + tray + "')]/../..//img[@alt='" + show + "']/..";
	    return x;
	}
	
	@FindBy(xpath = "//div[@id='play']")
	private WebElement playBtn;
	
	@FindBy(xpath = "//img[@alt='iWantTFC Logo']")
	private WebElement iWantLogo;
	
	@FindBy(xpath = "//p[normalize-space()='Home']")
	private WebElement homeTab;
	
	@FindBy(xpath = "//p[normalize-space()='Movies']")
	private WebElement moviesTab;
	
	@FindBy(xpath = "//p[normalize-space()='Shows']")
	private WebElement showsTab;
	
	@FindBy(xpath = "//p[normalize-space()='My Watchlist']")
	private WebElement myWatchlistTab;
	
	@FindBy(xpath = "//img[@class='absolute inset-0 object-cover']")
	private WebElement gmaTab;
	
	@FindBy(xpath = "//img[@alt='search-icon']")
	private WebElement searchIcon;
	
	@FindBy(xpath = "//img[@alt=\"account-arrow\"]/..")
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

	public WebElement getMyWatchlistTab() {
		return myWatchlistTab;
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
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getPlayBtn() {
		return playBtn;
	}

	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
