package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

import testScripts.SignInOut;

public class TC_001 extends SignInOut {

	public void click() throws Exception {
		// login
		sampleLoginTest();

		Thread.sleep(Duration.ofSeconds(10));

		// to scroll by xpath
		showElementXpath();
		wUtil.scrollToElement(driver, driver.findElement(By.xpath(hp.getShow(tray, show))));

		Thread.sleep(Duration.ofSeconds(10));

		initShowElement(); // Make sure the element is assigned
		dynamicShowElement.click();

	}

	@Test
	public void play() throws Exception {
		click();
		wUtil.safeClick(driver, cds.getPlayBtn());

		Thread.sleep(5000);
				
	//	for(int i = 1; i<=5; i++) {
			wUtil.moveToElement(driver, pc.getPauseBtn());
			pc.getPauseBtn().click();

			wUtil.moveToElement(driver, pc.getPlayBtn());
			pc.getPlayBtn().click();
			
			wUtil.moveToElement(driver, pc.getForwardBtn());
			pc.getForwardBtn().click();
			
			wUtil.moveToElement(driver, pc.getRewindBtn());
			pc.getRewindBtn().click();
			
			wUtil.moveToElement(driver, pc.getVolumeBtn());
			pc.getVolumeBtn().click();
	//	}



		Thread.sleep(Duration.ofSeconds(60));

		wUtil.moveToElement(driver, pc.getBackBtn());
		pc.getBackBtn().click();

		test.pass("Playback started successfully.");
	}

	@Test
	public void watchlist() throws Exception {
		click();

		wUtil.scrollWaitAndClick(driver, cds.getWatchlistBtn(), 10);
		wUtil.verifyToastMessage(driver, "Added to watchlist", 5);

		test.pass("Added to watchlist successfully.");
	}

}
