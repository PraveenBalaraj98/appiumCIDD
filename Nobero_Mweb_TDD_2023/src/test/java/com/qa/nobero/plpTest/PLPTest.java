
package com.qa.nobero.plpTest;

import static org.testng.Assert.fail;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.nobero.genericutility.BaseClass;
import com.qa.nobero.genericutility.JavaUtility;
import com.qa.nobero.genericutility.WebDriverUtility;
import com.qa.nobero.mWeb.objectRepo.RepositoryHub;

public class PLPTest extends BaseClass{
	JavaUtility jUtil = new JavaUtility();	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,groups = { "smoke", "regression" })
	public void ToVerifyApplyFilterforPriceLessthanRs500Test() {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step 2: Click on Hamburger icon
				repo.getHomeRepo().getHamburger().click();

				//Step 3: Click on Men
				repo.getHamburgerRepo().getMen().click();

				//Step 2: Fetch The Collection Name from Mens Page
				//String collectionName = repo.getHamburgerRepo().getMenPicksTeesTitle().getText().trim();

				//Click on ShopAllProducts in Pick any 3 @ 999in Mens Page
				repo.getHamburgerRepo().getMenPicksTeesShopAllProducts().click();

				//Step 3: Fetch The PLP page Name
				String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

				//Step 5: Validate the Collection name and PLP page
				Assert.assertEquals("T-Shirts", plpTitle, "To Verify pick any 3 tess at 999");

		//Step3: Click on  Filter 
		repo.getPLPRepo().getFilter().click();

		//Step4: Click on Price
		repo.getPLPRepo().getFilterPrice().click();

		//Step5: Click on 'less than 500'
		repo.getPLPRepo().getLessthanRs500().click();

		//Step6: Click On Apply
		repo.getPLPRepo().getApply().click();

		//Step7: Validate whether product less than 500 is displayed

			//Scroll the PLP page 
				repo.getPLPRepo().ScrollAllProducts(driver);

			//Fetch the product price of all the products in the PLP
				//Get all products price list
				 List<WebElement> priceList = repo.getPLPRepo().getProductPriceList();
				 Set<Integer> sortedPriceList = new LinkedHashSet<Integer>();
				 for (WebElement priceWe : priceList) {
					 sortedPriceList.add(jUtil.extractNumbers(priceWe.getText()));
				}
				for (Integer sortedPrice : sortedPriceList) {
					Assert.assertTrue(sortedPrice<500);
				}
				 
		
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,groups = { "smoke", "regression" })
	public void ToVerifyApplyFilterforPriceRs500toRs1000Test() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Women
		repo.getHamburgerRepo().getWomen().click();

		//Step 2: Fetch The Collection Name from Women s Page
		String collectionName = repo.getHamburgerRepo().getWomenCoordSets().getText();

		//Click on Co-ord Sets in Women s Page
		repo.getHamburgerRepo().getWomenCoordSets().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals(collectionName, plpTitle,"ToVerifyCoOrdSetPageFromWomenPageTest");


		//Step3: Click on  Filter 
		repo.getPLPRepo().getFilter().click();

		//Step4: Click on Price
		repo.getPLPRepo().getFilterPrice().click();

		//Step5: Click on '₹500 to ₹1000'
		repo.getPLPRepo().getRs500toRs1000().click();

		//Step6: Click On Apply
		repo.getPLPRepo().getApply().click();

		//Step7: Validate whether product ₹500 to ₹1000 is displayed

			//Scroll the PLP page 
			repo.getPLPRepo().ScrollAllProducts(driver);

			//Fetch the product price of all the products in the PLP and check if all the products are between 500 and 1000
			List<WebElement> priceList = repo.getPLPRepo().getProductPriceList();
			 Set<Integer> sortedPriceList = new LinkedHashSet<Integer>();
			 for (WebElement priceWe : priceList) {
				 sortedPriceList.add(jUtil.extractNumbers(priceWe.getText()));
			}
			for (Integer sortedPrice : sortedPriceList) {
				Assert.assertTrue(sortedPrice>500&&sortedPrice<1000);
			}
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,groups = { "smoke", "regression" })
	public void ToVerifyApplyFilterforPriceRs1000toRs1500Test() {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step 2: Click on Hamburger icon
				repo.getHomeRepo().getHamburger().click();

				//Step 3: Click on Women
				repo.getHamburgerRepo().getWomen().click();

				//Step 2: Fetch The Collection Name from Women s Page
				String collectionName = repo.getHamburgerRepo().getWomenCoordSets().getText();

				//Click on Co-ord Sets in Women s Page
				repo.getHamburgerRepo().getWomenCoordSets().click();

				//Step 3: Fetch The PLP page Name
				String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

				//Step 5: Validate the Collection name and PLP page
				Assert.assertEquals(collectionName, plpTitle,"ToVerifyCoOrdSetPageFromWomenPageTest");


		//Step3: Click on  Filter 
		repo.getPLPRepo().getFilter().click();

		//Step4: Click on Price
		repo.getPLPRepo().getFilterPrice().click();

		//Step5: Click on '₹1000 to ₹1500'
		repo.getPLPRepo().getRs1000toRs1500().click();

		//Step6: Click On Apply
		repo.getPLPRepo().getApply().click();

		//Step7: Validate whether product ₹1000 to ₹1500  is displayed

			//Scroll the PLP page 
				repo.getPLPRepo().ScrollAllProducts(driver);

			//Fetch the product price of all the products in the PLP and check if all the products are between 1000 and 1500
				List<WebElement> priceList = repo.getPLPRepo().getProductPriceList();
				 Set<Integer> sortedPriceList = new LinkedHashSet<Integer>();
				 for (WebElement priceWe : priceList) {
					 sortedPriceList.add(jUtil.extractNumbers(priceWe.getText()));
				}
				for (Integer sortedPrice : sortedPriceList) {
					Assert.assertTrue(sortedPrice>1000&&sortedPrice<1500);
				}
				
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,groups = { "smoke", "regression" })
	public void ToVerifyApplyFilterforPriceRs1500toRs2000Test() {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step 2: Click on Hamburger icon
				repo.getHomeRepo().getHamburger().click();

				//Step 3: Click on Men
				repo.getHamburgerRepo().getMen().click();

				//Step 2: Fetch The Collection Name from Mens Page
				String collectionName = repo.getHamburgerRepo().getMenCoordSets().getText();

				//Click on Co-Ord Sets in Mens Page
				repo.getHamburgerRepo().getMenCoordSets().click();

				//Step 3: Fetch The PLP page Name
				String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

				//Step 5: Validate the Collection name and PLP page
				Assert.assertEquals(collectionName, plpTitle, "ToVerifyCoOrdSetPageFromMenPageTest");


		//Step3: Click on  Filter 
		repo.getPLPRepo().getFilter().click();

		//Step4: Click on Price
		repo.getPLPRepo().getFilterPrice().click();

		//Step5: Click on '₹1500 to ₹2000'
		repo.getPLPRepo().getRs1500toRs2000().click();

		//Step6: Click On Apply
		repo.getPLPRepo().getApply().click();

		//Step7: Validate whether product ₹1500 to ₹2000  is displayed

			//Scroll the PLP page 
				repo.getPLPRepo().ScrollAllProducts(driver);

			//Fetch the product price of all the products in the PLP and check if all the products are between 1500 and 2000
				List<WebElement> priceList = repo.getPLPRepo().getProductPriceList();
				 Set<Integer> sortedPriceList = new LinkedHashSet<Integer>();
				 for (WebElement priceWe : priceList) {
					 sortedPriceList.add(jUtil.extractNumbers(priceWe.getText()));
				}
				for (Integer sortedPrice : sortedPriceList) {
					Assert.assertTrue(sortedPrice>1500&&sortedPrice<2000);
				}
				
	}
	

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, groups = { "smoke", "regression" })
	public void ToVerifyApplyFilterforPricemorethanRs2000Test() {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step 2: Click on Hamburger icon
				repo.getHomeRepo().getHamburger().click();

				//Step 3: Click on Men
				repo.getHamburgerRepo().getMen().click();

				//Step 2: Fetch The Collection Name from Mens Page
				//String collectionName = repo.getHamburgerRepo().getMenOversizedTees().getText();

				//Click on ShopAllProducts in top picks in Mens Page
				repo.getHamburgerRepo().getMenTopPicksShopAllProducts().click();

				//Step 3: Fetch The PLP page Name
				String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

				//Step 5: Validate the Collection name and PLP page
				Assert.assertEquals("Men", plpTitle);


		//Step3: Click on  Filter 
		repo.getPLPRepo().getFilter().click();

		//Step4: Click on Price
		repo.getPLPRepo().getFilterPrice().click();

		//Step5: Click on more than 2000
		repo.getPLPRepo().getMorethanRs2000().click();

		//Step6: Click On Apply
		repo.getPLPRepo().getApply().click();

		//Step7: Validate whether product more than 2000  is displayed

			//Scroll the PLP page 
				repo.getPLPRepo().ScrollAllProducts(driver);

			//Fetch the product price of all the products in the PLP and check if all the products are more than 2000
				List<WebElement> priceList = repo.getPLPRepo().getProductPriceList();
				 Set<Integer> sortedPriceList = new LinkedHashSet<Integer>();
				 for (WebElement priceWe : priceList) {
					 sortedPriceList.add(jUtil.extractNumbers(priceWe.getText()));
				}
				for (Integer sortedPrice : sortedPriceList) {
					Assert.assertTrue(sortedPrice>2000);
				}
				
				
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, groups = { "smoke", "regression" })
	public void ToVerifyApplyFilterforColorTest() {

			//Create Object for Singleton Class 
			RepositoryHub repo=new RepositoryHub(driver);

			//Step 2: Click on Hamburger icon
			repo.getHomeRepo().getHamburger().click();

			//Step 3: Click on Women
			repo.getHamburgerRepo().getWomen().click();

			//Step 2: Fetch The Collection Name from Mens Page
			//String collectionName = repo.getHamburgerRepo().getMenOversizedTees().getText();

			//Click on Shop all products in Top Picks in Women Page
			repo.getHamburgerRepo().getWomenTopPicksShopAllProducts().click();

			//Step 3: Fetch The PLP page Name
			String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

			//Step 5: Validate the Collection name and PLP page
			Assert.assertEquals("Women", plpTitle, "ToVerifyTopPicksShopAllProductsPageFromWomenPageTest");



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
	public void ToVerifyApplyColorFilterValidateColorInPDPPageTest() throws InterruptedException {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step 2: Fetch The Collection Name
				String collectionName = repo.getHomeRepo().getBestSeller().getText().trim();

				//Step 3: Click on Collection - BestSeller
				repo.getHomeRepo().getBestSeller().click();

				//Step 3: Fetch The PLP page Name
				String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

				//Step 5: Validate the Collection name and PLP page
				Assert.assertEquals(collectionName, plpTitle, "Verify BestSeller Major tab");

		//Step3: Click on  Filter 
		repo.getPLPRepo().getFilter().click();

		//Step4: Click on color
		repo.getPLPRepo().getFilterColor().click();
		
		//Step5: lick on Show more color
		repo.getPLPRepo().getShowMoreColor().click();

		//Step6: click on any color and get name		
		int colorIndex = 6;
		repo.getPLPRepo().geteachColor().get(colorIndex).click();
		String filterColorName = repo.getPLPRepo().getEachColorName().get(colorIndex).getText().trim();
		
		//Step7: Click On Apply
		repo.getPLPRepo().getApply().click();

		//Step8: Click on 1st Product.                                                    
		repo.getPLPRepo().getProducts().get(0).click();
		
		//Step9 :Get The color Name in PDP page
		String PDPColorName = repo.getPDPRepo().getcolorName().getText().replaceAll("[^a-zA-Z\\s]", "").trim();
		
		//Step10 :Validate the color Name
		Assert.assertEquals(filterColorName, PDPColorName);


	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,groups = { "smoke", "regression" })
	public void ToVerifyApplyColorFilterValidateColorInCartPageTest() throws InterruptedException {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step 2: Click on Hamburger icon
				repo.getHomeRepo().getHamburger().click();

				//Step 3: Click on Women
				repo.getHamburgerRepo().getWomen().click();

				//Step 2: Fetch The Collection Name from Womens Page
				//String collectionName = repo.getHamburgerRepo().getWomenPicksTeesTitle().getText().trim();

				//Click on Shop all products in Pick any 3 @ 999 in Womens Page
				repo.getHamburgerRepo().getWomenPicksTeesShopAllProducts().click();

				//Step 3: Fetch The PLP page Name
				String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

				//Step 5: Validate the Collection name and PLP page
				Assert.assertEquals("Women's Summer Tees", plpTitle, "ToVerify_Pickany3at999_PageFromWomenPageTest");


		//Step3: Click on  Filter 
		repo.getPLPRepo().getFilter().click();

		//Step4: Click on color
		repo.getPLPRepo().getFilterColor().click();
		
		//Step5: lick on Show more color
		repo.getPLPRepo().getShowMoreColor().click();

		//Step5: click on any color and get name
		int colorIndex = 2;
		repo.getPLPRepo().geteachColor().get(colorIndex).click();
		Thread.sleep(4000);
		String filterColorName = repo.getPLPRepo().getEachColorName().get(colorIndex).getText().trim();

		//Step4: Click on color
		repo.getPLPRepo().getFilterColor().click();
		
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
		
		//Fetch the color name in cart
		Thread.sleep(4000);
		String cartColorName = repo.getPDPRepo().getcolorName().getText().trim().replaceAll("[^a-zA-Z\\s]", "").trim();

		
		//Assert the color name in cart page
		Assert.assertEquals(filterColorName, cartColorName);

		//Step9: Check Proceed to buy is enabled
		Assert.assertTrue(repo.getCartRepo().getProceedToBuy().isEnabled());

	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,groups = { "smoke", "regression" })
	public void ToVerifyApplyFilterforSizeTest() {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step 2: Fetch The Collection Name
				String collectionName = repo.getHomeRepo().getMens().getText().trim();

				//Step 3: Click on Collection - Men's
				repo.getHomeRepo().getMens().click();

				//Step 3: Fetch The PLP page Name
				String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

				//Step 5: Validate the Collection name and PLP page
				Assert.assertEquals(collectionName, plpTitle,"ToVerifyMensPageTest");
				
		//Step3: Click on  Filter 
		repo.getPLPRepo().getFilter().click();

		//Step4: Click on color drawer
		repo.getPLPRepo().getFilterSize().click();

		//Step5: select a color
		repo.getPLPRepo().selectSize("L");

		repo.getPLPRepo().getFilterSize().click();
		repo.getPLPRepo().getFilterAvailability().click();
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
	public void ToVerifyApplySizeFilterValidateSizeInPDPPageTest() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Fetch The Collection Name
		String collectionName = repo.getHomeRepo().getmensSummerTees().getText().trim();

		//Step 3: Click on Collection - Men's Summer Tees
		repo.getHomeRepo().getmensSummerTees().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals(collectionName, plpTitle,"ToVerifyMenSummerTeesPageTest");
		
		//Step3: Click on  Filter 
		repo.getPLPRepo().getFilter().click();

		//Step4: Click on size drawer
		repo.getPLPRepo().getFilterSize().click();

		//Step6: click on size and fetch name
				int indexCount=0;
				repo.getPLPRepo().geteachSize().get(indexCount).click();
				String filterSizeName = repo.getPLPRepo().getAllSizeName().get(indexCount).getText();

				//Step7: Click On Apply
				repo.getPLPRepo().getApply().click();

		//Step8: Click on 1st Product.                                                    
		repo.getPLPRepo().getProducts().get(0).click();
		
		//Step9 :Get The color Name in PDP page
		String PDPSizeName = repo.getPDPRepo().getselectedSize().getText().trim();
		
		//Step10 :Validate the color Name
		Assert.assertEquals(filterSizeName, PDPSizeName);


	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true, groups = { "smoke", "regression" })
	public void ToVerifyApplySizeFilterValidateSizeInCartPageTest() {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step 2: Fetch The Collection Name
				String collectionName = repo.getHomeRepo().getCoOrdSet().getText().trim();

				//Step 3: Click on Collection - Co-Ord Set
				repo.getHomeRepo().getCoOrdSet().click();

				//Step 3: Fetch The PLP page Name
				String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

				//Step 5: Validate the Collection name and PLP page
				Assert.assertEquals(collectionName, plpTitle,"ToVerifyCoOrdSetPageTest");
		
		//Step3: Click on  Filter 
		repo.getPLPRepo().getFilter().click();

		//Step4: Click on size drawer
		repo.getPLPRepo().getFilterSize().click();

		//Step6: click on size and fetch name
				int indexCount=3;
				repo.getPLPRepo().geteachSize().get(indexCount).click();
				String filterSizeName = repo.getPLPRepo().getAllSizeName().get(indexCount).getText();

				//Step4: Click on size drawer
				repo.getPLPRepo().getFilterSize().click(); 
				
				//Step4: Click on Availability
				repo.getPLPRepo().getFilterAvailability().click();

				//Step5: Click on 'In Stock'
				repo.getPLPRepo().getInStockradio().click();
				
				//Step7: Click On Apply
				repo.getPLPRepo().getApply().click();

		//Step8: Click on 1st Product.                                                    
		repo.getPLPRepo().getProducts().get(0).click();

		//Step8: Add the Product To Cart
		repo.getPDPRepo().getAddToCart().click();
		
		//Fetch the size name in cart
		String cartSizeName = repo.getCartRepo().getcartSizeName().getText().trim();
		
		//Assert the size name in cart page
		Assert.assertEquals(filterSizeName, cartSizeName);

		//Step9: Check Proceed to buy is enabled
		Assert.assertTrue(repo.getCartRepo().getProceedToBuy().isEnabled());

	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,groups = { "smoke", "regression" })
	public void ToVerifyApplyFilterforAvailabilityInStockTest() {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step 2: Click on Hamburger icon
				repo.getHomeRepo().getHamburger().click();

				//Step 3: Click on Men
				repo.getHamburgerRepo().getMen().click();

				//Step 2: Fetch The Collection Name from Mens Page
				//String collectionName = repo.getHamburgerRepo().getMenComfortJoggers().getText();

				//Click on ComfortJoggers in Mens Page
				repo.getHamburgerRepo().getMenComfortJoggers().click();

				//Step 3: Fetch The PLP page Name
				String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

				//Step 5: Validate the Collection name and PLP page
				//Assert.assertEquals("Comfort Joggers and Shorts", plpTitle,"VERIFY COMFORT JOGGERS IN MEN COLLECTION");

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
	public void ToVerifyApplyFilterforAvailabilityOutOfStockTest() throws InterruptedException {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step 2: Click on Hamburger icon
				repo.getHomeRepo().getHamburger().click();

				//Step 3: Click on Women
				repo.getHamburgerRepo().getWomen().click();

				//Step 2: Fetch The Collection Name from Women Page
				String collectionName = repo.getHamburgerRepo().getWomenComfortJoggers().getText();

				//Click on ComfortJoggers in Women Page
				repo.getHamburgerRepo().getWomenComfortJoggers().click();

				//Step 3: Fetch The PLP page Name
				String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

				SoftAssert sf = new SoftAssert();
				//Step 5: Validate the Collection name and PLP page
				sf.assertEquals(collectionName, plpTitle, "VerifyComfortJoggersPageFromWomenPageTest");


		//Step3: Click on  Filter 
		repo.getPLPRepo().getFilter().click();

		//Step4: Click on Availability
		repo.getPLPRepo().getFilterAvailability().click();

		//Step5: Click on 'Out Of Stock'
		repo.getPLPRepo().getOutOfStockradio().click();

		//Step6: Click On Apply
		repo.getPLPRepo().getApply().click();

		//Step7: Click on 1st Product.                                                    
		repo.getPLPRepo().getProducts().get(0).click();
		
		//Step8: Validate the Toast message
		String toastMessage = repo.getPDPRepo().getToastMessageOutStock().getText().trim();
	//	Assert.assertEquals(toastMessage, "Item is out of stock");
		
		//Toast message should be disappeared after 3 seconds
		Thread.sleep(3000);
		
	//	Assert.assertFalse(repo.getPDPRepo().getToastMessageOutStock().isDisplayed());
		
	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class,groups = { "smoke", "regression" })
	public void ToVerifySortByBestSellingTest() {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step 2: Click on Hamburger icon
				repo.getHomeRepo().getHamburger().click();

				//Step 3: Click on Men
				repo.getHamburgerRepo().getMen().click();

				//Step 2: Fetch The Collection Name from Mens Page
				String collectionName = repo.getHamburgerRepo().getMenSummerSets().getText();

				//Click on SummerSets in Mens Page
				repo.getHamburgerRepo().getMenSummerSets().click();

				//Step 3: Fetch The PLP page Name
				String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

				//Step 5: Validate the Collection name and PLP page
				Assert.assertEquals("Men's Luxury Summer Set", plpTitle, "ToVerifySummerSetsPageFromMenPageTest");

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

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = false ,groups = { "smoke", "regression" })
	public void ToVerifySortByFeaturedTest() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Men
		repo.getHamburgerRepo().getMen().click();

		//Step 2: Fetch The Collection Name from Mens Page
		String collectionName = repo.getHamburgerRepo().getMenSummerShorts().getText();

		//Click on SummerShorts in Mens Page
		repo.getHamburgerRepo().getMenSummerShorts().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals(collectionName, plpTitle, "ToVerifySummerShortsPageFromMenPageTest");

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

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,groups = { "smoke", "regression" })
	public void ToVerifySortByNewArrivalTest() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Women
		repo.getHamburgerRepo().getWomen().click();

		//Step 2: Fetch The Collection Name from Women Page
		String collectionName = repo.getHamburgerRepo().getWomenSummerShorts().getText();

		//Click on SummerShorts in Women Page
		repo.getHamburgerRepo().getWomenSummerShorts().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();
		SoftAssert sf = new SoftAssert();
		//Step 5: Validate the Collection name and PLP page
		sf.assertEquals(collectionName, plpTitle, "ToVerifySummerShortsPageFromWomenPageTest");


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

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,groups = { "smoke", "regression" })
	public void ToVerifySortByPriceLowToHighTest() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Women
		repo.getHamburgerRepo().getWomen().click();

		//Step 2: Fetch The Collection Name from Women Page
		//String collectionName = repo.getHamburgerRepo().getWomenSummerTees().getText();

		//Click on SummerTees in Women Page
		repo.getHamburgerRepo().getWomenSummerTees().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals("Women's Summer Tees", plpTitle, "ToVerifySummerTeesPageFromWomenPageTest");

		//Step3: Click on Sort
		repo.getPLPRepo().getSortBy().click();

		//Step4: Click on PriceLowToHigh
		repo.getPLPRepo().getPriceLowToHigh().click();
		
		//Step5: Scroll the page
		repo.getPLPRepo().ScrollAllProducts(driver);

		//Get all products price list
		 List<WebElement> priceList = repo.getPLPRepo().getProductPriceList();
		 Set<Integer> sortedPriceList = new LinkedHashSet();
		 for (WebElement priceWe : priceList) {
			 sortedPriceList.add(jUtil.extractNumbers(priceWe.getText()));
		}
		// System.out.println(sortedPriceList);
		 int firstSortPrice = 0; int lastSortPrice= 0; int count=0;
		 for (Integer sortedPrice : sortedPriceList) {
			
			if (count==0) {
				firstSortPrice = sortedPrice;
			}
			if (count == (sortedPriceList.size() - 1)) {
				lastSortPrice = sortedPrice;
			}
			count++;
		}
		 System.out.println("firstSortPrice "+firstSortPrice);
		 System.out.println("lastSortPrice "+lastSortPrice);
		 
		//Step6: Fetch the product price
		int firstPrice = jUtil.extractNumbers(repo.getPLPRepo().getProductPriceList().get(0).getText());
		int lastPrice = jUtil.extractNumbers(repo.getPLPRepo().getProductPriceList().get(repo.getPLPRepo().getProductPriceList().size()-1).getText());
		
		//Validate the Price list with sorted Price list
		Assert.assertTrue(firstPrice<=lastPrice);
		Assert.assertTrue(firstPrice==firstSortPrice);
		Assert.assertTrue(lastPrice==lastSortPrice);
		
		//Step5: Click on 1st Product                                                 
		repo.getPLPRepo().getProducts().get(0).click();
		
		//Step7: Add the Product To Cart
		repo.getPDPRepo().getAddToCart().click();

		//Step8:  Check Proceed to buy is enabled
		Assert.assertTrue(repo.getCartRepo().getProceedToBuy().isEnabled());
	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class, enabled = true,groups = { "smoke", "regression" })
	public void ToVerifySortByPriceHighToLowTest() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Click on Hamburger icon
		repo.getHomeRepo().getHamburger().click();

		//Step 3: Click on Men
		repo.getHamburgerRepo().getMen().click();

		//Step 2: Fetch The Collection Name from Mens Page
		String collectionName = repo.getHamburgerRepo().getMenSummerTees().getText();

		//Click on SummerTees in Mens Page
		repo.getHamburgerRepo().getMenSummerTees().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals("Summer Tees", plpTitle, "ToVerifySummerTeesPageFromMenPageTest");


		//Step3: Click on Sort
		repo.getPLPRepo().getSortBy().click();

		//Step4: Click on PriceHighToLow
		repo.getPLPRepo().getPriceHightolow().click();
		
		//Step5: Scroll the page
		repo.getPLPRepo().ScrollAllProducts(driver);

		//Get all products price list
		 List<WebElement> priceList = repo.getPLPRepo().getProductPriceList();
		 Set<Integer> sortedPriceList = new LinkedHashSet();
		 for (WebElement priceWe : priceList) {
			 sortedPriceList.add(jUtil.extractNumbers(priceWe.getText()));
		}
		// System.out.println(sortedPriceList);
		 int firstSortPrice = 0; int lastSortPrice= 0; int count=0;
		 for (Integer sortedPrice : sortedPriceList) {
			
			if (count==0) {
				firstSortPrice = sortedPrice;
			}
			if (count == (sortedPriceList.size() - 1)) {
				lastSortPrice = sortedPrice;
			}
			count++;
		}
		 System.out.println("firstSortPrice "+firstSortPrice);
		 System.out.println("lastSortPrice "+lastSortPrice);
		 
		//Step6: Fetch the product price
		int firstPrice = jUtil.extractNumbers(repo.getPLPRepo().getProductPriceList().get(0).getText());
		int lastPrice = jUtil.extractNumbers(repo.getPLPRepo().getProductPriceList().get(repo.getPLPRepo().getProductPriceList().size()-1).getText());
		
		//Validate the Price list with sorted Price list
		Assert.assertTrue(firstPrice>=lastPrice);
		Assert.assertTrue(firstPrice==firstSortPrice);
		Assert.assertTrue(lastPrice==lastSortPrice);
		
		//Step5: Click on 1st Product                                                 
		repo.getPLPRepo().getProducts().get(0).click();
		
		//Step7: Add the Product To Cart
		repo.getPDPRepo().getAddToCart().click();

		//Step8:  Check Proceed to buy is enabled
		Assert.assertTrue(repo.getCartRepo().getProceedToBuy().isEnabled());
	}

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class,groups = {"regression" })
	public void ToVerifyPLPproductCountTest() {
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step 2: Fetch The Collection Name
				String collectionName = repo.getHomeRepo().getNewArrival().getText().trim();

				//Step 3: Click on Collection - New Arrivals
				repo.getHomeRepo().getNewArrival().click();

				//Step 3: Fetch The PLP page Name
				String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

				//Step 5: Validate the Collection name and PLP page
				Assert.assertEquals(collectionName, plpTitle," VERIFY NEW ARRIVAL");

		//Step3: fetch the product count in PLP page
		int PLPreviewcount = jUtil.extractNumbers(repo.getPLPRepo().getPLPcount().getText().trim());
		
		//Scroll the PLP page
		repo.getPLPRepo().ScrollAllProducts(driver);
		
		//Fetch the count of PLP products
		int ProductGridSize = repo.getPLPRepo().getProducts().size();
			
		//Validate the Product count in PLP page
		Assert.assertEquals(PLPreviewcount, ProductGridSize);
		
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class,groups = { "regression" }, enabled = false)
	public void ToVerifyReviewCountFromPLPtoPDPpageTest() {
		//Create Object for Singleton Class 
		RepositoryHub repo=new RepositoryHub(driver);

		//Step 2: Fetch The Collection Name
		String collectionName = repo.getHomeRepo().getWomens().getText().trim();

		//Step 3: Click on Collection - Women's
		repo.getHomeRepo().getWomens().click();

		//Step 3: Fetch The PLP page Name
		String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

		//Step 5: Validate the Collection name and PLP page
		Assert.assertEquals(collectionName, plpTitle);

		//Step3: fetch the review count and click on Product
		int PLPreviewcount = repo.getPLPRepo().FetchReviewCountAndClickProduct(0);

		//Step4: Go to review Section
		repo.getPDPRepo().getreviewCountOnProduct().click();
		
		//Validate the Review count in PDP page
		int PDPreviewcount = jUtil.extractNumbers(repo.getPDPRepo().getbasedOnReview().getText());
		Assert.assertEquals(PLPreviewcount, PDPreviewcount);
		
	}
	
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class,groups = { "regression" })
	public void ToVerifyProductInPLPCartAfterAddingProdtuctToCartTest() {
		//Create Object for Singleton Class 
		//Create Object for Singleton Class 
				RepositoryHub repo=new RepositoryHub(driver);

				//Step 2: Click on Hamburger icon
				repo.getHomeRepo().getHamburger().click();

				//Step 3: Click on Men
				repo.getHamburgerRepo().getMen().click();
				//Step 2: Fetch The Collection Name from Mens Page
				//String collectionName = repo.getHamburgerRepo().getMenOversizedTees().getText();

				//Click on SummerSets in Mens Page
				repo.getHamburgerRepo().getMenSummerSets().click();

				//Step 3: Fetch The PLP page Name
				String plpTitle = repo.getPLPRepo().getPLPTitle().getText().trim();

				//Step 5: Validate the Collection name and PLP page
				Assert.assertEquals("Men's Luxury Summer Set", plpTitle, "ToVerifySummerSetsPageFromMenPageTest");

				
				//Step3: Click on 1st Product                                                 
				repo.getPLPRepo().getProducts().get(0).click();
				
				//Fetch The product title
				String ProductTitle = repo.getPDPRepo().getProductTitle().getText().toLowerCase();
				
				//Add the product to cart
				repo.getPDPRepo().getAddToCart().click();
				
				//Fetch the product title in cart from PDP page
				String productTitleCart1 = repo.getCartRepo().ProductName().getText().toLowerCase();
				Assert.assertEquals(ProductTitle, productTitleCart1);
				
				//Click on Close icon in half cart page
				repo.getCartRepo().getcartCloseIcon().click();
				
				//Click on browser back button
				driver.navigate().back();
				
				
				//Script FAIL if page is not refreshed**************************************************
				driver.navigate().refresh();
				
				//Click on cart icon
				repo.getHomeRepo().getCartIcon().click();
				
				//Fetch the product title in cart from PLP page
				String productTitleCart2 = repo.getCartRepo().ProductName().getText().toLowerCase();
				Assert.assertEquals(ProductTitle, productTitleCart2);
					
	}

}
