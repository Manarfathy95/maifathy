package tests;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class TestBase {
	public static WebDriver driver ; 
//	public static FirefoxOptions firefoxOption() {
//		FirefoxOptions option = new FirefoxOptions();
//		option.addPreference("browser.download.folderList", 2);
//		option.addPreference("browser.download.dir", downloadPath);
//		option.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");
//		option.addPreference("browser.download.manager.showWhenStarting", false);
//		option.addPreference("pdfjs.disabled", true);
//		return option;
//	}

//	public static ChromeOptions chromeOption() {
//		ChromeOptions options = new ChromeOptions();
//		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
//		chromePrefs.put("profile.default.content_settings.popups", 0);
//		chromePrefs.put("download.default_directory", downloadPath);
//		options.setExperimentalOption("prefs", chromePrefs);
//		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//		return options;
//	}
	
	@BeforeSuite
	//@Parameters({"browser"})
	public void startDriver() 
	{
//		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
			driver = new ChromeDriver(); 
//		}
//
//		else if(browserName.equalsIgnoreCase("firefox")) {
//			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
//			driver = new FirefoxDriver(firefoxOption()); 
//		}
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");
	} 

	@AfterSuite
	public void stopDriver() 
	{
		driver.quit();
	}


}
