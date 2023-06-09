package com.qa.nobero.genericutility;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeOptions;
import com.google.common.io.Files;
import com.qa.nobero.mWeb.objectRepo.HomeRepo;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

/**
 * @author Praveen B
 *
 */
public class BaseClass {

	public static AndroidDriver driver;
	public static AndroidDriver sdriver;
	private AppiumDriverLocalService server;
	public static String URL;



	@BeforeSuite(alwaysRun = true)
	public void startserver() {
		server = AppiumDriverLocalService.buildService
				(new AppiumServiceBuilder().usingPort(4723).usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe")));
		server.start();
	}

	@BeforeTest(alwaysRun = true)
	public void launchBrowser() throws Throwable {
		FileUtility fileUtil = new FileUtility();


		//Set the capabilities
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("automationName", fileUtil.getPropertyKeyValue("automationName", IConstants.qaCapablityProprtyFile ));
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, fileUtil.getPropertyKeyValue("PLATFORM_NAME", IConstants.qaCapablityProprtyFile));
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, fileUtil.getPropertyKeyValue("PLATFORM_VERSION", IConstants.qaCapablityProprtyFile));
		desiredCapabilities.setCapability(MobileCapabilityType.UDID, fileUtil.getPropertyKeyValue("UDID", IConstants.qaCapablityProprtyFile));
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, fileUtil.getPropertyKeyValue("DEVICE_NAME", IConstants.qaCapablityProprtyFile));
		desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, fileUtil.getPropertyKeyValue("BROWSER_NAME", IConstants.qaCapablityProprtyFile));
		desiredCapabilities.setCapability("chromedriverExecutable", fileUtil.getPropertyKeyValue("chromedriverExecutable", IConstants.qaCapablityProprtyFile));

		URL url = new URL("http://localhost:4723");

		// Set the ChromeOptions to enable mobile emulation
		//        ChromeOptions options = new ChromeOptions();
		//        options.addArguments("--disable-notifications"); // disable notifications
		//        options.addArguments("--disable-extensions");
		//        options.addArguments("--disable-popup-blocking");
		//        options.addArguments("--disable-infobars");
		//        options.addArguments("--enable-precise-memory-info");
		//        options.addArguments("--start-maximized");
		//        options.addArguments("--disable-web-security");
		//        options.addArguments("--allow-running-insecure-content");
		//        options.addArguments("--disable-default-apps");
		//        options.addArguments("--disable-translate");

		driver = new AndroidDriver(url, desiredCapabilities);
		sdriver=driver;

		//Unlock the device 
		driver.unlockDevice();

		//Launch the Browser
		URL =fileUtil.getPropertyKeyValue("prodURL", IConstants.qaURLPropertyFilePath);
		//fileUtil.getPropertyKeyValue(EnnumKey.PRODURL, IConstants.qaURLPropertyFilePath);
		driver.get(URL);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Thread.sleep(5000);
		//new WebDriverUtility().handlePermissionPopUp(driver);

	}
	@AfterMethod(alwaysRun = true)
	public void afterMethodConfig(){
		// delete all cookies
		driver.manage().deleteAllCookies();
		driver.get(URL);
	}

	@AfterTest(alwaysRun = true)
	public void afterTestConfig(){
		driver.quit();
	}

	@AfterSuite
	public void stopServer() {
		server.stop();
	}

	public static String takescreenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) sdriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = "../Nobero-Mweb-AppiumSelenium-HyF-2023/reports/screenshots/"+JavaUtility.getSystemDateTime()+name+".png";
		File dest = new File(path);
		Files.copy(src, dest);
		return path;
	}

	public static String ts() {
		return sdriver.getScreenshotAs(OutputType.BASE64);
	}
}
