package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContentDeatilsScreen;
import objectRepo.PlayerControls;

public class Guest_User extends BaseClass {
	
    @BeforeMethod
    public void setupPages() {  
        pc = new PlayerControls(driver);
        cds = new ContentDeatilsScreen(driver);
    }


	@Test
	public void play() throws Exception {

		// to scroll by xpath
		showElementXpath();
		wUtil.scrollToElement(driver, driver.findElement(By.xpath(hp.getShow(tray, show))));

		Thread.sleep(Duration.ofSeconds(10));

		initShowElement(); // Make sure the element is assigned
		dynamicShowElement.click();
		Thread.sleep(Duration.ofSeconds(10));

		wUtil.scrollToElement(driver, cds.getPlayBtn()); // if element is not fully in view
		// Play the content
		wUtil.safeClick(driver, cds.getPlayBtn());

		Thread.sleep(100000);
		wUtil.moveToElement(driver, pc.getBackBtn());
		pc.getBackBtn().click();

		Thread.sleep(Duration.ofSeconds(10));

		System.out.println("Passed");

	}

}
