package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import genericUtility.BaseClass;
import objectRepo.AccountSettings;
import objectRepo.ContentDeatilsScreen;
import objectRepo.HomePage;
import objectRepo.LoginPage;
import objectRepo.PlayerControls;

public class SignInOut extends BaseClass {

    @BeforeMethod
    public void setupPages() {
        System.out.println("✅ Browser Launched: " + driver.getCurrentUrl());
        hp = new HomePage(driver);
        as = new AccountSettings(driver);
        lp = new LoginPage(driver);
        pc = new PlayerControls(driver);
        cds = new ContentDeatilsScreen(driver);
    }

    public void performLogin() throws EncryptedDocumentException, IOException {
        System.out.println("🔐 Starting Login...");

        // Click account dropdown and sign-in
        hp.getAccountArrow().click();
        as.getSignIn().click();
        
        // Handle cookie confirm only if visible
        try {
            if (lp.getConfirmCookie().isDisplayed()) {
                lp.getConfirmCookie().click();
            }
        } catch (Exception e) {
            System.out.println("⚠️ Confirm cookie button not present. Skipping...");
        }

        // Read credentials
        String email = eUtil.getStringDataFromExcel("Login", 1, 1);
        String pass = eUtil.getStringDataFromExcel("Login", 1, 2);

        // Enter credentials
        lp.getEmailAddTextField().sendKeys(email);
        lp.getPasswordTextField().sendKeys(pass);
        lp.getContinueButton().click();

        // Validate title
        String expectedTitle = eUtil.getStringDataFromExcel("Title", 1, 1);
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle, "❌ Login failed or title mismatch.");
        System.out.println("✅ Login Successful. Page Title: " + actualTitle);
    }

    @AfterMethod
    public void performLogout() {
        try {
            hp.getAccountArrow().click();
            as.getSignOut().click();
            System.out.println("✅ Signed out successfully.");
        } catch (Exception e) {
            System.out.println("⚠️ Logout skipped (probably not signed in): " + e.getMessage());
        }
    }

    // Example Test using login
  
    public void sampleLoginTest() throws EncryptedDocumentException, IOException {
        performLogin();
        // Additional validations after login can be placed here
    }
}
