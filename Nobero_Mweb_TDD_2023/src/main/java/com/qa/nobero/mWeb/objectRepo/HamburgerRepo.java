package com.qa.nobero.mWeb.objectRepo;

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
public class HamburgerRepo {
	public AndroidDriver driver;
	public HamburgerRepo(AndroidDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//div[@id='menu-container']/descendant::a[.='My Account']")
	private WebElement myAccount;
	
	@FindBy(xpath="//div[@id='menu-container']/descendant::a[.='Track Order']")
	private WebElement trackOrder;
	
	@FindBy(xpath="//div[@id='menu-container']/descendant::a[.='Reviews']")
	private WebElement reviews;
	
	@FindBy(xpath="//div[@id='menu-container']/descendant::a[.='Return & Exchange']")
	private WebElement returnExchange;
	
	@FindBy(xpath="//div[@id='menu-container']/descendant::a[.='Contact Us']")
	private WebElement ContactUs;
	
	@FindBy(xpath="//div[@id='shopify-section-bottom-nav']/descendant::button[contains(.,'Log In or Sign Up')]")
	private WebElement logInSignUp;
	
	@FindBy(xpath="//ul[@id='menu-drawer']/descendant::div[contains(.,'New Arrivals') and @class='font-[familyMedium] text-base']")
	private WebElement newArrival;
	
	@FindBy(xpath="//ul[@id='menu-drawer']/descendant::li[contains(.,'Men')]")
	private WebElement men;
	
	@FindBy(xpath="//ul[@id='menu-drawer']/descendant::li[contains(.,'Women')]")
	private WebElement women;
	
	@FindBy(xpath="//ul[@id='menu-drawer']/descendant::li[contains(.,'Co-ord Sets')]")
	private WebElement coOrdSet;
	
	@FindBy(xpath="//ul[@id='menu-drawer']/descendant::li[contains(.,'Offers')]")
	private WebElement offers;
	
	@FindBy(xpath="//div[@id='menu-container']//*[local-name()='svg' and @class='icon icon-close']")
	private WebElement closeIcon;
	
	@FindBy(xpath="//div[@id='menu-container']//*[local-name()='svg' and @viewBox='0 0 20 22']")
	private WebElement cartIcon;
	
	@FindBy(xpath="//div[@id='menu-container']//img[@alt='Nobero Logo']")
	private WebElement noberoLogo;
	
	@FindBy(xpath="//*[local-name()='svg' and @viewBox='0 0 8 12']/*[local-name()='path' and @d='M6.5 1L1.5 6L6.5 11']")
	private WebElement NewArrivalbackicon;
	
	@FindBy(xpath="//img[@class='rounded-lg object-cover mobile-nested-img']/parent::a[@href='https://nobero.com/collections/cozy-lounge-1']")	 
	private WebElement cozyLounge;
	
	@FindBy(xpath="//div[@id='shopify-section-bottom-nav']/descendant::button[contains(.,'Log Out')]")
	private WebElement logOut;
	
	
	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getMyAccount() {
		return myAccount;
	}

	public WebElement getTrackOrder() {
		return trackOrder;
	}

	public WebElement getReviews() {
		return reviews;
	}

	public WebElement getReturnExchange() {
		return returnExchange;
	}

	public WebElement getContactUs() {
		return ContactUs;
	}

	public WebElement getLogInSignUp() {
		return logInSignUp;
	}

	public WebElement getNewArrival() {
		return newArrival;
	}

	public WebElement getMen() {
		return men;
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getCoOrdSet() {
		return coOrdSet;
	}

	public WebElement getOffers() {
		return offers;
	}

	public WebElement getCloseIcon() {
		return closeIcon;
	}

	public WebElement getCartIcon() {
		return cartIcon;
	}

	public WebElement getNoberoLogo() {
		return noberoLogo;
	}

	public WebElement getNewArrivalbackicon() {
		return NewArrivalbackicon;
	}

	public WebElement getCozyLounge() {
		return cozyLounge;
	}
	
	@FindBy(xpath="//p[contains(text(),'Co-ord Sets')]")
	private WebElement CoordSetsMen;
	public WebElement getMenCoordSets() {
		return CoordSetsMen;
	}
	
	@FindBy(xpath="//p[contains(text(),'Comfort Joggers')]")
	private WebElement comfortJoggersMen;
	public WebElement getMenComfortJoggers() {
		return comfortJoggersMen;
	}
	
	@FindBy(xpath="//p[contains(text(),'Summer Shorts')]")
	private WebElement summerShortsMen;
	public WebElement getMenSummerShorts() {
		return summerShortsMen;
	}
	
	@FindBy(xpath="//p[contains(text(),'Summer Tees')]")
	private WebElement summerTeesMen;
	public WebElement getMenSummerTees() {
		return summerTeesMen;
	}
	
	@FindBy(xpath="//p[contains(text(),'Summer Sets')]")
	private WebElement summerSetsMen;
	public WebElement getMenSummerSets() {
		return summerSetsMen;
	}
	 	
	@FindBy(xpath="//p[contains(text(),'Oversized Tees')]")
	private WebElement oversizedTeesMen;
	public WebElement getMenOversizedTees() {
		return oversizedTeesMen;
	}
	
	
	
	@FindBy(xpath="//p[contains(text(),'Co-ord Sets')]")
	private WebElement CoordSetsWomen;
	public WebElement getWomenCoordSets() {
		return CoordSetsMen;
	}
	
	@FindBy(xpath="//p[contains(text(),'Comfort Joggers')]")
	private WebElement comfortJoggersWomen;
	public WebElement getWomenComfortJoggers() {
		return comfortJoggersWomen;
	}
	
	@FindBy(xpath="//p[contains(text(),'Summer Shorts')]")
	private WebElement summerShortsWomen;
	public WebElement getWomenSummerShorts() {
		return summerShortsWomen;
	}
	
	@FindBy(xpath="//p[contains(text(),'Summer Tees')]")
	private WebElement summerTeesWomen;
	public WebElement getWomenSummerTees() {
		return summerTeesWomen;
	}
	
	@FindBy(xpath="//p[contains(text(),'Oversized T-Shirts')]")
	private WebElement oversizedTShirts;
	public WebElement getWomenoversizedTShirts() {
		return oversizedTShirts;
	}
	 	
	@FindBy(xpath="//p[contains(text(),'Textured Collection')]")
	private WebElement texturedCollection;
	public WebElement getWomenTexturedCollection() {
		return texturedCollection;
	}
	
	@FindBy(xpath="//button[contains(.,'Log Out')]")
	private WebElement logOutButton;
	public WebElement getlogOutButton() {
		return menPicksTeesTitle;
	}
	
	@FindBy(xpath="//p[text()='Top picks of the moment']/..//button[text()='Shop All Products']")
	private WebElement menTopPicksShopAllProducts;
	public WebElement getMenTopPicksShopAllProducts() {
		return menTopPicksShopAllProducts;
	}
	
	@FindBy(xpath="//h2[text()='Pick any 3 @ 999']/..//button[text()='Shop All Products']")
	private WebElement menPicksTeesShopAllProducts;
	public WebElement getMenPicksTeesShopAllProducts() {
		return menPicksTeesShopAllProducts;
	}
	
	@FindBy(xpath="//div[@id='shopify-section-template--16056169726118__22b80a91-3775-40f2-8617-cc151a81ea02']//h2")
	private WebElement menPicksTeesTitle;
	public WebElement getMenPicksTeesTitle() {
		return menPicksTeesTitle;
	}
	
	@FindBy(xpath="//p[text()='Top picks of the moment']/..//button[text()='Shop All Products']")
	private WebElement womenTopPicksShopAllProducts;
	public WebElement getWomenTopPicksShopAllProducts() {
		return womenTopPicksShopAllProducts;
	}
	
	@FindBy(xpath="//h2[text()='Pick any 3 @ 999']/..//button[text()='Shop All Products']")
	private WebElement womenPicksTeesShopAllProducts;
	public WebElement getWomenPicksTeesShopAllProducts() {
		return womenPicksTeesShopAllProducts;
	}
	
	@FindBy(xpath="//div[@id='shopify-section-template--16056169726118__22b80a91-3775-40f2-8617-cc151a81ea02']//h2")
	private WebElement womenPicksTeesTitle;
	public WebElement getWomenPicksTeesTitle() {
		return womenPicksTeesTitle;
	}
	
	
	//PlushRibs
	//summerTees
	//airportCoOrds
	//seeTheLatest
	//topSelling
	//sale
	//cart
	//cartcount
	
	
	
	
	
}
