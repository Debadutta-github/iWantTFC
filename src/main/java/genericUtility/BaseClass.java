package genericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectRepo.AccountSettings;
import objectRepo.ContentDeatilsScreen;
import objectRepo.HomePage;
import objectRepo.LoginPage;
import objectRepo.PlayerControls;

public class BaseClass {

    public static ExtentReports extReport;
    public static ExtentTest test;
    public WebDriver driver;
    public static WebDriver sDriver;

    public JavaUtility jUtil = new JavaUtility();
    public WebDriverUtility wUtil = new WebDriverUtility();
    public FileUtility fUtil = new FileUtility();
    public ExcelUtility eUtil = new ExcelUtility();
    
    public AccountSettings as;
    public HomePage hp;
    public LoginPage lp;
    public AccountSettings ap;
    public PlayerControls pc;
    public ContentDeatilsScreen cds;
    
    public String tray;
    public String show;
    public WebElement dynamicShowElement;
    public String showElement;
    
    public int row = 4;
    
    public void initShowElement() throws Exception {
        tray = eUtil.getStringDataFromExcel("Shows", row, 0);
        show = eUtil.getStringDataFromExcel("Shows", row, 1);
        hp = new HomePage(driver); // You don’t need to pass tray/show unless reused
        dynamicShowElement = hp.getShowElementBy(tray, show);
    }
    
    public void showElementXpath() throws Exception {
        tray = eUtil.getStringDataFromExcel("Shows", row, 0);
        show = eUtil.getStringDataFromExcel("Shows", row, 1);
        hp = new HomePage(driver); // You don’t need to pass tray/show unless reused
        showElement = hp.getShow(tray, show);
    }


    @BeforeSuite
    public void reportConfig() {
        System.out.println("Initializing ExtentReports...");
        ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_reports/ExtentReport_" + jUtil.getSystemTime());
        extReport = new ExtentReports();
        extReport.attachReporter(spark);	
        test = extReport.createTest("Premium User Play Test");  
    }

    @Parameters("Browser")
    @BeforeClass
    public void launchBrowser(@Optional("chrome") String browserName) throws IOException {
        System.out.println("Launching browser: " + browserName);

        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            throw new IllegalArgumentException("Invalid browser: " + browserName);
        }

        sDriver = driver;
        wUtil.maximizeWindow(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(fUtil.getDataFromProperty("url"));

        System.out.println("Navigated to URL: " + fUtil.getDataFromProperty("url"));
    }

    @AfterClass
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed successfully.");
        }
    }

    @AfterSuite
    public void reportBackup() {
        System.out.println("Flushing ExtentReports...");
        extReport.flush();
    }
}
