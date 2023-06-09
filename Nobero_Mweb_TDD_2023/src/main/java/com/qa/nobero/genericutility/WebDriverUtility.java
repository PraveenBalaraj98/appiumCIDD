package com.qa.nobero.genericutility;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;
import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class WebDriverUtility {

	public void scrollToVisibleTest(AndroidDriver driver, String visibleText)
	{
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollTextIntoView(" + visibleText + "))"));

	}
	public void scrollToPoint(AppiumDriver driver,String x,String y) {
 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo("+x+","+y+");");

	}
	
	public void scrollToElementXAndY(AppiumDriver driver,WebElement WE) {
		 
		Point point = WE.getLocation();
		int x = point.getX();
		int y = point.getY()-200;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo("+x+","+y+");");

	}
	
	  public void scrollToElementJS(AndroidDriver driver, WebElement element) {
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
	    }
	  
	  public void elementClick(AndroidDriver driver, WebElement element) {
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("arguments[0].click();", element);
	    }

	public void handlePermissionPopUp(AndroidDriver driver) {
		Set<String> contextNames = driver.getContextHandles();
		for (String contextName : contextNames) {
			System.out.println( contextName );
			if (contextName.contains("CHROMIUM")) {
				driver.context("NATIVE_APP");
				try {
					Thread.sleep( 1500 );
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		//Click on Allow
		driver.findElement(By.xpath(".//android.widget.Button[@text='Block']")).click();
		//Change context back to the main page.
		driver.context("CHROMIUM");
		
	}
	
	public void slideSectionFromRightToLeft(AndroidDriver driver, WebElement slider) {
		// Get the width of the slider element
		int sliderWidth = slider.getSize().getWidth();
		
		// Create an instance of the Actions class
		Actions actions = new Actions(driver);
		
		// Click and hold the left mouse button and Move the mouse to the right then Release the left mouse button to finish the sliding action
		actions.clickAndHold(slider).moveByOffset(-(sliderWidth/2), 0).release().perform();

	}
	
	public void slideSectionFromLeftToRight(AndroidDriver driver, WebElement slider) {
		// Get the width of the slider element
		int sliderWidth = slider.getSize().getWidth();

		// Create an instance of the Actions class
		Actions actions = new Actions(driver);

		// Move the mouse to the slider element
		actions.moveToElement(slider).build().perform();

		// Click and hold the left mouse button on the slider element
		actions.clickAndHold().build().perform();

		// Move the mouse to the right to slide the image
		actions.moveByOffset(sliderWidth / 2, 0).build().perform();

		// Release the left mouse button to finish the sliding action
		actions.release().build().perform();

	}
	public void slideSectionFromBottomToTop(AndroidDriver driver, WebElement slider) {
		// Get the width of the slider element
		int sliderWidth = slider.getSize().getHeight();

		// Create an instance of the Actions class
		Actions actions = new Actions(driver);

		// Move the mouse to the slider element
		actions.moveToElement(slider).build().perform();

		// Click and hold the left mouse button on the slider element
		actions.clickAndHold().build().perform();

		// Move the mouse to the right to slide the image
		actions.moveByOffset(sliderWidth / 2, 0).build().perform();

		// Release the left mouse button to finish the sliding action
		actions.release().build().perform();

	}
	public void slideSectionFromTopToBottom(AndroidDriver driver, WebElement slider) {
		// Get the width of the slider element
		int sliderWidth = slider.getSize().getHeight();

		// Create an instance of the Actions class
		Actions actions = new Actions(driver);

		// Move the mouse to the slider element
		actions.moveToElement(slider).build().perform();

		// Click and hold the left mouse button on the slider element
		actions.clickAndHold().build().perform();

		// Move the mouse to the right to slide the image
		actions.moveByOffset(sliderWidth / 2, 0).build().perform();

		// Release the left mouse button to finish the sliding action
		actions.release().build().perform();

	}
	
	public void scrollToEndPage(AndroidDriver driver)
	{
		try {
			long lastHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");
			System.out.println(lastHeight);
			while (true) {
				((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
				Thread.sleep(2000);
				long newHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");
				if (newHeight == lastHeight) {
					break;
				}
				lastHeight = newHeight;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
