package com.qa.nobero.mWeb.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


	/**
	 * @author Praveen B
	 *
	 */
	public class HomeRepo {
		AndroidDriver driver;
		public  HomeRepo(AndroidDriver driver) {
			PageFactory.initElements(driver,this);

		}

		
		
		public AndroidDriver getDriver() {
			return driver;
		}

		public WebElement getHamburger() {
			return hamburger;
		}

		public WebElement getNewArrival() {
			return newArrival;
		}

		public WebElement getBestSeller() {
			return bestSeller;
		}

		public WebElement getMens() {
			return mens;
		}

		public WebElement getWomens() {
			return womens;
		}

		public WebElement getCoOrdSet() {
			return coOrdSet;
		}

		public WebElement gettShirt() {
			return mensSummerTees;
		}

		public WebElement getCartIcon() {
			return cartIcon;
		}

		public WebElement getCartItemCount() {
			return cartItemCount;
		}

		public WebElement getNoberoLogo() {
			return noberoLogo;
		}

		public WebElement getHomeTab() {
			return homeTab;
		}

		public WebElement getCategoryTab() {
			return categoryTab;
		}

		public WebElement getMyAccountTab() {
			return myAccountTab;
		}

		public WebElement getBackToTop() {
			return backToTop;
		}
		
		@FindBy(xpath="//*[local-name()='svg' and @viewBox='0 0 18 16']")
		private WebElement hamburger;

		@FindBy(xpath="//a[@href='/collections/new-arrivals']/div/div")
		private WebElement newArrival;
		
		@FindBy(xpath="//a[@href='/collections/best-sellers']/div/div")
		private WebElement bestSeller;
		
		@FindBy(xpath="//a[@href='/collections/men-collection']/div/div")
		private WebElement mens;
		
		@FindBy(xpath="//a[@href='/collections/women-collection']/div/div")
		private WebElement womens;
		
		@FindBy(xpath="//a[@href='/collections/all-coords']/div/div")
		private WebElement coOrdSet;
		
		@FindBy(xpath="//a[@href='/collections/pick-printed-t-shirts']/div/div")
		private WebElement mensSummerTees;
		public WebElement getmensSummerTees() {
			return mensSummerTees;
		}
		
		@FindBy(xpath="//div[@id='header-profile-button']/following-sibling::div")
		private WebElement cartIcon;
		
		@FindBy(xpath="//div[@id='header-profile-button']/following-sibling::div//span[@id='cart-icon-item-count']")
		private WebElement cartItemCount;
		
		@FindBy(xpath="//div[@id='header-logo']/a")
		private WebElement noberoLogo;
		
		
		@FindBy(xpath="//*[local-name()='svg' and @id='home-icon']")
		private WebElement homeTab;
		
		@FindBy(xpath="//div[@id='shopify-section-bottom-nav']//a[@href='/pages/categories' and text()='Category']")
		private WebElement categoryTab;
		
		@FindBy(xpath="//div[@id='shopify-section-bottom-nav']//a[@href='/account' and text()='My Account']")
		private WebElement myAccountTab;
		
		@FindBy(xpath="//button[@id='BackToTop']")
		private WebElement backToTop;
	

		//shopallprod
		//explore
		
		
		
		
	
	
	
}
