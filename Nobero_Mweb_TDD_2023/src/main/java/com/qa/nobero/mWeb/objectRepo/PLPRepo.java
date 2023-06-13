package com.qa.nobero.mWeb.objectRepo;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class PLPRepo {

	AndroidDriver driver;
	public  PLPRepo(AndroidDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//h3[contains(.,'items')]")
	private WebElement items;
	
	@FindBy(xpath="//article[@id='product_price']//span[@class='font-[familyMedium] text-sm text-[#121212] pr-1 lg:text-base ']")
	private List<WebElement> ProductPriceList;
	public List<WebElement> getProductPriceList() {
		return ProductPriceList;
	}

	@FindBy(xpath="//article[@id='product-grid']/section[@class='product-card-container h-full']")
	private List<WebElement> products;
	
	@FindBy(xpath="//article[@id='product-grid']/section//h3")
	private WebElement productName;
	
	@FindBy(xpath="//article[@id='product-grid']/section//h3/..//article[@id='price__regular']")
	private WebElement productPrice;
	
	@FindBy(xpath="//article[@id='filter_button']")
	private WebElement filter;
	
	@FindBy(xpath="//form[@id='submit-mobile-form']//span[text()='Price']")
	private WebElement filterPrice;
	
	@FindBy(xpath="//form[@id='submit-mobile-form']//span[text()='Color']")
	private WebElement filterColor;
	
	@FindBy(xpath="//form[@id='submit-mobile-form']//span[text()='Size']")
	private WebElement filterSize;
	
	@FindBy(xpath="//form[@id='submit-mobile-form']//span[text()='Availability']")
	private WebElement filterAvailability;
	
	@FindBy(xpath="//a[text()='Clear All' and @id='clear-all-fitlers']")
	private WebElement clearAll;
	
	@FindBy(xpath="//input[@id='filter-submit']")
	private WebElement Apply;
	
	@FindBy(xpath="//article[@id='filter_header']/button[@id='filter_close_btn']")
	private WebElement closeFilter;

	
	@FindBy(xpath="//form[@id='submit-mobile-form']//details[@class='filter-group']//li[@class='flex flex-col pt-[18px] pl-1  show-color ']")
	private WebElement firstColor;
	
	@FindBy(xpath="//form[@id='submit-mobile-form']//details[@class='filter-group']//span[contains(.,'+ Show')]")
	private WebElement showMoreColor;
	
	@FindBy(xpath="//form[@id='submit-mobile-form']//details[@class='filter-group']//span[contains(.,'- Hide')]")
	private WebElement hideColor;
	
	@FindBy(xpath="//section[@id='filter_container']//details[@class='filter-group']//ul[@class='grid grid-cols-4 px-3 lg:px-0 pb-5']/li")
	private WebElement filterBySize;
	
	@FindBy(xpath="//section[@id='filter_container']//details[@class='filter-group']//span[text()='In stock']")
	private WebElement inStockradio;
	
	@FindBy(xpath="//section[@id='filter_container']//details[@class='filter-group']//span[text()='Out of stock']")
	private WebElement OutOfStockradio;
	
	@FindBy(xpath="//article[@id='sort_dropdown']//span[text()='Featured']")
	private WebElement featured;
	
	@FindBy(xpath="//article[@id='sort_button']")
	private WebElement sortBy;
	
	@FindBy(xpath="//article[@id='sort_dropdown']//span[text()='New Arrivals']")
	private WebElement newArrivals;
	
	@FindBy(xpath="//article[@id='sort_dropdown']//span[text()='Best Selling']")
	private WebElement bestSelling;
	
	@FindBy(xpath="//article[@id='sort_dropdown']//span[text()='Price low to High']")
	private WebElement priceLowToHigh;
	
	@FindBy(xpath="//article[@id='sort_dropdown']//span[text()='Price High to low']")
	private WebElement priceHightolow;
	
	@FindBy(xpath="//article[@id='sort_header']/button[@id='sort_close_btn']")
	private WebElement closeSort;
	
	
	//@FindBy(xpath="//form[@id='submit-mobile-form']/descendant::span[text()='Less than ₹500']")
	@FindBy(xpath="//form[@id='submit-mobile-form']/descendant::span[contains(text(),'Less than') and contains(text(),'500')]")

	private WebElement lessthanRs500;

	//@FindBy(xpath="//form[@id='submit-mobile-form']/descendant::span[text()='₹500 - ₹1000']")
	@FindBy(xpath="//form[@id='submit-mobile-form']/descendant::span[contains(text(),'500 - ') and contains(text(),'1000')]")

	private WebElement Rs500toRs1000;

	//@FindBy(xpath="//form[@id='submit-mobile-form']/descendant::span[text()='₹1000 - ₹1500']")
	@FindBy(xpath="//form[@id='submit-mobile-form']/descendant::span[contains(text(),'1000 - ') and contains(text(),'1500')]")
	private WebElement Rs1000toRs1500;

	//@FindBy(xpath="//form[@id='submit-mobile-form']/descendant::span[text()='₹1500 - ₹2000']")
	@FindBy(xpath="//form[@id='submit-mobile-form']/descendant::span[contains(text(),'1500 - ') and contains(text(),'2000')]")
	private WebElement Rs1500toRs2000;

	@FindBy(xpath="//form[@id='submit-mobile-form']/descendant::span[contains(text(),'More than') and contains(text(),'2000')]")
   // @FindBy(xpath="//form[@id='submit-mobile-form']/descendant::span[text()='More than ₹2000']")
	private WebElement morethanRs2000;
	
	@FindBy(xpath="//form[@id='submit-mobile-form']/descendant::section[@class='pb-5']/ul/li/span")
	private List<WebElement> eachColorName;

	@FindBy(xpath="//link[@rel='stylesheet']/../section//h1")
	private WebElement PLPTitle;
	public WebElement getPLPTitle() {
		return PLPTitle;
	}
	@FindBy(xpath="//link[@rel='stylesheet']/../section//h3")
	private WebElement PLPcount;
	public WebElement getPLPcount() {
		return PLPcount;
	}
	
	@FindBy(xpath="//div[@id='image-container']//span[@class='text-[#242F66] pl-0.5 font-[familyMedium] text-xs lg:text-sm']")
	private WebElement PLPReviewCount;
	public WebElement getPLPReviewCount() {
		return PLPReviewCount;
	}
	
	@FindBy(xpath="//form[@id='submit-mobile-form']/descendant::section[@class='pb-5']/ul/li/div")
	private List<WebElement> eachColor;
	public List<WebElement> geteachColor() {
		return eachColor;
	}
	public int FetchReviewCountAndClickProduct(int Index)
	{
		String review = this.getPLPReviewCount().getText().trim();
		String[] parts = review.split(" \\| ");
		
		String secondPart = parts[1]; 
		
		int reviewCount = Integer.parseInt(secondPart);
		this.getPLPReviewCount().click();
		return reviewCount;
	}
	
	public WebElement getLessthanRs500() {
		return lessthanRs500;
	}

	public WebElement getRs500toRs1000() {
		return Rs500toRs1000;
	}
	public WebElement getRs1000toRs1500() {
		return Rs1000toRs1500;
	}

	public WebElement getRs1500toRs2000() {
		return Rs1500toRs2000;
	}

	public WebElement getMorethanRs2000() {
		return morethanRs2000;
	}

	public List<WebElement> getEachColorName() {
		return eachColorName;
	}

	public WebElement getBestSelling1() {
		return bestSelling;
	}

	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getItems() {
		return items;
	}

	public List<WebElement> getProducts() {
		return products;
	}

	public WebElement getProductName() {
		return productName;
	}

	public WebElement getProductPrice() {
		return productPrice;
	}

	public WebElement getFilter() {
		return filter;
	}

	public WebElement getFilterPrice() {
		return filterPrice;
	}

	public WebElement getFilterColor() {
		return filterColor;
	}

	public WebElement getFilterSize() {
		return filterSize;
	}

	public WebElement getFilterAvailability() {
		return filterAvailability;
	}

	public WebElement getClearAll() {
		return clearAll;
	}

	public WebElement getApply() {
		return Apply;
	}

	public WebElement getCloseFilter() {
		return closeFilter;
	}

	public WebElement getFilterByColor() {
		return firstColor;
	}

	public WebElement getShowMoreColor() {
		return showMoreColor;
	}

	public WebElement getHideColor() {
		return hideColor;
	}

	public WebElement getFilterBySize() {
		return filterBySize;
	}

	public WebElement getInStockradio() {
		return inStockradio;
	}

	public WebElement getOutOfStockradio() {
		return OutOfStockradio;
	}

	public WebElement getFeatured() {
		return featured;
	}

	public WebElement getSortBy() {
		return sortBy;
	}

	public WebElement getNewArrivals() {
		return newArrivals;
	}

	public WebElement getBestSelling() {
		return bestSelling;
	}

	public WebElement getPriceLowToHigh() {
		return priceLowToHigh;
	}

	public WebElement getPriceHightolow() {
		return priceHightolow;
	}

	public WebElement getCloseSort() {
		return closeSort;
	}
	
	public void selectColor(int index) {	
		List<WebElement> list = this.getEachColorName();
		int count = 0;
		for (WebElement webElement : list) {
			count++;
			if (count==index) {
				webElement.click();
			}
		}	
	}
	
	public String GetColorName(int index) throws InterruptedException {	
		List<WebElement> list = this.getEachColorName();
		int count = 0;
		String colorName = "";
		for (WebElement webElement : list) {
			count++;
			if (count==index) {
				colorName = webElement.getText().trim();
			}
		}
		return colorName;
	}
	public void ClickOnColor(int index) throws InterruptedException {	
		List<WebElement> list = this.getEachColorName();
		int count = 0;
		for (WebElement webElement : list) {
			count++;
			if (count==index) {
			 webElement.click();
			}
		}
	
	}
	
	
	
	
	@FindBy(xpath="//form[@id='submit-mobile-form']//li[@class='flex pt-[18px] pl-1  ']")
	private List<WebElement> eachSize;
	public List<WebElement> geteachSize() {
		return eachSize;
	}
	public void selectSize(int string) {
		List<WebElement> list = this.geteachSize();
		int count = 0;
			for (WebElement webElement : list) {
				count++;
				if (count==string) {
				 webElement.click();
				}
			}
				
	}
	
	
	
	public void selectSize(String Size) {
		
		List<WebElement> list = this.geteachSize();
		for (WebElement webElement : list) {
			String sizeWE = webElement.getText();
			if (sizeWE.equals(Size)) {
				webElement.click();
			}
		}	
	}

	//method for price filter and color and size
	@FindBy(xpath="//form[@id='submit-mobile-form']//li[@class='flex pt-[18px] pl-1  ']//span[@class='size-label text-[#484B5A] text-base']")
	private List<WebElement> allSizeName;
	public List<WebElement> getAllSizeName() {
		return allSizeName;
	}
	
	public String GetSizeName(int index) {
		List<WebElement> list = this.getAllSizeName();
		int count = 0;
		String sizeName = "";
		for (WebElement webElement : list) {
			count++;
			if (count==index) {
				sizeName = webElement.getText().trim();
			}
		}
		return sizeName;
	}
	public void ScrollAllProducts(AndroidDriver driver) {
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
