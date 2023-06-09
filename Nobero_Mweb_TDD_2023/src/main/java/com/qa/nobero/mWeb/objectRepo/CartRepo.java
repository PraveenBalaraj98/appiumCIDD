package com.qa.nobero.mWeb.objectRepo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

/**
 * @author Praveen B
 *
 */
public class CartRepo {
	
	AndroidDriver driver;
	
	
	public CartRepo(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath="//input[@name='updates[]']")
	private List<WebElement> quantities;
	public List<WebElement> getquantities() {
		return quantities;
	}
	
	@FindBy(id="Quantity-1")
	private WebElement quantity;
	public WebElement getquantity() {
		return quantity;
	}
	
	@FindBy(xpath="//a[contains(.,'Remove')]")
	private WebElement remove;
	
	public AndroidDriver getDriver() {
		return driver;
	}
	
	@FindBy(xpath="//button[@class='icon-close-drawer ']")
	private WebElement cartCloseIcon;
	public WebElement getcartCloseIcon() {
		return cartCloseIcon;
	}
	
	@FindBy(xpath="//div[@id='items']//div[@class='flex pb-1']/p[text()='Color:']/following-sibling::p")
	private WebElement cartColorName;
	public WebElement getcartColorName() {
		return cartColorName;
	}
	
	@FindBy(xpath="//div[@id='items']//div[@class='flex pb-1']/p[text()='Size:']/following-sibling::p")
	private WebElement cartSizeName;
	public WebElement getcartSizeName() {
		return cartSizeName;
	}
	
	@FindBy(xpath="//div[@id='slick-slide30']/descendant::h3")
	private WebElement recentlyViewProdTitle;
	public WebElement getrecentlyViewProdTitle() {
		return recentlyViewProdTitle;
	}
	@FindBy(xpath="//section[@class='h-full']//section[@id='product-info']/h3")
	private List<WebElement> allRecentlyViewProdTitle;
	public List<WebElement> getallRecentlyViewProdTitle() {
		return allRecentlyViewProdTitle;
	}
		public String getrecentlyViewdProductTitle() {
			 // Find the element using XPath
	        WebElement element = this.getrecentlyViewProdTitle();

	        // Get the text of the element using JavaScript
	        JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
	        String text = (String) jsExecutor.executeScript("return arguments[0].textContent;", element);
			return text;
		}

	public WebElement getRemove() {
		return remove;
	}

	public WebElement getProceedToBuy() {
		return proceedToBuy;
	}

	@FindBy(xpath="//div[@id='footer-amount']//button[contains(.,'Proceed to buy')]")
	private WebElement proceedToBuy;
	
	@FindBy(xpath="//p[@id='item-card-0']")
	private WebElement productName;
	public WebElement ProductName() {
		return productName;
	}
	
	@FindBy(xpath="//div[@id='slick-slide40']//article[@class='pt-4']/span")
	private WebElement viewProduct;
	public WebElement geViewProduct() {
		return viewProduct;
	}
	
	@FindBy(xpath="//div[@id='items']//section[@class='product_details pl-6 w-full']//div[@class='flex text-sm font-[familySemiBold]  pb-2']/p[1]")
	private List<WebElement> productPrice;
	public List<WebElement> getProductPrice() {
		return productPrice;
	}
	
	@FindBy(xpath="//div[@id='main-cart-footer']//p[text()='Total Payable']/parent::div/p[2]")
	private WebElement TotalSummaryPrice;
	public WebElement getTotalSummaryPrice() {
		return TotalSummaryPrice;
	}
	
	@FindBy(xpath="//div[@id='footer-amount']//p")
	private WebElement TotalPayablePrice;
	public WebElement getTotalPayablePrice() {
		return TotalPayablePrice;
	}
	
	@FindBy(xpath="//*[local-name()='svg' and @class='icon icon-plus']")
	private List<WebElement> plusIcon;
	public List<WebElement> getPlusIcon() {
		return plusIcon;
	}
	
	@FindBy(xpath="//*[local-name()='svg' and @class='icon icon-minus']")
	private WebElement minusIcon;
	public WebElement getminusIcon() {
		return minusIcon;
	}
	
	@FindBy(xpath="//div[@id='items']/div")
	private List<WebElement> products;
	public List<WebElement> getproducts() {
		return products;
	}
	@FindBy(xpath="//p[contains(.,'Your Cart Is Empty')]")
	private WebElement yourCartIsEmpty;
	public WebElement getyourCartIsEmpty() {
		return yourCartIsEmpty;
	}
	
	@FindBy(xpath="//div[@class='cart-recently-viewed sliderContainer slick-initialized slick-slider slick-dotted']")
	private WebElement recentlyViewdProductCartSection;
	public WebElement getrecentlyViewdProductCartSection() {
		return recentlyViewdProductCartSection;
	}
	
	@FindBy(xpath="//div[@id='main-cart-items']//div[@id='sales_countdown']")
	private WebElement salesCount;
	public WebElement getsalesCount() {
		return salesCount;
	}
	
	public void cartClose(AndroidDriver driver) {
		driver.findElement(By.xpath("//div[@class='slider__empty h-full w-[10%] lg:w-[65%] z-[999] bg-transparent overflow-hidden']")).click();
	}
	
	public String getQuantity(AndroidDriver driver) {
		WebElement textField = this.getquantity();

		// Create the JavaScript executor
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Retrieve the value of the disabled text field using JavaScript
		String value = (String) js.executeScript("return arguments[0].value;", textField);
		
		return value;
	}
	
	public String getQuantityList(AndroidDriver driver, WebElement WE ) {
		// Create the JavaScript executor
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Retrieve the value of the disabled text field using JavaScript
		String value = (String) js.executeScript("return arguments[0].value;", WE);
		
		return value;
	}
	
	
	@FindBy(xpath="//div[@class='pt-[3.3rem] lg:pt-[3.9rem]']//a[text()='Details' and @href='#main-cart-footer']")
	private WebElement detailsDrawer;

	
	public WebElement getdetailsDrawer() {
		return detailsDrawer;
	}
	
	public void IncrementProductCount(int count) {
		this.plusIcon.get(count).click();
		
	}
	
}
