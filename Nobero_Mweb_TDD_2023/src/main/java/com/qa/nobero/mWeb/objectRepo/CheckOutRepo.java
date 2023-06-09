package com.qa.nobero.mWeb.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class CheckOutRepo {

	AndroidDriver driver;
	
	
	public CheckOutRepo(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	@FindBy(xpath="//input[@id='phone-input']")
	private WebElement phoneNo;
	
	
	@FindBy(xpath="//span[text()='+ Add address']")
	private WebElement addAddress;
	
	@FindBy(xpath="//button[text()='Continue']")
	private WebElement contine;
}
