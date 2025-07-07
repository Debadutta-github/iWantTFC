package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlayerControls {
	
	@FindBy(xpath = "//img[@alt='Pause']")
	private WebElement pauseBtn;
	
	@FindBy(xpath = "//img[@alt='Play']")
	private WebElement playBtn;
	
	@FindBy(xpath = "//img[@alt='rewind 10s']")
	private WebElement rewindBtn;
	
	@FindBy(xpath = "//img[@alt='forward 10s']")
	private WebElement forwardBtn;
	
	@FindBy(xpath = "//img[@alt='volume']")
	private WebElement volumeBtn;
	
	@FindBy(xpath = "//img[@alt='subtitle']")
	private WebElement subtitleBtn;
	
	@FindBy(xpath = "//img[@alt='fullscreen']")
	private WebElement fulscreenBtn;
	
	@FindBy(xpath = "//img[@alt='back']")
	private WebElement backBtn;
	
	@FindBy(xpath = "//div[@class='player-progress-indicator']")
	private WebElement playerProgressBtn;
	
	@FindBy(xpath = "//span[@class='player-sub-heading']")
	private WebElement subHeading;
	
	@FindBy(xpath = "//div[@class='player-title']")
	private WebElement playerTitle;
	
	@FindBy(xpath = "//div[@class='player-mid-spacer']")
	private WebElement midSpace;

	public WebElement getPauseBtn() {
		return pauseBtn;
	}

	public WebElement getPlayBtn() {
		return playBtn;
	}

	public WebElement getRewindBtn() {
		return rewindBtn;
	}

	public WebElement getForwardBtn() {
		return forwardBtn;
	}

	public WebElement getVolumeBtn() {
		return volumeBtn;
	}

	public WebElement getSubtitleBtn() {
		return subtitleBtn;
	}

	public WebElement getFulscreenBtn() {
		return fulscreenBtn;
	}

	public WebElement getBackBtn() {
		return backBtn;
	}

	public WebElement getPlayerProgressBtn() {
		return playerProgressBtn;
	}

	public WebElement getSubHeading() {
		return subHeading;
	}

	public WebElement getPlayerTitle() {
		return playerTitle;
	}

	public WebElement getMidSpace() {
		return midSpace;
	}
}
