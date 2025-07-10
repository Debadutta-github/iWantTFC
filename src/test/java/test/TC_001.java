package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

import testScripts.SignInOut;

public class TC_001 extends SignInOut{
	
	@Test
	public void play() throws Exception {
		sampleLoginTest();
		
		Thread.sleep(Duration.ofSeconds(10));
		
		showElementXpath();
		wUtil.scrollToElement(driver, driver.findElement(By.xpath(hp.getShow(tray, show))));
		
		Thread.sleep(Duration.ofSeconds(10));
				
		initShowElement(); // Make sure the element is assigned
		dynamicShowElement.click();
		Thread.sleep(Duration.ofSeconds(10));
		
		//wUtil.scrollTillElementByAxis(driver, 0, 300);
	//	wUtil.scrollToElement(driver, hp.getPlayBtn());
	//	hp.getPlayBtn().click();
	//	wUtil.moveToElement(driver, pc.getBackBtn());
		//pc.getBackBtn().click();
				
		Thread.sleep(Duration.ofSeconds(10));
		
		System.out.println("Passed");
	 }
}
