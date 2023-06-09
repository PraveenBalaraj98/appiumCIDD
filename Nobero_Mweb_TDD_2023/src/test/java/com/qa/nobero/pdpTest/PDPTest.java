package com.qa.nobero.pdpTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.nobero.genericutility.BaseClass;
import com.qa.nobero.genericutility.JavaUtility;
import com.qa.nobero.genericutility.WebDriverUtility;
import com.qa.nobero.mWeb.objectRepo.RepositoryHub;


public class PDPTest extends BaseClass	{

	JavaUtility jUtil = new JavaUtility();
	WebDriverUtility wUtil = new WebDriverUtility();


	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, groups = {"smoke","regression"}, enabled = true)
	public void ToVerifyRecentlyViewedIsFunctionalTest() throws InterruptedException {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);
		ArrayList<String> ProdList = new ArrayList<String>();
		ArrayList<String> ProdListRV = new ArrayList<String>();
		
		//Step2: Click on Men Collection
		repo.getHomeRepo().getWomens().click();

		//Step3: Click on 1st Product and fetch the Product name.                                                    
		repo.getPLPRepo().getProducts().get(0).click();

		//Fetch The product title
		String PDP1ProductTitle = repo.getPDPRepo().getProductTitle().getText();
		ProdList.add(PDP1ProductTitle);

		//Step4: Scroll the page to similar products
		new WebDriverUtility().scrollToPoint(driver, "0", "1500");		

		//Step7: Click on any products in similar products
		repo.getPDPRepo().getsimilarProduct().click();

		//Fetch The product title
		String PDP2ProductTitle = repo.getPDPRepo().getProductTitle().getText();
		ProdList.add(PDP2ProductTitle);

		//Step8: click on cart icon
		repo.getHomeRepo().getCartIcon().click();

		//Step10: check whether the previously viewed product is displayed in recently viewed section in empty cart page
		String cartrv2_ProductTitle = repo.getCartRepo().getrecentlyViewdProductTitle().trim();
		Assert.assertEquals(PDP2ProductTitle, cartrv2_ProductTitle);

		//Step :Close cart page
		repo.getCartRepo().getcartCloseIcon().click();

		//Step6: Scroll the page to similar products
		new WebDriverUtility().scrollToPoint(driver, "0", "1500");	

		//Step7: Click on any products in similar products
		repo.getPDPRepo().getsimilarProduct().click();

		//Fetch The product title
		String PDP3ProductTitle = repo.getPDPRepo().getProductTitle().getText();
		ProdList.add(PDP3ProductTitle);

		//Step8: click on cart icon
		repo.getHomeRepo().getCartIcon().click();

		//Step10: check whether the previously viewed product is displayed in recently viewed section in empty cart page
		String cartrv3_ProductTitle = repo.getCartRepo().getrecentlyViewdProductTitle().trim();
		Assert.assertEquals(PDP3ProductTitle, cartrv3_ProductTitle);

		// Swipe the products in cart check if it is swipe
		//Close cart page
		repo.getCartRepo().getcartCloseIcon().click();
		
		// Scroll the page to recently viewed
				new WebDriverUtility().scrollToPoint(driver, "0", "2000");

				//Step9: check whether the previously viewed product is displayed in recently viewed section 
				String pdpRV_ProdTitle = repo.getPDPRepo().getrecentlyViewdProductName().getText().trim();
				Assert.assertEquals(PDP2ProductTitle, pdpRV_ProdTitle);

		// Find the element representing the current image
		

		// check whether the last viewed product is displayed in recently viewed section 

		// Swipe the products check if it is swipe
				repo.getHomeRepo().getCartIcon().click();
				List<WebElement> cartProdListRV = repo.getCartRepo().getallRecentlyViewProdTitle();
				for (WebElement ProdName : cartProdListRV) {
					ProdListRV.add(ProdName.getText());
					
					//Slide the Recently Viewed section
					wUtil.slideSectionFromRightToLeft(driver, repo.getCartRepo().getrecentlyViewdProductCartSection());
				
				}
				for (String ProdName : ProdList) {
					Assert.assertTrue(ProdListRV.contains(ProdName));
				}
				
	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, groups = {"regression"})
	public void ToVerifyProductSalesTimerisEnabledInPDPpage() throws InterruptedException{
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step1: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step2: Click on Men Collection
		repo.getHamburgerRepo().getMen().click();
		repo.getHamburgerRepo().getMenCoordSets().click();

		//Step3: Click on 1st Product                                                 
		repo.getPLPRepo().getProducts().get(0).click();

		//Fetch The sales timer and validate if timer is running
		int salesTimerPre = jUtil.extractNumbers(repo.getPDPRepo().getsalesCount().getText().trim()) ;
		Thread.sleep(5000);
		int salesTimerPost = jUtil.extractNumbers(repo.getPDPRepo().getsalesCount().getText().trim()) ;
		Assert.assertFalse((salesTimerPre==salesTimerPost));
	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, groups = {"smoke","regression"})
	public void ToVerifyProductImageisSlidingFromRightToLeftTest() throws InterruptedException{
		
		
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step1: Click on Hamburger icon
				repo.getHomeRepo().getHamburger().click();

				//Step2: Click on Men Collection
				repo.getHamburgerRepo().getMen().click();
				repo.getHamburgerRepo().getMenCoordSets().click();

		// Click on 1st Product                                                 
		repo.getPLPRepo().getProducts().get(0).click();

		// Find the slider element using a locator (e.g., ID, class name, etc.)
		int productImageSection = repo.getPDPRepo().getAllProductImages().size();

		//Slide the image from Right To Left
		for (int i = 0; i < productImageSection; i++) {
			wUtil.slideSectionFromRightToLeft(driver,repo.getPDPRepo().getproductImage());
		}

	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, groups = { "regression"})
	public void ToVerifyProductImageisSlidingFromLeftToRight() throws InterruptedException{
		
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step1: Click on Hamburger icon
				repo.getHomeRepo().getHamburger().click();

				//Step2: Click on Men Collection
				repo.getHamburgerRepo().getMen().click();
				repo.getHamburgerRepo().getMenCoordSets().click();

				
		// Click on 1st Product                                                 
		repo.getPLPRepo().getProducts().get(0).click();

		// Find the slider element using a locator (e.g., ID, class name, etc.)
		int productImageSection = repo.getPDPRepo().getAllProductImages().size();

		//Slide the image from Right To Left
		for (int i = 0; i < productImageSection; i++) {
			wUtil.slideSectionFromLeftToRight(driver,repo.getPDPRepo().getproductImage());;
		}

	}
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, groups = {"regression"})
	public void ToVerifyProductZoomFeatureIsEnabled() throws InterruptedException{
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);
		
		//Step1: Click on bestseller 
		repo.getHomeRepo().getMens().click();

		// Click on 1st Product                                                 
		repo.getPLPRepo().getProducts().get(0).click();

		//Click on Product image
		repo.getPDPRepo().getAllProductImages().get(1).click();

		//Click on Zoom In Feature
		while (repo.getPDPRepo().getproductZoomIn().isEnabled()) {
			repo.getPDPRepo().getproductZoomIn().click();
		}
		System.out.println("Zoom In feature is working as expected");
		Thread.sleep(2000);

		//Click on Zoom Out Feature
		while (repo.getPDPRepo().getproductZoomOut().isEnabled()) {
			repo.getPDPRepo().getproductZoomOut().click();
		}
		System.out.println("Zoom Out feature is working as expected");

		//Click on Close icon 
		repo.getPDPRepo().getproductZoomClose().click();	

	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, groups = {"regression"})
	public void ToVerifyThatNextProductIsClickedInZoom() throws InterruptedException{
		
		
	
	}
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, groups = { "regression" })
	public void ToVerifyShareIconTest() throws InterruptedException {
		
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
				
				//Click on share icon
				repo.getPDPRepo().getshareIcon().click();
				
				//Validate the share options
//				Assert.assertTrue(repo.getPDPRepo().getsharePinterest().isEnabled());
//				Assert.assertTrue(repo.getPDPRepo().getshareFB().isEnabled());
//				Assert.assertTrue(repo.getPDPRepo().getshareTweet().isEnabled());
				
	}
	
	
}
