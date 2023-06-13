package com.qa.nobero.cartTest;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.qa.nobero.genericutility.BaseClass;
import com.qa.nobero.genericutility.JavaUtility;
import com.qa.nobero.genericutility.WebDriverUtility;
import com.qa.nobero.mWeb.objectRepo.RepositoryHub;
@Listeners(com.qa.nobero.genericutility.ITestListenerImpClass.class)
public class cartTest extends BaseClass {
	List<WebElement> priceList;
	JavaUtility jUtil = new JavaUtility();
	WebDriverUtility wUtil = new WebDriverUtility();

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,groups = { "smoke", "regression" })
	public void ToVerifyProductIsAddedToCartTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step1: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step2: Click on Men Collection
		repo.getHamburgerRepo().getMen().click();
		repo.getHamburgerRepo().getMenCoordSets().click();

		//Step3: Click on 1st Product and fetch the Product name.                                                    
		repo.getPLPRepo().getProducts().get(0).click();
		//Step5: Add the Product To Cart
		repo.getPDPRepo().getAddToCart().click();

		//Step6: Check Proceed to buy is enabled
			Assert.assertTrue(repo.getCartRepo().getProceedToBuy().isEnabled());
		
		
	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,groups = { "smoke", "regression" })
	public void ToVerifyProductIsAddedToCartAfterSearchTest() {

		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//CLick on Search icon	
		repo.getSearchRepo().getSearchIcon().click();

		//Search for product - "Shirt"
		repo.getSearchRepo().getSearchText().sendKeys("Joggers");

		//Search Close
		repo.getSearchRepo().getSearchClose().click();
		
		//Step9: Click on 1st Product and fetch the Product name.                                                   
		repo.getSearchRepo().getProduct().click();

		//Add the Product To Cart
		repo.getPDPRepo().getAddToCart().click();

		//Step7: Check Proceed to buy is enabled
		Assert.assertTrue(repo.getCartRepo().getProceedToBuy().isEnabled());
	}
	
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,groups = { "sanity", "regression" })
	public void ToVerifyApplyFilterforColorTest() {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step1: Click on Hamburger icon
				repo.getHomeRepo().getHamburger().click();

				//Step2: Click on Men Collection
				repo.getHamburgerRepo().getMen().click();
				repo.getHamburgerRepo().getMenCoordSets().click();

				//Step3: Click on  Filter 
				repo.getPLPRepo().getFilter().click();

				//Step4: Click on color
				repo.getPLPRepo().getFilterColor().click();

				//Step5: click on any color
				repo.getPLPRepo().selectColor(2);
				
				//Step6: Click On Apply
				repo.getPLPRepo().getApply().click();

				//Step7: Click on 1st Product.                                                    
				repo.getPLPRepo().getProducts().get(0).click();

				//Step8: Add the Product To Cart
				repo.getPDPRepo().getAddToCart().click();

				//Step9: Check Proceed to buy is enabled
				Assert.assertTrue(repo.getCartRepo().getProceedToBuy().isEnabled());
			
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,groups = { "sanity", "regression" })
	public void ToVerifyApplyFilterforSizeTest() {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step1: Click on Hamburger icon
				repo.getHomeRepo().getHamburger().click();

				//Step2: Click on Men Collection
				repo.getHamburgerRepo().getMen().click();
				repo.getHamburgerRepo().getMenCoordSets().click();

				//Step3: Click on  Filter 
				repo.getPLPRepo().getFilter().click();

				//Step4: Click on color
				repo.getPLPRepo().getFilterSize().click();

				//Step5: click on any color
				repo.getPLPRepo().selectSize("M");
				
				//Step6: Click On Apply
				repo.getPLPRepo().getApply().click();

				//Step7: Click on 1st Product.                                                    
				repo.getPLPRepo().getProducts().get(0).click();

				//Step8: Add the Product To Cart
				repo.getPDPRepo().getAddToCart().click();

				//Step9: Check Proceed to buy is enabled
				Assert.assertTrue(repo.getCartRepo().getProceedToBuy().isEnabled());
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,groups = { "sanity", "regression" })
	public void ToVerifyApplyFilterforAvailabilityTest() {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step1: Click on Hamburger icon
				repo.getHomeRepo().getHamburger().click();

				//Step2: Click on Men Collection
				repo.getHamburgerRepo().getMen().click();
				repo.getHamburgerRepo().getMenCoordSets().click();

				//Step3: Click on  Filter 
				repo.getPLPRepo().getFilter().click();

				//Step4: Click on Availability
				repo.getPLPRepo().getFilterAvailability().click();

				//Step5: Click on 'In Stock'
				repo.getPLPRepo().getInStockradio().click();

				//Step6: Click On Apply
				repo.getPLPRepo().getApply().click();

				//Step7: Click on 1st Product.                                                    
				repo.getPLPRepo().getProducts().get(0).click();

				//Step8: Add the Product To Cart
				repo.getPDPRepo().getAddToCart().click();

				//Step9: Check Proceed to buy is enabled
				Assert.assertTrue(repo.getCartRepo().getProceedToBuy().isEnabled());
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,groups = { "sanity", "regression" })
	public void ToVerifySortByBestSellingTest() {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step1: Click on Hamburger icon
				repo.getHomeRepo().getHamburger().click();

				//Step2: Click on Men Collection
				repo.getHamburgerRepo().getMen().click();
				repo.getHamburgerRepo().getMenCoordSets().click();

				//Step3: Click on Sort
				repo.getPLPRepo().getSortBy().click();

				//Step4: Click on Best Selling
				repo.getPLPRepo().getBestSelling().click();

				//Step5: Click on 1st Product                                                 
				repo.getPLPRepo().getProducts().get(0).click();
				//Step7: Add the Product To Cart
				repo.getPDPRepo().getAddToCart().click();

				//Step8: Check Proceed to buy is enabled
				Assert.assertTrue(repo.getCartRepo().getProceedToBuy().isEnabled());
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,groups = { "sanity", "regression" })
	public void ToVerifySortByFeaturedTest() {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step1: Click on Hamburger icon
				repo.getHomeRepo().getHamburger().click();

				//Step2: Click on Men Collection
				repo.getHamburgerRepo().getMen().click();
				repo.getHamburgerRepo().getMenCoordSets().click();

				//Step3: Click on Sort
				repo.getPLPRepo().getSortBy().click();

				//Step4: Click on Featured
				repo.getPLPRepo().getFeatured().click();

				//Step5: Click on 1st Product                                                 
				repo.getPLPRepo().getProducts().get(0).click();

				//Step7: Add the Product To Cart
				repo.getPDPRepo().getAddToCart().click();

				//Step8:  Check Proceed to buy is enabled
				Assert.assertTrue(repo.getCartRepo().getProceedToBuy().isEnabled());
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,groups = { "sanity", "regression" })
	public void ToVerifySortByNewArrivalTest() {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step1: Click on Hamburger icon
				repo.getHomeRepo().getHamburger().click();

				//Step2: Click on Men Collection
				repo.getHamburgerRepo().getMen().click();
				repo.getHamburgerRepo().getMenCoordSets().click();

				//Step3: Click on Sort
				repo.getPLPRepo().getSortBy().click();
				
				//Step4: Click on New Arrival
				repo.getPLPRepo().getNewArrivals().click();

				//Step5: Click on 1st Product                                                 
				repo.getPLPRepo().getProducts().get(0).click();

				//Step7: Add the Product To Cart
				repo.getPDPRepo().getAddToCart().click();

				//Step8:  Check Proceed to buy is enabled
				Assert.assertTrue(repo.getCartRepo().getProceedToBuy().isEnabled());
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,groups = { "sanity", "regression" })
	public void ToVerifySortByPriceLowToHighTest() {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step1: Click on Hamburger icon
				repo.getHomeRepo().getHamburger().click();

				//Step2: Click on Men Collection
				repo.getHamburgerRepo().getMen().click();
				repo.getHamburgerRepo().getMenCoordSets().click();

				//Step3: Click on Sort
				repo.getPLPRepo().getSortBy().click();

				//Step4: Click on PriceLowToHigh
				repo.getPLPRepo().getPriceLowToHigh().click();

				//Step5: Click on 1st Product                                                 
				repo.getPLPRepo().getProducts().get(0).click();
				//Step7: Add the Product To Cart
				repo.getPDPRepo().getAddToCart().click();

				//Step8:  Check Proceed to buy is enabled
				Assert.assertTrue(repo.getCartRepo().getProceedToBuy().isEnabled());
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,groups = { "sanity", "regression" })
	public void ToVerifySortByPriceHighToLowTest() {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step1: Click on Hamburger icon
				repo.getHomeRepo().getHamburger().click();

				//Step2: Click on Men Collection
				repo.getHamburgerRepo().getMen().click();
				repo.getHamburgerRepo().getMenCoordSets().click();

				//Step3: Click on Sort
				repo.getPLPRepo().getSortBy().click();

				//Step4: Click on PriceHighToLow
				repo.getPLPRepo().getPriceHightolow().click();

				//Step5: Click on 1st Product                                                 
				repo.getPLPRepo().getProducts().get(0).click();

				//Step7: Add the Product To Cart
				repo.getPDPRepo().getAddToCart().click();

				//Step8:  Check Proceed to buy is enabled
				Assert.assertTrue(repo.getCartRepo().getProceedToBuy().isEnabled());
	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true, groups = { "regression" })
	public void ToVerifyProductSalesCountisEnabledInCartpageTest() throws InterruptedException {  
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);
				
				//Step1: Click on Hamburger icon
				repo.getHomeRepo().getHamburger().click();

				//Step2: Click on Men Collection
				repo.getHamburgerRepo().getMen().click();
				repo.getHamburgerRepo().getMenCoordSets().click();
				
				//Step3: Click on 1st Product                                                 
				repo.getPLPRepo().getProducts().get(0).click();
				
				//Click on add to cart
				repo.getPDPRepo().getAddToCart().click();
				
				//Click on cart icon
				//repo.getHomeRepo().getCartIcon().click();
				
				//Fetch The sales timer and validate if timer is running
				int salesTimerPre = jUtil.extractNumbers(repo.getCartRepo().getsalesCount().getText().trim()) ;
				Thread.sleep(5000);
				int salesTimerPost = jUtil.extractNumbers(repo.getCartRepo().getsalesCount().getText().trim()) ;
				//System.out.println(salesTimerPre+"  "+salesTimerPost);
				Assert.assertFalse((salesTimerPre==salesTimerPost));
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true, groups = { "smoke", "regression" })
	public void ToVerifyTotalCartSummaryTest() throws InterruptedException {  
				//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);
				
				//Step1: Click on Hamburger icon
				repo.getHomeRepo().getHamburger().click();

				//Step2: Click on Men Collection
				repo.getHamburgerRepo().getMen().click();
				repo.getHamburgerRepo().getMenCoordSets().click();
				
				//Step3: Click on 1st Product                                                 
				repo.getPLPRepo().getProducts().get(0).click();
				
				//Click on add to cart
				repo.getPDPRepo().getAddToCart().click();
				
				//Close cart page
				repo.getCartRepo().cartClose(driver);
				Thread.sleep(2000);
				
				//Go Back to PLP page
				driver.navigate().back();
				
				//Step3: Click on Product                                                 
				repo.getPLPRepo().getProducts().get(1).click();
				
				//Click on add to cart
				repo.getPDPRepo().getAddToCart().click();
				
				//Close cart page
				repo.getCartRepo().cartClose(driver);
				Thread.sleep(2000);
				
				//Click on product from similar products
				wUtil.scrollToPoint(driver, "0", "1400");
				Thread.sleep(4000);
				repo.getPDPRepo().getsimilarProduct().click();
				
				//Add to cart
				repo.getPDPRepo().getAddToCart().click();
				
				//Close cart page
				repo.getCartRepo().cartClose(driver);
				Thread.sleep(2000);
				
				//Click on product from recently viewed products
				//wUtil.scrollToPoint(driver, "0", "1700");
				wUtil.scrollToElementXAndY(driver, repo.getPDPRepo().getrecentlyViewdProduct().get(0));
				Thread.sleep(4000);
				repo.getPDPRepo().getrecentlyViewdProduct().get(1).click();
				
				//Click on add to cart 
				repo.getPDPRepo().getAddToCart().click();
				
				//Click on details drawer
				driver.navigate().refresh();
				repo.getHomeRepo().getCartIcon().click();
				
				Thread.sleep(2000);	
				//Click on product in you may also like
			    wUtil.scrollToElementJS(driver, repo.getCartRepo().geViewProduct());
			    repo.getCartRepo().geViewProduct().click();
			    
		Thread.sleep(4000);
			    //Add to cart
				repo.getPDPRepo().getAddToCart().click();
				
				try {
					repo.getCartRepo().getdetailsDrawer().click();
				} catch (Exception e) {
					 wUtil.scrollToElementJS(driver, repo.getCartRepo().geViewProduct());
				}
				//Fetch summation of all the product price
				List<WebElement> productPriceList = repo.getCartRepo().getProductPrice();
				List<WebElement> QuantityList = repo.getCartRepo().getquantities();
				float totalPrice = 0 ;
				int count=0;
				for (WebElement productPriceWE : productPriceList) {
					String qty = repo.getCartRepo().getQuantityList(driver, QuantityList.get(count));
					int qnty = Integer.parseInt(qty);
					float Price = jUtil.extractAmount(productPriceWE.getText());
					float productPrice = Price*qnty;
					//System.out.println(Price+" x "+qnty+" = "+productPrice);
					totalPrice=totalPrice+productPrice;
					count++;
				}
				
				//Fetch the Total Payable amount
				float TotalPayablePrice = jUtil.extractAmount(repo.getCartRepo().getTotalPayablePrice().getText());
				
				//Fetch the Total summary amount
				float TotalSummaryPrice = jUtil.extractAmount(repo.getCartRepo().getTotalSummaryPrice().getText());
				
				//Validate the Total Payable price
				Assert.assertEquals(totalPrice, TotalPayablePrice);
				
				//Validate the Total Summary price
				Assert.assertEquals(totalPrice, TotalSummaryPrice);
				
	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, groups = { "regression" })
	public void ToVerifyThatProductIsIncrementedinCartPageTest() throws InterruptedException {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);
		
		//Step1: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step2: Click on Men Collection
		repo.getHamburgerRepo().getMen().click();
		repo.getHamburgerRepo().getMenCoordSets().click();
		
		//Step3: Click on 1st Product                                                 
		repo.getPLPRepo().getProducts().get(0).click();
		
		//Click on add to cart
		repo.getPDPRepo().getAddToCart().click();
		
		//Get the quantity in cart
		int qunatityPre = Integer.parseInt(repo.getCartRepo().getQuantity(driver));
		
		//Click on Plus icon
		int IncrementClick = 3;
		for (int i = 0; i < IncrementClick; i++) {
			repo.getCartRepo().getPlusIcon().get(0).click();
			Thread.sleep(2000);
		}
		
		int qunatityPost = Integer.parseInt(repo.getCartRepo().getQuantity(driver));
		Assert.assertEquals((qunatityPre+IncrementClick), qunatityPost);
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class,groups = { "regression" })
	public void ToVerifyThatProductIsDecrementeInCartPageTest() throws InterruptedException {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);
		
		//Step1: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step2: Click on Men Collection
		repo.getHamburgerRepo().getMen().click();
		repo.getHamburgerRepo().getMenCoordSets().click();
		
		//Step3: Click on 1st Product                                                 
		repo.getPLPRepo().getProducts().get(0).click();
		
		//Click on add to cart
		repo.getPDPRepo().getAddToCart().click();
		
		//Get the quantity in cart
		
		int qunatityPre = Integer.parseInt(repo.getCartRepo().getQuantity(driver));
		
		//Close cart page
		//repo.getCartRepo().cartClose(driver);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//Increment the product quantity by clicking on 'Add to cart'
		int Click = 3;
		for (int i = 0; i < Click; i++) {
			
			repo.getPDPRepo().getAddToCart().click();
			driver.navigate().refresh();
			Thread.sleep(2000);
			//repo.getCartRepo().getcartCloseIcon().click();
			
		}
		
		repo.getHomeRepo().getCartIcon().click();
		//Get the quantity in cart after incrementing
		int qunatityPostIncr = Integer.parseInt(repo.getCartRepo().getQuantity(driver));
		
		//Click on minus icon
		for (int i = 0; i < Click; i++) {
			repo.getCartRepo().getminusIcon().click();
			Thread.sleep(2000);
		}	
		
		//Get the quantity in cart after decrementing
		int qunatityPostDecr = Integer.parseInt(repo.getCartRepo().getQuantity(driver));
		
		//Validate the product quantities
		Assert.assertEquals(qunatityPostDecr, qunatityPre, (qunatityPostIncr-Click));
	
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, groups = { "regression" })
	public void ToVerifyThatProductRemoveFeatureIsEnabledInCartPageTest() throws InterruptedException {
		
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);
		
		//Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Click on Men Collection
		repo.getHamburgerRepo().getMen().click();
		repo.getHamburgerRepo().getMenCoordSets().click();
		
		//Add the product 3 times
				//Click on Product                                                 
				repo.getPLPRepo().getProducts().get(1).click();
				
				//Click on add to cart
				repo.getPDPRepo().getAddToCart().click();
				
				//Close cart page
				//repo.getCartRepo().cartClose(driver);
				Thread.sleep(2000);
				driver.navigate().refresh();
				
		
		//Validate the cart count
		int cartCount = Integer.parseInt(repo.getHomeRepo().getCartItemCount().getText().trim());
		int Iteration=1;
		Assert.assertEquals(Iteration, cartCount);
		
		//Click on Cart icon
		repo.getHomeRepo().getCartIcon().click();
		
		//Fetch the products count in cart page
		int productCount = repo.getCartRepo().getproducts().size();
		
		Assert.assertEquals(cartCount, productCount);
		
		//Click on remove
		for (int i = 0; i < Iteration; i++) {
		repo.getCartRepo().getRemove().click();
		}
		
		//Validate the empty cart page
		Assert.assertTrue(repo.getCartRepo().getyourCartIsEmpty().isDisplayed());
		
	}
	
	

	

}
