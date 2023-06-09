package com.qa.nobero.mWeb.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class FooterRepo {
	AndroidDriver driver;
	
	public FooterRepo(AndroidDriver driver2) {
		PageFactory.initElements(driver,this);	}
	public AndroidDriver getDriver() {
		return driver;
	}
	
	@FindBy(xpath="//div[@class='footerLink lg:hidden']//h3[text()='Categories']")
	private WebElement Categories;
	public WebElement getCategories() {
		return Categories;
	}
	
	@FindBy(xpath="//ul[@class='footerLinkAnswer mt-6 ']//a[text()='Men']")
	private WebElement Men;
	public WebElement getMen() {
		return Men;
	}
	
	@FindBy(xpath="//ul[@class='footerLinkAnswer mt-6 ']//a[text()='Luxury Summer Sets']")
	private WebElement LuxurySummerSets;
	public WebElement getLuxurySummerSets() {
		return LuxurySummerSets;
	}
	
	@FindBy(xpath="//ul[@class='footerLinkAnswer mt-6 ']//a[text()='Women']")
	private WebElement women;
	public WebElement getWomen() {
		return women;
	}
	
}
