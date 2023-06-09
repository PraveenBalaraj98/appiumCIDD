package com.qa.nobero.mWeb.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class CategoryRepo {

	AndroidDriver driver;
	public  CategoryRepo(AndroidDriver driver) {
		PageFactory.initElements(driver,this);

	}



	public AndroidDriver getDriver() {
		return driver;
	}

	
	
}
