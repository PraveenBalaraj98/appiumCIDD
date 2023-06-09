package com.qa.nobero.mWeb.objectRepo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class SearchRepo {

	AndroidDriver driver;
	public  SearchRepo(AndroidDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[@id='st-search-icon']")
	private WebElement searchIcon;
	

	public WebElement getLessthanRs500search() {
		return lessthanRs500search;
	}

	public WebElement getRs501toRs1000() {
		return Rs501toRs1000;
	}

	public WebElement getRs1001toRs1500() {
		return Rs1001toRs1500;
	}



	public WebElement getRs1501toRs2000() {
		return Rs1501toRs2000;
	}
	

	public WebElement getMorethanRs2000search() {
		return morethanRs2000search;
	}
	@FindBy(xpath="//div[@id='searchModalContainer']/div[@id='searchModal']//div[@class='st-products']/descendant::div[@class='st-col-md-4 st-product']")
	private WebElement product;

	public WebElement getProduct() {
		return product;
	}
	
	@FindBy(xpath="//span[@id='selected-color-title']")
	private WebElement productColorTitle;

	public WebElement getproductColorTitle() {
		return productColorTitle;
	}
	
	@FindBy(xpath="//div[@id='searchModal']/descendant::span[@class='st-highlight  st-ellipse st-query-title']")
	private WebElement searchTitle;

	public WebElement getsearchTitle() {
		return searchTitle;
	}
	
	@FindBy(xpath="//div[@id='mobilesize']/descendant::ul/div/div/li/descendant::div[@class='filter-label']")
	private List<WebElement> SizesFilter;

	public List<WebElement> getSizesFilter() {
		return SizesFilter;
	}
	
	@FindBy(xpath="//div[@id='searchModal']/descendant::div[@class='st-row']/descendant::div[@class='st-products']")
	private WebElement PLPgrid;

	public WebElement getPLPgrid() {
		return PLPgrid;
	}
	
	@FindBy(xpath="//div[@id='searchModal']/descendant::div[@data-ga-view-info='Search_Result']/descendant::span[@class='st-original-price']/span[@class='money']")
	private List<WebElement> PLPgridPrice;

	public List<WebElement> getPLPgridPrice() {
		return PLPgridPrice;
	}
	@FindBy(xpath="//div[@id='searchModal']/descendant::div[@data-ga-view-info='Search_Result']/descendant::div[@class='st-col-md-4 st-product']")
	private List<WebElement> PLPgridProduct;
	public List<WebElement> getPLPgridProduct() {
		return PLPgridProduct;
	}
	
	@FindBy(xpath="//button[contains(.,'Add to Cart')]")
	private WebElement AddToCart;

	public WebElement getAddToCart() {
		return AddToCart;
	}
	
	@FindBy(xpath="//div[@class='w-full']//h1")
	private WebElement PDPprodTitle;
	public WebElement getPDPprodTitle() {
		return PDPprodTitle;
	}
	
	@FindBy(xpath="//div[@id='mobilecolor']/descendant::ul[@id='product_typeFilterValues']//li//div[@class='filter-label']")
	private List<WebElement> colorsSearchFilter;
	public List<WebElement> getcolorsSearchFilter() {
		return colorsSearchFilter;
	}
	
	@FindBy(xpath="//div[@id='mobilediscounted_price']/descendant::h4[contains(.,'Price Range')]")
	private WebElement priceRangeFilter;

	public WebElement getpriceRangeFilter() {
		return priceRangeFilter;
	}
	
	@FindBy(xpath="//div[@id='mobilecolor']/descendant::h4[contains(.,'Color')]")
	private WebElement colorFilter;

	public WebElement getcolorFilter() {
		return colorFilter;
	}
	
	@FindBy(xpath="//div[@id='mobilesize']/descendant::h4[contains(.,'Size')]")
	private WebElement sizeDrawerFilter;

	public WebElement getSizeDrawerFilter() {
		return sizeDrawerFilter;
	}
	
	@FindBy(xpath="//div[@id='mobileisActive']/descendant::h4[contains(.,'Availability')]")
	private WebElement availabilityFilter;

	public WebElement getavailabilityFilter() {
		return availabilityFilter;
	}
	
	@FindBy(xpath="//div[@id='searchModal']/descendant::div[@class='filter_h']")
	private WebElement searchFilter;

	public WebElement getsearchFilter() {
		return searchFilter;
	}
	
	@FindBy(xpath="//div[@id='searchModal']/descendant::div[@class='sort_h']")
	private WebElement searchSortBy;

	public WebElement getsearchSortBy() {
		return searchSortBy;
	}
	
//	//span[@id='st-search-icon']
//	@FindBy(xpath="//span[@id='st-search-icon']")
//	private WebElement searchIcon;
//	public WebElement getsearchIcon() {
//		return searchIcon;
//	}
	
	@FindBy(xpath="//div[@id='searchModal']/descendant::input[@id='filter-submit']")
	private WebElement FilterApply;

	public WebElement getFilterApply() {
		return FilterApply;
	}
	
	@FindBy(xpath="//div[@id='mobileisActive']/descendant::div[@class='filter-label' and contains(.,'In Stock')]")
	private WebElement InStock;

	public WebElement getInStock() {
		return InStock;
	}
	
	@FindBy(xpath="//div[@id='mobileisActive']/descendant::div[@class='filter-label' and contains(.,'Out Of Stock')]")
	private WebElement OutOfStock;

	public WebElement getOutOfStock() {
		return OutOfStock;
	}
	
	@FindBy(xpath="//div[@id='searchModal']//ul[@class='list']//div[@class='ripple-container']//span[contains(.,'Featured')]")
	private WebElement Featured;

	public WebElement getFeatured() {
		return Featured;
	}
	
	@FindBy(xpath="//span[.='Proceed to buy']")
	private WebElement proceedToBuy;
	public WebElement getproceedToBuy() {
		return proceedToBuy;
	}
	
	@FindBy(xpath="//div[@id='empty-cart-title']")
	private WebElement emptyCartTitle;
	public WebElement getemptyCartTitle() {
		return emptyCartTitle;
	}
	
	@FindBy(xpath="//div[@id='searchModal']//ul[@class='list']//div[@class='ripple-container']//span[contains(.,'New Arrivals')]")
	private WebElement NewArrivals;

	public WebElement getNewArrivals() {
		return NewArrivals;
	}
	
	@FindBy(xpath="//div[@id='searchModal']//ul[@class='list']//div[@class='ripple-container']//span[contains(.,'Price low to high')]")
	private WebElement priceLowtoHigh;

	public WebElement getpriceLowtoHigh() {
		return priceLowtoHigh;
	}
	
	@FindBy(xpath="//div[@id='searchModal']//ul[@class='list']//div[@class='ripple-container']//span[contains(.,'Price high to low')]")
	private WebElement priceHighToLow;

	public WebElement getpriceHighToLow() {
		return priceHighToLow;
	}
	
	@FindBy(xpath="//div[@id='items']/descendant::p[@id='item-card-0']")
	private WebElement cartProdTitle;

	public WebElement getcartProdTitle() {
		return cartProdTitle;
	}
	
	@FindBy(xpath="//div[@class='flex justify-end items-center']/descendant::button[@class='cart-icon-bubble']")
	private WebElement cartIcon;

	public WebElement getcartIcon() {
		return cartIcon;
	}
	
	@FindBy(xpath="//a[text()='Size Guide']")
	private WebElement sizeGuide;

	public WebElement getsizeGuide() {
		return sizeGuide;
	}
	
	@FindBy(xpath="//button[contains(.,'Notify me when available')]")
	private WebElement NotifyMeWhenAvailable;

	public WebElement getNotifyMeWhenAvailable() {
		return NotifyMeWhenAvailable;
	}
	
	@FindBy(xpath="//div[@class='form_content_container']")
	private WebElement contloForm;
	public WebElement getcontloForm() {
		return contloForm;
	}
	@FindBy(xpath="//div[@class='form_content_container']//strong[@class='ql-font-poppins']")
	private WebElement contloFormTitle;
	public WebElement getcontloFormTitle() {
		return contloFormTitle;
	}
	
	@FindBy(xpath="//a[contains(.,'Size Guide')]")
	private WebElement sizeGuideLink;
	public WebElement getsizeGuideLink() {
		return sizeGuideLink;
	}
	@FindBy(xpath="//div[@id='st-search-bar']/input[@name='q' and @type='text']")
	private WebElement searchText;
	
	@FindBy(xpath="//*[local-name()='svg' and @viewBox='0 0 17.139 20.677' ]")
	private WebElement searchClose;
	
	//@FindBy(xpath="//div[@id='mobilediscounted_price']/descendant::div[text()='Less than ₹500']")
	@FindBy(xpath="//div[@id='mobilediscounted_price']/descendant::div[contains(text(),'Less than ') and contains(text(),'500')]")
	private WebElement lessthanRs500search;

	//@FindBy(xpath="//div[@id='mobilediscounted_price']/descendant::div[text()='₹  501 - ₹ 1,000']")
	@FindBy(xpath="//div[@id='mobilediscounted_price']/descendant::div[contains(text(),'501 - ') and contains(text(),'1,000')]")
private WebElement Rs501toRs1000;

	//@FindBy(xpath="//div[@id='mobilediscounted_price']/descendant::div[text()='₹  1,001 - ₹ 1,500']")
	@FindBy(xpath="//div[@id='mobilediscounted_price']/descendant::div[contains(text(),'1,001 - ') and contains(text(),'1,500')]")
private WebElement Rs1001toRs1500;

	//@FindBy(xpath="//div[@id='mobilediscounted_price']/descendant::div[text()='₹  1,501 - ₹ 2,000']")
	@FindBy(xpath="//div[@id='mobilediscounted_price']/descendant::div[contains(text(),'1,501 - ') and contains(text(),'2,000')]")
private WebElement Rs1501toRs2000;

	//@FindBy(xpath="//div[@id='mobilediscounted_price']/descendant::div[text()='More than ₹2000']")
	@FindBy(xpath="//div[@id='mobilediscounted_price']/descendant::div[contains(text(),'More than ') and contains(text(),'2000')]")
private WebElement morethanRs2000search;
	
	public WebElement getSearchIcon() {
		return searchIcon;
	}

	public WebElement getSearchText() {
		return searchText;
	}

	public WebElement getSearchClose() {
		return searchClose;
	}

	public WebElement getParamColor(String color) {
	WebElement colortitlePDPWE = driver.findElement(By.xpath("//span[@id='selected-color-title' and contains(text(),'"+color+"')]"));
	return colortitlePDPWE;
	}
	public WebElement getParamColorPicBox(int colorIndex) {
		WebElement colorBoxPDPWE = driver.findElement(By.xpath("//div[@class='flex overflow-x-scroll hide-scrollbar']/descendant::label[@for='color-"+colorIndex+"']"));
		return colorBoxPDPWE;
		}
}
